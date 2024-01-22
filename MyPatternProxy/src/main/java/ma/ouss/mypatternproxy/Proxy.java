package ma.ouss.mypatternproxy;
import java.util.Random;
public class Proxy implements Standard {
    private StandardImpl1 target = new StandardImpl1();
    @Override
    public void process() {
        boolean b = new Random().nextBoolean();
        if(b){
            System.out.println("Before");
            target = new StandardImpl1();
            target.process();
            System.out.println("Ater");
        }else {
            throw new RuntimeException("403");
        }
    }
}
