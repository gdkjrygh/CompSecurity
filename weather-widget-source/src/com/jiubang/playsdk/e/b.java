// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.e;

import android.content.Context;
import com.jiubang.playsdk.a.y;
import com.jiubang.playsdk.f.a;
import com.jiubang.playsdk.f.e;

// Referenced classes of package com.jiubang.playsdk.e:
//            a

final class b
    implements Runnable
{

    final Context a;
    final int b;
    final long c;
    final int d;
    final long e;
    final int f;

    b(Context context, int i, long l, int j, long l1, 
            int k)
    {
        a = context;
        b = i;
        c = l;
        d = j;
        e = l1;
        f = k;
        super();
    }

    public void run()
    {
        com.jiubang.playsdk.e.a.a(a);
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(20).append("||").append(com.jiubang.playsdk.f.e.h(a)).append("||").append(com.jiubang.playsdk.e.a.a()).append("||").append(com.jiubang.playsdk.e.a.a(b)).append("||").append(c).append("||").append("a000").append("||").append("1").append("||").append(com.jiubang.playsdk.f.e.e(a)).append("||").append(com.jiubang.playsdk.f.e.f(a)).append("||").append(com.jiubang.playsdk.f.a.d(a, a.getPackageName())).append("||").append(com.jiubang.playsdk.f.a.e(a, a.getPackageName())).append("||").append(d).append("||").append(e).append("||").append(f).append("||").append(0).append("||").append(com.gau.go.a.e.b(a)).append("||").append("").append("||").append("").append("||").append(y.a().b(a));
        com.gau.go.a.e.a(a).a(stringbuffer.toString());
    }
}
