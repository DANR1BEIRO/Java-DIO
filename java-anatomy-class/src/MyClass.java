public class MyClass {

    public static void main(String [] args)  {

        String firstName = "Daniel";
        String secondName = "Goku";
        String fullName = fullName(firstName, secondName);
        System.out.println(fullName);
      
    }

    public static String fullName(String firtsName, String secondName) {
        return "Method result " + firtsName.concat(" ").concat(secondName);
    }
}