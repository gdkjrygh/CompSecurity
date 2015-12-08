// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.detail.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.jiubang.playsdk.views.TouchMaskFrameLayout;

// Referenced classes of package com.jiubang.playsdk.detail.a:
//            l

class m
    implements android.view.View.OnClickListener
{

    final ViewGroup a;
    final TouchMaskFrameLayout b;
    final int c;
    final l d;

    m(l l1, ViewGroup viewgroup, TouchMaskFrameLayout touchmaskframelayout, int i)
    {
        d = l1;
        a = viewgroup;
        b = touchmaskframelayout;
        c = i;
        super();
    }

    public void onClick(View view)
    {
        if (l.a(d) != null)
        {
            l.a(d).onItemClick((AdapterView)a, b, c, c);
        }
    }
}
