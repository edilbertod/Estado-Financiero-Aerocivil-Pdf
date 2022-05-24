package co.com.choucair.aerocivil.tasks;

import co.com.choucair.aerocivil.interactions.CambioPdf;
import co.com.choucair.aerocivil.userinterfaces.EstadoFinancieroPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;


public class EstadoFinanciero implements Task {
    public static EstadoFinanciero the(){
        return Tasks.instrumented(EstadoFinanciero.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                    MoveMouse.to(EstadoFinancieroPagina.TRANSPARENCIA),
                Click.on(EstadoFinancieroPagina.PRESUPUESTO),
                Click.on(EstadoFinancieroPagina.EST_FINAN),
                Click.on(EstadoFinancieroPagina.BALANCES),
                Click.on(EstadoFinancieroPagina.PDF)
        );
        actor.attemptsTo(CambioPdf.the());
    }
}
