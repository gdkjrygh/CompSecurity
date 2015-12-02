// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            fd, dw

class he
    implements android.view.View.OnClickListener
{

    final dw a;
    final View b;
    final View c;
    final boolean d;
    final View e;

    he(dw dw, View view, boolean flag, View view1, View view2)
    {
        a = dw;
        c = view;
        d = flag;
        e = view1;
        b = view2;
        super();
    }

    public void onClick(View view)
    {
        c.startAnimation(new fd(a, c, b, e, d));
    }
}
