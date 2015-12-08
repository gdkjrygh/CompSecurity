// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.g;

import android.text.TextUtils;
import io.wecloud.message.c.a;
import io.wecloud.message.d.h;
import io.wecloud.message.e.b;
import io.wecloud.message.e.c;
import io.wecloud.message.j;
import java.util.Timer;

// Referenced classes of package io.wecloud.message.g:
//            e, g

class f
    implements h
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    static e a(f f1)
    {
        return f1.a;
    }

    public void a()
    {
        a.c();
        j.a(io.wecloud.message.g.e.a(a), 110);
        if (io.wecloud.message.c.a.s(io.wecloud.message.g.e.a(a)))
        {
            io.wecloud.message.c.a.d(io.wecloud.message.g.e.a(a), false);
            io.wecloud.message.c.a.d(io.wecloud.message.g.e.a(a), System.currentTimeMillis());
            io.wecloud.message.c.a.c(io.wecloud.message.g.e.a(a), true);
        }
    }

    public void a(String s)
    {
        c.d("CSH", (new StringBuilder("login error --- ")).append(s).toString());
        io.wecloud.message.g.e.b(a).a(io.wecloud.message.e.a.a(5, s));
        if (TextUtils.isEmpty(s) || !s.equals("The appkey is not match its package name"))
        {
            s = a;
            s.d = ((e) (s)).d + 1;
            if (a.d <= 3)
            {
                s = new g(this);
                (new Timer()).schedule(s, a.d * 10000);
                return;
            }
        }
    }
}
