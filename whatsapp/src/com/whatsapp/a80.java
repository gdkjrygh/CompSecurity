// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.widget.TextView;

// Referenced classes of package com.whatsapp:
//            aon, ContactInfo

class a80
    implements Runnable
{

    final int a;
    final aon b;

    a80(aon aon1, int i)
    {
        b = aon1;
        a = i;
        super();
    }

    public void run()
    {
        if (!b.isCancelled())
        {
            ((TextView)b.a.findViewById(0x7f0b0123)).setText(Integer.toString(a));
        }
    }
}
