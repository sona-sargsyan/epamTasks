package com.company.electronicdevices;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;

/**
 * Created by sonasargsyan on 2/18/20.
 */
public class Room {

    public List<ElectronicDevice> roomDevices;

    public Room() {
        this.roomDevices = new ArrayList<>();
    }

    public List<ElectronicDevice> getRoomDevices(){
        return roomDevices;
    }

    public List<ElectronicDevice> findDevices(Predicate<ElectronicDevice> filter){

        return (List<ElectronicDevice>)roomDevices.stream().filter(filter).collect(Collectors.toList());

    }

    public List<ElectronicDevice> sortDevices(Function<ElectronicDevice, Comparable> sort){

        return (List<ElectronicDevice>)roomDevices.stream().sorted(Comparator.comparing(sort)).collect(Collectors.toList());

    }

    public void addDeviceToRoom(ElectronicDevice device){
        roomDevices.add(device);
    }
}
