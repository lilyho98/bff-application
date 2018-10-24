package hello;

import lombok.val;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HttpQuoteService implements QuoteService {

    @Override
    public QuoteModel getQuote() {
        RestTemplate restTemplate = new RestTemplate();
        val url = "https://talaikis.com/api/quotes/random/";
        val quoteModel = restTemplate.getForObject(url, QuoteModel.class);
        return quoteModel;
    }

}
