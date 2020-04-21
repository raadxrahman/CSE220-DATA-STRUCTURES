/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task05;

/**
 *
 * @author DOLPHIN-PC
 */
public class Node {

    int x;
    Node prev;
    Node next;

    public Node(int i, Node p, Node n) {
        x = i;
        prev = p;
        next = n;
    }
}
