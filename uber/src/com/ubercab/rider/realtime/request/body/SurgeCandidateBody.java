// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.request.body;


// Referenced classes of package com.ubercab.rider.realtime.request.body:
//            Shape_SurgeCandidateBody, LocationBody

public abstract class SurgeCandidateBody
{

    public SurgeCandidateBody()
    {
    }

    public static SurgeCandidateBody create()
    {
        return new Shape_SurgeCandidateBody();
    }

    public abstract LocationBody getLocation();

    public abstract SurgeCandidateBody setLocation(LocationBody locationbody);
}
