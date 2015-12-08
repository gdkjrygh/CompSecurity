// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import android.content.SharedPreferences;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.identity.ai;
import com.google.android.apps.youtube.core.identity.aj;
import com.google.android.apps.youtube.core.identity.b;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.ytremote.backend.a.a;
import com.google.android.apps.ytremote.backend.a.d;
import com.google.android.apps.ytremote.backend.a.e;
import com.google.android.apps.ytremote.backend.a.g;
import com.google.android.apps.ytremote.backend.a.j;
import com.google.android.apps.ytremote.backend.a.n;
import com.google.android.apps.ytremote.model.CloudScreen;
import com.google.android.apps.ytremote.model.PairingCode;
import com.google.android.apps.ytremote.model.ScreenId;
import com.google.android.youtube.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            bw, bk, YouTubeTvScreen, z, 
//            v, ab, aa, y, 
//            x, u, w

public final class t
    implements bw
{

    private static final Pair a = Pair.create("", "");
    private final Map b = new HashMap();
    private final Resources c;
    private final Executor d;
    private final e e = new e();
    private final j f = new j();
    private final com.google.android.apps.ytremote.backend.logic.a g;
    private final bk h;
    private final com.google.android.apps.ytremote.backend.a.l i = new com.google.android.apps.ytremote.backend.a.l();
    private final a j;
    private final l k;
    private final b l;

    public t(Executor executor, SharedPreferences sharedpreferences, Resources resources, bk bk1, com.google.android.apps.youtube.common.c.a a1, l l1, b b1)
    {
        d = (Executor)com.google.android.apps.youtube.common.fromguava.c.a(executor);
        com.google.android.apps.youtube.common.fromguava.c.a(sharedpreferences);
        c = (Resources)com.google.android.apps.youtube.common.fromguava.c.a(resources);
        h = (bk)com.google.android.apps.youtube.common.fromguava.c.a(bk1);
        k = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        l = (b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        j = new a(new g(com.google.android.apps.youtube.app.remote.bk.a(sharedpreferences, "remote_id")));
        g = new d(new n(sharedpreferences), j);
        a1.a(this);
    }

    static Pair a()
    {
        return a;
    }

    static com.google.android.apps.ytremote.backend.a.l a(t t1)
    {
        return t1.i;
    }

    static String a(t t1, List list, CloudScreen cloudscreen)
    {
        ScreenId screenid;
        Iterator iterator;
        screenid = cloudscreen.getScreenId();
        iterator = list.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        CloudScreen cloudscreen1 = (CloudScreen)iterator.next();
        if (!cloudscreen1.getScreenId().equals(screenid)) goto _L4; else goto _L3
_L3:
        if (cloudscreen1 == null) goto _L6; else goto _L5
_L5:
        cloudscreen = cloudscreen1.getName();
_L8:
        return cloudscreen;
_L2:
        cloudscreen1 = null;
        continue; /* Loop/switch isn't completed */
_L6:
label0:
        {
            if (TextUtils.isEmpty(cloudscreen.getName()))
            {
                break label0;
            }
            String s = cloudscreen.getName();
            int i1 = 2;
            t1 = s;
            do
            {
                cloudscreen = t1;
                if (com.google.android.apps.ytremote.backend.a.c.a(list, t1) == null)
                {
                    break;
                }
                t1 = (new StringBuilder()).append(s).append(" ").append(i1).toString();
                i1++;
            } while (true);
        }
        if (true) goto _L8; else goto _L7
_L7:
        return t1.a(list);
        if (true) goto _L3; else goto _L9
_L9:
    }

    private String a(List list)
    {
        int i1 = 1;
        do
        {
            String s = c.getString(p.fx, new Object[] {
                Integer.valueOf(i1)
            });
            if (com.google.android.apps.ytremote.backend.a.c.a(list, s) == null)
            {
                return s;
            }
            i1++;
        } while (true);
    }

    static List a(t t1, List list)
    {
        t1 = new ArrayList();
        for (list = list.iterator(); list.hasNext(); t1.add(new YouTubeTvScreen((CloudScreen)list.next()))) { }
        return t1;
    }

    private Pair b()
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        if (!k.b())
        {
            return Pair.create("SIGNED_OUT_USER", "");
        }
        String s = k.e();
        com.google.android.apps.youtube.core.identity.a a1;
        try
        {
            a1 = (com.google.android.apps.youtube.core.identity.a)l.a(k).get();
        }
        catch (InterruptedException interruptedexception)
        {
            return a;
        }
        catch (ExecutionException executionexception)
        {
            return a;
        }
        if (a1.a())
        {
            return Pair.create(s, a1.c());
        } else
        {
            return a;
        }
    }

    static Pair b(t t1)
    {
        return t1.b();
    }

    static com.google.android.apps.ytremote.backend.logic.a c(t t1)
    {
        return t1.g;
    }

    private void c()
    {
        if (j != null)
        {
            j.a();
        }
    }

    static bk d(t t1)
    {
        return t1.h;
    }

    private void d(com.google.android.apps.youtube.common.a.b b1)
    {
        d.execute(new z(this, b1));
    }

    static Map e(t t1)
    {
        return t1.b;
    }

    static e f(t t1)
    {
        return t1.e;
    }

    static j g(t t1)
    {
        return t1.f;
    }

    public final void a(com.google.android.apps.youtube.common.a.b b1)
    {
        d(new v(this, null, b1, b1));
    }

    public final void a(CloudScreen cloudscreen, com.google.android.apps.youtube.common.a.b b1)
    {
        d.execute(new ab(this, b1, cloudscreen));
    }

    public final void a(PairingCode pairingcode, com.google.android.apps.youtube.common.a.b b1)
    {
        d.execute(new aa(this, pairingcode, b1));
    }

    public final void a(ScreenId screenid, com.google.android.apps.youtube.common.a.b b1)
    {
        d.execute(new y(this, b1, screenid));
    }

    public final void a(ScreenId screenid, String s, com.google.android.apps.youtube.common.a.b b1)
    {
        d.execute(new x(this, b1, screenid, s));
    }

    public final void a(String s, PairingCode pairingcode, com.google.android.apps.youtube.common.a.b b1)
    {
        d.execute(new u(this, pairingcode, b1, s));
    }

    public final void b(com.google.android.apps.youtube.common.a.b b1)
    {
        d(new w(this, null, b1, b1));
    }

    public final void c(com.google.android.apps.youtube.common.a.b b1)
    {
        c();
        b(((com.google.android.apps.youtube.common.a.b) (null)));
    }

    public final void onSignIn(ai ai)
    {
        c();
    }

    public final void onSignOut(aj aj)
    {
        c();
    }

}
