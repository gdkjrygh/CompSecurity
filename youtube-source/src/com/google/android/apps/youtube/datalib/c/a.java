// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.c;

import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Base64;
import com.android.volley.VolleyError;
import com.android.volley.j;
import com.android.volley.l;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.e.d;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.datalib.a.k;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.crypto.NoSuchPaddingException;

// Referenced classes of package com.google.android.apps.youtube.datalib.c:
//            f, b, e

public final class a
    implements f
{

    private final l a;
    private final SharedPreferences b;
    private final com.google.android.apps.youtube.datalib.config.a c;
    private b d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    public a(l l1, SharedPreferences sharedpreferences, com.google.android.apps.youtube.datalib.config.a a1, String s, String s1, String s2)
    {
        a = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        b = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        c = (com.google.android.apps.youtube.datalib.config.a)com.google.android.apps.youtube.common.fromguava.c.a(a1);
        e = com.google.android.apps.youtube.common.fromguava.c.a(s);
        f = com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(s2);
        g = String.format("%s_%s", new Object[] {
            "apiary_device_id", s2
        });
        h = String.format("%s_%s", new Object[] {
            "apiary_device_key", s2
        });
    }

    private b b()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.apps.youtube.common.fromguava.c.b();
        if (d == null) goto _L2; else goto _L1
_L1:
        Object obj;
        L.f("Returned cached device auth.");
        obj = d;
_L5:
        this;
        JVM INSTR monitorexit ;
        return ((b) (obj));
_L2:
        Object obj1;
        obj = b.getString(g, null);
        obj1 = b.getString(h, null);
        if (obj == null || obj1 == null)
        {
            break MISSING_BLOCK_LABEL_423;
        }
        obj = new b(((String) (obj)), Base64.decode(((String) (obj1)), 0));
_L10:
        d = ((b) (obj));
        if (d == null) goto _L4; else goto _L3
_L3:
        L.e("Returned device auth from shared preferences.");
        obj = d;
          goto _L5
_L4:
        k k1;
        obj1 = new d();
        obj = c.f().buildUpon().appendEncodedPath(c.d()).appendQueryParameter("key", e).appendQueryParameter("rawDeviceId", f).build();
        k1 = k.a();
        e e1 = new e(((Uri) (obj)), k1, c.g(), 4);
_L7:
        a.a(e1);
        d = (b)k1.get(15L, TimeUnit.SECONDS);
        obj = d;
        b.edit().putString(g, ((b) (obj)).b()).putString(h, new String(Base64.encode(((b) (obj)).a(), 0))).apply();
        L.d("Successfully completed device registration.");
        obj = d;
          goto _L5
        obj;
        obj = null;
          goto _L5
        obj;
        obj = null;
          goto _L5
        obj;
        L.a("Could not do device auth handshake: ", ((Throwable) (obj)));
        if (((d) (obj1)).a()) goto _L7; else goto _L6
_L6:
        obj = null;
          goto _L5
        obj;
        L.a("Could not do device auth handshake: ", ((Throwable) (obj)));
        if (((ExecutionException) (obj)).getCause() instanceof VolleyError)
        {
            obj = (VolleyError)((ExecutionException) (obj)).getCause();
            if (((VolleyError) (obj)).networkResponse != null && ((VolleyError) (obj)).networkResponse.b != null)
            {
                L.e((new StringBuilder("Server returned: ")).append(new String(((VolleyError) (obj)).networkResponse.b)).toString());
            }
        }
        if (((d) (obj1)).a()) goto _L7; else goto _L8
_L8:
        obj = null;
          goto _L5
        obj;
        boolean flag;
        L.a("Could not do device auth handshake: ", ((Throwable) (obj)));
        flag = ((d) (obj1)).a();
        if (flag) goto _L7; else goto _L9
_L9:
        obj = null;
          goto _L5
        obj;
        throw obj;
        obj = null;
          goto _L10
    }

    public final void a()
    {
        d = null;
        b.edit().remove(g).remove(h).apply();
    }

    public final void a(Map map, String s, byte abyte0[])
    {
        b b1 = b();
        if (b1 != null)
        {
            b1.a(map, s, abyte0);
        }
    }
}
