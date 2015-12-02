// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ae, at, ImageGallery, ImagePreview, 
//            bp, t

class af
    implements ae
{

    final at a;
    final bp b;
    final ImageView c;
    final t d;

    af(at at1, ImageView imageview, bp bp, t t)
    {
        a = at1;
        c = imageview;
        b = bp;
        d = t;
        super();
    }

    public void a()
    {
        c.setBackgroundColor(ImageGallery.d(a.b));
        c.setImageDrawable(null);
    }

    public void a(Bitmap bitmap, boolean flag)
    {
label0:
        {
            int i = ImagePreview.B;
            if (c.getTag() != b)
            {
                break label0;
            }
            if (bitmap == ImageGallery.a(d, a.b.getBaseContext()))
            {
                c.setScaleType(android.widget.ImageView.ScaleType.CENTER);
                c.setBackgroundColor(ImageGallery.d(a.b));
                c.setImageBitmap(bitmap);
                if (i == 0)
                {
                    break label0;
                }
            }
            c.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            c.setBackgroundResource(0);
            if (!flag)
            {
                TransitionDrawable transitiondrawable = new TransitionDrawable(new Drawable[] {
                    ImageGallery.k(a.b), new BitmapDrawable(a.b.getResources(), bitmap)
                });
                transitiondrawable.setCrossFadeEnabled(true);
                transitiondrawable.startTransition(150);
                c.setImageDrawable(transitiondrawable);
                if (i == 0)
                {
                    break label0;
                }
            }
            c.setImageBitmap(bitmap);
        }
    }
}
