// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.util.Pair;
import android.view.View;
import com.android.volley.VolleyError;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.youtube.p;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            LikeAction, hj, hn, hy

final class hz
    implements l
{

    final hj a;
    private final LikeAction b;
    private final String c;

    public hz(hj hj1, LikeAction likeaction, String s)
    {
        a = hj1;
        super();
        b = (LikeAction)com.google.android.apps.youtube.common.fromguava.c.a(likeaction);
        c = (String)com.google.android.apps.youtube.common.fromguava.c.a(s);
    }

    public final void a(VolleyError volleyerror)
    {
        L.a("Error rating", volleyerror);
        hj.a(a).c(volleyerror);
        if (hj.a(a, c))
        {
            Pair pair;
            for (volleyerror = hj.d(a).iterator(); volleyerror.hasNext(); hj.a(a, (View)pair.second, false))
            {
                pair = (Pair)volleyerror.next();
                hj.a(a, (View)pair.first, false);
            }

        }
    }

    public final void a(Object obj)
    {
        hn.a[b.ordinal()];
        JVM INSTR tableswitch 1 3: default 36
    //                   1 67
    //                   2 80
    //                   3 93;
           goto _L1 _L2 _L3 _L4
_L1:
        if (hj.a(a, c))
        {
            com.google.android.apps.youtube.app.ui.hj.c(a).a(b);
        }
        return;
_L2:
        hj.a(a, p.eO);
        continue; /* Loop/switch isn't completed */
_L3:
        hj.a(a, p.eL);
        continue; /* Loop/switch isn't completed */
_L4:
        hj.a(a, p.eQ);
        if (true) goto _L1; else goto _L5
_L5:
    }
}
