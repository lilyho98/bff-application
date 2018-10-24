package hello;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuoteUsecaseService {

    private QuoteService quoteService;

    @Autowired
    public QuoteUsecaseService(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    public QuoteModifiedModel getQuote() {
         val quoteModel = quoteService.getQuote();
         return convertquoteModelToModifiedModel(quoteModel);

    }

    private QuoteModifiedModel convertquoteModelToModifiedModel(QuoteModel quoteModel) {
        return QuoteModifiedModel.builder().quote(quoteModel.getQuote()).
                author(quoteModel.getAuthor()).category(quoteModel.getCat()).build();
    }
}
