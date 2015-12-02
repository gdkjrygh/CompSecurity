// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;


// Referenced classes of package com.whatsapp.gallerypicker:
//            GalleryPicker, ag

class bm
    implements Runnable
{

    final ag a;
    final GalleryPicker b;

    bm(GalleryPicker gallerypicker, ag ag)
    {
        b = gallerypicker;
        a = ag;
        super();
    }

    public void run()
    {
        GalleryPicker.a(b, a);
    }
}
