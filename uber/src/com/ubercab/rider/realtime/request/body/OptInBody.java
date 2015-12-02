// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_OptInBody, OptionsBody

public abstract class OptInBody
{

    public OptInBody()
    {
    }

    public static OptInBody create()
    {
        return new Shape_OptInBody();
    }

    public abstract OptionsBody getOptions();

    public abstract OptInBody setOptions(OptionsBody optionsbody);
}
