public class ThreadWorkerWithSync extends Thread{
    private final ResourcesExploiter rExp;

    public ThreadWorkerWithSync(ResourcesExploiter rExp) {
        this.rExp = rExp;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        synchronized (rExp) {
            for (int i = 0; i < 1000; i ++) {
                rExp.exploit();
                System.out.println(name + ": " + rExp.getRsc());
            }
        }
    }
}
