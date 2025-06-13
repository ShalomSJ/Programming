public class Lab05_B {

    String studName, dept;
    int studId,test,assign,project,total;
    // Constructor initialized
    public Lab05_B (String studName, int studId, String dept,int test,int assign,int project,int total) {
        this.studName = studName;
        this.studId = studId;
        this.dept = dept;
        this.test=test;
        this.assign=assign;
        this.project=project;
        this.total=total;
    }

    public static void main(String[] args) {
        //Object created
        Lab05_B john =new Lab05_B("John", 8886, "Computer Science",8,17,29,54);
        Lab05_B stephen = new Lab05_B("Steven", 888611, "Computer Science",18,27,19,64);
        Lab05_B tessy = new Lab05_B("Tessy",18886,"Computer Science",7,11,19,37);
        Lab05_B jane = new Lab05_B("Jane",811886,"Computer Science",18,27,21,66);
        Lab05_B saima = new Lab05_B("Saima",22886,"Computer Science",16,27,22,65);
        Lab05_B pius = new Lab05_B("Pius",223886,"Computer Science",12,19,32,63);

        System.out.println("                   "+"NAME" +"   "+ "ID" +"  "+ "DEPT"+"   " + "TEST" +" " + "ASSIGN" +"  "+ "PROJECT" +"  "+ "TOTAL MARK");
        System.out.println("Student's Record #1:"+john.studName+"   "+john.studId+"   "+john.dept+" "+john.test+"  "+john.assign+" "+john.project+" "+john.total);
        System.out.println("Student's Record #2:" + stephen.studName+" "+stephen.studId+" "+stephen.dept+" "+stephen.test+" "+stephen.assign+" "+stephen.project+" "+stephen.total);
        System.out.println("Student's Record #3:" + tessy.studName+"  "+tessy.studId+"  "+tessy.dept+" "+tessy.test+"  "+tessy.assign+" "+tessy.project+" "+tessy.total);
        System.out.println("Student's Record #4:"+jane.studName+"   "+jane.studId+" "+jane.dept+" "+jane.test+" "+jane.assign+" "+jane.project+" "+jane.total);
        System.out.println("Student's Record #5:" + saima.studName+"  "+saima.studId+"  "+saima.dept+" "+saima.test+" "+saima.assign+" "+saima.project+" "+saima.total);
        System.out.println("Student's Record #6:" + pius.studName+"   "+pius.studId+" "+pius.dept+" "+pius.test+" "+pius.assign+" "+pius.project+" "+pius.total);
    }
}

