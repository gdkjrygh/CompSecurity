// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings.alerts.donotdisturb;

import com.weather.commons.push.ProductType;
import com.weather.util.time.CurrentTimeOfDayBuilder;
import com.weather.util.time.validator.TimeOfTheDayOutsideRangeValidator;
import com.weather.util.time.validator.TimeValidationException;

// Referenced classes of package com.weather.Weather.settings.alerts.donotdisturb:
//            DoNotDisturbModel

public class DoNotDisturbValidator
{

    protected CurrentTimeOfDayBuilder currentTimeOfDayBuilder;
    protected DoNotDisturbModel doNotDisturbModel;
    protected ProductType productType;

    public DoNotDisturbValidator()
    {
        currentTimeOfDayBuilder = new CurrentTimeOfDayBuilder();
        doNotDisturbModel = new DoNotDisturbModel();
        productType = null;
    }

    private TimeOfTheDayOutsideRangeValidator buildTimeOfTheDayOutsideRangeValidator()
    {
        TimeOfTheDayOutsideRangeValidator timeofthedayoutsiderangevalidator = new TimeOfTheDayOutsideRangeValidator();
        com.weather.util.time.TimeOfDay timeofday = currentTimeOfDayBuilder.build();
        com.weather.util.time.TimeOfDay timeofday1 = doNotDisturbModel.getStartTimeOfDay();
        com.weather.util.time.TimeOfDay timeofday2 = doNotDisturbModel.getEndTimeOfDay();
        timeofthedayoutsiderangevalidator.setLowerLimit(timeofday1).setUpperLimit(timeofday2).setTimeOfDay(timeofday);
        return timeofthedayoutsiderangevalidator;
    }

    public DoNotDisturbValidator setProductType(ProductType producttype)
    {
        productType = producttype;
        return this;
    }

    public void validate()
        throws TimeValidationException
    {
        if (productType != ProductType.PRODUCT_SEVERE)
        {
            boolean flag;
            if (!doNotDisturbModel.isEnabled())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag)
            {
                TimeOfTheDayOutsideRangeValidator timeofthedayoutsiderangevalidator = buildTimeOfTheDayOutsideRangeValidator();
                try
                {
                    timeofthedayoutsiderangevalidator.validate();
                    return;
                }
                catch (TimeValidationException timevalidationexception)
                {
                    throw new TimeValidationException("Current time inside DND time frame");
                }
            }
        }
    }
}
