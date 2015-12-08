// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.widget.ImageView;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            gr

final class gs
    implements Runnable
{

    final gr a;

    gs(gr gr1)
    {
        a = gr1;
        super();
    }

    public final void run()
    {
        if (gr.a(a).isLayoutRequested())
        {
            gr.b(a);
            return;
        } else
        {
            gr.c(a);
            return;
        }
    }
}
