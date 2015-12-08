// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.messagecenter;

import android.database.ContentObserver;
import android.os.Handler;

// Referenced classes of package com.go.weatherex.messagecenter:
//            b, i

class f extends ContentObserver
{

    final b a;

    public f(b b1, Handler handler)
    {
        a = b1;
        super(handler);
    }

    public void onChange(boolean flag)
    {
        super.onChange(flag);
        if (!flag && b.d(a) != null)
        {
            b.d(a).a(a);
        }
    }
}
