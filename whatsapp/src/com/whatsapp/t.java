// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Bitmap;

// Referenced classes of package com.whatsapp:
//            aon, ContactInfo

class t
    implements Runnable
{

    final aon a;
    final Bitmap b;

    t(aon aon1, Bitmap bitmap)
    {
        a = aon1;
        b = bitmap;
        super();
    }

    public void run()
    {
        if (!a.isCancelled())
        {
            ContactInfo.a(a.a, b);
        }
    }
}
