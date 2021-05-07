package filters;

public abstract class Filter implements Runnable{

    protected Pipe input,output;   //Declaramos una tuberia para entrada
                                   //Declaramos una tuberia para salida
    public Filter(Pipe in, Pipe out){
        input = in;
        output = out;
    }
    public void start() {
        Thread thread = new Thread(this);
        thread.start();
        System.out.println("EJECUTANDO.... "+ thread.currentThread().getName());
    }

    @Override
    public void run() {
        long initialTime = System.currentTimeMillis();
        transform();
    }
    public abstract void transform();
}
