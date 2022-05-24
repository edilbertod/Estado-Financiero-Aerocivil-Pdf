package co.com.choucair.aerocivil.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EstadoFinancieroPagina extends PageObject {


    public static final Target TRANSPARENCIA = Target.the("").located(By.xpath("//*[@id=\"zz2_RootAspMenu\"]/li[7]/a/span/span"));
    public static final Target PRESUPUESTO = Target.the("").located(By.xpath("/html/body/form/div[13]/div[1]/div[2]/div[4]/nav/div[2]/div/div[1]/div/div/ul/li[7]/ul/li[6]/a/span/span"));
    public static final Target EST_FINAN = Target.the("").located(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_MenuThirdLevel\"]/ul/li[3]/a"));
    public static final Target BALANCES = Target.the("").located(By.xpath("//*[@id=\"WebPartWPQ10\"]/div[1]"));
    public static final Target PDF = Target.the("").located(By.xpath("//*[@id=\"paging_container3\"]/ul/li[1]/div/div/div/a[1]"));
}
