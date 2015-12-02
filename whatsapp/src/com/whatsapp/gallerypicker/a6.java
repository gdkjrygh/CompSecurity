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
//            ae, aa, GalleryPicker, ImagePreview, 
//            ImageGallery, bp, t

class a6
    implements ae
{

    final aa a;
    final ImageView b;
    final bp c;
    final t d;

    a6(aa aa1, ImageView imageview, bp bp, t t)
    {
        a = aa1;
        b = imageview;
        c = bp;
        d = t;
        super();
    }

    public void a()
    {
        b.setBackgroundColor(GalleryPicker.g(a.b));
        b.setImageDrawable(null);
    }

    public void a(Bitmap bitmap, boolean flag)
    {
label0:
        {
            int i = ImagePreview.B;
            if (b.getTag() != c)
            {
                break label0;
            }
            if (bitmap == ImageGallery.a(d, a.b.getBaseContext()))
            {
                b.setScaleType(android.widget.ImageView.ScaleType.CENTER);
                b.setBackgroundColor(GalleryPicker.g(a.b));
                b.setImageBitmap(bitmap);
                if (i == 0)
                {
                    break label0;
                }
            }
            b.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            b.setBackgroundResource(0);
            if (!flag)
            {
                TransitionDrawable transitiondrawable = new TransitionDrawable(new Drawable[] {
                    GalleryPicker.a(a.b), new BitmapDrawable(a.b.getResources(), bitmap)
                });
                transitiondrawable.setCrossFadeEnabled(true);
                transitiondrawable.startTransition(150);
                b.setImageDrawable(transitiondrawable);
                if (i == 0)
                {
                    break label0;
                }
            }
            b.setImageBitmap(bitmap);
        }
    }
}
