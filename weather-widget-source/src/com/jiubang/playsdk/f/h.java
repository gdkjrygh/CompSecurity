// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.playsdk.f;

import android.content.Context;

// Referenced classes of package com.jiubang.playsdk.f:
//            f

class h
    implements Runnable
{

    final Context a;
    final f b;

    h(f f1, Context context)
    {
        b = f1;
        a = context;
        super();
    }

    public void run()
    {
        if (!f.a(b))
        {
            f.a(b, a);
        }
        f.a(b, false);
    }
}
