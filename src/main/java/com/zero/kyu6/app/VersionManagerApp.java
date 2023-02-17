package com.zero.kyu6.app;

import com.zero.kyu6.VersionManager;

import java.util.Arrays;

public class VersionManagerApp {
    public static void main(String[] args) throws Exception {

        new VersionManager("46.45").patch().major().rollback().rollback().minor().rollback().patch().major().patch().minor().rollback().release();
    }
}
