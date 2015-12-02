// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rds.core.model.TripSummary;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_PasswordResetTripVerifyStateData

public abstract class PasswordResetTripVerifyStateData
{

    public PasswordResetTripVerifyStateData()
    {
    }

    public static PasswordResetTripVerifyStateData newInstance()
    {
        return new Shape_PasswordResetTripVerifyStateData();
    }

    public abstract String getTripChallengeId();

    public abstract TripSummary getTripSummary();

    public abstract PasswordResetTripVerifyStateData setTripChallengeId(String s);

    public abstract PasswordResetTripVerifyStateData setTripSummary(TripSummary tripsummary);
}
