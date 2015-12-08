// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.content.SharedPreferences;
import android.net.Uri;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bc;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            f, z, m

public final class l
{

    private final SharedPreferences a;
    private volatile f b;
    private volatile z c;
    private volatile boolean d;

    public l(SharedPreferences sharedpreferences)
    {
        a = (SharedPreferences)com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        d = false;
    }

    private l(f f1)
    {
        b = f1;
        a = null;
        d = true;
    }

    static f a(l l1)
    {
        return l1.b;
    }

    public static l a()
    {
        return new l(com.google.android.apps.youtube.core.identity.f.a);
    }

    static z a(l l1, z z1)
    {
        l1.c = z1;
        return z1;
    }

    static SharedPreferences b(l l1)
    {
        return l1.a;
    }

    static z c(l l1)
    {
        return l1.c;
    }

    private void i()
    {
        Object obj1 = null;
        this;
        JVM INSTR monitorenter ;
        boolean flag = d;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        String s1 = a.getString("user_account", null);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        String s = a.getString("user_identity", null);
        Object obj = s;
        if ("No +Page Delegate".equals(s))
        {
            obj = null;
        }
        b = new f(s1, ((String) (obj)));
        obj = a;
        s = ((SharedPreferences) (obj)).getString("profile_display_name", "");
        s1 = ((SharedPreferences) (obj)).getString("profile_display_email", "");
        obj = ((SharedPreferences) (obj)).getString("profile_thumbnail_uri", null);
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = obj1;
_L5:
        c = new z(s, s1, ((Uri) (obj)));
_L6:
        d = true;
          goto _L1
        obj;
        throw obj;
_L4:
        obj = Uri.parse(((String) (obj)));
          goto _L5
        b = com.google.android.apps.youtube.core.identity.f.a;
          goto _L6
    }

    public final void a(bc bc1, a a1)
    {
        if (!d)
        {
            i();
        }
        if (!b())
        {
            return;
        } else
        {
            bc1.a(new m(this, b, a1));
            return;
        }
    }

    final void a(f f1, z z1)
    {
        d = true;
        b = (f)com.google.android.apps.youtube.common.fromguava.c.a(f1);
        c = (z)com.google.android.apps.youtube.common.fromguava.c.a(z1);
    }

    public final boolean b()
    {
        if (!d)
        {
            i();
        }
        return b != com.google.android.apps.youtube.core.identity.f.a;
    }

    public final String c()
    {
        if (!d)
        {
            i();
        }
        return b.e();
    }

    public final z d()
    {
        if (!d)
        {
            i();
        }
        com.google.android.apps.youtube.common.fromguava.c.b(b());
        return c;
    }

    public final String e()
    {
        if (!d)
        {
            i();
        }
        return b.b();
    }

    final String f()
    {
        if (!d)
        {
            i();
        }
        return b.b();
    }

    final f g()
    {
        if (!d)
        {
            i();
        }
        return b;
    }

    final void h()
    {
        d = true;
        b = com.google.android.apps.youtube.core.identity.f.a;
        c = null;
    }
}
