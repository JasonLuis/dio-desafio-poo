package br.com.dio.desafio.dominio;

import java.util.Comparator;
import java.util.Map;

public class ComparatorRanking implements Comparator<Map.Entry<String, Double>> {
    @Override
    public int compare(Map.Entry<String, Double> r1, Map.Entry<String, Double> r2) {
        int value = Double.compare(r1.getValue(), r2.getValue());
        if (value != 0) return value;

        return r1.getKey().toLowerCase().compareTo(r2.getKey().toLowerCase());
    }
}
