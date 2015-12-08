// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.kangaroo.service;

import java.util.Locale;

public class Header
{

    public static final Header NO_CACHE = new Header("Cache-Control", "no-cache");
    private final String mName;
    private final String mValue;

    public Header(String s, String s1)
    {
        mName = s;
        mValue = s1;
    }

    public String name()
    {
        return mName;
    }

    public String toString()
    {
        return String.format(Locale.US, "%s: %s", new Object[] {
            mName, mValue
        });
    }

    public String value()
    {
        return mValue;
    }

}
