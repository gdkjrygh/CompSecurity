// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.widget.ImageView;

// Referenced classes of package com.miteksystems.misnap:
//            t, b

final class ag
    implements Runnable
{

    final t a;

    ag(t t1)
    {
        a = t1;
        super();
    }

    public final void run()
    {
        if (t.h(a) != null && t.h(a).a())
        {
            t.h(a).c();
        }
        t.i(a).setVisibility(4);
        t.c(a);
    }
}
