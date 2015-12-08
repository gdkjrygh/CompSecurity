// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.gtp.go.weather.sharephoto.b.h;
import com.gtp.go.weather.sharephoto.b.p;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.view:
//            g

class m extends BroadcastReceiver
{

    final g a;

    m(g g1)
    {
        a = g1;
        super();
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        long l;
        l = intent.getLongExtra("extra_change_photo_id", -1L);
        i = intent.getIntExtra("extra_change_type", 1);
        j = intent.getIntExtra("extra_change_value", -1);
        if (i != 1) goto _L4; else goto _L3
_L3:
        context = g.a(a).iterator();
_L7:
        if (!context.hasNext()) goto _L2; else goto _L5
_L5:
        intent = ((h)context.next()).b(l);
        if (intent == null) goto _L7; else goto _L6
_L6:
        boolean flag;
        if (j == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        intent.a(flag);
        intent.a(j);
        a.notifyDataSetChanged();
_L2:
        return;
_L4:
        if (i == 2)
        {
            return;
        }
        if (true) goto _L2; else goto _L8
_L8:
    }
}
