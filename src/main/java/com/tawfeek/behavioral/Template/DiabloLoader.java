package com.tawfeek.behavioral.Template;

public class DiabloLoader extends BaseGameLoader{
    @Override
    byte[] loadLocalData() {
        System.out.println("load local data of diablo");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("create objects of diablo");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("download additional files of diablo");
    }

    @Override
    void initializeProfiles() {
        System.out.println("initialize profiles of diablo");
    }

    @Override
    void cleanTempFiles() {
        System.out.println("clean temp files of diablo");
    }
}
