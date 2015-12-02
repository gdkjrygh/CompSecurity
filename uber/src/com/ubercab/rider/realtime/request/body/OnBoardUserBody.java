// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import com.ubercab.rider.realtime.request.param.OnBoardUserData;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_OnBoardUserBody

public abstract class OnBoardUserBody
{

    public OnBoardUserBody()
    {
    }

    public static OnBoardUserBody create()
    {
        return new Shape_OnBoardUserBody();
    }

    public abstract OnBoardUserData getRequest();

    public abstract OnBoardUserBody setRequest(OnBoardUserData onboarduserdata);
}
