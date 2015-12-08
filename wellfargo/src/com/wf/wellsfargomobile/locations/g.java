// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import com.google.android.gms.maps.model.e;

// Referenced classes of package com.wf.wellsfargomobile.locations:
//            LocationListActivity

class g
    implements Runnable
{

    final e a;
    final LocationListActivity b;

    g(LocationListActivity locationlistactivity, e e)
    {
        b = locationlistactivity;
        a = e;
        super();
    }

    public void run()
    {
        LocationListActivity.a(b, a);
    }
}
