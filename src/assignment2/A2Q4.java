/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author keonj9218
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creating a city
        City kw = new City();

        //creating a robot
        Robot jimmy = new Robot(kw, 3, 1, Direction.NORTH);

        //creating the castle
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.EAST);
        new Wall(kw, 1, 1, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.WEST);

        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.EAST);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 1, Direction.WEST);

        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.WEST);

        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.WEST);

        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.NORTH);

        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.WEST);

        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);

        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);

        //moving jimmy around the wall infinitely
        while (jimmy.frontIsClear()) {
            jimmy.move();
            if (!(jimmy.frontIsClear())) {
                jimmy.turnLeft();
                jimmy.move();
                jimmy.turnLeft();
                jimmy.turnLeft();
                jimmy.turnLeft();
                jimmy.move();
                jimmy.move();
                jimmy.turnLeft();
                jimmy.turnLeft();
                jimmy.turnLeft();
                jimmy.move();
                jimmy.move();
                jimmy.turnLeft();
                jimmy.turnLeft();
                jimmy.turnLeft();
                jimmy.move();
                jimmy.turnLeft();

            }

        }





    }
}
