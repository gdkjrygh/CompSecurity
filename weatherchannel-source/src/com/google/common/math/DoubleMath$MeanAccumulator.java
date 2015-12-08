// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.math;

import com.google.common.base.Preconditions;

// Referenced classes of package com.google.common.math:
//            DoubleMath, DoubleUtils

private static final class <init>
{

    private long count;
    private double mean;

    void add(double d)
    {
        Preconditions.checkArgument(DoubleUtils.isFinite(d));
        count = count + 1L;
        mean = mean + (d - mean) / (double)count;
    }

    double mean()
    {
        boolean flag;
        if (count > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Cannot take mean of 0 values");
        return mean;
    }

    private ()
    {
        count = 0L;
        mean = 0.0D;
    }

    mean(mean mean1)
    {
        this();
    }
}
