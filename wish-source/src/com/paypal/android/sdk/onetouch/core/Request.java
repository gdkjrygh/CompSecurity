// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk.onetouch.core;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;

// Referenced classes of package com.paypal.android.sdk.onetouch.core:
//            au, db, dc, b, 
//            Result, dl, Protocol

public abstract class Request
    implements Parcelable
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;

    public Request()
    {
    }

    protected abstract Request a();

    protected final String b()
    {
        return String.format("clientId:%s, environment:%s", new Object[] {
            getClientId(), getEnvironment()
        });
    }

    public Request cancelUrl(String s, String s1)
    {
        d = (new StringBuilder()).append(s).append("://onetouch/v1/").append(s1).toString();
        return a();
    }

    public Request clientId(String s)
    {
        b = s;
        return a();
    }

    public Request clientMetadataId(String s)
    {
        c = s;
        return a();
    }

    public Request environment(String s)
    {
        a = s;
        return a();
    }

    public abstract dc getBrowserSwitchRecipe(db db);

    public abstract String getBrowserSwitchUrl(Context context, db db);

    public String getCancelUrl()
    {
        return d;
    }

    public String getClientId()
    {
        return b;
    }

    public String getClientMetadataId()
    {
        return c;
    }

    public String getEnvironment()
    {
        return a;
    }

    public String getEnvironmentUrl()
    {
        if (au.c(getEnvironment()))
        {
            return "https://api-m.paypal.com/v1/";
        }
        if (au.b(getEnvironment()))
        {
            return "https://api-m.sandbox.paypal.com/v1/";
        }
        if (au.a(getEnvironment()))
        {
            return null;
        } else
        {
            return getEnvironment();
        }
    }

    public abstract dc getRecipeToExecute(Context context, db db, boolean flag);

    public String getSuccessUrl()
    {
        return e;
    }

    public abstract Result parseBrowserResponse(b b1, Uri uri);

    public abstract void persistRequiredFields(b b1);

    public Request successUrl(String s, String s1)
    {
        e = (new StringBuilder()).append(s).append("://onetouch/v1/").append(s1).toString();
        return a();
    }

    public abstract void trackFpti(Context context, dl dl, Protocol protocol);

    public abstract boolean validateV1V2Response(b b1, Bundle bundle);
}
