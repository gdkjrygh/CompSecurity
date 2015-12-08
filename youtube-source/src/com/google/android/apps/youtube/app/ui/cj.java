// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.uilib.a.h;
import com.google.android.youtube.p;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ch, LoadingFrameLayout, ci

final class cj
    implements b
{

    final ch a;

    private cj(ch ch1)
    {
        a = ch1;
        super();
    }

    cj(ch ch1, byte byte0)
    {
        this(ch1);
    }

    public final void a(Object obj, Exception exception)
    {
        com.google.android.apps.youtube.app.ui.ch.b(a).a(p.cQ);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (List)obj1;
        ch.a(a).b();
        if (((List) (obj)).isEmpty())
        {
            com.google.android.apps.youtube.app.ui.ch.b(a).a(p.cQ);
        } else
        {
            ch.a(a).a(((java.util.Collection) (obj)));
            com.google.android.apps.youtube.app.ui.ch.b(a).b();
        }
        ch.c(a).a(((List) (obj)).size());
    }
}
