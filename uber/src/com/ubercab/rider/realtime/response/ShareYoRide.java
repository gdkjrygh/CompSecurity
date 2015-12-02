// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;


// Referenced classes of package com.ubercab.rider.realtime.response:
//            Shape_ShareYoRide

public abstract class ShareYoRide
{

    public ShareYoRide()
    {
    }

    public static ShareYoRide create(String s)
    {
        Shape_ShareYoRide shape_shareyoride = new Shape_ShareYoRide();
        shape_shareyoride.setShareUrl(s);
        return shape_shareyoride;
    }

    public abstract String getShareUrl();

    abstract void setShareUrl(String s);
}
