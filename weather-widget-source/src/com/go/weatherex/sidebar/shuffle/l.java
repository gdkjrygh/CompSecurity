// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar.shuffle;

import android.util.Log;
import com.gau.go.launcherex.goweather.goplay.a.e;
import com.google.android.gms.ads.AdListener;

// Referenced classes of package com.go.weatherex.sidebar.shuffle:
//            g

class l extends AdListener
{

    final g a;

    l(g g1)
    {
        a = g1;
        super();
    }

    public void onAdFailedToLoad(int i)
    {
        Object obj = new e(g.a(a), "2");
        ((e) (obj)).f("-1");
        ((e) (obj)).b("ad_requst_re");
        ((e) (obj)).d("ca-app-pub-6646759830189405/8928439175");
        ((e) (obj)).g("5");
        long l1 = System.currentTimeMillis();
        long l2 = g.c(a);
        ((e) (obj)).j((new StringBuilder()).append((double)(l1 - l2) / 1000D).append("").toString());
        obj = ((e) (obj)).b();
        com.gau.go.a.e.a(g.a(a)).a(((String) (obj)));
        Log.i("lky", (new StringBuilder()).append("errorCode->").append(i).toString());
    }
}
