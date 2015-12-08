// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.credentials;

import android.accounts.Account;
import com.google.android.gms.common.internal.zzx;

public final class IdentityProviders
{

    public static final String FACEBOOK = "https://www.facebook.com";
    public static final String GOOGLE = "https://accounts.google.com";
    public static final String LINKEDIN = "https://www.linkedin.com";
    public static final String MICROSOFT = "https://login.live.com";
    public static final String PAYPAL = "https://www.paypal.com";
    public static final String TWITTER = "https://twitter.com";
    public static final String YAHOO = "https://login.yahoo.com";

    private IdentityProviders()
    {
    }

    public static final String getIdentityProviderForAccount(Account account)
    {
        zzx.zzb(account, "account cannot be null");
        if ("com.google".equals(account.type))
        {
            return "https://accounts.google.com";
        }
        if ("com.facebook.auth.login".equals(account.type))
        {
            return "https://www.facebook.com";
        } else
        {
            return null;
        }
    }
}
