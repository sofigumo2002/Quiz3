/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.CircularDoublyLinkedList;
import domain.CircularLinkedList;
import domain.Course;
import domain.DoublyLinkedList;
import domain.Employee;
import domain.ListException;
import domain.Node;
import domain.SinglyLinkedList;
import domain.Student;
import java.util.Date;
import static javafx.application.Application.launch;

/**
 *
 * @author sofia
 */
public class Quiz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ListException {
        // TODO code application logic here
        
        System.out.println("hola");
        
//        domain.SinglyLinkedList a = new domain.SinglyLinkedList();
//        a.add(new Student("1", "Maria", 20, "Cartago"));
////        a.add(new Student("2", "Carlos", 22, "San José"));
////        a.add(new Student("3", "Laura", 20, "Paraíso"));
////        a.add(new Student("4", "Paula", 18, "Turrialba"));
////        a.add(new Student("5", "Carlos", 21, "Limón"));
//        System.out.println(a + "\n");
//        
        domain.DoublyLinkedList b = new DoublyLinkedList();
//        b.add(new Course("IF-3001", "Algoritmos y Estructuras de Datos", 4));
        b.add(new Course("IF-4001", "Sistemas operativos", 4));
//        b.add(new Course("IF-2000", "Programacion 1", 4));
//        b.add(new Course("IF-3000", "Programacion 2", 4));
//        b.add(new Course("IF-4000", "Arquitectura", 3));
        System.out.println(b + "\n");
//         
//        domain.CircularLinkedList c = new CircularLinkedList();//year,month,day
//        c.add(new Employee(0, "Juan", "Perez", "Informatica", new Date(2002, 2, 20)));//20
//        c.add(new Employee(1, "Pablo", "Mora", "Administracion", new Date(1999, 1, 25)));//23
//        c.add(new Employee(2, "Daniel", "Cruz", "Ingles", new Date(1997, 2, 05)));//25
//        c.add(new Employee(3, "Joshua", "Gutierrez", "Turismo", new Date(1994, 3, 19)));//28
//        c.add(new Employee(4, "Lucia", "Vindas", "Agronomia", new Date(1992, 1, 15)));//30
//        System.out.println(c + "\n");
//        
//        domain.CircularDoublyLinkedList d = new CircularDoublyLinkedList();
//
//        d.add(new Employee(0, "Jasson", "Fonseca", "Informatica", new Date(2001, 10, 23)));//20
//        d.add(new Employee(1, "Hillary", "Solano", "Administracion", new Date(1998, 12, 02))); // 23
//        d.add(new Employee(2, "Jose", "Piedra", "Ingles", new Date(1996, 11, 03)));//25
//        d.add(new Employee(3, "Pablo", "Vargas", "Turismo", new Date(1993, 10, 19)));//28
//        d.add(new Employee(4, "Joan", "Marin", "Agronomia", new Date(1991, 9, 7)));//30
//        System.out.println(d + "\n");
//        
        
//        //NODO REFENCE
//        System.out.println(" ");
//        Node reference = new Node("reference");
//        Node aux = new Node();
//        
//        //instanciando las listas nuevas
//        SinglyLinkedList  SinglyLinkedList2= new SinglyLinkedList();
//        DoublyLinkedList  DoublyLinkedList2 = new DoublyLinkedList();
//        CircularLinkedList  CircularLinkedList2 = new CircularLinkedList();
//        CircularDoublyLinkedList CircularDoublyLinkedList2 = new CircularDoublyLinkedList();
//        
//        SinglyLinkedList2.add(reference.data);
//        DoublyLinkedList2.add(reference.data);
//        CircularLinkedList2.add(reference.data);
//        CircularDoublyLinkedList2.add(reference.data);
//
//        //Conecta el objeto "referencia" con el primer nodo de la lista "a"
//        if (!a.isEmpty()) {
//            for (int i = 1; i <= a.size(); i++) {
//                aux = new Node(a.getNode(i).getData());
//                SinglyLinkedList2.add(aux.data);
//                aux = aux.next;
//            }
//        }
//        //Conecta el último nodo de la lista “a” con el primer nodo de la lista “b”
//        if (!b.isEmpty()) {
//            for (int i = 1; i <= b.size(); i++) {
//                aux = new Node(b.getNode(i).getData());
//                DoublyLinkedList2.add(aux.data);
//                aux = aux.next;
//            }
//        }
//        //Conecta el último nodo de la lista “b” con el primer nodo de la lista “c”
//        if (!c.isEmpty()) {
//            for (int i = 1; i <= c.size(); i++) {
//                aux = new Node(c.getNode(i).getData());
//                CircularLinkedList2.add(aux.data);
//                aux = aux.next;
//            }
//        }
//        //Conecta el último nodo de la lista “c” con el primer nodo de la lista “d”
//        if (!d.isEmpty()) {
//            for (int i = 1; i <= d.size(); i++) {
//                aux = new Node(d.getNode(i).getData());
//                CircularDoublyLinkedList2.add(aux.data);
//                aux = aux.next;
//            }
//        }
//    
//        System.out.println(display());
//    
    }
     

//     public void display() {
//        Node reco=raiz;
//        System.out.println("Listado de todos los elementos de las listas enlazadas.");
//        while (reco!=null) {
//            System.out.print(reco.info+"-");
//            reco=reco.sig;
//        }
//        System.out.println();
   }
