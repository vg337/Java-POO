public class Classroom {

    public static void main(String[] args) {

        Wilder claude = new Wilder("Claude");
        claude.setAware(false);      
        System.out.println("1. " + (claude.whoAmI()));

        Wilder henry = new Wilder("Henry");  
        System.out.println("2. " + (henry.whoAmI()));

        System.out.println("3. What is the best answer : " + Wilder.bonus());
    }
}