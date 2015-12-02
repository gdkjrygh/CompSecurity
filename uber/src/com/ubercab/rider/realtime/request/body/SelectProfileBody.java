// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_SelectProfileBody

public abstract class SelectProfileBody
{

    public SelectProfileBody()
    {
    }

    public static SelectProfileBody create(String s, String s1)
    {
        return (new Shape_SelectProfileBody()).setProfileUUID(s).setJobUUID(s1);
    }

    public abstract String getJobUUID();

    public abstract String getProfileUUID();

    abstract SelectProfileBody setJobUUID(String s);

    abstract SelectProfileBody setProfileUUID(String s);
}
