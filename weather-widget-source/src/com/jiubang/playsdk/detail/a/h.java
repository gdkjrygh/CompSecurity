// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.detail.a;

import android.view.View;
import com.jiubang.playsdk.d.a;

// Referenced classes of package com.jiubang.playsdk.detail.a:
//            g, j

class h
    implements android.view.View.OnClickListener
{

    final a a;
    final g b;

    h(g g1, a a1)
    {
        b = g1;
        a = a1;
        super();
    }

    public void onClick(View view)
    {
        if (com.jiubang.playsdk.detail.a.g.a(b) != null)
        {
            com.jiubang.playsdk.detail.a.g.a(b).a(a, 2);
        }
    }
}
