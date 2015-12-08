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

final class c
    implements Runnable
{

    final Context a;
    final String b;
    final String c;
    final String d;
    final String e;
    final String f;
    final String g;
    final String h;
    final String i;
    final String j;
    final String k;

    c(Context context, String s, String s1, String s2, String s3, String s4, String s5, 
            String s6, String s7, String s8, String s9)
    {
        a = context;
        b = s;
        c = s1;
        d = s2;
        e = s3;
        f = s4;
        g = s5;
        h = s6;
        i = s7;
        j = s8;
        k = s9;
        super();
    }

    public void run()
    {
        com.jiubang.playsdk.e.a.a(a);
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append(20).append("||").append(com.jiubang.playsdk.f.e.h(a)).append("||").append(com.jiubang.playsdk.e.a.a()).append("||").append(b).append("||").append(c).append("||").append(d).append("||").append(e).append("||").append(com.jiubang.playsdk.f.e.e(a)).append("||").append(com.jiubang.playsdk.f.e.f(a)).append("||").append(com.jiubang.playsdk.f.a.d(a, a.getPackageName())).append("||").append(com.jiubang.playsdk.f.a.e(a, a.getPackageName())).append("||").append(f).append("||").append(g).append("||").append(h).append("||").append(i).append("||").append(com.gau.go.a.e.b(a)).append("||").append(j).append("||").append(k).append("||").append(y.a().b(a));
        com.gau.go.a.e.a(a).a(stringbuffer.toString());
    }
}
