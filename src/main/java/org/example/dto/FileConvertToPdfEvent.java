package org.example.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FileConvertToPdfEvent {

    @NotBlank(message = "fileId must not be blank")
    private String fileId;

    @NotBlank(message = "inputPath must not be blank")
    private String inputPath;
}
