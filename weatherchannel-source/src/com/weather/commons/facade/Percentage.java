// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;


// Referenced classes of package com.weather.commons.facade:
//            FormattedValue

public class Percentage
    implements FormattedValue
{

    public static final String percentSymbol = "%";
    public final Object value;

    public Percentage(Object obj)
    {
        value = obj;
    }

    public String format()
    {
        if (value == null)
        {
            return "--";
        } else
        {
            return (new StringBuilder()).append(value).append("%").toString();
        }
    }
}
