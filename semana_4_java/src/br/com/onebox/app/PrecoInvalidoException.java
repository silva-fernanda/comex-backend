package br.com.onebox.app;

public class PrecoInvalidoException extends RuntimeException {
    public PrecoInvalidoException (String msg){
        super (msg);
    }
}