// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.android.photo.util;

import org.apache.http.cookie.Cookie;

public class NetworkUtils
{

    public NetworkUtils()
    {
    }

    public static String asString(Cookie cookie)
    {
        return (new StringBuilder()).append("===[ Cookie ]===").append("\n    Class: ").append(cookie.getClass()).append("\n     Name: ").append(cookie.getName()).append("\n    Value: ").append(cookie.getValue()).append("\n   Domain: ").append(cookie.getDomain()).append("\n     Path: ").append(cookie.getPath()).append("\n  Expires: ").append(cookie.getExpiryDate()).append("\n   Secure: ").append(cookie.isSecure()).append("\n================").toString();
    }
}
