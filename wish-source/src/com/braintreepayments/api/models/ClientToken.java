// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.models;

import android.util.Base64;
import com.google.gson.Gson;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClientToken
{

    private static final Pattern BASE_64_PATTERN = Pattern.compile("([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)");
    private String mAuthorizationFingerprint;
    private String mClientTokenString;
    private String mConfigUrl;

    public ClientToken()
    {
    }

    public static ClientToken fromString(String s)
    {
        String s1 = s;
        if (BASE_64_PATTERN.matcher(s).matches())
        {
            s1 = new String(Base64.decode(s, 0));
        }
        s = (ClientToken)(new Gson()).fromJson(s1, com/braintreepayments/api/models/ClientToken);
        s.mClientTokenString = s1;
        return s;
    }

    public String getAuthorizationFingerprint()
    {
        return mAuthorizationFingerprint;
    }

    public String getClientTokenString()
    {
        return mClientTokenString;
    }

    public String getConfigUrl()
    {
        return mConfigUrl;
    }

}
