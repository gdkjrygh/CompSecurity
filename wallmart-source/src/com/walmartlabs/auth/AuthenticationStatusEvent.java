// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.auth;


public class AuthenticationStatusEvent
{

    public boolean accountCreated;
    public String cid;
    public String customerId;
    public String email;
    public boolean emailSignup;
    public String firstName;
    public boolean hasCredentials;
    public boolean isShippingPassMember;
    public String lastName;
    public boolean loggedIn;

    public AuthenticationStatusEvent()
    {
    }
}
