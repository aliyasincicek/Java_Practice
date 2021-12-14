package _10_DateTime;

import java.time.LocalDateTime;

public class Kullanici {
	// bu classta fieldslar var. yani özellikler

    String name;
    LocalDateTime kayitZamani;
    
    public Kullanici(){// p'siz cons.
    }
    public Kullanici(String name, LocalDateTime kayitZamani) { //p'li fields li cons. kayit al methodu icerisindeki user objesinden gelen ismi ekler ve 
        this.name = name;                                   // zamani tespit edip 8 ve 9. satirdaki variablelara ekler              
        this.kayitZamani = kayitZamani;
    }
}