import java.util.ArrayList;


public class Landscape {
	ArrayList<Tile> tile;

	public Landscape() {
		tile = new ArrayList<Tile>();
	}

	public void addTile(Tile t) {
		tile.add(t);
	}

	public String renderAll() {
		String str = "";
		for (Tile tile2 : tile) {
			str += tile2.render();
		}
		return str;
	}
}
