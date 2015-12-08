// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.view.View;
import android.widget.RelativeLayout;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            ShuffleLoadingActivity

class o
    implements Runnable
{

    final View a;
    final ShuffleLoadingActivity b;

    o(ShuffleLoadingActivity shuffleloadingactivity, View view)
    {
        b = shuffleloadingactivity;
        a = view;
        super();
    }

    public void run()
    {
        ShuffleLoadingActivity.a(b).removeView(a);
    }
}
