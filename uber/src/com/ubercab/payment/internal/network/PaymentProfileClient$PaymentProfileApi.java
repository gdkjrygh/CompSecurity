// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.payment.internal.network;

import com.ubercab.payment.internal.network.model.ValidateCodeRequest;
import retrofit.Callback;

interface Q
{

    public abstract void checkBalance(String s, Callback callback);

    public abstract void delete(String s, Callback callback);

    public abstract void depositRequest(String s, double d, String s1, Callback callback);

    public abstract void sendCode(String s, Callback callback);

    public abstract void validateCode(String s, ValidateCodeRequest validatecoderequest, Callback callback);
}
