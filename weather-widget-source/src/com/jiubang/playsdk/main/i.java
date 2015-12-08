// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.main;

import android.view.View;

// Referenced classes of package com.jiubang.playsdk.main:
//            g, l

class i
    implements android.view.View.OnClickListener
{

    final g a;

    i(g g1)
    {
        a = g1;
        super();
    }

    public void onClick(View view)
    {
        g.b(a).a();
    }
}
