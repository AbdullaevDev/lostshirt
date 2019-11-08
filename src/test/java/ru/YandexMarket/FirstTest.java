package ru.YandexMarket;

import org.checkerframework.checker.units.qual.C;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ali\\Downloads\\chrom.driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://market.yandex.ru/");
        driver.findElement(By.cssSelector("body > div.main > div > span > div.n-w-tabs.n-w-tabs_flex_row.b-zone.i-bem.n-w-tabs_js_inited > noindex > div.n-w-tabs__horizontal-tabs-container > div > div > div.n-w-tabs__horizontal-tabs > div.n-w-tab.n-w-tab_interaction_click-navigation-menu.n-w-tab_type_navigation-menu-grouping.i-bem.n-w-tab_js_inited > div")).click();
        driver.get("https://market.yandex.ru/catalog--tovary-dlia-zhivotnykh/54496");
        driver.get("https://market.yandex.ru/catalog--lakomstva-dlia-koshek/62819/list?hid=15963668");
        driver.findElement(By.xpath("//*[@id=\"glpricefrom\"]")).sendKeys("50");
        driver.findElement(By.xpath("//*[@id=\"glpriceto\"]")).sendKeys("150");
      //  driver.findElement(By.cssSelector("#search-prepack > div > div > div:nth-child(3) > div > div > div._178jz2CyDL > div:nth-child(14) > div > div > fieldset > ul > li:nth-child(1) > div > label > div > span")).click();
        driver.findElement(By.cssSelector("#search-prepack > div > div > div:nth-child(3) > div > div > div._178jz2CyDL > div:nth-child(3) > div > div > fieldset > ul > li:nth-child(1) > div > a > label > div > span")).click();
        driver.get("https://market.yandex.ru/product--lakomstvo-dlia-koshek-beaphar-happy-rolls-mix/218886032?show-uid=15731305547635440942516001&nid=62819&glfilter=7893318%3A10714501&offer-shipping=delivery&pricefrom=50&priceto=150&context=search");
        driver.findElement(By.cssSelector("body > div.main > div.n-product-summary.b-zone.i-bem.n-product-summary_js_inited.b-zone_js_inited > div.n-product-summary__header > div > div > div > div.n-product-title-features__toolbar > div > div")).click();
        driver.get("https://market.yandex.ru/catalog--lakomstva-dlia-koshek/62819/list?hid=15963668&glfilter=7893318%3A10714501&onstock=1&local-offers-first=0&pricefrom=50&priceto=150&offer-shipping=delivery");
        //driver.findElement(By.cssSelector("#search-prepack > div > div > div:nth-child(3) > div > div > div._178jz2CyDL > div:nth-child(3) > div > div > fieldset > ul > li:nth-child(1) > div")).click();
        driver.findElement(By.cssSelector("#search-prepack > div > div > div:nth-child(3) > div > div > div._178jz2CyDL > div:nth-child(3) > div > div > fieldset > ul > li:nth-child(1) > div > a > label > div > span")).click();
        driver.findElement(By.cssSelector("#search-prepack > div > div > div:nth-child(3) > div > div > div._178jz2CyDL > div:nth-child(3) > div > div > fieldset > ul > li:nth-child(9) > div > a > label > div > span")).click();
        driver.get("https://market-click2.yandex.ru/redir/GAkkM7lQwz62j9BQ6_qgZr_1ZOSqTKvllZTBh72I-fzO8a_0LlloSMZMhNmiAG-1oQBuJBxqk1u30kgAHENgIgg2xxGYREKZJSTD133vJMv4JyJtMk_k5SCdHRv_EyEl-gylVvqIWWmf9afsCCITYCsk3oKctPbzb-Zfec-t9hWcen7IUa9J1VvUMJkI8IYmTZuHJbZrRZv6Z1Kx4njjhTcJNfHLFKQuWdGHtsqGJzd5GsHyY1pUdoHU2GsJpxODB9cg9DG8i7StrLvdbPYLOvYkGZx2-XXd-B1wnfufffxXHs7Tlsbusa-Db1LRBA-Zor0Ann98TY09i221CU3Qz5LezT4Y8Y_rk4uykGdKo7zpLkUVXZlxQ-hXpTrLZ14Jg1Z71SKstecVDSEkLU0YIHjK6zyJKXgblcmD2DcS14oZX30J_NPBru1WsY22KqI5jUUOhr_RaWnPoPf6USY_flmV4g3glgviYU34jOcpNm3uKVa1fU_JeHfDFEgj46BcHt4XBPzEIzoZjTCtSAI2pMNnGSrjXqLw3WjaJfKrzFWGrPEw7h_FyQGvHLSuZVDLrCod7va_QqYNTWS3QC44D5EW_Innsh7Bk7ScsEiPYRPbwI0TiGsAzQ5tB-zKxP6l5DCn4oiNofxPV_Wquu4deVXNVyclHJUPDT8J40ADBnzlnKA5JOcLVUehIb6VYFr7A7NW6Kdk9DjBWsLFRUXKo13wNdstS206r-36RM-OXbFF5Sl3SEcGAIqfZmapUFS00kIDmeUUS3yx1pOXXs3gIDFQq6JrN4WojFTGspe6BEfkIosdd94AJ2M9c3SzP90ptvwTXTukS11bpUkb19dUatGrX5IXM8mAvNYn1SvMh4UYIVl3Ul2SUaftCTtfbtDMOh1VfbAOpUrlQRBshxXu6XziRNbegJLoBxqKVWvIHKJtFyOy9vzuoWxC757o61b8mHTtXiAsa70CoaZ9iRIOzOgdZXGvbOQm?data=QVyKqSPyGQwNvdoowNEPjRkJWfFMyEuXxTJr1s8gK_W-fAWK8RQq_q3s1OghQKzHgRR0SE--lPUh--jme-X4Zd5h-z77cMAUGrGSH4AjgmNRg1rON698v5qaJW5NlFvV4DLcYtF_xSxuJhIV83Dbx-pxUwblvIXgz2_k7LMmT7dYpxNOiJk0ItowUovCkycG117GK4dn7Pq7XgODdvV_F2BhJv2ozzwXNrcVidr_jeAwIB6H3wL9IIc0BIrhgwhTEaqgXF6FzcFkP3zJVR1pjNbpXIxie9BGhnFGwjnLTtHhRSOlEBfRz-loHUN5HXvFyAgxCb9EnueQ8uoUMqEncs2ds8gALCsqhQTftROSeffqDQIJVnI-Ze7WFDJgewVP0VYBdDimRlStuBMAh3_3sPDrp9pPWCexULQ-FammYZtMw9k7NOxwySfXFpm-g8nA-VtMzeyCTfKOiblWgqmmHAcYXcP53ZgUwiPQICSqctG90FQccKbislFd824X2aPDDJ-fHXtoPdct-pFDYwzTo6nZibGuwxDpOARWb_CrwmGMrc_s9_fIUD8SueElWgdhwrFa-dczwqozRKbbQBlBFiBHiuIhTXgHdsMKwb1EW0dzK8GvKSMWQmDedhYGkt88M2YAnL4DLvzlPVvMFiXyG46kKWd1BK_5wrvJUu27mi4nNPLBq4-lbJNfILM5Aul7imc-eKpMJON-KY16f7HhI7pN4oDnqE_XuSfNRzSH8H-e-J9nYjvhktycUJHNCziuMLczMgArzcvfbultzGdipsqM5iGZkRr_&b64e=1&sign=7a17f88eeb800528e243b40df65d0e30&keyno=1");
        driver.get("https://market.yandex.ru/product--lakomstvo-dlia-koshek-triol-kolbaski-appetitnye-krolik-s-kuritsei/536924438?show-uid=15731335311418871048716003&nid=62819&glfilter=7893318%3A10717307&offer-shipping=delivery&pricefrom=50&priceto=150&context=search");
        driver.findElement(By.cssSelector("body > div.main > div.n-product-summary.b-zone.i-bem.n-product-summary_js_inited.b-zone_js_inited > div.n-product-summary__header > div > div > div > div.n-product-title-features__toolbar > div > div")).click();
        driver.get("https://market.yandex.ru/compare?track=head");
        driver.findElement(By.cssSelector("body > div.main > div.n-compare.n-compare-draggable.i-bem.n-compare_type_diff.n-compare-draggable_js_inited.n-compare_js_inited > div.layout.layout_type_maya.layout_context_compare > div.n-compare-toolbar.i-bem.n-compare-toolbar_js_inited > div.n-compare-toolbar__action > span > span")).click();
        //  driver.quit();

    }

}
