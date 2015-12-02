// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;

import java.util.List;

// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_FareSplitInvitationBody

public abstract class FareSplitInvitationBody
{

    public FareSplitInvitationBody()
    {
    }

    public static FareSplitInvitationBody create()
    {
        return new Shape_FareSplitInvitationBody();
    }

    public abstract List getInvitees();

    public abstract FareSplitInvitationBody setInvitees(List list);
}
