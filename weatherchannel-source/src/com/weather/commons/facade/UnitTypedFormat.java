// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;

import com.google.common.base.Preconditions;
import com.weather.util.UnitType;

// Referenced classes of package com.weather.commons.facade:
//            FormattedValue

abstract class UnitTypedFormat
    implements FormattedValue
{

    public final String englishUnit;
    public final String hybridUnit;
    public final String metricUnit;
    public final UnitType unitType;
    public final Object value;

    public UnitTypedFormat(Object obj, UnitType unittype, String s, String s1, String s2)
    {
        value = obj;
        unitType = (UnitType)Preconditions.checkNotNull(unittype);
        englishUnit = (String)Preconditions.checkNotNull(s);
        metricUnit = (String)Preconditions.checkNotNull(s1);
        hybridUnit = (String)Preconditions.checkNotNull(s2);
    }

    public String format()
    {
        if (value != null)
        {
            return (new StringBuilder()).append(value).append(getUnit()).toString();
        } else
        {
            return "--";
        }
    }

    public String getUnit()
    {
        static class _cls1
        {

            static final int $SwitchMap$com$weather$util$UnitType[];

            static 
            {
                $SwitchMap$com$weather$util$UnitType = new int[UnitType.values().length];
                try
                {
                    $SwitchMap$com$weather$util$UnitType[UnitType.ENGLISH.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$weather$util$UnitType[UnitType.METRIC.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$weather$util$UnitType[UnitType.HYBRID.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.weather.util.UnitType[unitType.ordinal()])
        {
        default:
            throw new IllegalStateException("This should never happen!");

        case 1: // '\001'
            return englishUnit;

        case 2: // '\002'
            return metricUnit;

        case 3: // '\003'
            return hybridUnit;
        }
    }
}
