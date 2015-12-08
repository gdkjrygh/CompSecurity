// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.uilib.innertube;

import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.datalib.innertube.i;
import com.google.android.apps.youtube.datalib.innertube.model.p;
import com.google.android.apps.youtube.uilib.a.h;

// Referenced classes of package com.google.android.apps.youtube.uilib.innertube:
//            e, i, l, n

public final class m extends e
{

    private final com.google.android.apps.youtube.uilib.innertube.i a;

    public m(i j, h h, com.google.android.apps.youtube.uilib.innertube.i k, a a1, aw aw)
    {
        super(j, h, a1, aw);
        a = (com.google.android.apps.youtube.uilib.innertube.i)c.a(k);
    }

    static com.google.android.apps.youtube.uilib.innertube.i a(m m1)
    {
        return m1.a;
    }

    public final void a(p p1)
    {
label0:
        {
            a();
            l l1 = new l();
            l1.a(p1.c());
            a(l1);
            if (p1 != null)
            {
                a(((java.util.Collection) (p1.a())));
                com.google.a.a.a.a.qu qu = p1.b();
                if (qu == null)
                {
                    break label0;
                }
                a(p1.d());
                a(((android.view.View.OnClickListener) (new n(this, qu))));
                a(true);
            }
            return;
        }
        a(false);
    }
}
