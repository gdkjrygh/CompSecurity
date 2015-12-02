// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import java.util.ArrayList;

// Referenced classes of package com.whatsapp.gallerypicker:
//            i, ImageGallery, at, q

class bi
    implements Runnable
{

    final q a;
    final i b;

    bi(i j, q q)
    {
        b = j;
        a = q;
        super();
    }

    public void run()
    {
        if (!b.isCancelled())
        {
            ImageGallery.h(b.b).add(a);
            ImageGallery.c(b.b).notifyDataSetChanged();
        }
    }
}
