package co.com.choucair.aerocivil.questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class ValidarPdf implements Question<Boolean> {

    private String titulo;

    public ValidarPdf(String titulo) {
        this.titulo = titulo;
    }

    public static ValidarPdf the(String titulo){
        return new ValidarPdf(titulo);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        Boolean result;
        String titulopdf = null;
        try {
            titulopdf = URLDecoder.decode(Serenity.getWebdriverManager().getWebdriver().getCurrentUrl(),"UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        titulopdf = titulopdf.replaceAll("%20"," ");

        if (titulopdf.contains(titulo)){
            result = true;
        }
        else{
            result = false;
        }
        return result;
    }
}
