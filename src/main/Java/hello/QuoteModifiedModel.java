package hello;

import lombok.Builder;

@Builder
public class QuoteModifiedModel {
    public String quote;
    public String author;
    public String category;
}
