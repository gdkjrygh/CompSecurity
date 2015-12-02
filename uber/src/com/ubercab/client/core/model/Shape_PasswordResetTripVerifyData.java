// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


// Referenced classes of package com.ubercab.client.core.model:
//            PasswordResetTripVerifyData

public final class Shape_PasswordResetTripVerifyData extends PasswordResetTripVerifyData
{

    private Boolean tripChallengeAnswer;
    private String tripChallengeId;
    private String tripId;

    Shape_PasswordResetTripVerifyData()
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
            obj = (PasswordResetTripVerifyData)obj;
            if (((PasswordResetTripVerifyData) (obj)).getTripChallengeId() == null ? getTripChallengeId() != null : !((PasswordResetTripVerifyData) (obj)).getTripChallengeId().equals(getTripChallengeId()))
            {
                return false;
            }
            if (((PasswordResetTripVerifyData) (obj)).getTripId() == null ? getTripId() != null : !((PasswordResetTripVerifyData) (obj)).getTripId().equals(getTripId()))
            {
                return false;
            }
            if (((PasswordResetTripVerifyData) (obj)).getTripChallengeAnswer() == null ? getTripChallengeAnswer() != null : !((PasswordResetTripVerifyData) (obj)).getTripChallengeAnswer().equals(getTripChallengeAnswer()))
            {
                return false;
            }
        }
        return true;
    }

    public final Boolean getTripChallengeAnswer()
    {
        return tripChallengeAnswer;
    }

    public final String getTripChallengeId()
    {
        return tripChallengeId;
    }

    public final String getTripId()
    {
        return tripId;
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (tripChallengeId == null)
        {
            i = 0;
        } else
        {
            i = tripChallengeId.hashCode();
        }
        if (tripId == null)
        {
            j = 0;
        } else
        {
            j = tripId.hashCode();
        }
        if (tripChallengeAnswer != null)
        {
            k = tripChallengeAnswer.hashCode();
        }
        return (j ^ (i ^ 0xf4243) * 0xf4243) * 0xf4243 ^ k;
    }

    final PasswordResetTripVerifyData setTripChallengeAnswer(Boolean boolean1)
    {
        tripChallengeAnswer = boolean1;
        return this;
    }

    final PasswordResetTripVerifyData setTripChallengeId(String s)
    {
        tripChallengeId = s;
        return this;
    }

    final PasswordResetTripVerifyData setTripId(String s)
    {
        tripId = s;
        return this;
    }

    public final String toString()
    {
        return (new StringBuilder("PasswordResetTripVerifyData{tripChallengeId=")).append(tripChallengeId).append(", tripId=").append(tripId).append(", tripChallengeAnswer=").append(tripChallengeAnswer).append("}").toString();
    }
}
