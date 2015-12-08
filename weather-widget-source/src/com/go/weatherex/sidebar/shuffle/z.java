// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            ShuffleLoadingActivity

class z extends Handler
{

    final ShuffleLoadingActivity a;

    z(ShuffleLoadingActivity shuffleloadingactivity)
    {
        a = shuffleloadingactivity;
        super();
    }

    public void handleMessage(Message message)
    {
        if (message.what == 0)
        {
            ShuffleLoadingActivity.b(a);
        }
    }
}
