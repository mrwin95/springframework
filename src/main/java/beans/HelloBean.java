package beans;

public class HelloBean {

    public void init() throws Exception {
        System.out.println("Bean Hello has been started");
    }

    public void destroy() throws Exception {
        System.out.println("Bean Hello has been destroyed");
    }
}
