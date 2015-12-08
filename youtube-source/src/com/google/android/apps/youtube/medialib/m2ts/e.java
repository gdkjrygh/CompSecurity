// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.medialib.m2ts;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.exoplayer.ExoPlaybackException;
import com.google.android.exoplayer.ah;
import com.google.android.exoplayer.ai;
import com.google.android.exoplayer.aj;
import com.google.android.exoplayer.ak;
import com.google.android.exoplayer.e.k;
import com.google.android.exoplayer.l;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.apps.youtube.medialib.m2ts:
//            NativeM2TSPlayer, c

public final class e extends ak
{

    private final ai a;
    private final l b = new l();
    private final ah c[];
    private int d;
    private int e;
    private boolean f;
    private long g;
    private long h;
    private NativeM2TSPlayer i;
    private com.google.android.apps.youtube.medialib.m2ts.c j;
    private float k;

    public e(ai ai1)
    {
        int i1 = 0;
        super();
        boolean flag;
        if (k.a >= 9)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.apps.youtube.common.fromguava.c.b(flag);
        a = ai1;
        for (c = new ah[7]; i1 < c.length; i1++)
        {
            c[i1] = new ah(true);
        }

        k = 1.0F;
    }

    private void l()
    {
        if (i != null)
        {
            i.e();
        }
        NativeM2TSPlayer nativem2tsplayer;
        try
        {
            i = new NativeM2TSPlayer();
        }
        catch (NativeM2TSPlayer.InitException initexception)
        {
            L.b("Couldn't create the native player.");
            i = null;
            return;
        }
        j = new com.google.android.apps.youtube.medialib.m2ts.c(i, b.a);
        nativem2tsplayer = i;
        NativeM2TSPlayer.a(k);
        if (p() == 3)
        {
            i.c();
        }
    }

    private void m()
    {
        int i1 = 0;
        d = 0;
        for (; i1 < 7; i1++)
        {
            if (c[i1].c != null)
            {
                c[i1].c.clear();
            }
        }

    }

    protected final int a()
    {
        int i1;
        try
        {
            a.a();
        }
        catch (IOException ioexception)
        {
            throw new ExoPlaybackException(ioexception);
        }
        for (i1 = 0; i1 < a.b(); i1++)
        {
            if (com.google.android.exoplayer.e.k.a(a.a(0).a))
            {
                e = 0;
                return 1;
            }
        }

        return -1;
    }

    public final void a(int i1, Object obj)
    {
        if (i1 == 1)
        {
            float f1 = ((Float)obj).floatValue();
            k = f1;
            if (i != null)
            {
                obj = i;
                NativeM2TSPlayer.a(f1);
            }
            return;
        } else
        {
            super.a(i1, obj);
            return;
        }
    }

    protected final void a(long l1)
    {
        a.b(l1);
        m();
        f = false;
        g = l1;
        h = l1;
        l();
    }

    protected final void a(long l1, boolean flag)
    {
        a.a(e, l1);
        m();
        f = false;
        g = l1;
        h = l1;
    }

    protected final void b()
    {
        a.b(e);
    }

    protected final void b(long l1)
    {
        a.a(l1);
        if (i != null)
        {
            while (i.a()) ;
        }
_L15:
        if (f) goto _L2; else goto _L1
_L1:
        IOException ioexception;
        boolean flag;
        if (h - d() > 0x4c4b40L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L3
_L10:
        a.a(e, d(), b, c[d]);
        JVM INSTR tableswitch -4 -1: default 231
    //                   -4 116
    //                   -3 151
    //                   -2 237
    //                   -1 133;
           goto _L4 _L5 _L6 _L7 _L8
_L5:
        l();
          goto _L4
_L8:
        try
        {
            f = true;
            i.b();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            throw new ExoPlaybackException(ioexception);
        }
        flag = false;
          goto _L9
_L6:
        h = c[d].f;
        d = d + 1;
        if (d == 7)
        {
            j.a(c, d);
            m();
        }
        flag = true;
          goto _L9
_L3:
        if (!flag) goto _L10; else goto _L2
_L2:
        flag = false;
_L9:
        if (!flag)
        {
            return;
        }
          goto _L11
_L4:
        flag = true;
          goto _L12
_L7:
        flag = false;
_L12:
        if (true) goto _L9; else goto _L13
_L13:
_L11:
        if (true) goto _L15; else goto _L14
_L14:
    }

    protected final void c()
    {
        if (i != null)
        {
            i.e();
            i = null;
        }
        a.d();
    }

    protected final long d()
    {
        if (i != null)
        {
            NativeM2TSPlayer nativem2tsplayer = i;
            long l1 = NativeM2TSPlayer.f();
            if (l1 > 0L)
            {
                g = l1;
            }
        }
        return g;
    }

    protected final long e()
    {
        return a.a(e).b;
    }

    protected final long f()
    {
        long l1 = a.c();
        if (l1 == -1L || l1 == -3L)
        {
            return l1;
        } else
        {
            return Math.max(l1, d());
        }
    }

    protected final void g()
    {
        if (i != null)
        {
            i.c();
        }
    }

    protected final void h()
    {
        if (i != null)
        {
            i.d();
        }
    }

    protected final boolean i()
    {
        if (i == null)
        {
            return false;
        } else
        {
            return i.g();
        }
    }

    protected final boolean j()
    {
        return i != null;
    }

    protected final boolean k()
    {
        return true;
    }
}
