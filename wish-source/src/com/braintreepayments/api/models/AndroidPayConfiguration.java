// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;


public class AndroidPayConfiguration
{

    private String mDisplayName;
    private boolean mEnabled;
    private String mEnvironment;
    private String mGoogleAuthorizationFingerprint;

    public AndroidPayConfiguration()
    {
    }

    public String getDisplayName()
    {
        return mDisplayName;
    }

    public String getEnvironment()
    {
        return mEnvironment;
    }

    public String getGoogleAuthorizationFingerprint()
    {
        return mGoogleAuthorizationFingerprint;
    }

    public boolean isEnabled()
    {
        return mEnabled;
    }
}
