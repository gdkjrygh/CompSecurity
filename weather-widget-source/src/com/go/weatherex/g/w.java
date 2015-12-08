// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.go.weatherex.framework.fragment.f;

// Referenced classes of package com.go.weatherex.g:
//            s

class w
{

    View a;
    TextView b;
    final s c;

    public w(s s1, ViewGroup viewgroup)
    {
        c = s1;
        super();
        a = s1.i().a(0x7f0300f6, viewgroup, false);
        a.setTag(this);
        b = (TextView)a.findViewById(0x7f0904e3);
    }
}
