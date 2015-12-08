// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.os.Message;
import com.gau.go.launcherex.gowidget.weather.service.a.i;

public class d
    implements Runnable
{

    private Object a;
    private i b;

    public d(Object obj, i j)
    {
        a = obj;
        b = j;
    }

    public void run()
    {
        Message message = Message.obtain();
        message.what = 4097;
        message.arg1 = 1;
        if (b != null)
        {
            b.a(message, null, null);
        }
        try
        {
            Thread.sleep(1000L);
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        message = Message.obtain();
        message.what = 4100;
        message.obj = a;
        if (b != null)
        {
            b.a(message, null, null);
        }
    }
}
