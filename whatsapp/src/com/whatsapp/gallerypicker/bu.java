// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import java.util.ArrayList;

// Referenced classes of package com.whatsapp.gallerypicker:
//            i, ImageGallery, at, q

class bu
    implements Runnable
{

    final i a;
    final q b;

    bu(i j, q q)
    {
        a = j;
        b = q;
        super();
    }

    public void run()
    {
        if (!a.isCancelled())
        {
            ImageGallery.h(a.b).add(b);
            ImageGallery.c(a.b).notifyDataSetChanged();
        }
    }
}
