// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.util.Pair;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import com.google.android.apps.youtube.datalib.model.transfer.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            h, x, k, z, 
//            y, UploadService

public final class w
    implements h
{

    private final Context a;
    private final Activity b;
    private final bc c;
    private final List d = new ArrayList();
    private final Map e = new HashMap();
    private final Map f = new HashMap();
    private final Map g = new HashMap();
    private final Map h = new HashMap();
    private z i;
    private com.google.android.apps.youtube.core.utils.w j;
    private boolean k;

    public w(Activity activity, bc bc1)
    {
        a = (Context)com.google.android.apps.youtube.common.fromguava.c.a(activity);
        b = activity;
        c = (bc)com.google.android.apps.youtube.common.fromguava.c.a(bc1);
    }

    static Map a(w w1)
    {
        return w1.h;
    }

    static void a(w w1, x x1)
    {
        w1.b(x1);
    }

    private boolean a(x x1)
    {
        if (f.containsKey(com.google.android.apps.youtube.core.transfer.x.a(x1))) goto _L2; else goto _L1
_L1:
        Transfer transfer;
        d.remove(x1);
        transfer = (Transfer)((k)j.a()).a().get(com.google.android.apps.youtube.core.transfer.x.a(x1));
        if (transfer == null) goto _L4; else goto _L3
_L3:
        if (!transfer.a() || !transfer.g.b("metadata_updated", true)) goto _L6; else goto _L5
_L5:
        i.c();
_L7:
        return true;
_L6:
        if (((k)j.a()).a().containsKey(com.google.android.apps.youtube.core.transfer.x.a(x1)))
        {
            e.put(com.google.android.apps.youtube.core.transfer.x.a(x1), x1);
            ((k)j.a()).a(com.google.android.apps.youtube.core.transfer.x.a(x1), 64);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b(x1);
        if (true) goto _L7; else goto _L2
_L2:
        return false;
    }

    static Map b(w w1)
    {
        return w1.f;
    }

    private void b(x x1)
    {
label0:
        {
            if (e())
            {
                f.put(com.google.android.apps.youtube.core.transfer.x.a(x1), x1);
                if (com.google.android.apps.youtube.core.transfer.x.c(x1) == null)
                {
                    break label0;
                }
                ((k)j.a()).a(com.google.android.apps.youtube.core.transfer.x.a(x1), com.google.android.apps.youtube.core.transfer.x.c(x1), x.b(x1));
            }
            return;
        }
        bc bc1 = c;
        String s = x.d(x1);
        com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy privacy = x.e(x1);
        String s1 = x.f(x1);
        String s2 = x.g(x1);
        String s3 = x.h(x1);
        String s4 = x.i(x1);
        Pair pair = x.j(x1);
        if (b != null)
        {
            x1 = com.google.android.apps.youtube.common.a.a.a(b, new y(this, x1));
        } else
        {
            x1 = new y(this, x1);
        }
        bc1.a(s, privacy, s1, s2, s3, s4, pair, x1);
    }

    static z c(w w1)
    {
        return w1.i;
    }

    private void d()
    {
        int l = 0;
        do
        {
            if (l >= d.size())
            {
                break;
            }
            if (!a((x)d.get(l)))
            {
                l++;
            }
        } while (true);
    }

    private boolean e()
    {
        return j != null && j.a() != null;
    }

    public final void a(Uri uri, String s, com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy privacy, String s1, String s2, String s3, String s4, 
            Pair pair, a a1, boolean flag)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(uri);
        com.google.android.apps.youtube.common.fromguava.c.a(s, "filename of the video being uploaded was not provided.");
        com.google.android.apps.youtube.common.fromguava.c.a(privacy);
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        com.google.android.apps.youtube.common.fromguava.c.a(a1);
        s3 = new x((byte)0);
        com.google.android.apps.youtube.core.transfer.x.a(s3, s);
        if (!flag)
        {
            privacy = com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.PRIVATE;
        }
        com.google.android.apps.youtube.core.transfer.x.a(s3, privacy);
        x.b(s3, s1);
        com.google.android.apps.youtube.core.transfer.x.c(s3, s2);
        x.d(s3, null);
        x.e(s3, s4);
        com.google.android.apps.youtube.core.transfer.x.a(s3, pair);
        com.google.android.apps.youtube.core.transfer.x.a(s3, uri);
        x.f(s3, uri.toString());
        x.g(s3, (String)h.get(com.google.android.apps.youtube.core.transfer.x.a(s3)));
        com.google.android.apps.youtube.core.transfer.x.a(s3, a1);
        x.b(s3).a("metadata_updated", flag);
        d.add(s3);
        if (e())
        {
            a(((x) (s3)));
        }
    }

    public final void a(z z1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(z1);
        i = z1;
        if (e())
        {
            m_();
            return;
        } else
        {
            j = com.google.android.apps.youtube.core.transfer.UploadService.a(a, this);
            return;
        }
    }

    public final void a(Transfer transfer)
    {
        if (f.containsKey(transfer.a))
        {
            Object obj = (x)f.remove(transfer.a);
            g.put(transfer.a, obj);
            obj = i;
            boolean flag;
            if (!transfer.g.b("metadata_updated", true))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ((z) (obj)).a(flag);
            d();
        }
    }

    public final void b()
    {
    }

    public final void b(Transfer transfer)
    {
    }

    public final void c()
    {
        if (e())
        {
            Iterator iterator = ((k)j.a()).a().values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Transfer transfer = (Transfer)iterator.next();
                if (!transfer.g.b("metadata_updated", true))
                {
                    ((k)j.a()).a(transfer.a);
                }
            } while (true);
            j.b(a);
            j = null;
            h.clear();
            d.clear();
            e.clear();
            f.clear();
            g.clear();
            return;
        } else
        {
            k = true;
            return;
        }
    }

    public final void c(Transfer transfer)
    {
        if (transfer.e == transfer.f)
        {
            transfer = i;
        }
    }

    public final void d(Transfer transfer)
    {
        if (g.containsKey(transfer.a) && transfer.c == com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.COMPLETED)
        {
            g.remove(transfer.a);
        }
    }

    public final void e(Transfer transfer)
    {
        if (e.containsKey(transfer.a))
        {
            b((x)e.remove(transfer.a));
        }
    }

    public final void m_()
    {
        if (k)
        {
            k = false;
            c();
            return;
        }
        if (!d.isEmpty())
        {
            d();
            return;
        } else
        {
            i.b();
            return;
        }
    }
}
