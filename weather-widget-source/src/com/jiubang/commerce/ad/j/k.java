// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.j;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.jiubang.commerce.ad.f;

// Referenced classes of package com.jiubang.commerce.ad.j:
//            g

class k extends LinearLayout
{

    public int a;
    public int b;
    final g c;
    private RelativeLayout d;

    public k(g g, Context context)
    {
        c = g;
        super(context);
        LayoutInflater.from(context).inflate(f.a(context).b("ad_exit_google_float_window_small_layout"), this);
        d = (RelativeLayout)findViewById(f.a(context).a("small_window_layout"));
        a = d.getLayoutParams().width;
        b = d.getLayoutParams().height;
    }
}
