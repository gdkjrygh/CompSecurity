// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.rider.realtime.response;


public abstract class LoginResponse
{

    public LoginResponse()
    {
    }

    public abstract String getPhoneNumberE164();

    public abstract String getToken();

    public abstract String getUsername();

    public abstract String getUuid();

    abstract LoginResponse setPhoneNumberE164(String s);

    abstract LoginResponse setToken(String s);

    abstract LoginResponse setUsername(String s);

    abstract LoginResponse setUuid(String s);
}
