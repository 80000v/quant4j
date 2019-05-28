
package com.quant.common.indicator;


import org.ta4j.core.TimeSeries;
import org.ta4j.core.indicators.SMAIndicator;
import org.ta4j.core.indicators.helpers.ClosePriceIndicator;


/**
 * sma指标计算
 */
public class SmaIndicatorAdapter extends IndicatorAdapter {


    public SmaIndicatorAdapter(TimeSeries timeSeries, int barCount) {
        super(timeSeries, barCount);
    }

    /**
     * 计算并返回Indicator
     *
     * @return
     */
    @Override
    public org.ta4j.core.Indicator strategCalculation() {
        ClosePriceIndicator closePrice = new ClosePriceIndicator(timeSeries);
        return new SMAIndicator(closePrice, barCount);
    }
}
