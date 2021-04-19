package com.example.cal.value;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;
@Slf4j
public class TimeValueCalTest {

    @org.junit.Test
    public void calFv() {
//        log.info(TimeValueCal.calFv(new BigDecimal(5_000_000), new BigDecimal(0.07), 5).toString());

        log.info(TimeValueCal.calFv(new BigDecimal(10_000_000), new BigDecimal(0.09), 10).toEngineeringString());
    }

    @Test
    public void calFv2(){
        log.info(TimeValueCal.calFv(new BigDecimal(10_000), new BigDecimal(0.08), 2, 4).toString());
    }

    @Test
    public void calContinuousFv(){
        log.info(TimeValueCal.calContinuousFv(new BigDecimal(10_000), new BigDecimal(0.08), 2).toString());
    }
}