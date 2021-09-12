package ua.masliy.hw12;

public class ThrowThreeExceptions {
    public static void ThreeExceptionsThrow(int incomingNum) throws FirstException, SecondException, ThirdException {
        if (incomingNum == 0) {
            throw new FirstException("Your number shouldn't be zero");
        } else if (incomingNum > 0) {
            throw new SecondException("Your number shouldn't be bigger than zero");
        } else {
            throw new ThirdException("Your number shouldn't be lower than zero");
        }
    }
}
