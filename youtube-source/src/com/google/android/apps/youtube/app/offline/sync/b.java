// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.sync;

import com.google.a.a.a.a.ly;
import com.google.a.a.a.a.mb;
import com.google.a.a.a.a.mc;
import com.google.a.a.a.a.md;
import com.google.a.a.a.a.mj;
import com.google.a.a.a.a.mm;
import com.google.a.a.a.a.mn;
import com.google.a.a.a.a.mo;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.d.j;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.au;
import com.google.android.apps.youtube.core.identity.l;
import com.google.android.apps.youtube.core.offline.store.OfflineStoreInterface;
import com.google.android.apps.youtube.core.offline.store.q;
import com.google.android.apps.youtube.datalib.innertube.InnerTubeServiceException;
import com.google.android.apps.youtube.datalib.innertube.ad;
import com.google.android.apps.youtube.datalib.innertube.af;
import com.google.android.apps.youtube.datalib.legacy.model.v;
import com.google.android.apps.youtube.datalib.legacy.model.w;
import com.google.android.apps.youtube.datalib.legacy.model.x;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.youtube.app.offline.sync:
//            c, d

public final class b
{

    HashMap a;
    private final l b;
    private final q c;
    private final ad d;
    private final com.google.android.apps.youtube.common.e.b e;
    private final Set f = new HashSet();
    private final j g;
    private final au h;
    private volatile OfflineStoreInterface i;
    private com.google.android.apps.youtube.app.offline.sync.c j;

    public b(l l1, q q1, ad ad1, j j1, com.google.android.apps.youtube.common.e.b b1, au au1)
    {
        a = new HashMap();
        b = (l)com.google.android.apps.youtube.common.fromguava.c.a(l1);
        c = (q)com.google.android.apps.youtube.common.fromguava.c.a(q1);
        d = (ad)com.google.android.apps.youtube.common.fromguava.c.a(ad1);
        e = (com.google.android.apps.youtube.common.e.b)com.google.android.apps.youtube.common.fromguava.c.a(b1);
        g = (j)com.google.android.apps.youtube.common.fromguava.c.a(j1);
        h = (au)com.google.android.apps.youtube.common.fromguava.c.a(au1);
    }

    private static int a(long l1)
    {
        if (l1 < 0L)
        {
            return 0x7fffffff;
        } else
        {
            return (int)l1;
        }
    }

    private mb a(Collection collection)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        af af1 = d.a();
        af1.a(collection);
        try
        {
            collection = d.a(af1);
            L.e("Offline refresh response returned!");
            L.e((new StringBuilder("Offlined video set update count: ")).append(((mb) (collection)).c.length).toString());
            L.e((new StringBuilder("Contains continuation?: ")).append(((mb) (collection)).d).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            L.d("Failed to reach offline refresh service: ", collection);
            return null;
        }
        return collection;
    }

    private void a(long l1, md md1, v v1)
    {
        String s = v1.a();
        md1.e;
        JVM INSTR tableswitch 1 6: default 48
    //                   1 69
    //                   2 80
    //                   3 69
    //                   4 48
    //                   5 94
    //                   6 153;
           goto _L1 _L2 _L3 _L2 _L1 _L4 _L5
_L1:
        if (md1.e != 5)
        {
            f.remove(s);
        }
        return;
_L2:
        b(l1, md1, v1);
        continue; /* Loop/switch isn't completed */
_L3:
        i.g(s);
        continue; /* Loop/switch isn't completed */
_L4:
        try
        {
            md md2 = new md();
            com.google.protobuf.nano.c.a(md2, com.google.protobuf.nano.c.a(md1));
            md2.e = 1;
            b(l1, md2, v1);
            f.add(s);
        }
        // Misplaced declaration of an exception variable
        catch (v v1)
        {
            L.b("Error parsing the original OfflineState");
        }
        continue; /* Loop/switch isn't completed */
_L5:
        try
        {
            md md3 = new md();
            com.google.protobuf.nano.c.a(md3, com.google.protobuf.nano.c.a(md1));
            md3.e = 1;
            b(l1, md3, v1);
            i.m(s);
        }
        // Misplaced declaration of an exception variable
        catch (v v1)
        {
            L.b("Error parsing the original OfflineState");
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    private void a(String s, long l1)
    {
        com.google.android.apps.youtube.common.fromguava.c.a(s);
        try
        {
            af af1 = d.a();
            af1.a(s);
            s = d.a(af1);
            L.e("Offline refresh continuation response returned!");
            L.e(String.format(Locale.US, "Offlined video set update count: %d", new Object[] {
                Integer.valueOf(((mb) (s)).c.length)
            }));
            if (((mb) (s)).c.length > 0)
            {
                a(((mb) (s)).c, ((mb) (s)).f, l1);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            L.d("Failed to reach offline refresh service: ", s);
        }
    }

    private void a(mn amn[], int k, long l1)
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        int k1 = amn.length;
        for (int i1 = 0; i1 < k1; i1++)
        {
            Object obj = amn[i1];
            md md1 = ((mn) (obj)).b;
            if (((mn) (obj)).c.length == 0)
            {
                for (obj = i.d(md1.b).iterator(); ((Iterator) (obj)).hasNext(); a(l1, md1, (v)((Iterator) (obj)).next())) { }
                continue;
            }
            mo amo[] = ((mn) (obj)).c;
            int i2 = amo.length;
            for (int j1 = 0; j1 < i2; j1++)
            {
                String s = amo[j1].b;
                a(l1, md1, i.c(s));
            }

        }

        i.a(k);
        i.a(f);
        f.clear();
    }

    private void b(long l1, md md1, v v1)
    {
        i.a(v1.i().a(new com.google.android.apps.youtube.datalib.innertube.model.v(md1)).b(l1).a());
    }

    public final void a()
    {
        com.google.android.apps.youtube.common.fromguava.c.b();
        if (b.b()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1;
        long l1;
        i = c.a(b.c());
        l1 = e.a();
        HashMap hashmap = new HashMap();
        Map map = i.g();
        Iterator iterator = i.e().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj2 = (x)iterator.next();
            if (((x) (obj2)).w())
            {
                Object obj = ((x) (obj2)).f();
                String s = ((x) (obj2)).a();
                long l2 = ((v) (obj)).c();
                long l3 = ((x) (obj2)).e();
                int k = a(TimeUnit.MILLISECONDS.toSeconds(l1 - l2));
                int j1 = a(TimeUnit.MILLISECONDS.toSeconds(l1 - l3));
                L.e(String.format(Locale.US, "Refreshing video %s: Time since last refreshed: %d", new Object[] {
                    s, Long.valueOf(((v) (obj)).d())
                }));
                obj2 = new mj();
                obj2.b = s;
                obj2.c = k;
                obj2.d = j1;
                if (map.containsKey(s))
                {
                    obj2.e = (com.google.a.a.a.a.ml[])((List)map.get(s)).toArray(((mj) (obj2)).e);
                }
                s = ((v) (obj)).g();
                if (hashmap.containsKey(s))
                {
                    obj = (mm)hashmap.get(s);
                } else
                {
                    obj = new mm();
                    obj.b = s;
                    hashmap.put(s, obj);
                }
                obj.c = (mj[])com.google.android.apps.youtube.common.e.c.a(((mm) (obj)).c, new mj[] {
                    obj2
                });
            }
        } while (true);
        obj1 = hashmap.values();
        if (((Collection) (obj1)).isEmpty()) goto _L1; else goto _L3
_L3:
        obj1 = a(((Collection) (obj1)));
        if (obj1 == null) goto _L1; else goto _L4
_L4:
        a(((mb) (obj1)).c, ((mb) (obj1)).f, l1);
        if (((mb) (obj1)).d == null || ((mb) (obj1)).d.b == null) goto _L1; else goto _L5
_L5:
        int i1;
        obj1 = ((mb) (obj1)).d.b;
        com.google.android.apps.youtube.common.fromguava.c.a(obj1);
        try
        {
            i1 = ((ly) (obj1)).c;
            if (i1 > h.Q())
            {
                j = new com.google.android.apps.youtube.app.offline.sync.c(this, ((ly) (obj1)), l1);
                g.b(com.google.android.apps.youtube.app.offline.sync.d.a(l1 + TimeUnit.SECONDS.toMillis(i1)));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            L.a("OfflineSyncController: Thread.sleep interrupted: ", ((Throwable) (obj1)));
            return;
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_496;
        }
        Thread.sleep(TimeUnit.SECONDS.toMillis(i1));
        a(((ly) (obj1)).b, l1);
        return;
    }

    public final void b()
    {
        if (j != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        long l1;
        l1 = e.a();
        if (l1 <= j.b())
        {
            break MISSING_BLOCK_LABEL_52;
        }
        j = null;
        if (!h.R()) goto _L1; else goto _L3
_L3:
        a();
        return;
        a(j.a(), l1);
        j = null;
        return;
        Exception exception;
        exception;
        j = null;
        throw exception;
    }
}
