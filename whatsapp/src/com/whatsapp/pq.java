// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.DialogInterface;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            BroadcastDetails

class pq
    implements android.content.DialogInterface.OnClickListener
{

    final ArrayList a;
    final BroadcastDetails b;

    pq(BroadcastDetails broadcastdetails, ArrayList arraylist)
    {
        b = broadcastdetails;
        a = arraylist;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i < a.size())
        {
            BroadcastDetails.a(b, BroadcastDetails.b(b), ((Integer)a.get(i)).intValue());
        }
        b.removeDialog(3);
    }
}
