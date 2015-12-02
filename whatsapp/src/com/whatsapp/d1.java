// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package com.whatsapp:
//            og, BroadcastDetails

class d1
    implements android.widget.AdapterView.OnItemClickListener
{

    final BroadcastDetails a;

    d1(BroadcastDetails broadcastdetails)
    {
        a = broadcastdetails;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (og)view.getTag();
        if (adapterview != null)
        {
            BroadcastDetails.a(a, adapterview);
            a.showDialog(3);
        }
    }
}
