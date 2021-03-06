package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/random-quote")
public class QuoteController {

    private QuoteUsecaseService quoteUsecaseService;

    @Autowired
    public QuoteController(QuoteUsecaseService quoteUsecaseService) {
        this.quoteUsecaseService = quoteUsecaseService;
    }

    @RequestMapping(method = GET, produces = APPLICATION_JSON_VALUE)
    public QuoteModifiedModel getQuote() {
        return quoteUsecaseService.getQuote();
    }




}
