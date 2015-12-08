// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.metric;

import com.google.common.base.Preconditions;

// Referenced classes of package com.weather.util.metric:
//            Metric

public abstract class BaseMetric
    implements Metric
{

    private final String description;
    private final String name;

    BaseMetric(String s, String s1)
    {
        Preconditions.checkNotNull(s1);
        if (s.trim().isEmpty())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Name ").append(s).append(" can not be empty or null").toString());
        } else
        {
            name = s;
            description = s1;
            return;
        }
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        return name;
    }
}
