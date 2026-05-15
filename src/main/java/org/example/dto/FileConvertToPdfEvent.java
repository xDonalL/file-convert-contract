package org.example.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FileConvertToPdfEvent {

    @NotBlank(message = "fileId must not be blank")
    private String fileId;

    @NotBlank(message = "inputPath must not be blank")
    private String inputPath;
}
