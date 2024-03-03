/*
 * Copyright (C) 2024 Kayque de Freitas <kayquefreitas08@gmail.com>
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package lista1.beecrowd;

/**
 *
 * @author Kayque de Freitas <kayquefreitas08@gmail.com>
 * @data 03/03/2024
 * @brief Class Ex10
 */
import java.util.*;
public class Ex10 {
    public static void main(String[] args){
 
        Scanner ler = new Scanner(System.in);// metodo da biblioteca importada para ler dados
         //metodo de repeticao
            while (ler.hasNext()) {
                //.hasNext e para ler muitas entradas de uma so vez sem para e ter q usar diversas linhas de codigo usando o metodo Scanner
            int L = ler.nextInt(); //declarando e lendo a variavel
            int maxVelocidade = 0;

            //laco de repeticao para q ira continuar ate q o i seja igual ao L
            for (int i = 0; i < L; i++) {
                int velocidade = ler.nextInt();
                if (velocidade > maxVelocidade) {
                    maxVelocidade = velocidade;
                }
            }

            //verificando em qual nivel de velocidade o numero indicado esta.
            if (maxVelocidade < 10) {
                System.out.println("1");
            } else if (maxVelocidade < 20) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }
 
    }

}
