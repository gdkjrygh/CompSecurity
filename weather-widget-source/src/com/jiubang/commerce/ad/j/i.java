// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.j;

import android.content.Context;
import android.view.View;

// Referenced classes of package com.jiubang.commerce.ad.j:
//            g

class i
    implements android.view.View.OnClickListener
{

    final Context a;
    final g b;

    i(g g1, Context context)
    {
        b = g1;
        a = context;
        super();
    }

    public void onClick(View view)
    {
        g.a(b, a);
    }
}
