public class Classroom {

    public static void main(String[] args){
        Wilder anne = new Wilder("Anne", true);
        String afficher = anne.whoIam();
        System.out.println(afficher);
        Wilder alan = new Wilder("Alan", false);
        String afficher2 = alan.whoIam();
        System.out.println(afficher2); 
    }    
}