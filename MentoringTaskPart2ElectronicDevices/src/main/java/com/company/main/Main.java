package com.company.main;
import com.company.commen.DBConnection;
import com.company.commen.ReadWriteFromToFile;
import com.company.electronicdevices.*;
import com.company.exceptions.IncorrectPowerException;
import com.company.exceptions.UndefinedDeviceException;
import com.company.exceptions.UnpluggedDeviceException;
import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.sql.SQLException;
import java.util.Map;

public class Main {

    enum devicesEnum {
        TV,
        Vacuum,
        Refrigerator,
        Microwave
    };

    public static void main(String[] args) throws IOException, IncorrectPowerException, SQLException {

        ElectronicDevice microwave = new Microwave();
        ElectronicDevice refrigerator = new Refrigerator();
        ElectronicDevice tv = new TV();
        ElectronicDevice vacuum = new Vacuum();

        tv.setIsPowerOn(true);
        Room room = new Room();

        room.addDeviceToRoom(tv);
        room.addDeviceToRoom(microwave);
        room.addDeviceToRoom(vacuum);
        room.addDeviceToRoom(tv);
        room.addDeviceToRoom(refrigerator);

        room.findDevices(device -> device.getPower() > 700);
        room.sortDevices(device -> device.getPower());

        try {
            ReadWriteFromToFile obj = new ReadWriteFromToFile();
            Gson gson = new Gson();
            String json = obj.readFromFile("text.json");
            String jsonString = gson.toJson(room);
            obj.writeToFile(jsonString, "output.txt");

            Type type = new TypeToken<Map<String, ElectronicDevice>>() {
            }.getType();
            Map<String, ElectronicDevice> myMap = gson.fromJson(json, type);

            for (Map.Entry<String, ElectronicDevice> entry : myMap.entrySet()) {

                if (entry.getKey().contains(devicesEnum.values().toString())){
                    throw new UndefinedDeviceException(entry.getKey()+ " is not a device!");
                }
                if (entry.getValue().getPower() > 900) {
                    throw new IncorrectPowerException(entry.getKey() + " power is too high!");
                }
                if (!entry.getValue().isPowerOn()) {
                    throw new UnpluggedDeviceException(entry.getKey() + " device is unplugged!");
                }
            }
        } catch (JsonParseException ex) {
            ex.printStackTrace();
        } catch (UndefinedDeviceException ex) {
            ex.printStackTrace();
        } catch (IncorrectPowerException ex) {
            ex.printStackTrace();
        } catch (UnpluggedDeviceException ex) {
            ex.printStackTrace();
        }

        DBConnection db = new DBConnection();
        db.selectAll();
    }
}