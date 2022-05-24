package co.com.choucair.aerocivil.tasks;

import co.com.choucair.aerocivil.userinterfaces.AbrirPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirAerocivil implements Task {
    private AbrirPagina abrirPagina;

    public static AbrirAerocivil the(){
        return Tasks.instrumented(AbrirAerocivil.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrirPagina));
    }
}
