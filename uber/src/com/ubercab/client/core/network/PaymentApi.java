// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.network;

import java.util.Map;
import retrofit.Callback;
import retrofit.client.Response;

public interface PaymentApi
{

    public abstract void checkBalance(String s, Callback callback);

    public abstract void depositRequest(String s, String s1, String s2, Callback callback);

    public abstract void sendCode(String s, Map map, Callback callback);

    public abstract Response validateCode(String s, Map map);

    public abstract void validateCode(String s, Map map, Callback callback);
}
