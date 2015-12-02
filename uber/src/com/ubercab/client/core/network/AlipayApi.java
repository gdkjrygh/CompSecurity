// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.network;

import retrofit.Callback;

public interface AlipayApi
{

    public abstract void getAlipayUserData(String s, String s1, Callback callback);

    public abstract void getSignature(String s, Callback callback);
}
