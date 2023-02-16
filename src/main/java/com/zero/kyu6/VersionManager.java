package com.zero.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VersionManager {

    private String version;
    private final String defaultVersion = "0.0.1";
    private int major;
    private int minor;
    private int patch;
    private List<String> listCallOrderMethod = new ArrayList<>();
    private List<String> listHistoryVersion = new ArrayList<>();

    public VersionManager(){
        this.version = this.defaultVersion;
        this.listHistoryVersion.add(this.version);
        this.breakVersion();
    }

    public VersionManager(String version) throws Exception {
        if(version.length() == 0){
            this.version = this.defaultVersion;
        } else {
            if(!this.isValidVersion(version)){
                throw new Exception("Error occured while parsing version!");
            }
            this.version = version;
        }
        this.listHistoryVersion.add(this.version);
        this.breakVersion();
    }

    public VersionManager major(){
        this.listCallOrderMethod.add("major");

        this.major += 1;
        this.minor = 0;
        this.patch = 0;

        this.buildVersion();
        return this;
    }

    public VersionManager minor(){
        this.listCallOrderMethod.add("minor");

        this.minor += 1;
        this.patch = 0;

        this.buildVersion();
        return this;
    }

    public VersionManager patch(){
        this.listCallOrderMethod.add("patch");

        this.patch += 1;

        this.buildVersion();
        return this;
    }

    public VersionManager rollback() throws Exception{
        if(listCallOrderMethod.isEmpty()){
            throw new Exception("Cannot rollback!");
        }
        this.listCallOrderMethod.add("rollback");
        this.substractVersion();
        return this;
    }

    public String release(){

        for(String s : listCallOrderMethod){
            System.out.println("order method : " + s);
        }

        for(String s : listHistoryVersion){
            System.out.println("history version : " + s);
        }
        System.out.println("version : " + this.version);
        return this.version;
    }

    private void buildVersion(){
        StringBuilder builder = new StringBuilder();
        builder.append(this.major).append(".");
        builder.append(this.minor).append(".");
        builder.append(this.patch);
        this.version = builder.toString();
        this.listHistoryVersion.add(this.version);
    }

    private void breakVersion(){
        String[] versions = this.version.split("\\.");
        String[] newVersions = new String[3];
        if(versions.length == 1){
            newVersions[0] = versions[0];
            newVersions[1] = "0";
            newVersions[2] = "0";
        } else if(versions.length == 2){
            newVersions[0] = versions[0];
            newVersions[1] = versions[1];
            newVersions[2] = "0";
        } else {
            newVersions[0] = versions[0];
            newVersions[1] = versions[1];
            newVersions[2] = versions[2];
        }

        try {
            this.major = Integer.parseInt(newVersions[0]);
            this.minor = Integer.parseInt(newVersions[1]);
            this.patch = Integer.parseInt(newVersions[2]);
            this.buildVersion();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    private boolean isValidVersion(String version) throws Exception{
        String[] split = version.split("\\.");
        for(int i = 0; i < split.length; i++){
            try{
                if(i < 3){
                    Integer.parseInt(split[i]);
                }
            } catch (Exception e){
                return false;
            }
        }
        return true;
    }

    private void substractVersion(){
        for(int i = 0; i < listCallOrderMethod.size(); i++){
            if(listCallOrderMethod.get(i).equals("rollback") && i != 0){
                this.version = this.listHistoryVersion.get(this.listHistoryVersion.size() - 2);
                this.listHistoryVersion.remove(this.listHistoryVersion.size() - 1);
                listCallOrderMethod.remove(i);
                listCallOrderMethod.remove(i - 1);
            }
        }
    }
}
