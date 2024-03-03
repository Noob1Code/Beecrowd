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
 * @brief Class Ex8
 */
import java.util.*;
public class Ex8 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);//metodo para ler dados informado pelo usuario
        //variavel
        int N;
        //leitura de variavel
        N = ler.nextInt();
        //laco de repeticao
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) { //condicional de validacao, para imprimir para o usuario/
                System.out.println(i);
            }
        }
 
    }

}
