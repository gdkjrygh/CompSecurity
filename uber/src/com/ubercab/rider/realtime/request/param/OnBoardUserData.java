// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.param;


// Referenced classes of package com.ubercab.rider.realtime.request.param:
//            Shape_OnBoardUserData, CreateProfile

public abstract class OnBoardUserData
{

    public OnBoardUserData()
    {
    }

    public static OnBoardUserData create()
    {
        return new Shape_OnBoardUserData();
    }

    public abstract CreateProfile getPersonalProfile();

    public abstract CreateProfile getProfile();

    public abstract String getUserUuid();

    public abstract OnBoardUserData setPersonalProfile(CreateProfile createprofile);

    public abstract OnBoardUserData setProfile(CreateProfile createprofile);

    public abstract OnBoardUserData setUserUuid(String s);
}
