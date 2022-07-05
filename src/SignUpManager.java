


public class SignUpManager {

    private IUserCheck iUserCheck;

    public SignUpManager(IUserCheck iUserCheck) {
        this.iUserCheck = iUserCheck;
    }

    public void SignUp(User user){
        if(iUserCheck.usercheck(user))
            System.out.println("Sign up is succesful: " + user.getName());
        else
            System.out.println("Sign up failed");
    }

}
