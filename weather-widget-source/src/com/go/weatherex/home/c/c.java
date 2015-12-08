// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.c;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.model.GoLifeBean;

// Referenced classes of package com.go.weatherex.home.c:
//            a

class c
{

    ImageView a;
    TextView b;
    TextView c;
    final a d;

    c(a a1, View view)
    {
        d = a1;
        super();
        a = (ImageView)view.findViewById(0x7f0902db);
        b = (TextView)view.findViewById(0x7f0902dc);
        c = (TextView)view.findViewById(0x7f0902dd);
        a1.a(b, 4, true);
        view.setTag(this);
    }

    void a(GoLifeBean golifebean)
    {
        a.setImageResource(com.go.weatherex.home.c.a.a(d, golifebean.c()));
        b.setText(com.go.weatherex.home.c.a.b(d, golifebean.c()));
        c.setText(com.go.weatherex.home.c.a.a(d, golifebean.c(), golifebean.b()));
    }
}
