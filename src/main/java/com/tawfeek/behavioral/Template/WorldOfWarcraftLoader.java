package com.tawfeek.behavioral.Template;

public class WorldOfWarcraftLoader extends BaseGameLoader{
    @Override
    byte[] loadLocalData() {

        System.out.println("loadLocalData");
        return new byte[0];
    }

    @Override
    void createObjects(byte[] data) {
        System.out.println("create wow objects");
    }

    @Override
    void downloadAdditionalFiles() {
        System.out.println("download additional files of wow ");
    }

    @Override
    void initializeProfiles() {
        System.out.println("initialize profiles of wow");
    }

    @Override
    void cleanTempFiles() {
        System.out.println("clean temp files of wow");
    }
}
