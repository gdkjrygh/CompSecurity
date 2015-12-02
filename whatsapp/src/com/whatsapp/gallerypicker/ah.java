// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp.gallerypicker:
//            bp, ag, aa, GalleryPicker, 
//            t, ImageGallery

class ah
    implements bp
{

    final ag a;
    final aa b;
    final t c;
    final ImageView d;

    ah(aa aa1, ImageView imageview, t t1, ag ag1)
    {
        b = aa1;
        d = imageview;
        c = t1;
        a = ag1;
        super();
    }

    public String a()
    {
        return a.a();
    }

    public Bitmap b()
    {
        Bitmap bitmap;
        if (d.getTag() != this)
        {
            bitmap = null;
        } else
        {
            Bitmap bitmap1 = c.a(GalleryPicker.c(b.b));
            bitmap = bitmap1;
            if (bitmap1 == null)
            {
                return ImageGallery.a(c, b.b.getBaseContext());
            }
        }
        return bitmap;
    }
}
