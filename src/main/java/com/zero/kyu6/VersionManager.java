package com.zero.kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class VersionManager {

    private String version;
    private String currentVersion;
    private String lastVersion;
    private final String defaultVersion = "0.0.1";
    private int major;
    private int minor;
    private int patch;
    private int lastMajor;
    private int lastMinor;
    private int lastPatch;
    private List<String> listCallOrderMethod = new ArrayList<>();

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
            this.version = version;
        }
        this.breakVersion();
    }

    public VersionManager major(){
        this.listCallOrderMethod.add("major");
        this.lastMajor = this.major;
        this.lastMinor = this.minor;
        this.lastPatch = this.patch;

        this.major += 1;
        this.minor = 0;
        this.patch = 0;

        return this;
    }

    public VersionManager minor(){
        this.listCallOrderMethod.add("minor");
        this.lastMinor = this.minor;
        this.lastPatch = this.patch;

        this.minor += 1;
        this.patch = 0;

        return this;
    }

    public VersionManager patch(){
        this.listCallOrderMethod.add("patch");
        this.lastPatch = this.patch;

        this.patch += 1;

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

        System.out.println("major : " + this.major);
        System.out.println("minor : " + this.minor);
        System.out.println("patch : " + this.patch);

        StringBuilder builder = new StringBuilder();
        builder.append(this.major).append(".");
        builder.append(this.minor).append(".");
        builder.append(this.patch);
        this.currentVersion = builder.toString();

        if(this.currentVersion.equals("0.0.0")){
            this.currentVersion = this.defaultVersion;
        }

        System.out.println("release version : " + this.currentVersion);
        return this.currentVersion;
    }

    private void breakVersion(){
        String[] versions = this.version.split("\\.");
        try {
            this.major = Integer.parseInt(versions[0]);
            this.minor = Integer.parseInt(versions[1]);
            this.patch = Integer.parseInt(versions[2]);
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
                String versionToSub = listCallOrderMethod.get(i - 1);
                switch (versionToSub){
                    case "major":
                        this.major = this.lastMajor;
                        this.minor = this.lastMinor;
                        this.patch = this.lastPatch;
                        break;
                    case "minor":
                        this.patch = this.lastPatch;
                        this.minor = this.lastMinor;
                        break;
                    case "patch":
                        this.patch = this.lastPatch;
                }
                listCallOrderMethod.remove(i);
                listCallOrderMethod.remove(i - 1);
            }
        }
    }
}
