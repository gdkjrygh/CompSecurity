// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend.location;

import com.amazon.identity.auth.device.AuthError;
import com.weather.dal2.ups.UserDetails;

public interface AmazonLoginListener
{

    public abstract void onLoginError(AuthError autherror);

    public abstract void onLoginSuccess(UserDetails userdetails, String s);
}
