package j3_abstract_interface;

/* 
 * **** Abstract vs Interface ********
 * interface de değişkenler public.static veya final olmak zorundadır
 * 
*/
public class j2_coklu_kalitim {
    public static void main(String[] args) {
        MuslumBaba test = new MuslumBaba();
        test.dansEt();
        test.mikrofonuYakinTut();
        test.sarkiSoyle();
    }
}

abstract class Sarkici {
    abstract void sarkiSoyle();
}

/**
 * ArabeskSarkilar
 */
interface ArabeskSarkilar {
    void mikrofonuYakinTut();
}

/**
 * PopSarkilar
 */
interface PopSarkilar {
    void dansEt();

}

class ArabeskSarkisi extends Sarkici {

    @Override
    void sarkiSoyle() {
        // TODO Auto-generated method stub
        System.out.println("Arabesk şarkısı");
    }

    void mikrofonuYakinTut() {
        System.out.println("mikrofonu yakin tut");
    }
}

class PopSarkisi extends Sarkici {

    @Override
    void sarkiSoyle() {
        // TODO Auto-generated method stub
        System.out.println("Pop şarkısı");
    }

    void dansEt() {
        System.out.println("Dans ediliyor");
    }
}

// class MuslumBaba extends ArabeskSarkisi, PopSarkisi{}

class MuslumBaba extends Sarkici implements ArabeskSarkilar, PopSarkilar {

    @Override
    public void dansEt() {
        // TODO Auto-generated method stub

    }

    @Override
    public void mikrofonuYakinTut() {
        // TODO Auto-generated method stub

    }

    @Override
    void sarkiSoyle() {
        // TODO Auto-generated method stub

    }
}