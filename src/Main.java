

public class Main {
    public static void main(String Args[]){

        SignUpManager signUpManager = new SignUpManager(new AgeCheck());


        signUpManager.SignUp(new User( 17, "Yakup"));


    }
}
