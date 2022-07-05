




public class ComplexCheck implements IUserCheck{

    @Override
    public boolean usercheck(User user) {
        if(user.getAge() > 18 && user.getName().startsWith("Ya")) {
            return true;
        }
        else {
            return false;
        }
    }



}
