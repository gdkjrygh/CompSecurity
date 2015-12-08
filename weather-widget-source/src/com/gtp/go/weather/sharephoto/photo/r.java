// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.view.View;
import com.gau.go.a.e;
import com.gau.go.launcherex.goweather.goplay.a.g;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.go.weatherex.f.b;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            PhotoActivity

class r
    implements android.view.View.OnClickListener
{

    final PhotoActivity a;

    r(PhotoActivity photoactivity)
    {
        a = photoactivity;
        super();
    }

    public void onClick(View view)
    {
        b.a(a.getApplicationContext());
        view = (new g("a000", "", "", "", "", "", "")).b();
        e.a(GoWidgetApplication.b()).a(view);
    }
}
