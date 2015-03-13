package com.paths;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import static java.nio.file.Files.readAllBytes;
import static java.nio.file.Paths.get;

/**
 * Created by ankurks on 3/10/2015.
 */
public class ReadFileAndMap {
    static Map<String, List<String>> routesfromFile = new Hashtable<String, List<String>>();

    public static String getFileContent(String fileName) throws IOException {
        return new String(readAllBytes(get(fileName)));
    }

    public static String[] splitContentAtNewLine(String content) {
        return content.split("\r\n");
    }

    public static void mapToRoute(String[] splittedContent) {
        Paths.routes = routesfromFile;
        for (String line : splittedContent) {
            String[] lineArray = line.split(",");
            addFirstEleAsKeyOthersInList(lineArray);
            addSecondEleAsKey(lineArray);
        }

    }

    private static void addSecondEleAsKey(String[] lineArray) {
        List<String> cont = Paths.routes.get(lineArray[1].toLowerCase());
        if (cont == null) {
            cont = new ArrayList<String>();
            cont.add(lineArray[0].toLowerCase());
            Paths.routes.put(lineArray[1].toLowerCase(), cont);
        } else {
            if (!cont.contains(lineArray[0].toLowerCase()))
                cont.add(lineArray[0].toLowerCase());
        }
    }

    private static void addFirstEleAsKeyOthersInList(String[] lineArray) {
        List<String> cont = Paths.routes.get(lineArray[0].toLowerCase());
        if (cont == null) {
            cont = new ArrayList<String>();
            cont.add(lineArray[1].toLowerCase());
            Paths.routes.put(lineArray[0].toLowerCase(), cont);
        } else {
            if (!cont.contains(lineArray[1].toLowerCase()))
                cont.add(lineArray[1].toLowerCase());
        }
    }
}