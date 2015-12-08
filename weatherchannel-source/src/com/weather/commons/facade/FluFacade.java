// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.weather.dal2.data.MonthlyFluRecord;
import com.weather.util.date.TwcDateFormatter;
import java.util.TimeZone;

// Referenced classes of package com.weather.commons.facade:
//            ColdFluCondition

public class FluFacade
{

    public static final int FLU_INDEX_HIGH = 65;
    public static final int FLU_INDEX_LOW = 25;
    public static final int FLU_INDEX_MODERATE = 45;
    public static final int FLU_INDEX_VERY_HIGH = 85;
    private final MonthlyFluRecord fluRecord;

    public FluFacade(MonthlyFluRecord monthlyflurecord)
    {
        fluRecord = monthlyflurecord;
    }

    public String getColor(int i)
    {
        return fluRecord.getColor(i);
    }

    public String getCondition(int i)
    {
        return fluRecord.getCondition(i);
    }

    public String getDate(int i)
    {
        java.util.Date date = fluRecord.getDate(i);
        String s = null;
        if (date != null)
        {
            s = TwcDateFormatter.formatMd(date, TimeZone.getDefault());
        }
        return s;
    }

    public ColdFluCondition getFluCondition(int i)
    {
        String s;
label0:
        {
            s = getCondition(i);
            ColdFluCondition coldflucondition = ColdFluCondition.NONE;
            if (s != null)
            {
                if (!s.equals(ColdFluCondition.WIDESPREAD.getCondition()))
                {
                    break label0;
                }
                coldflucondition = ColdFluCondition.WIDESPREAD;
            }
            return coldflucondition;
        }
        if (s.equals(ColdFluCondition.REGIONAL.getCondition()))
        {
            return ColdFluCondition.REGIONAL;
        }
        if (s.equals(ColdFluCondition.LOCAL.getCondition()))
        {
            return ColdFluCondition.LOCAL;
        }
        if (s.equals(ColdFluCondition.SPORADIC.getCondition()))
        {
            return ColdFluCondition.SPORADIC;
        } else
        {
            return ColdFluCondition.NONE;
        }
    }

    public int getSize()
    {
        return fluRecord.getSize();
    }

    public String getState(int i)
    {
        return fluRecord.getState(i);
    }

    public boolean hasData()
    {
        return fluRecord.getSize() > 0;
    }
}
