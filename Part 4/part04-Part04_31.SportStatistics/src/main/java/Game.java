/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brand
 */
public class Game {

    private String home;
    private String opposing;
    private int homepoints;
    private int opposingpoints;

    public Game(String home, String opposing, int homepoints, int opposingpoints) {
        this.home = home;
        this.opposing = opposing;
        this.homepoints = homepoints;
        this.opposingpoints = opposingpoints;
    }

    public String getHomeTeam() {
        return home;
    }

    public String getOpponent() {
        return opposing;
    }

    public boolean winnerIs(String team) {
        if (team.equals(home) && homepoints > opposingpoints) {
            return true;
        }

        if (team.equals(opposing) && opposingpoints > homepoints) {
            return true;
        }

        return false;
    }
}