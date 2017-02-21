/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author keonj9218
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create city
        City kw = new City();

        //creatnig a robot
        Robot jimmy = new Robot(kw, 6, 5, Direction.SOUTH);

        //will always end up facing west
        if (jimmy.getDirection() == Direction.SOUTH) {
            jimmy.turnLeft();
        }

        if (jimmy.getDirection() == Direction.EAST) {
            jimmy.turnLeft();
        }

        if (jimmy.getDirection() == Direction.NORTH) {
            jimmy.turnLeft();
        }
        //will move to avenue 0   
        while (jimmy.getAvenue() > 0) {
            jimmy.move();
            if (jimmy.getAvenue() == 0) {
                // once its on avenue 0 and facing west, it wil turn right    
                if (jimmy.getStreet() > 0) {
                    jimmy.turnLeft();
                    jimmy.turnLeft();
                    jimmy.turnLeft();
                    //will move to steet 0 and stop
                    if (jimmy.getDirection() == Direction.NORTH) {
                        while (jimmy.getAvenue() == 0) {
                            jimmy.move();
                            if (jimmy.getStreet() == 0) {
                                break;
                            }
                        }
                    }
                }


            }
        }
    }
}
