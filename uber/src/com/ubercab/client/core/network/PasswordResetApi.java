// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.network;

import com.ubercab.client.core.model.PasswordResetData;
import retrofit.Callback;

public interface PasswordResetApi
{

    public abstract void requestNextAction(PasswordResetData passwordresetdata, Callback callback);
}
