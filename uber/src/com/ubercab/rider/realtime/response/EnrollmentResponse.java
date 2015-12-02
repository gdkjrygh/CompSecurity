// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;


public abstract class EnrollmentResponse
{

    public EnrollmentResponse()
    {
    }

    public abstract String getEnrollmentUUID();

    public abstract String getResultCode();

    public abstract void setEnrollmentUUID(String s);

    public abstract void setResultCode(String s);
}
