/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpatterndemo;

/**
 *
 * @author TranTPhuong
 */
public class AdapterPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Turkey turkey = new WildTurkey();
        MallardDuck duck = new MallardDuck();
        
        TurkeyAdapter tuckeyAdapter = new TurkeyAdapter(turkey);
        
        tuckeyAdapter.quack();
        tuckeyAdapter.fly();
        
        duck.quack();
        turkey.fly();
        
        // convert duck into turkey
        DuckAdapter duckAdapter = new DuckAdapter(duck);
        System.out.println("Duck says...");
        duckAdapter.gobble();
        System.out.println("Duck flies...");
        duckAdapter.fly();

    }
    
}
