// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;


public abstract class PasswordResetNameVerifyData
{

    public PasswordResetNameVerifyData()
    {
    }

    public abstract String getFirstName();

    public abstract String getLastName();

    abstract PasswordResetNameVerifyData setFirstName(String s);

    abstract PasswordResetNameVerifyData setLastName(String s);
}
