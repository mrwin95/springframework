package beans;

public class SimpleMovieListener {

    private final MovieMaker movieMaker;

    public SimpleMovieListener(MovieMaker movieMaker){
        System.out.println("Inside SimpleMovie");
        this.movieMaker = movieMaker;
    }

    public void makeMovie(){
        movieMaker.makeMovie();
    }

}
