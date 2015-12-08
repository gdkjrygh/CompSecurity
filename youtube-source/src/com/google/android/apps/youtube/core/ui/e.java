// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.view.View;
import android.widget.ListAdapter;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            d, BasePagedView

final class e
    implements Runnable
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public final void run()
    {
        if (a.a.i.getCount() == 0)
        {
            if (a.a.d.getVisibility() != 0)
            {
                a.a.c();
            }
            return;
        } else
        {
            a.a.d();
            return;
        }
    }
}
