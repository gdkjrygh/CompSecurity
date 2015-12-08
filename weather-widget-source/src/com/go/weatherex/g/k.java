// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.framework.fragment.f;

// Referenced classes of package com.go.weatherex.g:
//            h

class k
{

    View a;
    TextView b;
    final h c;

    public k(h h1, ViewGroup viewgroup)
    {
        c = h1;
        super();
        a = h.b(h1).i().a(0x7f0300f2, viewgroup, false);
        b = (TextView)a.findViewById(0x7f0904de);
    }
}
