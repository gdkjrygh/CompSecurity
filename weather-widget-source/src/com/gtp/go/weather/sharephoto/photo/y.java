// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.view.View;
import com.gau.go.launcherex.gowidget.statistics.a.a;
import com.gau.go.launcherex.gowidget.statistics.q;
import com.gtp.go.weather.sharephoto.b.g;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            PhotoActivity

class y
    implements android.view.View.OnClickListener
{

    final g a;
    final PhotoActivity b;

    y(PhotoActivity photoactivity, g g1)
    {
        b = photoactivity;
        a = g1;
        super();
    }

    public void onClick(View view)
    {
        view = new a(117, "fs_set_background");
        view.a(String.valueOf(a.a()));
        com.gtp.go.weather.sharephoto.photo.PhotoActivity.a(b, a.a(), 2);
        q.a(b.getApplicationContext()).a(view);
    }
}
