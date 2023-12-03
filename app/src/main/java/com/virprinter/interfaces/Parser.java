package com.virprinter.interfaces;

import java.io.File;
import java.util.Map;

public interface Parser {
    String getDeviceName();
    String getDeviceType();
    String getDeviceNumber();
    Map<String,Double> getDeviceMap();
    void parse(String inputFile);
}
