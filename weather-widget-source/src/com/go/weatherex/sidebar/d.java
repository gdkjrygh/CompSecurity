// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.sidebar;

import android.os.Handler;
import android.os.Message;
import com.go.weatherex.b.a.e;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.go.weatherex.sidebar:
//            b

class d
    implements e
{

    final b a;

    d(b b1)
    {
        a = b1;
        super();
    }

    public void a(int i)
    {
    }

    public void a(List list)
    {
        if (list == null)
        {
            return;
        } else
        {
            com.go.weatherex.sidebar.b.b(a).clear();
            com.go.weatherex.sidebar.b.b(a, (ArrayList)list);
            list = com.go.weatherex.sidebar.b.c(a).obtainMessage();
            list.what = 1;
            list.arg1 = 2;
            com.go.weatherex.sidebar.b.c(a).sendMessage(list);
            return;
        }
    }

    public void b(List list)
    {
    }
}
