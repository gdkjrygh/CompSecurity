// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.go.weatherex.sidebar:
//            b

class e
    implements com.go.weatherex.b.a.e
{

    final b a;

    e(b b1)
    {
        a = b1;
        super();
    }

    public void a(int i)
    {
        Log.i("lky", "mNextAdapter onAdFail");
    }

    public void a(List list)
    {
        if (list == null)
        {
            return;
        } else
        {
            Log.i("lky", (new StringBuilder()).append("mNextAdapter \u8FD4\u56DE\u6570\u636E\u6210\u529F size-->").append(list.size()).toString());
            com.go.weatherex.sidebar.b.a(a).clear();
            com.go.weatherex.sidebar.b.c(a, (ArrayList)list);
            list = com.go.weatherex.sidebar.b.c(a).obtainMessage();
            list.what = 1;
            list.arg1 = 1;
            com.go.weatherex.sidebar.b.c(a).sendMessage(list);
            return;
        }
    }

    public void b(List list)
    {
    }
}
