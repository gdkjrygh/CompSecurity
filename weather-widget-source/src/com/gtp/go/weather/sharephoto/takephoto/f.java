// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.jiubang.ggheart.apps.desks.diy.filter.core.FilterParameter;
import java.lang.ref.SoftReference;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            d, h, g

class f
    implements android.view.View.OnClickListener
{

    View a;
    ImageView b;
    TextView c;
    ImageView d;
    h e;
    final d f;

    f(d d1, int i)
    {
        f = d1;
        super();
        a = com.gtp.go.weather.sharephoto.takephoto.d.a(d1).getLayoutInflater().inflate(0x7f0300fe, null);
        b = (ImageView)a.findViewById(0x7f0904f3);
        d = (ImageView)a.findViewById(0x7f0904f4);
        c = (TextView)a.findViewById(0x7f0904f5);
        d.setVisibility(4);
        a.setOnClickListener(this);
        d1 = new android.view.ViewGroup.LayoutParams(i, -2);
        a.setLayoutParams(d1);
    }

    void a(h h1)
    {
        e = h1;
        FilterParameter filterparameter = h1.a;
        c.setText(filterparameter.getFilterNameResId());
        if (com.gtp.go.weather.sharephoto.takephoto.d.b(f) != null)
        {
            h1 = (SoftReference)com.gtp.go.weather.sharephoto.takephoto.d.c(f).get(filterparameter.getTypeId());
            int i;
            if (h1 != null)
            {
                h1 = (Bitmap)h1.get();
            } else
            {
                h1 = null;
            }
            if (h1 != null)
            {
                b.setImageBitmap(h1);
            } else
            {
                filterparameter.mSrcBitmap = com.gtp.go.weather.sharephoto.takephoto.d.b(f);
                (new g(this, filterparameter)).execute(new Void[0]);
            }
        }
        h1 = d;
        if (e.b)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        h1.setVisibility(i);
    }

    public void onClick(View view)
    {
        com.gtp.go.weather.sharephoto.takephoto.d.a(f, e);
    }
}
