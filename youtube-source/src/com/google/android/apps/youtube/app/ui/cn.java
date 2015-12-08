// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.android.volley.VolleyError;
import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.c.a;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.utils.ah;
import com.google.android.apps.youtube.datalib.a.l;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            cl, LikeAction, de

final class cn
    implements l
{

    final LikeAction a;
    final String b;
    final cl c;

    cn(cl cl1, LikeAction likeaction, String s)
    {
        c = cl1;
        a = likeaction;
        b = s;
        super();
    }

    public final void a(VolleyError volleyerror)
    {
        L.a("Error rating", volleyerror);
        com.google.android.apps.youtube.app.ui.cl.a(c).c(volleyerror);
    }

    public final void a(Object obj)
    {
        ah.a(cl.b(c), a.getSuccessToastStringId(), 1);
        cl.c(c).c(new de(b, a));
    }
}
