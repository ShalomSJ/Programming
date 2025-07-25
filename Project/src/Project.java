import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class LoginGUI extends JFrame implements ActionListener {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton signUpButton;


    public LoginGUI() {
        setTitle("Login");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        panel.add(usernameLabel);

        usernameField = new JTextField();
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        panel.add(passwordField);

        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        panel.add(loginButton);

        signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(this);
        panel.add(signUpButton);


        add(panel);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // username and password
        // check database for password
        if (username.equals("admin") && password.equals("password")) {
            dispose();
            BookingGUI bookingGUI = new BookingGUI();
            bookingGUI.setVisible(true); //opens booking menu
        } else if (e.getSource()== signUpButton){
            SignUpGUI signUpGUI = new SignUpGUI();
            signUpGUI.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(this, "Login Failed!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginGUI loginGUI = new LoginGUI();
            loginGUI.setVisible(true);
        });
    }
}

class SignUpGUI extends JFrame{
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton signUpButton;

    public SignUpGUI(){
        setTitle("Sign Up");
        setSize(300,200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,2));

        JLabel usernameLabel = new JLabel("Username");
        panel.add(usernameLabel);

        usernameField = new JTextField();
        panel.add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        panel.add(passwordField);

        signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Handle sign up logic here
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());

                if (username.equals("user") && password.equals("password")){
                    JOptionPane.showMessageDialog(SignUpGUI.this, "Sign Up Successful!");
                    dispose(); //to close the sign-in
                    new LoginGUI().setVisible(true);
                } else{
                    JOptionPane.showMessageDialog(SignUpGUI.this,"Try again" ,"Error",JOptionPane.ERROR_MESSAGE);
                }
            }

        });
        panel.add(signUpButton);

        add(panel);
    }
}


     class BookingGUI extends LoginGUI {
         private JComboBox<Movie> movieComboBox;
         private JTextField ticketsField;
         private JButton bookButton;
         private JButton cancelButton;

         public BookingGUI() {
             setTitle("Booking");
             setSize(300, 200);
             setLocationRelativeTo(null);

             JPanel panel = new JPanel();
             panel.setLayout(new GridLayout(3, 2));

             JLabel movieLabel = new JLabel("Movie:");
             panel.add(movieLabel);

             //movie names
             Movie movie1 = new Movie("Avengers: Endgame", "Monday", "15:00", "Main Theater", 100, 10.0);
             Movie movie2 = new Movie("The Lion King", "Tuesday", "17:30", "Main Theater", 80, 12.0);
             Movie movie3 = new Movie("Dune: Part Two", "Wednesday", "12:00", "Main Theater", 50, 12.0);
             Movie movie4 = new Movie("Ghost busters: Frozen Empire", "Thursday", "18:00", "Main Theater", 150, 10.0);
             Movie movie5 = new Movie("Godzilla x Kong: The New Empire", "Wednesday", "20:00", "Main Theater", 50, 12.0);
             Movie movie6 = new Movie("Madame Web", "Friday", "16:00", "Main Theater", 100, 10.0);
             Movie movie7 = new Movie("Fast and Furious", "Monday", "19:00", "Main Theater", 80, 10.0);
             Movie movie8 = new Movie("Kingdom of the Planet of the Apes", "Saturday", "10:00", "Main Theater", 40, 10.0);
             Movie movie9 = new Movie("The beautiful game", "Saturday", "12:00", "Main Theater", 60, 12.0);

             Movie[] movies = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9};
             movieComboBox = new JComboBox<>(movies);
             panel.add(movieComboBox);

             JLabel seatsLabel = new JLabel("Number of Tickets:");
             panel.add(seatsLabel);

             ticketsField = new JTextField();
             panel.add(ticketsField);

             bookButton = new JButton("Book");
             bookButton.addActionListener(new ActionListener() {
                 @Override
                 public void actionPerformed(ActionEvent e) {
                     bookAction();
                 }
             });
             panel.add(bookButton);

             add(panel);
         }

         private void bookAction() {

             //booking logic
             int tickets;
             Movie selectedMovie = (Movie) movieComboBox.getSelectedItem();

             try {
                 tickets = Integer.parseInt(ticketsField.getText()); // Parse seats from the field
                 if (tickets <= 0) {
                     JOptionPane.showMessageDialog(BookingGUI.this, "Number of seats must be greater than 0.", "Invalid Seats", JOptionPane.ERROR_MESSAGE);
                     return; // Stop processing booking if number of seats is invalid
                 }
             } catch (NumberFormatException ex) {
                 JOptionPane.showMessageDialog(BookingGUI.this, "Please enter a valid number of seats.", "Invalid Seats", JOptionPane.ERROR_MESSAGE);
                 return; // Stop processing booking if number of seats is not a valid number
             }

             boolean bookingSuccess = selectedMovie.bookTickets(tickets);
             if (bookingSuccess) {
                 // Booking successful
                 double totalPrice = tickets * selectedMovie.getPricePerTicket();
                 String bookingDetails = "Booking Details:\n" +
                         "Movie: " + selectedMovie.getTitle() + "\n" +
                         "Date: " + selectedMovie.getDay() + "\n" +
                         "Time: " + selectedMovie.getTime() + "\n" +
                         "Location: " + selectedMovie.getLocation() + "\n" +
                         "Number of Tickets: " + tickets + "\n" +
                         "Total Price: $" + totalPrice;
                 JOptionPane.showMessageDialog(BookingGUI.this, bookingDetails, "Booking Successful", JOptionPane.INFORMATION_MESSAGE);

                 // disable booking button
                 bookButton.setEnabled(false);

                 //cancel button added after booking details
                 cancelButton = new JButton("Cancel");
                 cancelButton.addActionListener(new ActionListener() {
                     @Override
                     public void actionPerformed(ActionEvent e) {
                         dispose();
                     }
                 });
                 JPanel panel = (JPanel) getContentPane().getComponent(0); // Get the panel
                 panel.add(cancelButton); // Add cancel button
                 panel.revalidate(); // revalidate panel to reflect the changes
             }

         }
     }










