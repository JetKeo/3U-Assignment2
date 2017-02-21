/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author keonj9218
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a city
        City kw = new City();

        //creating a robot
        Robot jimmy = new Robot(kw, 2, 0, Direction.EAST);

        //creating the course
        new Wall(kw, 2, 0, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 6, Direction.SOUTH);
        new Wall(kw, 2, 7, Direction.SOUTH);
        new Wall(kw, 2, 8, Direction.SOUTH);

        new Wall(kw, 2, 0, Direction.EAST);
        new Wall(kw, 2, 1, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 6, Direction.EAST);

        //creating finish line
        new Thing(kw, 2, 8);

        //if theres a wall turn left and move
        while (!(jimmy.frontIsClear())) {
            jimmy.turnLeft();
            jimmy.move();
            jimmy.turnLeft();
            jimmy.turnLeft();
            jimmy.turnLeft();
            jimmy.move();
            jimmy.turnLeft();
            jimmy.turnLeft();
            jimmy.turnLeft();
            jimmy.move();
            jimmy.turnLeft();
            while (jimmy.frontIsClear()) {
                jimmy.move();
                if (jimmy.canPickThing()) {
                    break;
                }

            }
        }



    }
}
