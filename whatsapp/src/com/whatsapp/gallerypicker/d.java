// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;


// Referenced classes of package com.whatsapp.gallerypicker:
//            GalleryPicker

class d
    implements Runnable
{

    final GalleryPicker a;

    d(GalleryPicker gallerypicker)
    {
        a = gallerypicker;
        super();
    }

    public void run()
    {
        GalleryPicker.h(a);
    }
}
