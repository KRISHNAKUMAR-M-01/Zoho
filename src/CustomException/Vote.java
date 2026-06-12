package CustomException;


class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

class Verification  {
    void RegisterVoter(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("For Voting your age should be greater than or equal to 18");
        }
        else{
            System.out.println("You are eligible for voting");
        }
    }
}

public class Vote {
    static void main(String[] args) {
        Verification verify =new Verification();
        try{
            verify.RegisterVoter(16);
        }catch(InvalidAgeException e){
            System.out.println("Error:" +e.getMessage());
        }
    }

}
