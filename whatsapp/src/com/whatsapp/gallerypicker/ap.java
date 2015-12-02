// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp.gallerypicker:
//            bp, t, at, ImageGallery

class ap
    implements bp
{

    final ImageView a;
    final at b;
    final t c;

    ap(at at1, ImageView imageview, t t1)
    {
        b = at1;
        a = imageview;
        c = t1;
        super();
    }

    public String a()
    {
        return c.c();
    }

    public Bitmap b()
    {
        Bitmap bitmap;
        if (a.getTag() != this)
        {
            bitmap = null;
        } else
        {
            Bitmap bitmap1 = c.a(ImageGallery.j(b.b));
            bitmap = bitmap1;
            if (bitmap1 == null)
            {
                return ImageGallery.a(c, b.b.getBaseContext());
            }
        }
        return bitmap;
    }
}
