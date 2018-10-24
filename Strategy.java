import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.LineSegment;

/**
 *
 * @author mdsinalpha
 */

public class Strategy 
{   
    public static Player [] init_players(){
        Player[] players = new Player[5];
        // Here modify your initialize player names and positions:
        players[0] = new Player("player1", new Coordinate(0,0));
        players[1] = new Player("player2", new Coordinate(0,0));
        players[2] = new Player("player3", new Coordinate(0,0));
        players[3] = new Player("player4", new Coordinate(0,0));
        players[4] = new Player("player5", new Coordinate(0,0));
        //
        return players;
    }
    
    public static Triple do_turn(Game game){
        Triple act = new Triple();
        // Play the game! code your strategies and fill act by your values:)
        act.setPlayerID(0);
        Coordinate player1 = game.getMyTeam().getPlayer(0).getPosition();
        Coordinate ball = game.getBall().getPosition();
        act.setPower((int)player1.distance(ball)*10);
        LineSegment line = new LineSegment(player1, ball);
        act.setAngle((int)line.angle());
        //
        return act;
    }
}
