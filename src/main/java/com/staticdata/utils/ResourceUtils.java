package com.staticdata.utils;


import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

@Slf4j
public class ResourceUtils {

    public static String getResourceAsJson(String resourcePath) {
        StringBuilder builder = new StringBuilder();
        try {

            File file = org.springframework.util.ResourceUtils.getFile("classpath:"+ resourcePath);
            builder.append(new String(Files.readAllBytes(file.toPath())));

        } catch (FileNotFoundException e) {
            log.error("Error in getting file at path : {}", resourcePath, e);
        }
        catch (IOException e) {
            log.error("Error in getting file at path : {}", resourcePath, e);
        }
        return builder.toString();
    }

}
