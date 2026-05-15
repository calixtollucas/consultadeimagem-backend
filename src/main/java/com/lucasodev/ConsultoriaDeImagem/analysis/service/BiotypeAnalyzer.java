package com.lucasodev.ConsultoriaDeImagem.analysis.service;

import com.lucasodev.ConsultoriaDeImagem.analysis.dto.BiotypeResult;
import com.lucasodev.ConsultoriaDeImagem.analysis.enums.BiotypeEnum;
import org.springframework.stereotype.Service;

@Service
public class BiotypeAnalyzer {

    public static BiotypeResult analyze(
            Double shoulderWidth,
            Double waistSize,
            Double hipSize,
            Double chest
    ) {
        Double superior = Math.max(shoulderWidth, chest);
        BiotypeEnum bioTypeEnumResult;
        if (waistSize > superior) {
            bioTypeEnumResult = BiotypeEnum.OVAL;
        } else if (hipSize > (superior+5)) {
            bioTypeEnumResult = BiotypeEnum.TRIANGLE;
        } else if (superior > (hipSize+5)) {
            bioTypeEnumResult = BiotypeEnum.INVERTED_TRIANGLE;
        } else {
            if (waistSize <= (superior * 0.75)) {
                bioTypeEnumResult = BiotypeEnum.HOURGLASS;
            } else {
                bioTypeEnumResult = BiotypeEnum.RECTANGLE;
            }
        }

        return new BiotypeResult(
                bioTypeEnumResult.getPurtugueseBiotype(),
                bioTypeEnumResult.getDescription()
        );
    }
}
