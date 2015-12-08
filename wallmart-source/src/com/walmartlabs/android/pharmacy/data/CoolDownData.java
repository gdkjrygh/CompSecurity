// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.pharmacy.data;


public class CoolDownData
{

    public int coolDownTimeInSeconds;
    public boolean dobVerificationAttempted;
    public int noOfFailedAttemptsIn24Hours;
    public int noOfRetriesRemainingIn24Hours;

    public CoolDownData()
    {
    }
}
