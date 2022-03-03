package j2_oop;

import java.util.ArrayList;

/**
 * oop_uyg1_yıgın
 * Kendi yığın yapımızı oluşturalım
 */
public class oop_uyg1_yıgın {

    public static void main(String[] args) {
        myStack stack = new myStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        stack.yazdir();

        System.out.println(stack.bosMu());
        System.out.println(stack.elemanGoster());
        System.out.println(stack.kacElemanVar());
        System.out.println(stack.pop());

        stack.yazdir();
    }
}

/**
 * myStack
 */
class myStack {
    private ArrayList<Object> liste;

    public myStack() {
        liste = new ArrayList<>();
    }

    public int kacElemanVar() { // kaç eleman olduğunu gösterir
        return liste.size();
    }

    public boolean bosMu() { // hiç elemanı yoksa true değerini döndürür
        return liste.isEmpty();
    }

    public Object elemanGoster() { // listedeki son elemanı silmeden göster
        return liste.get(kacElemanVar() - 1);
    }

    public Object pop() { // listeddeki son elemanı göster ve listeden sil
        if (bosMu()) {
            Object geriyeDondurulecekEleman = liste.get(kacElemanVar() - 1);
            liste.remove(kacElemanVar() - 1);
            return geriyeDondurulecekEleman;
        }
        return null;
    }

    public void push(Object deger) {
        liste.add(deger);
    }

    public void yazdir() {
        for (Object object : liste) {
            System.out.print(object + ", ");
        }
        System.out.println("\n");
    }
}