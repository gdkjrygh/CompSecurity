// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp.util:
//            Log, b2

class b5
    implements Runnable
{

    private ImageView a;
    final b2 b;
    private String c;
    private Bitmap d;

    public b5(b2 b2_1, Bitmap bitmap, ImageView imageview, String s)
    {
        b = b2_1;
        super();
        d = bitmap;
        a = imageview;
        c = s;
    }

    public void run()
    {
label0:
        {
            boolean flag = Log.f;
            if (a.getTag() == null || !a.getTag().equals(c))
            {
                break label0;
            }
            if (d != null)
            {
                if (a.getDrawable() == null)
                {
                    TransitionDrawable transitiondrawable = new TransitionDrawable(new Drawable[] {
                        new ColorDrawable(0), new BitmapDrawable(a.getResources(), d)
                    });
                    transitiondrawable.setCrossFadeEnabled(true);
                    transitiondrawable.startTransition(200);
                    a.setImageDrawable(transitiondrawable);
                    if (!flag)
                    {
                        break label0;
                    }
                }
                a.setImageBitmap(d);
                if (!flag)
                {
                    break label0;
                }
            }
            a.setImageDrawable(b2.c(b));
        }
    }
}
