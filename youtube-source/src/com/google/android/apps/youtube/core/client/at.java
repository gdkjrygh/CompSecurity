// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.telephony.TelephonyManager;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.o;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.au;
import com.google.android.apps.youtube.core.converter.http.dp;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.datalib.e.b;
import com.google.android.apps.youtube.datalib.e.f;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.apache.http.client.HttpClient;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            m, av, bc, DeviceClassification, 
//            aw, au

public abstract class at extends m
{

    private static final Uri a = Uri.parse("https://www.youtube.com/leanback_ajax?action_environment=1");
    private static final Uri h = Uri.parse("https://www.youtube-nocookie.com/device_204");
    private final SharedPreferences i;
    private final bc j;
    private final l k;
    private final af l;
    private final b m;
    private final au n;
    private final DeviceClassification o;
    private final ConnectivityManager p;
    private final TelephonyManager q;
    private final com.google.android.apps.youtube.common.a.b r = new av(this);

    public at(Context context, Executor executor, HttpClient httpclient, com.google.android.apps.youtube.common.e.b b1, SharedPreferences sharedpreferences, bc bc1, l l1, 
            au au1, DeviceClassification deviceclassification, b b2)
    {
        super(executor, httpclient, b1);
        com.google.android.apps.youtube.common.fromguava.c.a(context);
        p = (ConnectivityManager)context.getSystemService("connectivity");
        q = (TelephonyManager)context.getSystemService("phone");
        i = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        j = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
        k = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        n = (au)com.google.android.apps.youtube.common.fromguava.c.a(au1);
        o = (DeviceClassification)com.google.android.apps.youtube.common.fromguava.c.a(deviceclassification, "deviceClassification cannot be null");
        context = new aw(this);
        l = a(a(dp.a, context));
        m = (b)com.google.android.apps.youtube.common.fromguava.c.a(b2);
    }

    private void a(long l1)
    {
        long l2;
        for (l2 = d.a(); l2 - l1 < 0xdbba00L || !a() || !n.D();)
        {
            return;
        }

        i.edit().putLong("dev_retention_last_ping_time_ms", l2).apply();
        l.a(a, r);
    }

    static void a(at at1, String s, long l1)
    {
        if (!at1.k.b())
        {
            at1.a(s, l1, ((UserProfile) (null)));
            return;
        } else
        {
            at1.j.a(new com.google.android.apps.youtube.core.client.au(at1, s, l1));
            return;
        }
    }

    static void a(at at1, String s, long l1, UserProfile userprofile)
    {
        at1.a(s, l1, userprofile);
    }

    private void a(String s, long l1, UserProfile userprofile)
    {
        boolean flag1 = false;
        Object obj;
        o o1;
        boolean flag;
        if (userprofile != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!i.contains("dev_retention_first_geo"))
        {
            flag1 = true;
        }
        if (flag1)
        {
            i.edit().putString("dev_retention_first_geo", s).putLong("dev_retention_first_active", l1).apply();
        }
        if (flag && !i.contains("dev_retention_first_login"))
        {
            i.edit().putLong("dev_retention_first_login", l1).apply();
        }
        o1 = com.google.android.apps.youtube.common.e.o.a(h);
        obj = i.getString("dev_retention_uuid", null);
        s = ((String) (obj));
        if (obj == null)
        {
            s = UUID.randomUUID().toString();
            i.edit().putString("dev_retention_uuid", s).apply();
        }
        obj = o1.a("app_anon_id", s);
        ((o) (obj)).a("firstactive", Long.toString(i.getLong("dev_retention_first_active", 0L))).a("firstactivegeo", i.getString("dev_retention_first_geo", ""));
        if (i.contains("dev_retention_first_login"))
        {
            ((o) (obj)).a("firstlogin", Long.toString(i.getLong("dev_retention_first_login", 0L)));
        }
        if (i.contains("dev_retention_prev_active"))
        {
            ((o) (obj)).a("prevactive", Long.toString(i.getLong("dev_retention_prev_active", 0L)));
        }
        if (i.contains("dev_retention_prev_login"))
        {
            ((o) (obj)).a("prevlogin", Long.toString(i.getLong("dev_retention_prev_login", 0L)));
        }
        if (i.contains("dev_retention_intercepted_url"))
        {
            ((o) (obj)).a("intercepted_url", i.getString("dev_retention_intercepted_url", ""));
            i.edit().remove("dev_retention_intercepted_url").apply();
        }
        if (userprofile != null)
        {
            s = "1";
        } else
        {
            s = "0";
        }
        ((o) (obj)).a("loginstate", s);
        if (userprofile != null && userprofile.hasAge() && userprofile.gender != com.google.android.apps.youtube.core.identity.UserProfile.Gender.UNKNOWN)
        {
            if (userprofile.gender == com.google.android.apps.youtube.core.identity.UserProfile.Gender.MALE)
            {
                s = "m";
            } else
            {
                s = "f";
            }
            ((o) (obj)).a("uga", (new StringBuilder()).append(s).append(userprofile.age).toString());
        }
        o.a(((o) (obj)));
        s = p.getActiveNetworkInfo();
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.getType() != 1) goto _L4; else goto _L3
_L3:
        s = "wifi";
_L6:
        if (s != null)
        {
            ((o) (obj)).a("cnetwork", s);
        }
        s = ((o) (obj)).a();
        L.d((new StringBuilder("Retention ping: ")).append(s).toString());
        userprofile = m;
        userprofile = com.google.android.apps.youtube.datalib.e.b.a("drp", 0x323467f);
        userprofile.a(s);
        m.a(userprofile, com.google.android.apps.youtube.datalib.a.b.b);
        s = i.edit();
        s.putLong("dev_retention_prev_active", l1);
        if (flag)
        {
            s.putLong("dev_retention_prev_login", l1);
        }
        s.apply();
        return;
_L4:
        if (s.getType() == 0 || s.getType() == 4 || s.getType() == 5 || s.getType() == 2 || s.getType() == 3)
        {
            if (q != null)
            {
                s = q.getNetworkOperatorName();
            } else
            {
                s = "mobile";
            }
            continue; /* Loop/switch isn't completed */
        }
        if (s.getType() == 7)
        {
            s = "bluetooth";
            continue; /* Loop/switch isn't completed */
        }
        if (s.getType() == 9)
        {
            s = "ethernet";
            continue; /* Loop/switch isn't completed */
        }
        if (s.getType() == 6)
        {
            s = "wimax";
            continue; /* Loop/switch isn't completed */
        }
_L2:
        s = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(Uri uri)
    {
        if (uri != null)
        {
            i.edit().putString("dev_retention_intercepted_url", uri.toString()).apply();
        }
        a(i.getLong("dev_retention_last_ping_time_ms", 0L));
    }

    protected abstract boolean a();

    public final void b()
    {
        L.e("Resetting all information associated with device retention");
        i.edit().remove("dev_retention_uuid").remove("dev_retention_first_active").remove("dev_retention_first_geo").remove("dev_retention_first_login").remove("dev_retention_prev_active").remove("dev_retention_prev_login").remove("dev_retention_last_ping_time_ms").apply();
    }

    public final void c()
    {
        a(i.getLong("dev_retention_last_ping_time_ms", 0L));
    }

    public final void f()
    {
        a(0L);
    }

}
