// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.view.View;
import com.gau.go.launcherex.gowidget.statistics.a.a;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gtp.go.weather.sharephoto.b.g;
import com.gtp.go.weather.sharephoto.c.d;
import com.gtp.go.weather.sharephoto.view.e;
import com.jiubang.pla.a.b;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            PhotoActivity

class n
    implements android.view.View.OnClickListener
{

    final g a;
    final PhotoActivity b;

    n(PhotoActivity photoactivity, g g1)
    {
        b = photoactivity;
        a = g1;
        super();
    }

    public void onClick(View view)
    {
        int i = 1;
        if (com.gtp.go.weather.sharephoto.d.n.a(b.getApplicationContext()))
        {
            view = a;
            int j;
            boolean flag;
            if (!a.h())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.a(flag);
            j = a.c();
            if (!a.h())
            {
                i = -1;
            }
            a.a(j + i);
            b.a.notifyDataSetChanged();
            PhotoActivity.l(b).a(a);
            view = new a(117);
            view.a(String.valueOf(a.a()));
            view.e("1");
            if (a.h())
            {
                e.a(b, PhotoActivity.m(b));
                view.b("exellent_add");
                q.a(b.getApplicationContext()).a(view);
                return;
            } else
            {
                e.b(b, PhotoActivity.m(b));
                view.b("exellent_minus");
                q.a(b.getApplicationContext()).a(view);
                return;
            }
        } else
        {
            PhotoActivity.n(b);
            return;
        }
    }
}
