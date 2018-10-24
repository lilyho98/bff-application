package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class QuoteModel {

    public String quote;
    public String author;
    public String cat;

}
