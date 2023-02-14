import java.util.ArrayList;

public class UserDao {
    private ArrayList<User> users=new ArrayList<>();
    public void saveUser(User user){
        users.add(user);
        





    }
    public User id(int id){
        for (User user:users) {
            if (user.getId()==id){
                return user;
            
        }
        }

        return null;
    }

}
