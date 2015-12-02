// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;


// Referenced classes of package com.ubercab.rider.realtime.response:
//            Shape_Surge

public abstract class Surge
{

    public static final String STATUS_ELIGIBLE = "ELIGIBLE";
    public static final String STATUS_EXIST_UNCHANGED = "EXIST_UNCHANGED";
    public static final String STATUS_EXIST_UPDATED = "EXIST_UPDATED";
    public static final String STATUS_INELIGIBLE = "INELIGIBLE";
    public static final String STATUS_NEWLY_CREATED = "NEWLY_CREATED";

    public Surge()
    {
    }

    public static Surge create()
    {
        return new Shape_Surge();
    }

    public abstract boolean getOptin();

    public abstract String getStatus();

    public abstract Float getThreshold();

    public abstract Surge setOptin(boolean flag);

    public abstract Surge setStatus(String s);

    public abstract Surge setThreshold(Float float1);
}
