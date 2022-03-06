package teste;

import dominio.entidades.Destino;
import dominio.entidades.InfoCompanhia;
import dominio.entidades.ListaDesejos;
import dominio.entidades.chaves.DestinoPK;
import dominio.entidades.voos.InfoVoo;
import dominio.servicos.servicosImpls.ServicoSistema;
import dominio.servicos.servicosImpls.ServicoUtilizador;
import dominio.servicos.servicosImpls.ServicoVoos;
import teste.testes.TesteObterDestinosDestaque;
import teste.testes.TesteObterInfoCompanhias;
import teste.testes.TesteObterListaDeDesejos;
import teste.testes.TesteObterVoos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AplicacaoTeste {

    static ServicoSistema servicoSistema;
    static ServicoUtilizador servicoUtilizador;
    static ServicoVoos servicoVoos;

    public static void main(String[] args) {
	    /* Realização de testes às classes de domínio */

        servicoSistema = new ServicoSistema();
        servicoUtilizador = new ServicoUtilizador();
        servicoVoos = new ServicoVoos();

        TesteObterDestinosDestaque testeObterDestinosDestaque = new TesteObterDestinosDestaque(servicoSistema);
        System.out.println(testeObterDestinosDestaque.executarTeste() ? "Teste Obter Destinos Destaque -> PASS" : "Teste Obter Destinos Destaque -> FAIL");

        TesteObterInfoCompanhias testeObterInfoCompanhias = new TesteObterInfoCompanhias(servicoSistema);
        System.out.println(testeObterInfoCompanhias.executarTeste() ? "Teste Obter Informação de Companhias -> PASS" : "Teste Obter Informação de Companhias -> FAIL");

        TesteObterListaDeDesejos testeObterListaDeDesejos = new TesteObterListaDeDesejos(servicoUtilizador);
        System.out.println(testeObterListaDeDesejos.executarTeste() ? "Teste Obter Lista de Desejos -> PASS" : "Teste Obter Lista de Desejos -> FAIL");

        TesteObterVoos testeObterVoos = new TesteObterVoos(servicoVoos);
        System.out.println(testeObterVoos.executarTeste() ? "Teste Obter Voos -> PASS" : "Teste Obter Voos -> FAIL");

    }


}
