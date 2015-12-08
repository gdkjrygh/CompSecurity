// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.scriptengine.parser;

import android.content.Context;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.gau.go.launcherex.gowidget.scriptengine.parser:
//            ae, i

class n
    implements Runnable
{

    final i a;
    private final Context b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final int f;

    public n(i j, Context context, String s, int k, boolean flag, boolean flag1)
    {
        a = j;
        super();
        b = context;
        c = s;
        d = flag;
        e = flag1;
        f = k;
    }

    public void run()
    {
        if (b != null)
        {
            z z = (new ae(b)).a(c, i.g(a));
            Message message = i.h(a).obtainMessage();
            if (d)
            {
                if (!e)
                {
                    message.what = 1;
                } else
                {
                    message.what = 4;
                }
            } else
            {
                message.what = 2;
            }
            message.obj = ((Object) (new Object[] {
                c, z, Integer.valueOf(f)
            }));
            i.h(a).sendMessage(message);
        }
    }
}
