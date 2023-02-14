public class Main {
    public static void main(String[] args) {

User user=new User(1,"Bakyt",23);
User user1=new User(2,"Uson",23);
User user2=new User(3,"Aibek",18);
UserDao userDao=new UserDao();
        userDao.saveUser(user);
        userDao.saveUser(user1);
        userDao.saveUser(user2);
        System.out.println(userDao.id(1));
        System.out.println(userDao.id(3));



//     List<Integer> words=new ArrayList<>();
//     words.add(19);
//        System.out.println(words.size());
//        words.add(2);
//        System.out.println(words.size());
//
//        System.out.println(words.contains("1"));


    }
}