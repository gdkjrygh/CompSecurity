// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_FareSplitUninviteBody

public abstract class FareSplitUninviteBody
{

    public FareSplitUninviteBody()
    {
    }

    public static FareSplitUninviteBody create()
    {
        return new Shape_FareSplitUninviteBody();
    }

    public abstract String getInvitee();

    public abstract FareSplitUninviteBody setInvitee(String s);
}
