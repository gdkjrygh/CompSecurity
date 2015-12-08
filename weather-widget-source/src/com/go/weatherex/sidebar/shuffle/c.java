// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.os.Message;
import com.facebook.ads.NativeAd;
import com.gau.go.launcherex.gowidget.weather.service.a.i;
import com.jiubang.goweather.e.a;

public class c
    implements Runnable
{

    private NativeAd a;
    private i b;

    public c(NativeAd nativead, i j)
    {
        a = nativead;
        b = j;
    }

    public void run()
    {
        Message message = Message.obtain();
        message.what = 4097;
        message.arg1 = 1;
        System.currentTimeMillis();
        Object obj = a.getAdCoverImage().getUrl();
        android.graphics.Bitmap bitmap = com.jiubang.goweather.e.a.b(a.getAdIcon().getUrl());
        obj = com.jiubang.goweather.e.a.b(((String) (obj)));
        if (b != null)
        {
            b.a(message, null, null);
        }
        System.currentTimeMillis();
        try
        {
            Thread.sleep(1000L);
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        message = Message.obtain();
        message.what = 4099;
        message.obj = a;
        if (b != null)
        {
            b.a(message, bitmap, ((android.graphics.Bitmap) (obj)));
        }
    }
}
