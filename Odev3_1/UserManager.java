package OopIntro_1.Odev3_1;

public class UserManager {
    public void register(User user){
        System.out.println("User " + user.getFirstName() + "' registered succesfully.");
    }

    public void register(User[] users){
        for (User user : users){
            register(user);
        }
    }

    public void delete(User user){
        System.out.println("User " + user.getFirstName() + " removed succesfully.");
    }

    public void delete(User[] users){
        for (User user : users){
            delete(user);
        }
    }
}


