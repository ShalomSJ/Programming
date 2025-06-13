class Students {
    public void Inheritance(){
        System.out.println("Demonstration of Hierarchical inheritance:");
    }
    public void Play() {
        System.out.println("We are proud students of NUST-");
    }
}
class FT extends Students{
    public void FTStudy() {
        System.out.println("Mr Steven-I am in FT programme");
    }
}
class PT extends Students {
    public void PTStudy() {
        System.out.println("Ms Jane-I am in PT programme");
    }
}
public class Lab07_C{
    public static void main(String[] args) {

        FT FT = new FT();
        PT PT = new PT();

        PT.Inheritance();
        PT.Play();
        FT.FTStudy();
        PT.PTStudy();
    }
}

