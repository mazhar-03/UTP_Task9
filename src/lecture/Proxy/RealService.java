package lecture.Proxy;

public class RealService implements Service{

    @Override
    public void performTask(String taskName) {
        System.out.println("Execute task: " + taskName);
    }
}
