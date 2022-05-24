package co.com.choucair.aerocivil.stepdefinitions;

import co.com.choucair.aerocivil.questions.ValidarPdf;
import co.com.choucair.aerocivil.tasks.AbrirAerocivil;
import co.com.choucair.aerocivil.tasks.EstadoFinanciero;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class EstadoFinancieroStepDefinitions {

    @Before
    public void setStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que entro a la seccion de Estados Financieros")
    public void queEntroALaSeccionDeEstadosFinancieros() {
        OnStage.theActorCalled("Edi").wasAbleTo(AbrirAerocivil.the());
    }

    @Cuando("consulto el PDF del ultimo mes registrado")
    public void consultoElPDFDelUltimoMesRegistrado() {
        OnStage.theActorInTheSpotlight().attemptsTo(EstadoFinanciero.the());
    }

    @Entonces("verifico que sea el pdf correcto")
    public void verificoQueSeaElPdfCorrecto(DataTable dataTable) {
        List<List<String>> rows = dataTable.asLists(String.class);
        List<List<String>> rowsWithoutHead = rows.subList(1, rows.size());
        for (List<String> pdf : rowsWithoutHead){
            OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPdf.the(pdf.get(0))));
        }

    }
}
