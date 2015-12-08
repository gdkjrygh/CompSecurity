// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.widget.CheckBox;
import com.gau.go.launcherex.gowidget.statistics.a.a;
import com.gau.go.launcherex.gowidget.statistics.q;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoDetailActivity

class e
    implements Runnable
{

    final PhotoDetailActivity a;

    e(PhotoDetailActivity photodetailactivity)
    {
        a = photodetailactivity;
        super();
    }

    public void run()
    {
        if (com.gtp.go.weather.sharephoto.PhotoDetailActivity.a(a) == 1)
        {
            PhotoDetailActivity.d(a, true);
        } else
        if (PhotoDetailActivity.u(a))
        {
            a a1 = new a(117);
            a1.a(String.valueOf(PhotoDetailActivity.p(a)));
            if (PhotoDetailActivity.v(a).isChecked())
            {
                a1.b("preview");
                q.a(a.getApplicationContext()).a(a1);
            }
            a1.b("fs_set_background");
            q.a(a.getApplicationContext()).a(a1);
            PhotoDetailActivity.w(a);
            return;
        }
    }
}
