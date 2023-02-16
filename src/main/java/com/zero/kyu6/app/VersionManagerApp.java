package com.zero.kyu6.app;

import com.zero.kyu6.VersionManager;

import java.util.Arrays;

public class VersionManagerApp {
    public static void main(String[] args) throws Exception {

        new VersionManager("49.38.0").major().rollback().release();
    }
}
