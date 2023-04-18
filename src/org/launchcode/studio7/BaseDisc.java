package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc implements OpticalDisc {
    public BaseDisc(String title, String dataType, String capacity, String discType) {
        this.title = title;
        this.dataType = dataType;
        this.capacity = capacity;
        this.discType = discType;
    }

    public String getTitle() {
        return title;
    }

    public String getDataType() {
        return dataType;
    }

    public String getCapacity() {
        return capacity;
    }

    public String getDiscType() {
        return discType;
    }

    public ArrayList<File> getFiles() {
        return files;
    }

    public void setFiles(ArrayList<File> files) {
        this.files = files;
    }
    private final String title;
    private final String dataType;
    private final String capacity;
    private final String discType;
    private ArrayList<File> files = new ArrayList<>();

    @Override
    public void spinDisk() {
        System.out.println("spinning...");
    }

    @Override
    public String read() {
        return null;
    }

    @Override
    public void write() {
    return this.data();
    }
}
