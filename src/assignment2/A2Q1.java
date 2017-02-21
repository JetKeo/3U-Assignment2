/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author keonj9218
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a city
        City kw = new City();

        //creating a robot
        Robot jimmy = new Robot(kw, 1, 1, Direction.EAST);

        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 1, 4);
        new Thing(kw, 1, 5);
        new Thing(kw, 1, 6);
        new Thing(kw, 1, 7);
        new Thing(kw, 1, 8);
        new Thing(kw, 1, 9);
        new Thing(kw, 1, 10);
        new Thing(kw, 1, 11);


        //moving onto the path
        jimmy.move();

        //if he can pick something up, pick it up and move
        while (jimmy.canPickThing()) {
            jimmy.pickThing();
            jimmy.move();
            //once he has 7 things move to the end
            if (jimmy.countThingsInBackpack() == 7) {
                jimmy.move();
                while (jimmy.canPickThing()) {
                    jimmy.move();
                }



            }
        }
    }
}