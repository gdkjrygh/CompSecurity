// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message;

import android.content.Context;
import android.text.TextUtils;
import io.wecloud.message.c.a;
import io.wecloud.message.h.g;

// Referenced classes of package io.wecloud.message:
//            j

public class k
{

    public static void a(Context context)
    {
        boolean flag = true;
        if (context != null)
        {
            io.wecloud.message.c.a.a(context, true);
            if (g.a(context))
            {
                if (TextUtils.isEmpty(io.wecloud.message.c.a.e(context)))
                {
                    flag = false;
                }
                io.wecloud.message.j.a(context, flag);
                return;
            }
        }
    }
}
