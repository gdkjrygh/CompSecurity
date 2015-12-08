// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar;

import android.database.ContentObserver;
import android.os.Handler;
import com.go.weatherex.messagecenter.i;

// Referenced classes of package com.go.weatherex.sidebar:
//            b

class g extends ContentObserver
{

    final b a;

    public g(b b1, Handler handler)
    {
        a = b1;
        super(handler);
    }

    public void onChange(boolean flag)
    {
        super.onChange(flag);
        if (!flag && b.h(a) != null)
        {
            b.h(a).b(a);
        }
    }
}
