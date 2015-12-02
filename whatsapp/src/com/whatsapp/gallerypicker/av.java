// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;


// Referenced classes of package com.whatsapp.gallerypicker:
//            GalleryPicker

class av extends Thread
{

    final GalleryPicker a;

    av(GalleryPicker gallerypicker, String s)
    {
        a = gallerypicker;
        super(s);
    }

    public void run()
    {
        GalleryPicker.f(a);
    }
}
