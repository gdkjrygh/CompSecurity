// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            ad, ah

class af
    implements android.view.View.OnClickListener
{

    View a;
    ImageView b;
    TextView c;
    ImageView d;
    ah e;
    final ad f;

    af(ad ad1, int i)
    {
        f = ad1;
        super();
        a = ad.a(ad1).getLayoutInflater().inflate(0x7f030100, null);
        b = (ImageView)a.findViewById(0x7f0904f8);
        d = (ImageView)a.findViewById(0x7f0904f9);
        c = (TextView)a.findViewById(0x7f0904fa);
        d.setVisibility(4);
        a.setOnClickListener(this);
        ad1 = new android.view.ViewGroup.LayoutParams(i, -2);
        a.setLayoutParams(ad1);
    }

    void a(ah ah1)
    {
        e = ah1;
        c.setText(e.b);
        b.setImageResource(e.c);
        ah1 = d;
        int i;
        if (e.d)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        ah1.setVisibility(i);
    }

    public void onClick(View view)
    {
        ad.a(f, e);
    }
}
