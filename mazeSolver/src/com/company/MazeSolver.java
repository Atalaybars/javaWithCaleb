package com.company;

import java.util.LinkedList;

public class MazeSolver {

    static int[][] maze = {
            {2, 0, 1, 1},
            {1, 1, 0, 1},
            {0, 1, 1, 1}
    };

    // 0 = wall
    // 1 = path
    // 2 = destination

    static LinkedList<Position> path = new LinkedList<>();

    public static void main(String[] args) {
        Position position = new Position(3, 0);
        path.push(position);

        maze[path.peek().y][path.peek().x] = 0;
        
    }
}
