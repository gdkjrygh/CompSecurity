// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;
import android.widget.ImageView;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            fh, SliderLayout

final class fl
    implements android.view.View.OnClickListener
{

    final fh a;

    private fl(fh fh1)
    {
        a = fh1;
        super();
    }

    fl(fh fh1, byte byte0)
    {
        this(fh1);
    }

    public final void onClick(View view)
    {
        boolean flag = true;
        if (fh.c(a))
        {
            fh.a(a).a(1, true);
        } else
        {
            fh.a(a).a(0, true);
        }
        view = a;
        if (fh.c(a))
        {
            flag = false;
        }
        fh.a(view, flag);
        fh.d(a).setSelected(fh.c(a));
    }
}
