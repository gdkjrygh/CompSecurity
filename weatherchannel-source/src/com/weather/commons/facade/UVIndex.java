// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.facade;


// Referenced classes of package com.weather.commons.facade:
//            FormattedValue

public class UVIndex
    implements FormattedValue
{

    public final String description;
    public final Integer index;

    public UVIndex(Integer integer, String s)
    {
        index = integer;
        description = s;
    }

    public String format()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Object obj;
        if (index != null)
        {
            obj = index;
        } else
        {
            obj = "--";
        }
        stringbuilder = stringbuilder.append(obj).append(" ");
        if (description != null)
        {
            obj = description;
        } else
        {
            obj = "";
        }
        return stringbuilder.append(((String) (obj))).toString();
    }
}
