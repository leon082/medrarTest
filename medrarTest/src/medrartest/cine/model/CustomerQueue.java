/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medrartest.cine.model;

/**
 *
 * @author luis.leon
 */
public class CustomerQueue {
    
    public class Nodo
    {
        public Customer customer;
        public Nodo next;
    }
    
    private Nodo root, last;
    
    public CustomerQueue()
    {
        this.root = null;
        this.last = null;
    }
    
    public boolean isEmpty()
    {
        return this.root == null ? true : false;
    }
    
    public void Insert(Customer customer)
    {
        Nodo newNodo = new Nodo();
        newNodo.customer = customer;
        if(isEmpty())
        {
            this.root = newNodo;
            this.last = newNodo;
        }
        else
        {
            this.last.next = newNodo;
            this.last = newNodo;
        }
    }
    
    public Customer getCustomer()
    {
        if(!isEmpty())
        {
            Customer customer = this.root.customer;
            this.root = this.root.next;
            return customer;
        }
        else
        {
            return null;
        }
    }
    
    public int size(){
        Nodo reco= this.root;
        int count = 0;
        while (reco != null){
            count++;
            reco = reco.next;
        }
        return count;
    }
    
    
}
