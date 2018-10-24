package hello;


import lombok.val;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.apache.logging.log4j.util.Strings.isNotBlank;

public class HttpQuoteServiceTest {

    private HttpQuoteService testInstance;

    @Before
    public void setUp() {
        testInstance = new HttpQuoteService();
    }

    @Test
    public void getQuoteShouldWork() {
        val result = testInstance.getQuote();
        assertTrue(isNotBlank(result.getAuthor()));
        assertTrue(isNotBlank(result.getCat()));
        assertTrue(isNotBlank(result.getQuote()));
        System.out.print(result.toString());

    }
}
