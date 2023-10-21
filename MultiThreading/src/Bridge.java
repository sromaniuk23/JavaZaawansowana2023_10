public class Bridge {
    public synchronized void driveThrough(Car car){
        System.out.println("Car "+car+" is driving throught the bridge!!!");
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Car "+car+" left the bridge!!!");
    }
}
