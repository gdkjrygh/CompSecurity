// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.g;

import io.wecloud.message.e.c;
import io.wecloud.message.h.g;
import io.wecloud.message.j;
import java.util.TimerTask;

// Referenced classes of package io.wecloud.message.g:
//            e

class i extends TimerTask
{

    final e a;

    i(e e1)
    {
        a = e1;
        super();
    }

    public void run()
    {
        e.a(a, null);
        a.b = false;
        if (a.e)
        {
            return;
        }
        if (g.a(e.a(a)))
        {
            a.e();
            return;
        } else
        {
            j.d(e.a(a));
            j.a();
            c.b("CSH", "\u7F51\u7EDC\u4E0D\u901A\uFF0C\u653E\u5F03\u5EFA\u7ACB\u8FDE\u63A5");
            c.b("CSH", "\u53D6\u6D88\u5FC3\u8DF3\u95F9\u949F\u548Cwake lock");
            return;
        }
    }
}
