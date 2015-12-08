// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.os.Handler;
import android.os.Message;
import com.gau.go.launcherex.gowidget.weather.service.a.b;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            ShuffleLoadingActivity, ab

class aa
    implements Runnable
{

    final ShuffleLoadingActivity a;

    aa(ShuffleLoadingActivity shuffleloadingactivity)
    {
        a = shuffleloadingactivity;
        super();
    }

    public void run()
    {
        int i = 0;
        while (i < 66 && !ShuffleLoadingActivity.c(a)) 
        {
            try
            {
                Thread.sleep(150L);
                Message message = ShuffleLoadingActivity.d(a).obtainMessage();
                message.what = 0;
                ShuffleLoadingActivity.d(a).sendMessage(message);
            }
            catch (Exception exception) { }
            i++;
        }
        b.a(new ab(this), 1500L);
    }
}
