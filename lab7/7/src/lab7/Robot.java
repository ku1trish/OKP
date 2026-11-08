package lab7;

public class Robot {
    private String model;
    private String function;
    private int batteryLife;

    private static int totalRobots;
    private static int totalBatteryLife;

    public Robot(String model, String function, int batteryLife) {
        this.model = model;
        this.function = function;
        this.batteryLife = batteryLife;
        totalRobots++;
        totalBatteryLife += batteryLife;
    }

    public String getModel(){
        return model;
    }
    public String getFunction(){
        return function;
    }
    public int getBatteryLife(){
        return batteryLife;
    }
    public static double getAverageBatteryLife (){
        if(totalRobots == 0){
            return 0;
        }
        return (double)totalBatteryLife/totalRobots;
    }

}
