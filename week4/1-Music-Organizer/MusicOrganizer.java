public class MusicOrganiser {
    private Vector<Song> songs;

    public MusicOrganiser(){
        songs = new Vector<Song>();
    }

    public void addSong(Song s){
        songs.add(s);
    }

    public int getCount(){
        return songs.getSize();
    }

    public Vector<String> getAlbums(){
        Vector<String> albums = new Vector<String>();
        for(int i = 0; i < songs.getSize(); i++){
            if(uniqueAlbum(albums, i)){
                albums.add(getAlbum(i));
            }
        }
        return albums;
    }

    public int getAlbumsCount(){
        return getAlbums().getSize();
    }

    public Vector<Song> getAlbumSongs(String albumName){
        Vector<Song> albumSongs = new Vector<>();
        for(int i = 0; i < songs.getSize(); i++){
            if(songs.getElement(i).getAlbum() == albumName){
                albumSongs.add(songs.getElement(i));
            }
        }
        return albumSongs;
    }

    public Vector<String> getAlbumsAndSongs(){
        Vector<String> albumsAndSongs = new Vector<>();
        Vector<String> uniqueAlbums = getAlbums();

        for(int i = 0; i < uniqueAlbums.getSize(); i++){
            albumsAndSongs.add( uniqueAlbums.getElement(i) + " (" + getAlbumSongs(uniqueAlbums.getElement(i)).getSize() + ")" );
        }

        return albumsAndSongs;
    }

    private String getAlbum(int index){
        if(index < songs.getSize() && index >= 0){
            return songs.getElement(index).getAlbum();
        }
        return null;
    }

    private boolean uniqueAlbum(Vector<String> albums, int index){
        for (int i = 0; i < albums.getSize(); i++){
            if(albums.getElement(i) == getAlbum(index)){
                return false;
            }
        }
        return true;
    }



}
