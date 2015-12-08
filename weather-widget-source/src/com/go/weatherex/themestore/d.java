// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.themestore;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.viewframe.viewholder.b;

// Referenced classes of package com.go.weatherex.themestore:
//            a

class d extends b
{

    TextView a;
    View b;
    final a c;

    d(a a1)
    {
        c = a1;
        super();
        e = LayoutInflater.from(com.go.weatherex.themestore.a.c(a1)).inflate(0x7f030115, com.go.weatherex.themestore.a.b(a1), false);
        e.setTag(this);
        e.setOnClickListener(com.go.weatherex.themestore.a.d(a1));
        a = (TextView)b(0x7f090544);
        b = b(0x7f090545);
        b.setVisibility(8);
    }
}
