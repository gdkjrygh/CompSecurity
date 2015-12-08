// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;


public final class Protocol extends Enum
{

    private static final Protocol a[];
    public static final Protocol v0;
    public static final Protocol v1;
    public static final Protocol v2;
    public static final Protocol v3;

    private Protocol(String s, int i)
    {
        super(s, i);
    }

    public static Protocol valueOf(String s)
    {
        return (Protocol)Enum.valueOf(com/paypal/android/sdk/onetouch/core/Protocol, s);
    }

    public static Protocol[] values()
    {
        return (Protocol[])a.clone();
    }

    static 
    {
        v0 = new Protocol("v0", 0);
        v1 = new Protocol("v1", 1);
        v2 = new Protocol("v2", 2);
        v3 = new Protocol("v3", 3);
        a = (new Protocol[] {
            v0, v1, v2, v3
        });
    }
}
