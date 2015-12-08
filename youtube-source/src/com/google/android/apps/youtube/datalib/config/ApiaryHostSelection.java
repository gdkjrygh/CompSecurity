// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.config;

import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;

public final class ApiaryHostSelection extends Enum
{

    private static final ApiaryHostSelection $VALUES[];
    public static final int DEFAULT_ORDINAL = 0;
    public static final String PREFERENCES_KEY = "ApiaryHostSelection";
    public static final ApiaryHostSelection PRODUCTION;
    public static final ApiaryHostSelection STAGING;
    private final Uri apiaryBaseUri;

    private ApiaryHostSelection(String s, int i, String s1)
    {
        super(s, i);
        apiaryBaseUri = Uri.parse(s1);
    }

    static ApiaryHostSelection getApiaryHostSelection(SharedPreferences sharedpreferences)
    {
        c.a(sharedpreferences);
        sharedpreferences = sharedpreferences.getString("ApiaryHostSelection", values()[0].toString());
        ApiaryHostSelection apiaryhostselection;
        try
        {
            apiaryhostselection = valueOf(sharedpreferences);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            L.b((new StringBuilder("Bogus value in shared preferences for key ApiaryHostSelection value ")).append(sharedpreferences).append(" returning default value.").toString());
            return values()[0];
        }
        return apiaryhostselection;
    }

    public static int getDefaultIndex()
    {
        return 0;
    }

    public static ApiaryHostSelection valueOf(String s)
    {
        return (ApiaryHostSelection)Enum.valueOf(com/google/android/apps/youtube/datalib/config/ApiaryHostSelection, s);
    }

    public static ApiaryHostSelection[] values()
    {
        return (ApiaryHostSelection[])$VALUES.clone();
    }

    final Uri getApiaryBaseUri()
    {
        return apiaryBaseUri;
    }

    static 
    {
        PRODUCTION = new ApiaryHostSelection("PRODUCTION", 0, "https://www.googleapis.com");
        STAGING = new ApiaryHostSelection("STAGING", 1, "https://www-googleapis-staging.sandbox.google.com");
        $VALUES = (new ApiaryHostSelection[] {
            PRODUCTION, STAGING
        });
    }
}
