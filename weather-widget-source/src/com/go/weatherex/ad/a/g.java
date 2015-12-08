// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.ad.a;

import android.view.View;

// Referenced classes of package com.go.weatherex.ad.a:
//            e, i, a

class g
    implements android.view.View.OnClickListener
{

    final a a;
    final e b;

    g(e e1, a a1)
    {
        b = e1;
        a = a1;
        super();
    }

    public void onClick(View view)
    {
        e.c(b).d(a);
    }
}
