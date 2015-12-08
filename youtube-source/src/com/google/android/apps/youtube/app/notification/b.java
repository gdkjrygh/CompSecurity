// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.notification;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.d;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.identity.ai;
import com.google.android.apps.youtube.core.identity.aj;
import com.google.android.apps.youtube.datalib.innertube.InnerTubeServiceException;
import com.google.android.apps.youtube.datalib.innertube.ab;
import com.google.android.apps.youtube.datalib.innertube.ac;
import com.google.android.gms.a.a;
import java.io.IOException;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.apps.youtube.app.notification:
//            c

public final class b
{

    private final a a;
    private final String b;
    private final SharedPreferences c;
    private final ab d;
    private final Executor e;

    public b(a a1, String s, SharedPreferences sharedpreferences, ab ab1, Executor executor)
    {
        a = (a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        b = com.google.android.apps.youtube.common.fromguava.c.a(s);
        c = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        d = (ab)com.google.android.apps.youtube.common.fromguava.c.a(ab1);
        e = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
    }

    static void a(b b1)
    {
        if (!TextUtils.isEmpty(b1.c())) goto _L2; else goto _L1
_L1:
        d d1 = new d();
_L3:
        String s = b1.a.a(new String[] {
            b1.b
        });
        if (!TextUtils.isEmpty(s))
        {
            b1.c.edit().putString("gcm_registration_id", s).apply();
        }
_L4:
        b1.b();
        return;
        IOException ioexception;
        ioexception;
        L.b("Could not register with GCM: ", ioexception);
        if (!d1.a()) goto _L4; else goto _L3
_L2:
        b1.b();
        return;
    }

    private void b()
    {
        Object obj = c();
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            L.e("Could not register with InnerTube because no GCM registration ID was found.");
            return;
        }
        d d1 = new d();
        obj = d.a().a(((String) (obj)));
        do
        {
            try
            {
                d.a(((ac) (obj)));
                return;
            }
            catch (InnerTubeServiceException innertubeserviceexception)
            {
                L.b("Could not register for notifications with InnerTube: ", innertubeserviceexception);
                if (!d1.a())
                {
                    return;
                }
            }
            catch (IllegalStateException illegalstateexception)
            {
                L.b("Could not register for notifications with InnerTube: ", illegalstateexception);
                if (!d1.a())
                {
                    return;
                }
            }
        } while (true);
    }

    private String c()
    {
        String s1 = c.getString("gcm_registration_id", "");
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = null;
        }
        return s;
    }

    public final void a()
    {
        e.execute(new com.google.android.apps.youtube.app.notification.c(this));
    }

    public final void onSignIn(ai ai)
    {
        a();
    }

    public final void onSignOut(aj aj)
    {
        a();
    }
}
