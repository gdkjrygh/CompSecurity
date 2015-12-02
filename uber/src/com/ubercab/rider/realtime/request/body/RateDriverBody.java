// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import com.ubercab.rider.realtime.request.param.Location;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_RateDriverBody

public abstract class RateDriverBody
{

    public RateDriverBody()
    {
    }

    public static RateDriverBody create(int i)
    {
        return (new Shape_RateDriverBody()).setRating(i);
    }

    public abstract String getFeedback();

    public abstract Integer getFeedbackId();

    public abstract int getRating();

    public abstract Location getTargetLocation();

    public abstract RateDriverBody setFeedback(String s);

    public abstract RateDriverBody setFeedbackId(Integer integer);

    abstract RateDriverBody setRating(int i);

    public abstract RateDriverBody setTargetLocation(Location location);
}
