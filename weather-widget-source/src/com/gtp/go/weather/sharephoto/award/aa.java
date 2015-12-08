// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.award;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.award:
//            o, MyAwardsActivity, y, k, 
//            x

class aa extends o
{

    final MyAwardsActivity a;

    private aa(MyAwardsActivity myawardsactivity)
    {
        a = myawardsactivity;
        super();
    }

    aa(MyAwardsActivity myawardsactivity, x x)
    {
        this(myawardsactivity);
    }

    public void a(List list)
    {
        if (list != null)
        {
            MyAwardsActivity.a(a).a((ArrayList)list);
            MyAwardsActivity.a(a).notifyDataSetChanged();
            MyAwardsActivity.b(a).a(list);
        }
    }

    public void a(boolean flag, long l, long l1)
    {
        super.a(flag, l, l1);
        MyAwardsActivity.a(a).notifyDataSetChanged();
    }
}
