// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.async;

import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.c;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.async:
//            t

public final class ac
    implements android.content.SharedPreferences.OnSharedPreferenceChangeListener, t
{

    private Uri a;
    private Uri b;
    private final Uri c = (new android.net.Uri.Builder()).scheme("http").authority("uploads.gdata.youtube.com").build();
    private final SharedPreferences d;

    public ac(SharedPreferences sharedpreferences)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        d = sharedpreferences;
        d.registerOnSharedPreferenceChangeListener(this);
    }

    public final Uri a()
    {
        if (a == null)
        {
            android.net.Uri.Builder builder = (new android.net.Uri.Builder()).scheme("http");
            String s = d.getString("gdata_hostname", "gdata.youtube.com");
            if (!Arrays.asList(new String[] {
    "gdata.youtube.com", "stage.gdata.youtube.com", "dev.gdata.youtube.com"
}).contains(s))
            {
                s = "gdata.youtube.com";
            }
            a = builder.authority(s).appendPath("feeds").appendPath("api").build();
        }
        return a;
    }

    public final Uri b()
    {
        if (b == null)
        {
            b = a().buildUpon().scheme("https").build();
        }
        return b;
    }

    public final Uri c()
    {
        return c;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedpreferences, String s)
    {
        if ("gdata_hostname".equals(s))
        {
            a = null;
            b = null;
        }
    }
}
