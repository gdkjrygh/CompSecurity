// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.MotionEvent;
import android.widget.ImageView;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ft, fh, fk

final class fj
    implements ft
{

    final fh a;

    private fj(fh fh1)
    {
        a = fh1;
        super();
    }

    fj(fh fh1, byte byte0)
    {
        this(fh1);
    }

    public final void a(int i)
    {
        if (fh.b(a) != null)
        {
            if (i == 0)
            {
                fh.b(a).b();
            } else
            {
                fh.b(a).a();
            }
        }
        fh.d(a).setSelected(fh.c(a));
    }

    public final void a(int i, int j)
    {
    }

    public final boolean a(MotionEvent motionevent)
    {
        return false;
    }

    public final void v()
    {
    }
}
