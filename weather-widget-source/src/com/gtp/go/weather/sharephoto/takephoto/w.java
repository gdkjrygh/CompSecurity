// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.widget.Toast;
import com.gau.go.launcherex.gowidget.weather.service.a.a;
import com.gau.go.launcherex.gowidget.weather.service.a.g;
import com.gtp.go.weather.sharephoto.b.e;
import com.gtp.go.weather.sharephoto.c.b;
import com.gtp.go.weather.sharephoto.c.n;
import com.jiubang.goweather.b.f;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            PublishPhotoActivity

class w extends g
{

    final PublishPhotoActivity a;

    w(PublishPhotoActivity publishphotoactivity)
    {
        a = publishphotoactivity;
        super();
    }

    public void b(a a1)
    {
        com.gtp.go.weather.sharephoto.takephoto.PublishPhotoActivity.a(a, false);
        com.gtp.go.weather.sharephoto.takephoto.PublishPhotoActivity.f(a);
        if (!(a1 instanceof b)) goto _L2; else goto _L1
_L1:
        a1 = (b)a1;
        if (-1L != a1.c().f()) goto _L4; else goto _L3
_L3:
        int i = a1.e().e();
        if (i != 6 && i != 12) goto _L6; else goto _L5
_L5:
        Toast.makeText(a, a.getString(0x7f080461), 0).show();
_L8:
        return;
_L6:
        Toast.makeText(a, a.getString(0x7f08045f), 0).show();
        return;
_L4:
        Toast.makeText(a, a.getString(0x7f08045e), 0).show();
        com.gtp.go.weather.sharephoto.takephoto.PublishPhotoActivity.g(a);
        a.finish();
        return;
_L2:
        if (a1 instanceof n)
        {
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }
}
