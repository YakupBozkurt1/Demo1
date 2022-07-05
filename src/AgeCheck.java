



public class AgeCheck implements IUserCheck{

    public boolean usercheck(User user) {
        if(user.getAge() > 18) {
            return true;
        }
        else {
            return false;
        }
    }

}
