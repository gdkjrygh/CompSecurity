// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.vendor.baidu;

import retrofit.Callback;

interface BaiduApi
{

    public abstract void getAuthorizationDetails(String s, Callback callback);
}
