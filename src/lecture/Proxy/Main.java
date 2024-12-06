package lecture.Proxy;
public class Main {
    public static void main(String[] args) {
        Service rService = new RealService();

        rService.performTask("My task");

        Service pService = (Service) LoggingProxy.createProxy(rService);
        pService.performTask("My task");
    }
}
