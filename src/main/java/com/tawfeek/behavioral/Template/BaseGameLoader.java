package com.tawfeek.behavioral.Template;

public abstract class BaseGameLoader {

    public void load(){
        byte [] data = loadLocalData();

        createObjects(data);
        downloadAdditionalFiles();
        cleanTempFiles();
        initializeProfiles();
    }

    abstract byte [] loadLocalData();
    abstract void createObjects(byte [] data);
    abstract void downloadAdditionalFiles();
    abstract void initializeProfiles();
    abstract void cleanTempFiles();

    protected void cleanTempData(){
        System.out.println("Cleaning temp data");
    }
}
