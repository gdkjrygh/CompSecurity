// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;


// Referenced classes of package com.wf.wellsfargomobile.locations:
//            LocationListActivity

class f
    implements Runnable
{

    final String a;
    final LocationListActivity b;

    f(LocationListActivity locationlistactivity, String s)
    {
        b = locationlistactivity;
        a = s;
        super();
    }

    public void run()
    {
        if (a != null && "ATM".equals(a))
        {
            LocationListActivity.g(b);
            return;
        } else
        {
            LocationListActivity.h(b);
            return;
        }
    }
}
