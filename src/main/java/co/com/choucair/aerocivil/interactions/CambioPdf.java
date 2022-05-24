package co.com.choucair.aerocivil.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;

import java.util.Set;

import static net.serenitybdd.core.Serenity.getDriver;

public class CambioPdf implements Interaction {
    public static CambioPdf the(){
        return new CambioPdf();
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        int venti = 2;
        int vent = 0;

        Set<String> ventana = getDriver().getWindowHandles();

        for (String ventana2 : ventana) {
            vent = vent + 1;
            if (vent == venti) {
                getDriver().switchTo().window(ventana2);
                break;
            }
        }
    }
}
