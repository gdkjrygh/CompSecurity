// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public abstract class PasswordResetTripVerifyData
{

    public PasswordResetTripVerifyData()
    {
    }

    public abstract Boolean getTripChallengeAnswer();

    public abstract String getTripChallengeId();

    public abstract String getTripId();

    abstract PasswordResetTripVerifyData setTripChallengeAnswer(Boolean boolean1);

    abstract PasswordResetTripVerifyData setTripChallengeId(String s);

    abstract PasswordResetTripVerifyData setTripId(String s);
}
