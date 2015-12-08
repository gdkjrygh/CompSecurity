// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.util;

import com.walmart.android.utils.UpcUtils;

public class SlapUpc
{

    private final String mOriginalUpc;
    private final String mSlapUpc;

    public SlapUpc(String s)
    {
        mOriginalUpc = s;
        mSlapUpc = UpcUtils.getLookupUpc(mOriginalUpc);
    }

    public String getUpc()
    {
        return mSlapUpc;
    }

    public String toString()
    {
        return (new StringBuilder()).append("SlapUpc [").append(mOriginalUpc).append(" -> ").append(mSlapUpc).append("]").toString();
    }
}
