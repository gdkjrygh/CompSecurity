// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.wallpaper;


// Referenced classes of package com.whatsapp.wallpaper:
//            CropImageView, p

class f
    implements Runnable
{

    final p a;
    final CropImageView b;

    f(CropImageView cropimageview, p p)
    {
        b = cropimageview;
        a = p;
        super();
    }

    public void run()
    {
        CropImageView.a(b, a);
    }
}
