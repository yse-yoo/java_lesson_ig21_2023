package sns.entity;

public class App {
    
    public static void main(String[] args) {
        User user = new User();    
        user.setEmail("yse@test.com");
        user.setName("東京　太郎");
        user.setPassword("xxxxxxxx");

        System.out.println(user.getEmail());
        System.out.println(user.getName());
        System.out.println(user.getPassword());
    }

}
