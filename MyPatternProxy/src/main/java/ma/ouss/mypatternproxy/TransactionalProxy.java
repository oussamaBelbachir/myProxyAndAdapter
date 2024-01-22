package ma.ouss.mypatternproxy;

public class TransactionalProxy implements IMetier{
    private IMetier metier;
    @Override
    public void process() {
        System.out.println("Start");
        metier = new MetierImpl();
        metier.process();
        System.out.println("Rollback OR Commit");
    }
}
