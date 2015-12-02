// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;


// Referenced classes of package com.whatsapp.gallerypicker:
//            GalleryPicker

class au
    implements Runnable
{

    final GalleryPicker a;
    final boolean b;

    au(GalleryPicker gallerypicker, boolean flag)
    {
        a = gallerypicker;
        b = flag;
        super();
    }

    public void run()
    {
        GalleryPicker.a(a, b);
        a.a(b);
    }
}
