package br.com.cauesobral.consultaFipe.service;

import java.util.List;

public interface InterfaceConverteDados {
    <T> T obterDados(String json, Class<T> classe);
    <T> List<T> obterLista(String json, Class<T> classe);
}
