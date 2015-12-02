// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;


public abstract class SafetyNetEmergencyContact
{

    public SafetyNetEmergencyContact()
    {
    }

    public abstract String getId();

    public abstract String getName();

    public abstract String getPhone();

    abstract SafetyNetEmergencyContact setId(String s);

    abstract SafetyNetEmergencyContact setName(String s);

    abstract SafetyNetEmergencyContact setPhone(String s);
}
