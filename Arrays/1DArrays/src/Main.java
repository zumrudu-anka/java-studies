public class Main {

    public static void main(String[] args) {
        String[] students = new String[3];
        students[0] = "Ali";
        students[1] = "Veli";
        students[2] = "Ayşe";
        for (int i = 0; i < students.length; i++){
            System.out.println(students[i]);
        }
        System.out.println("\n---------------------------\n");
        for (String student:students){ // This usage like foreach
            System.out.println(student);
        }

    }
}
