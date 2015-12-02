// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp:
//            ao9, og, App

final class kd
    implements Runnable
{

    final ao9 a;
    private Bitmap b;
    private og c;
    private ImageView d;

    public kd(ao9 ao9_1, Bitmap bitmap, ImageView imageview, og og1)
    {
        a = ao9_1;
        super();
        b = bitmap;
        d = imageview;
        c = og1;
    }

    public void run()
    {
label0:
        {
            if (d.getTag() == null || !d.getTag().equals(c.b(ao9.c(a), ao9.b(a))))
            {
                break label0;
            }
            if (b != null)
            {
                TransitionDrawable transitiondrawable = new TransitionDrawable(new Drawable[] {
                    d.getDrawable(), new BitmapDrawable(b)
                });
                transitiondrawable.setCrossFadeEnabled(false);
                transitiondrawable.startTransition(300);
                d.setImageDrawable(transitiondrawable);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            Bitmap bitmap = c.j();
            if (!(d.getDrawable() instanceof BitmapDrawable) || ((BitmapDrawable)(BitmapDrawable)d.getDrawable()).getBitmap() != bitmap)
            {
                d.setImageBitmap(bitmap);
            }
        }
    }
}
