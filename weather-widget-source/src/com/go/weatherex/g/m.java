// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.view.View;

// Referenced classes of package com.go.weatherex.g:
//            l

class m
    implements android.view.View.OnClickListener
{

    final String a;
    final l b;

    m(l l1, String s)
    {
        b = l1;
        a = s;
        super();
    }

    public void onClick(View view)
    {
        l.a(b, a);
    }
}
