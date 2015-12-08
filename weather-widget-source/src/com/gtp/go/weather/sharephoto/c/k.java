// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.gtp.a.a.b.c;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.gtp.go.weather.sharephoto.c:
//            d, f

class k extends BroadcastReceiver
{

    final d a;

    k(d d1)
    {
        a = d1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        c.a("UploadLikeAndBgHandler", (new StringBuilder()).append("UploadLikeAndBgHandler.action = ").append(context).toString());
        if (!"LIKE_OR_BG_UPLOAD".equals(context)) goto _L2; else goto _L1
_L1:
        context = d.g(a).getActiveNetworkInfo();
        if (context == null || !context.isConnected()) goto _L4; else goto _L3
_L3:
        context = new ConcurrentHashMap(com.gtp.go.weather.sharephoto.c.d.c(a));
        intent = new ConcurrentHashMap(d.d(a));
        ConcurrentHashMap concurrenthashmap = new ConcurrentHashMap(d.e(a));
        (new f(a, context, intent, concurrenthashmap)).execute(new Void[0]);
_L6:
        return;
_L4:
        d.b(a, true);
        return;
_L2:
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(context))
        {
            context = d.g(a).getActiveNetworkInfo();
            if (context != null && context.isConnected() && d.h(a))
            {
                d.b(a, false);
                context = new ConcurrentHashMap(com.gtp.go.weather.sharephoto.c.d.c(a));
                intent = new ConcurrentHashMap(d.d(a));
                ConcurrentHashMap concurrenthashmap1 = new ConcurrentHashMap(d.e(a));
                (new f(a, context, intent, concurrenthashmap1)).execute(new Void[0]);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
