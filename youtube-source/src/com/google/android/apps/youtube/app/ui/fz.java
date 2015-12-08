// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.android.volley.VolleyError;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.datalib.a.l;
import com.google.android.apps.youtube.datalib.innertube.model.am;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            fw, q

final class fz
    implements l
{

    final am a;
    final fw b;

    fz(fw fw1, am am1)
    {
        b = fw1;
        a = am1;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        fw.d(b).c(volleyerror);
        if (a == fw.b(b))
        {
            fw.c(b);
        }
    }

    public final void a(Object obj)
    {
        com.google.android.apps.youtube.app.ui.fw.a(b).c(new q(a.a()));
        a.a(false);
        if (a == fw.b(b))
        {
            fw.c(b);
        }
    }
}
