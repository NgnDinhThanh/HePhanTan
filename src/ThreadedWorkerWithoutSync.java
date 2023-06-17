public class ThreadedWorkerWithoutSync extends  Thread{
    private ResourcesExploiter rExp;

    public ThreadedWorkerWithoutSync(ResourcesExploiter rExp) {
        this.rExp = rExp;
    }
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 1000; i++) {
            rExp.exploit();
            System.out.println(name + ": " + rExp.getRsc()) ;
        }
    }
}
