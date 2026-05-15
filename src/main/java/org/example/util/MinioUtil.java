package org.example.util;

import lombok.extern.slf4j.Slf4j;
import org.example.dto.MinioPath;
import org.example.exception.InvalidMinioPathException;

@Slf4j
public class MinioUtil {

    private MinioUtil() {}

    public static MinioPath parseMinioPath(String inputPath) {

        if (inputPath == null || inputPath.isBlank()) {
            log.warn("MinIO path is null or blank");
            throw new InvalidMinioPathException(inputPath);
        }

        String[] parts = inputPath.split("/", 2);

        if (parts.length < 2) {
            log.warn("Invalid MinIO path format: {}", inputPath);
            throw new InvalidMinioPathException(inputPath);
        }

        return new MinioPath(parts[0], parts[1]);
    }
}
