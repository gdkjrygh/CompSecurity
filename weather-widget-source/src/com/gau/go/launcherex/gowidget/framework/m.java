// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.framework;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import com.jiubang.commerce.ad.a.a;
import java.lang.ref.WeakReference;

// Referenced classes of package com.gau.go.launcherex.gowidget.framework:
//            GoWidgetActivity, GoWidgetApplication

class m extends Handler
{

    WeakReference a;
    private boolean b;
    private Object c;

    public m(GoWidgetActivity gowidgetactivity)
    {
        b = false;
        c = new Object();
        a = new WeakReference(gowidgetactivity);
    }

    public void handleMessage(Message message)
    {
        obj = (GoWidgetActivity)a.get();
        if (obj == null || ((GoWidgetActivity) (obj)).isFinishing())
        {
            break MISSING_BLOCK_LABEL_296;
        }
        if (message.what == 0)
        {
            synchronized (c)
            {
                if (!b)
                {
                    removeCallbacksAndMessages(null);
                    ((GoWidgetActivity) (obj)).b();
                }
            }
            return;
        }
        break MISSING_BLOCK_LABEL_60;
        obj;
        message;
        JVM INSTR monitorexit ;
        throw obj;
        if (message.what == 2)
        {
            ((GoWidgetActivity) (obj)).a();
            sendEmptyMessageDelayed(2, 80L);
            return;
        }
        if (message.what == 3)
        {
            synchronized (c)
            {
                if (message.obj instanceof a)
                {
                    a a1 = (a)message.obj;
                    SharedPreferences sharedpreferences = GoWidgetApplication.c(((GoWidgetActivity) (obj)).getApplicationContext()).a();
                    int i = sharedpreferences.getInt("key_show_brand_ad_time", 0);
                    Log.d("zyz", (new StringBuilder()).append("times:").append(i).toString());
                    Log.d("zyz", (new StringBuilder()).append("infoBean.getFrequency():").append(a1.w()).toString());
                    if (a1.w() <= 0 || i % a1.w() == 0)
                    {
                        b = true;
                        ((GoWidgetActivity) (obj)).a((a)message.obj);
                    }
                    sharedpreferences.edit().putInt("key_show_brand_ad_time", i + 1).commit();
                }
            }
            return;
        }
        break MISSING_BLOCK_LABEL_262;
        message;
        obj1;
        JVM INSTR monitorexit ;
        throw message;
        if (message.what == 1)
        {
            removeCallbacksAndMessages(null);
            ((GoWidgetActivity) (obj)).b();
            return;
        }
        if (message.what == 4)
        {
            ((GoWidgetActivity) (obj)).a(message.obj);
        }
    }
}
