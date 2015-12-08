// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.api;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.DeviceAuthorizerForV2Apis;
import com.google.android.apps.youtube.core.client.as;
import com.google.android.apps.youtube.datalib.legacy.model.b;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.api:
//            d, e, f, b

public final class a
    implements DeviceAuthorizerForV2Apis
{

    private final as a;
    private final Executor b;
    private final SharedPreferences c;
    private final Handler d;
    private final String e;
    private final String f;
    private b g;

    public a(as as1, Executor executor, Handler handler, SharedPreferences sharedpreferences, String s, String s1, String s2)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s1, "appVersion cannot be null or empty");
        com.google.android.apps.youtube.common.fromguava.c.a(s2, "appDeveloperKey cannot be null or empty");
        a = (as)com.google.android.apps.youtube.common.fromguava.c.a(as1, "deviceRegistrationClient cannot be null");
        b = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor, "executor cannot be null");
        d = (Handler)com.google.android.apps.youtube.common.fromguava.c.a(handler, "uiHandler cannot be null");
        c = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences, "preferences cannot be null");
        f = com.google.android.apps.youtube.common.fromguava.c.a(s, "appPackage cannot be null or empty");
        e = String.format("_%s_%s_%s", new Object[] {
            s, s1, s2
        });
    }

    static b a(a a1)
    {
        return a1.g;
    }

    static b a(a a1, b b1)
    {
        a1.g = b1;
        return b1;
    }

    static void a(a a1, f f1)
    {
        a1.d.post(new d(a1, f1));
    }

    static void a(a a1, f f1, Exception exception)
    {
        a1.d.post(new e(a1, f1, exception));
    }

    static SharedPreferences b(a a1)
    {
        return a1.c;
    }

    static String c(a a1)
    {
        return a1.e;
    }

    static as d(a a1)
    {
        return a1.a;
    }

    public final String a(Uri uri)
    {
        if (g == null)
        {
            throw new IllegalStateException("Need to call init() first");
        } else
        {
            return String.format("%s, client-id=\"%s\"", new Object[] {
                g.a(uri), f
            });
        }
    }

    public final void a(f f1)
    {
        if (g != null)
        {
            f1.a();
            return;
        }
        g = com.google.android.apps.youtube.datalib.legacy.model.b.a(c, e);
        if (g != null)
        {
            f1.a();
            return;
        } else
        {
            b.execute(new com.google.android.apps.youtube.api.b(this, f1));
            return;
        }
    }
}
