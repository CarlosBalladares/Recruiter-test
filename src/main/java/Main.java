package main.java;

import main.java.thermometer.*;

/**
 * Created by carlosballadares on 2018-06-08.
 */


public class Main {
    public static boolean CELSIUS= true;
    public static boolean FARENHEIT= false;


    public static void main(String[] args){
        Thermometer tm = new Thermometer();
//        tm.reportTemperature(FARENHEIT);
//        tm.setTemperature(33f, FARENHEIT);
//        tm.reportTemperature(CELSIUS);
//
//        Float temp = 50f;
//
//
//        TemperatureListener tlFreezing = tm.listen("freezing", new Callback() {
//            @Override
//            public void execute() {
//                System.out.println("its freezing");
//            }
//        });
//
//        TemperatureListener tlBoiling = tm.listen("boiling", new Callback() {
//            @Override
//            public void execute() {
//                System.out.println("its boiling");
//            }
//        });
//
//        tm.setTemperature(100f, FARENHEIT);
//        tm.setTemperature(100f, CELSIUS);
//
//
//        tm.unlisten(tlBoiling);
//
//        tm.setTemperature(100f, CELSIUS);
//        tm.setTemperature(0f, CELSIUS);
//
//        tm.unlisten(tlFreezing);
//        tm.setTemperature(0f, CELSIUS);
//        tm.setTemperature(100f, CELSIUS);
//
//        Settings freezing = new Settings();
//
//
//        TemperatureListener listen = tm.listen(freezing, new Callback() {
//            @Override
//            public void execute() {
//                System.out.println("freezing");
//            }
//        });

        Settings fall= new Settings();
        fall.temperature = 0f;
        fall.direction = Settings.Direction.DOWN;
        fall.ignoreBand = 0f;

        tm.setTemperature(5f, CELSIUS);


        Settings freezing = new Settings();
        freezing.temperature = 0f;
        freezing.direction = Settings.Direction.ANY;
        freezing.ignoreBand = 0.5f;

        tm.listen(freezing, new Callback() {
            @Override
            public void execute() {
                System.out.println("We are freezing");
            }
        });

        tm.setTemperature(10f, CELSIUS);

        tm.setTemperature(0f, CELSIUS);
        tm.setTemperature(0.5f, CELSIUS);
        tm.setTemperature(-0.5f, CELSIUS);
        tm.setTemperature(0f, CELSIUS);
        tm.setTemperature(0f, CELSIUS);
        tm.setTemperature(0f, CELSIUS);
        tm.setTemperature(0f, CELSIUS);
        tm.setTemperature(0f, CELSIUS);
        tm.setTemperature(0f, CELSIUS);

        tm.setTemperature(1f, CELSIUS);


        Settings settings = SettingsFactory.get("Freezing");

        tm.listen(settings, new Callback() {
            @Override
            public void execute() {
                //Do something when its freezing.
            }
        });









    }



}
