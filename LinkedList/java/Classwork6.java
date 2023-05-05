package LinkedList.java;

import java.util.LinkedList;

public class Classwork6 {
    public static void main(String[] args) {
        LinkedList<Character>word1=new LinkedList<Character>();
        word1.add('a');
        word1.add('b');
        word1.add('c');
        word1.add('d');
        word1.add('e');
        LinkedList<Character>word2=new LinkedList<Character>();
        word2.add('f');
        word2.add('g');
        word2.add('h');
        word2.add('i');
        word2.add('j');
      LinkedList<Character>word3=new LinkedList<Character>();
      word3.addAll(word1);
      word3.addAll(word2);
        System.out.println(word3);
    }
}
