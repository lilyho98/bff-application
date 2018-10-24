package hello;

import lombok.val;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

public class QuoteUsecaseServiceTest {
    private QuoteUsecaseService testInstance;

    @Mock
    private QuoteService quoteService;

    @Before
    public void givenQuoteService() {
        MockitoAnnotations.initMocks(this);
        testInstance = new QuoteUsecaseService(quoteService);
    }

    @Test
    public void shouldGetQuoteSuccessfully() {
        when(quoteService.getQuote()).thenReturn(validQuoteModel());
        val quote = testInstance.getQuote();
        assertThat(quote, is(notNullValue()));
        assertThat(quote.author, is("Maggie Smith"));
        assertThat(quote.quote, is("I tend to head for what's amusing because a lot of things " +
                "aren't happy. But usually you can find a funny side to practically anything."));

    }

    private QuoteModel validQuoteModel() {
        val quoteModel = new QuoteModel();
        quoteModel.setQuote("I tend to head for what's amusing because a lot of things " +
                "aren't happy. But usually you can find a funny side to practically anything.");
        quoteModel.setAuthor("Maggie Smith");
        quoteModel.setCat("funny");
        return quoteModel;
    }
}
