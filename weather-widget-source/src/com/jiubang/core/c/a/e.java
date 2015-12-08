// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.c.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.gtp.a.a.b.c;
import com.gtp.a.a.c.d;

// Referenced classes of package com.jiubang.core.c.a:
//            b

class e extends BroadcastReceiver
{

    final b a;

    e(b b1)
    {
        a = b1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent != null)
        {
            intent = intent.getAction();
        } else
        {
            intent = null;
        }
        if (!TextUtils.isEmpty(intent))
        {
            c.a("DownloadManager", (new StringBuilder()).append("action = ").append(intent).toString());
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent))
            {
                b.a(a, d.b(context));
                return;
            }
        }
    }
}
