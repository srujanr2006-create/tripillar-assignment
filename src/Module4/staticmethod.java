package Module4;
public class staticmethod{
    String firstName;
    String lastName;

    staticmethod(String firstName,String lastNamme){
        this.firstName = firstName;
        this.lastName = lastNamme;
    }

}

class student extends staticmethod {
    int usn;

    student(String firstName, String lastName, int usn) {
        super(firstName, lastName);
        this.usn = usn;

    }

    void printdetails() {
        System.out.println("student name is" + firstName + lastName);
        System.out.println("student usn is" + usn);
    }
}
class Driver{
    public static void main(String[] args) {
        student s1 = new student("srujan", "rokkad", 111);
        s1.printdetails();
    }

}
