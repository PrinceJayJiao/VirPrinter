package com.virprinter.interfaces;

public abstract class AbstractComListener {
    private String tmpFolder;
    private String actionFolder;
    private String fixedValueFolder;

    public AbstractComListener(String tmpFolder, String actionFolder, String fixedValueFolder) {
        this.tmpFolder = tmpFolder;
        this.actionFolder = actionFolder;
        this.fixedValueFolder = fixedValueFolder;
    }


    void listen() {

    }
}
