// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_UseCreditsBody

public abstract class UseCreditsBody
{

    public UseCreditsBody()
    {
    }

    public static UseCreditsBody create()
    {
        return new Shape_UseCreditsBody();
    }

    public abstract boolean getUseCredits();

    public abstract UseCreditsBody setUseCredits(boolean flag);
}
