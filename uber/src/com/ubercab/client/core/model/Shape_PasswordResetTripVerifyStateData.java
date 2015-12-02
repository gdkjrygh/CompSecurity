// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import com.ubercab.rds.core.model.TripSummary;

// Referenced classes of package com.ubercab.client.core.model:
//            PasswordResetTripVerifyStateData

public final class Shape_PasswordResetTripVerifyStateData extends PasswordResetTripVerifyStateData
{

    private String tripChallengeId;
    private TripSummary tripSummary;

    Shape_PasswordResetTripVerifyStateData()
    {
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (PasswordResetTripVerifyStateData)obj;
            if (((PasswordResetTripVerifyStateData) (obj)).getTripChallengeId() == null ? getTripChallengeId() != null : !((PasswordResetTripVerifyStateData) (obj)).getTripChallengeId().equals(getTripChallengeId()))
            {
                return false;
            }
            if (((PasswordResetTripVerifyStateData) (obj)).getTripSummary() == null ? getTripSummary() != null : !((PasswordResetTripVerifyStateData) (obj)).getTripSummary().equals(getTripSummary()))
            {
                return false;
            }
        }
        return true;
    }

    public final String getTripChallengeId()
    {
        return tripChallengeId;
    }

    public final TripSummary getTripSummary()
    {
        return tripSummary;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (tripChallengeId == null)
        {
            i = 0;
        } else
        {
            i = tripChallengeId.hashCode();
        }
        if (tripSummary != null)
        {
            j = tripSummary.hashCode();
        }
        return (i ^ 0xf4243) * 0xf4243 ^ j;
    }

    public final PasswordResetTripVerifyStateData setTripChallengeId(String s)
    {
        tripChallengeId = s;
        return this;
    }

    public final PasswordResetTripVerifyStateData setTripSummary(TripSummary tripsummary)
    {
        tripSummary = tripsummary;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("PasswordResetTripVerifyStateData{tripChallengeId=")).append(tripChallengeId).append(", tripSummary=").append(tripSummary).append("}").toString();
    }
}
