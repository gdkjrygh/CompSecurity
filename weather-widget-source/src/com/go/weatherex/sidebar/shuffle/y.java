// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.os.Message;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            w, ShuffleLoadingActivity

class y
    implements Runnable
{

    final Message a;
    final w b;

    y(w w1, Message message)
    {
        b = w1;
        a = message;
        super();
    }

    public void run()
    {
        ShuffleLoadingActivity.a(b.a, a.obj);
    }
}
