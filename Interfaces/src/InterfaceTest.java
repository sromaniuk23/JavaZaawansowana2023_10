public class InterfaceTest {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer[] = new MediaPlayer[5]; //tu nie tworzymy nowych obiektow, tylko nowa pusta tablice (tablica bez obiektow)

//        for(MediaPlayer mP:mediaPlayer){
//            System.out.println(mP);
//        }

        //chociaz nie mozna utworzyc obiektu interfejsu, to jednak interfejs moze byc traktowany jako nowy typ referencyjny!
        //czyli mozemy utworzyc obiekty klas implementujacych dany interfejs i uchwycic je typem referencyjnym naszego interfejsu
        //referowanie dziala tak samo jak w przypadku dziedziczenia, z tymze tam dalo sie utworzyc obiekt nadklasy, a tu sie nie da
        //oczywiscie pamietamy ze typ referencyjny okresla zestaw pol i metod do ktorych mamy dostep
        mediaPlayer[0] = new MP3Player();
        mediaPlayer[1] = new Smartphone();
        mediaPlayer[2] = new IoS();
        mediaPlayer[3] = new AndroidSmartphone();
        mediaPlayer[4] = new AnotherPlayer();

        //pamietamy ze typ referencyjny obejmuje wszystkie obiekty danego typu referencyjnego jak i
        // typow dziedziczacych badz implementujacych dany typ referencyjny!!!

        for(MediaPlayer mP : mediaPlayer){
            mP.play();
            mP.stop();
            System.out.println(MediaPlayer.pi); //stale dostepne sa z poziomu interfejsu!
            System.out.println(MediaPlayer.TAG);
            System.out.println(MediaPlayer.getName()); //metoda statyczna interfejsu
//            mP.next(); //metody domyslne sa przekazywane dalej do obiektow klas implementujacych interfejs

            if (mP instanceof MP3Player) {
                MP3Player mP3Player = (MP3Player) mP; //rzutujemy na MP3Player zeby miec dostep do wszystkich metod MP3Player
                mP3Player.ejectDisc();
            }

            if (mP instanceof Smartphone smartphone){
                smartphone.callMyGirl();
            }

            if(mP instanceof RewindInterface rewindInterface){
                rewindInterface.rewindBackward();
                rewindInterface.rewindForward();
            }

            if(mP instanceof GetWeatherInfo getWeatherInfo){
                getWeatherInfo.getHumidity();
                getWeatherInfo.getTemperature();
            }
        }

        MP3Player mp3Player = new MP3Player();
        Smartphone smartphone = new Smartphone();
        AnotherPlayer anotherPlayer = new AnotherPlayer();

    }

    private static void activateMethodsMP3Player(MP3Player mp3Player[]){
        for(MP3Player mp3: mp3Player){
            mp3.play();
            mp3.stop();
        }
    }

    private static void activateMethodsSmartphone(Smartphone smartphones[]){
        for(Smartphone s: smartphones){
            s.play();
            s.stop();
        }
    }

    private static void activateMethodsAnotherPlayer(AnotherPlayer anotherPlayer[]){
        for(AnotherPlayer aP: anotherPlayer){
            aP.play();
            aP.stop();
        }
    }

    private static void activateMethods(MediaPlayer mediaPlayers[]){
        for (MediaPlayer mP: mediaPlayers){
            mP.play();
            mP.stop();
        }
    }
}
