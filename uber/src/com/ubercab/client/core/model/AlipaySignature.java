// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_AlipaySignature

public abstract class AlipaySignature
    implements Parcelable
{

    public AlipaySignature()
    {
    }

    public static AlipaySignature create()
    {
        return new Shape_AlipaySignature();
    }

    public static AlipaySignature create(String s)
    {
        return create().setSignature(s);
    }

    public abstract String getSignature();

    abstract AlipaySignature setSignature(String s);
}
