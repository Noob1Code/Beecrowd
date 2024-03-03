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
 * @brief Class Ex5
 */
import java.util.*;
public class Ex5 {
    public static void main(String[] args){
    Scanner ler = new Scanner(System.in); //metodo de leitura de dados dado pelo usuario
    //declarando variaveis
    float X, Y;
    //lendo as variaveis usando o metodo Scanner a partir da palavra ler
    X = ler.nextFloat();
    Y = ler.nextFloat();
    //validadno os dados para a impressao da msg que ira informar de qual eixo os numeros informados pertence
    if(X == 0 && Y != 0){
        System.out.printf("Eixo Y%n");
    }else 
        if(X != 0 && Y == 0){
        System.out.printf("Eixo X%n");
    }else 
        if(X > 0 && Y > 0){
        System.out.printf("Q1%n");
    }else 
        if(X < 0 && Y > 0){
        System.out.printf("Q2%n");
    }else 
        if(X < 0 && Y < 0){
        System.out.printf("Q3%n");
    }else 
        if(X > 0 && Y < 0){
        System.out.printf("Q4%n");
    }else 
        if(X == 0 && Y == 0){
        System.out.printf("Origem%n");
    }
  }

}
