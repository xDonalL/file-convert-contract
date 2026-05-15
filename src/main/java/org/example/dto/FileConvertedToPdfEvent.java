package org.example.dto;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class FileConvertedToPdfEvent {
    private String fileId;
    private String pdfPath;
}
