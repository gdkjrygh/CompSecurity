// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.visa.cbp.sdk.facade.api;

import retrofit.Callback;

public interface AuthRestAdapter
{

    public static final String AUTHENTICATE_ENDPOINT = "/ics/auth/oauth2/token";
    public static final String CONTENT_TYPE_FORM_URLENCODED = "Content-Type: application/x-www-form-urlencoded";

    public abstract void authenticate(String s, String s1, Callback callback);
}
