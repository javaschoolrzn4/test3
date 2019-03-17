package test3.q15;


class Game{ }
class Cricket extends Game{ }
class Instrument{ }
class Guitar extends Instrument{ }
interface Player<E>{ void play(E e); }
interface GamePlayer<E extends Game> extends Player<E>{ }
interface MusicPlayer<E extends Instrument> extends Player{ }

//    Identify valid declarations.
//        Select 1 option:

//  A.
//class Batsman implements GamePlayer<Cricket>{
//    public void play(Game o){ }
//}

//  B.
//class Bowler implements GamePlayer<Guitar>{
//    public void play(Guitar o){ }
//}

// !C.
class Bowler implements Player<Guitar>{
    public void play(Guitar o){ }
}

//  D.
//class MidiPlayer implements MusicPlayer {
//    public void play(Guitar g){ }
//}

//  E.
//class MidiPlayer implements MusicPlayer<Instrument> {
//    public void play(Guitar g){ }
//}
