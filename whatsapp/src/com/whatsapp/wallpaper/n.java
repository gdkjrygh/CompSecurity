// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.wallpaper;


// Referenced classes of package com.whatsapp.wallpaper:
//            ImageViewTouchBase, s

class n
    implements Runnable
{

    final ImageViewTouchBase a;
    final boolean b;
    final s c;

    n(ImageViewTouchBase imageviewtouchbase, s s, boolean flag)
    {
        a = imageviewtouchbase;
        c = s;
        b = flag;
        super();
    }

    public void run()
    {
        a.setImageRotateBitmapResetBase(c, b);
    }
}
