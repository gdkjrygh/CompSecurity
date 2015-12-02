// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_OptionsBody

public abstract class OptionsBody
{

    public OptionsBody()
    {
    }

    public static OptionsBody create()
    {
        return new Shape_OptionsBody();
    }

    public abstract boolean getOptin();

    public abstract Float getThreshold();

    public abstract OptionsBody setOptin(boolean flag);

    public abstract OptionsBody setThreshold(Float float1);
}
