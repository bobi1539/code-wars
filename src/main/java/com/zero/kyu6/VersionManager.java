package com.zero.kyu6;

import java.util.ArrayList;
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
        this.breakVersion();
    }

    public VersionManager(String version) throws Exception {
        if(version.length() == 0){
            this.version = this.defaultVersion;
        } else {
            if(!this.isValidVersion(version)){
                throw new Exception("Error occured while parsing version!");
            }
            this.setUpVersion(version);
        }
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

        System.out.println("\nmajor : " + this.major);
        System.out.println("minor : " + this.minor);
        System.out.println("patch : " + this.patch);

        System.out.println("version : " + this.version);
        return this.version;
    }

    private void setUpVersion(String version){
        String[] versions = version.split("\\.");
        if(versions.length == 1){
            version = versions[0] + ".0.0";
        }
        if (versions.length == 2){
            version = versions[0] + "." + versions[1] + ".0";
        }
        this.version = version;
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
        try {
            this.major = Integer.parseInt(versions[0]);
            this.minor = Integer.parseInt(versions[1]);
            this.patch = Integer.parseInt(versions[2]);
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

                String[] split = this.version.split("\\.");
                this.major = Integer.parseInt(split[0]);
                this.minor = Integer.parseInt(split[1]);
                this.patch = Integer.parseInt(split[2]);
            }
        }
    }
}
