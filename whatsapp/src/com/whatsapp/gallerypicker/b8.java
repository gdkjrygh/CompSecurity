// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ae, o

class b8
    implements Runnable
{

    final Bitmap a;
    final ae b;
    final Bitmap c;
    final o d;

    b8(o o, ae ae1, Bitmap bitmap, Bitmap bitmap1)
    {
        d = o;
        b = ae1;
        c = bitmap;
        a = bitmap1;
        super();
    }

    public void run()
    {
        ae ae1 = b;
        Bitmap bitmap = c;
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ae1.a(bitmap, flag);
    }
}
