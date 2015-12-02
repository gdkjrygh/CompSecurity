// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.vendor.google.network;

import retrofit.Callback;

public interface DirectionsApi
{

    public abstract void directions(String s, String s1, String s2, String s3, Callback callback);
}
