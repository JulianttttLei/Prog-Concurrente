/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp0repaso;

/**
 *
 * @author agust
 */
public class Musica {

 
    
// No importa el tipo de Instrumento,
// seguirá funcionando debido a Polimorfismo:
static void afinar(Instrumento i) {
    
// ...
i.tocar();
}

static void afinarTodo(Instrumento[] e) {
for(int i = 0; i < e.length; i++)
afinar(e[i]);
}

public static void main(String[] args) {
Instrumento[] orquesta = new Instrumento[5];
int i = 0;
// Up-casting al asignarse el Arreglo
orquesta[i++] = new Guitarra();
orquesta[i++] = new Piano();
orquesta[i++] = new Saxofon();
orquesta[i++] = new Guzla();
orquesta[i++] = new Ukelele();
afinarTodo(orquesta);
}
} //clase Musica


