package com.github.philipealves.dojo.jokenpo;

/**
 * Desafio Jokenpo: https://dojopuzzles.com/problems/jokenpo/
 * 
 * Jokenpo é uma brincadeira japonesa, onde dois jogadores escolhem um dentre
 * três possíveis itens: Pedra, Papel ou Tesoura.
 *
 * O objetivo é fazer um juiz de Jokenpo que dada a jogada dos dois jogadores
 * informa o resultado da partida.
 *
 * As regras são as seguintes:
 *
 * Pedra empata com Pedra e ganha de Tesoura Tesoura empata com Tesoura e ganha
 * de Papel Papel empata com Papel e ganha de Pedra
 */
public class JokenpoDojo {

    public String jogar(String jogador1, String jogador2) {
        if (jogador1.equals("PEDRA") && jogador2.equals("TESOURA"))
            return "PEDRA";
        return "EMPATA";
    }
}
