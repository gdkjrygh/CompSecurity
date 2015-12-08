// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.miteksystems.misnap:
//            MiSnap, t, MiSnapAPI, k

final class d extends Handler
{

    final MiSnap a;

    d(MiSnap misnap)
    {
        a = misnap;
        super();
    }

    public final void handleMessage(Message message)
    {
        if (!a.f()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        message.what;
        JVM INSTR tableswitch 1 19: default 104
    //                   1 105
    //                   2 121
    //                   3 104
    //                   4 104
    //                   5 104
    //                   6 129
    //                   7 158
    //                   8 291
    //                   9 309
    //                   10 459
    //                   11 197
    //                   12 487
    //                   13 508
    //                   14 529
    //                   15 550
    //                   16 571
    //                   17 592
    //                   18 613
    //                   19 113;
           goto _L3 _L4 _L5 _L3 _L3 _L3 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L18:
        continue; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        a.d();
        return;
_L19:
        MiSnap.a(a);
        return;
_L5:
        MiSnap.b(a);
        return;
_L6:
        a.g();
        if (MiSnap.c(a) != null)
        {
            MiSnap.c(a).b(3);
            return;
        }
          goto _L1
_L7:
        a.a(R.string.uxp_help_button);
        a.g();
        if (MiSnap.c(a) != null)
        {
            MiSnap.c(a).b(2);
            return;
        }
          goto _L1
_L11:
        message = a;
        int i = R.string.uxp_touch_screen;
        MiSnap misnap = a;
        int j = MiSnap.d(misnap) + 1;
        MiSnap.a(misnap, j);
        message.a(i, j);
        if (MiSnap.d(a) >= a.a.O())
        {
            a.g();
            if (MiSnap.c(a) != null)
            {
                MiSnap.c(a).j();
                MiSnap.c(a).b(1);
                return;
            }
        }
          goto _L1
_L8:
        a.a(R.string.uxp_timeout_help_end);
        a.onBackPressed();
        return;
_L9:
        a.h();
        a.g();
        a.a(R.string.uxp_measured_failover);
        if (a.a.c())
        {
            if (a.a.N())
            {
                if (MiSnap.c(a) != null)
                {
                    MiSnap.c(a).b(0);
                    return;
                }
            } else
            {
                if (MiSnap.c(a) != null)
                {
                    MiSnap.c(a).j();
                }
                a.c();
                a.w.sendEmptyMessage(a.b());
                return;
            }
        } else
        {
            if (MiSnap.c(a) != null)
            {
                MiSnap.c(a).j();
            }
            a.a(0, null, "VideoCaptureFailed");
            return;
        }
          goto _L1
_L10:
        a.i();
        if (MiSnap.c(a) == null) goto _L1; else goto _L20
_L20:
        MiSnap.c(a).e();
        return;
_L12:
        if (a.b == null) goto _L1; else goto _L21
_L21:
        a.b.f();
        return;
_L13:
        if (a.b == null) goto _L1; else goto _L22
_L22:
        a.b.l();
        return;
_L14:
        if (MiSnap.c(a) == null) goto _L1; else goto _L23
_L23:
        MiSnap.c(a).m();
        return;
_L15:
        if (a.b == null) goto _L1; else goto _L24
_L24:
        a.b.g();
        return;
_L16:
        if (MiSnap.c(a) == null) goto _L1; else goto _L25
_L25:
        MiSnap.c(a).o();
        return;
_L17:
        if (a.b == null) goto _L1; else goto _L26
_L26:
        a.b.d();
        return;
        if (MiSnap.c(a) == null) goto _L1; else goto _L27
_L27:
        MiSnap.c(a).i();
        return;
    }
}
