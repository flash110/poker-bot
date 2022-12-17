package poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import poker.card.*;

public class Table {

    public static void main(String[] args) {
        Map<Value, Integer> valueMap = new HashMap<>();
        ArrayList<Card> deck = new ArrayList<>();
        Value[] values = Value.values();
        for(int index = 1; index < values.length+1; index++) {
            valueMap.put(values[index-1], index);
        }
        
        for(int numValue = 0; numValue < 13; numValue++) {
            for(int numSuit = 0; numSuit < 4; numSuit++) {
                deck.add(new Card(Suit.values()[numSuit], Value.values()[numValue]));
            }
        }
        System.out.println("Size of deck: " + deck.size());
        Collections.shuffle(deck);
        System.out.println(deck);
    }
}