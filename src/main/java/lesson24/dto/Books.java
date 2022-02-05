package lesson24.dto;

import com.opencsv.bean.CsvBindByName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    @CsvBindByName
    private int id;
    @CsvBindByName
    private long isbn;
    @CsvBindByName
    private String title;
    @CsvBindByName
    private String link;
    @CsvBindByName
    private int pages;
    @CsvBindByName
    private String attributes;

}
