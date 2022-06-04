package thread;

public class User2 extends Thread{

    private SharedObj sharedObj;

    public void setSharedObj(SharedObj sharedObj) {
        setName(this.getClass().getTypeName());
        this.sharedObj = sharedObj;
    }

    @Override
    public void run() {
        sharedObj.setData(50);
    }
}
