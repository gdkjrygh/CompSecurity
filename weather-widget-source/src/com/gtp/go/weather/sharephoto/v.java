// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.globalview.a;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoReportActivity, w

class v
{

    final PhotoReportActivity a;
    private View b;
    private TextView c;
    private CheckBox d;
    private a e;

    v(PhotoReportActivity photoreportactivity)
    {
        a = photoreportactivity;
        super();
        b = photoreportactivity.getLayoutInflater().inflate(0x7f030061, null);
        c = (TextView)b.findViewById(0x7f09009d);
        d = (CheckBox)b.findViewById(0x7f090264);
    }

    static View a(v v1)
    {
        return v1.b;
    }

    private void b()
    {
        c.setText(e.a);
        d.setChecked(e.b);
    }

    public void a()
    {
        Iterator iterator = com.gtp.go.weather.sharephoto.PhotoReportActivity.a(a).iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a a1 = (a)iterator.next();
            if (!a1.b)
            {
                continue;
            }
            a1.b = false;
            break;
        } while (true);
        e.b = true;
        PhotoReportActivity.b(a).notifyDataSetChanged();
    }

    void a(int i)
    {
        e = (a)com.gtp.go.weather.sharephoto.PhotoReportActivity.a(a).get(i);
        b();
    }
}
