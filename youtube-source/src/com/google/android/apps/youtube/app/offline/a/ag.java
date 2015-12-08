// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.offline.a;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.utils.p;
import com.google.android.apps.youtube.datalib.legacy.model.Playlist;
import com.google.android.apps.youtube.datalib.legacy.model.s;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import java.util.HashSet;

// Referenced classes of package com.google.android.apps.youtube.app.offline.a:
//            af, f

final class ag
{

    final f a;
    private final af b;
    private final Playlist c;
    private final HashSet d;
    private volatile s e;
    private volatile int f;
    private volatile int g;
    private volatile boolean h;
    private volatile boolean i;

    private ag(f f1, af af1, Playlist playlist)
    {
        a = f1;
        super();
        b = (af)com.google.android.apps.youtube.common.fromguava.c.a(af1);
        c = (Playlist)com.google.android.apps.youtube.common.fromguava.c.a(playlist);
        d = new HashSet(playlist.size);
    }

    ag(f f1, af af1, Playlist playlist, byte byte0)
    {
        this(f1, af1, playlist);
    }

    private int a()
    {
        this;
        JVM INSTR monitorenter ;
        int j = d.size();
        this;
        JVM INSTR monitorexit ;
        return j;
        Exception exception;
        exception;
        throw exception;
    }

    static s a(ag ag1)
    {
        return ag1.b();
    }

    static void a(ag ag1, Transfer transfer)
    {
        ag1.a(transfer);
    }

    static void a(ag ag1, String s1)
    {
        ag1.a(s1);
    }

    private void a(Transfer transfer)
    {
        long l1 = 0L;
        this;
        JVM INSTR monitorenter ;
        String s1;
        com.google.android.apps.youtube.common.fromguava.c.a(transfer);
        s1 = p.c(transfer);
        int k = 0;
        if (!d.contains(s1)) goto _L2; else goto _L1
_L1:
        if (!transfer.a())
        {
            d.remove(s1);
            af.b(b, s1, c.id);
            if (transfer.c == com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.FAILED)
            {
                i = true;
            }
        }
        s1 = p.b(transfer);
        if (c.id.equals(s1) && transfer.c == com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.RUNNING)
        {
            h = true;
        }
        if (c.size <= 0) goto _L4; else goto _L3
_L3:
        int l = c.size - d.size();
        if (l != c.size) goto _L6; else goto _L5
_L5:
        f = 100;
        g = l;
        int j = 2;
_L9:
        k = j;
        if (!h)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        k = j;
        if (transfer.c == com.google.android.apps.youtube.datalib.model.transfer.Transfer.Status.PENDING)
        {
            k = 2;
        }
        e = null;
_L2:
        a.a(b(), k);
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        k = (l * 100) / c.size;
        j = k;
        if (transfer.a())
        {
            if (transfer.f != 0L)
            {
                l1 = (transfer.e * 100L) / transfer.f;
            }
            j = k + (int)l1 / c.size;
        }
        j = Math.min(99, j);
        if (j <= f && l <= g) goto _L4; else goto _L7
_L7:
        boolean flag;
        f = j;
        g = l;
        flag = h;
        if (flag)
        {
            j = 2;
            continue; /* Loop/switch isn't completed */
        }
          goto _L4
        transfer;
        throw transfer;
_L4:
        j = 1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.apps.youtube.common.fromguava.c.a(s1);
        d.add(s1);
        af.a(b, s1, c.id);
        this;
        JVM INSTR monitorexit ;
        return;
        s1;
        throw s1;
    }

    static int b(ag ag1)
    {
        return ag1.a();
    }

    private s b()
    {
        if (e == null)
        {
            e = new s(c, a(), f, i);
        }
        return e;
    }

    static void b(ag ag1, Transfer transfer)
    {
        ag1.b(transfer);
    }

    private void b(Transfer transfer)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.android.apps.youtube.common.fromguava.c.a(transfer);
        int j = 0;
        String s1 = p.c(transfer);
        if (!d.remove(s1))
        {
            break MISSING_BLOCK_LABEL_125;
        }
        af.b(b, s1, c.id);
        transfer = p.b(transfer);
        if (!c.id.equals(transfer) && d.size() != 0)
        {
            j = 1;
        } else
        {
            j = 2;
        }
        if (c.size > 0)
        {
            g = c.size - d.size();
            f = (g * 100) / c.size;
        }
        e = null;
        a.a(b(), j);
        this;
        JVM INSTR monitorexit ;
        return;
        transfer;
        throw transfer;
    }

    static Playlist c(ag ag1)
    {
        return ag1.c;
    }
}
