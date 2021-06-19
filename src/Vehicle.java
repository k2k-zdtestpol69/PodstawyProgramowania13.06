import java.lang.reflect.Array;
import java.util.ArrayList;

public class Vehicle {
    public boolean tableChecker(ArrayList<Motorcycle> motorcycleArrayList) {
        return (motorcycleArrayList.isEmpty());
    }

    public void motorcycleCheck(ArrayList<Motorcycle> motorcycleArrayList) {
        if (tableChecker(motorcycleArrayList)) {
            System.out.println("Ta lista motocyklów jest pusta!");
        }
        {
            for (int i = 1; i < motorcycleArrayList.size()+1; i++){
                System.out.println("Motor nr "+i+"marki"+);
        }
        }
    }
}
