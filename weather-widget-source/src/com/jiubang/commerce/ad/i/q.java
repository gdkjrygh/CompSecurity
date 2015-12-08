// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.i;

import android.content.Context;
import android.os.Handler;
import com.facebook.ads.NativeAdsManager;
import com.jiubang.commerce.ad.b.a.f;
import com.jiubang.commerce.ad.e.m;
import com.jiubang.commerce.ad.i.a.a;
import com.jiubang.commerce.utils.s;

// Referenced classes of package com.jiubang.commerce.ad.i:
//            b, c

class q
    implements com.facebook.ads.NativeAdsManager.Listener
{

    final NativeAdsManager a;
    final Context b;
    final String c;
    final String d;
    final f e;
    final m f;
    final a g;
    final String h[];
    final int i;
    final Handler j;
    final s k;
    final b l;
    final c m;

    q(c c1, NativeAdsManager nativeadsmanager, Context context, String s, String s1, f f1, m m1, 
            a a1, String as[], int i1, Handler handler, s s2, b b1)
    {
        m = c1;
        a = nativeadsmanager;
        b = context;
        c = s;
        d = s1;
        e = f1;
        f = m1;
        g = a1;
        h = as;
        i = i1;
        j = handler;
        k = s2;
        l = b1;
        super();
    }
}
