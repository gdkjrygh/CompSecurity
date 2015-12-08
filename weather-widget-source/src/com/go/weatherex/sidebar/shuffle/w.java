// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.graphics.Bitmap;
import android.os.Message;
import com.facebook.ads.NativeAd;
import com.gau.go.launcherex.goweather.goplay.a.e;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.service.a.b;
import com.gau.go.launcherex.gowidget.weather.service.a.i;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            ShuffleLoadingActivity, x, y

class w
    implements i
{

    final ShuffleLoadingActivity a;

    w(ShuffleLoadingActivity shuffleloadingactivity)
    {
        a = shuffleloadingactivity;
        super();
    }

    public void a(Message message, Bitmap bitmap, Bitmap bitmap1)
    {
        if (message != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        message.what;
        JVM INSTR tableswitch 4097 4100: default 40
    //                   4097 41
    //                   4098 51
    //                   4099 59
    //                   4100 150;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        continue; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        com.go.weatherex.sidebar.shuffle.ShuffleLoadingActivity.b(a, true);
        return;
_L5:
        a.finish();
        return;
_L6:
        if (!ShuffleLoadingActivity.c(a)) goto _L1; else goto _L8
_L8:
        message = (NativeAd)message.obj;
        System.currentTimeMillis();
        b.a(new x(this, message, bitmap, bitmap1));
        message = new e(a.getApplicationContext(), "2");
        message.b("f000");
        message.d("1624435071119252_1702129763349782");
        message.g("5");
        message = message.b();
        com.gau.go.a.e.a(a.getApplicationContext()).a(message);
        return;
        if (!ShuffleLoadingActivity.c(a)) goto _L1; else goto _L9
_L9:
        b.a(new y(this, message));
        message = (new e("f000", "ca-app-pub-6646759830189405/8928439175", "946", "", "", "", "")).b();
        com.gau.go.a.e.a(GoWidgetApplication.b()).a(message);
        return;
    }
}
