// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.pla.internal;

import android.view.View;

// Referenced classes of package com.jiubang.pla.internal:
//            PLA_AbsListView, f

class a
    implements Runnable
{

    final View a;
    final f b;
    final PLA_AbsListView c;

    a(PLA_AbsListView pla_abslistview, View view, f f)
    {
        c = pla_abslistview;
        a = view;
        b = f;
        super();
    }

    public void run()
    {
        a.setPressed(false);
        c.setPressed(false);
        if (!c.L)
        {
            c.post(b);
        }
        c.t = -1;
    }
}
