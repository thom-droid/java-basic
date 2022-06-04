package thread;

public class SharedObjByMultiThreads {

    public static void main(String[] args) {
        SharedObj sharedObj = new SharedObj(0, "Shared Obj");
        User1 user1 = new User1();
        user1.setSharedObj(sharedObj);
        user1.start();

        User2 user2 = new User2();
        user2.setSharedObj(sharedObj);
        user2.start();
    }
}
