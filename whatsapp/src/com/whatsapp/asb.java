// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            qu, ConversationRowVideo, App

class asb
    implements Runnable
{

    final qu a;
    final Bitmap b;

    asb(qu qu1, Bitmap bitmap)
    {
        a = qu1;
        b = bitmap;
        super();
    }

    public void run()
    {
label0:
        {
            BitmapDrawable bitmapdrawable;
label1:
            {
                if (a.b != a.d.i.B || !a.d.isShown())
                {
                    break label0;
                }
                if (a.e == null)
                {
                    a.e = ConversationRowVideo.b(a.d).getDrawable();
                }
                bitmapdrawable = new BitmapDrawable(a.d.getResources(), b);
                if (a.e != null)
                {
                    TransitionDrawable transitiondrawable = new TransitionDrawable(new Drawable[] {
                        a.e, bitmapdrawable
                    });
                    transitiondrawable.setCrossFadeEnabled(false);
                    transitiondrawable.startTransition(500);
                    ConversationRowVideo.b(a.d).setImageDrawable(transitiondrawable);
                    if (App.am == 0)
                    {
                        break label1;
                    }
                }
                ConversationRowVideo.b(a.d).setImageDrawable(bitmapdrawable);
            }
            a.e = bitmapdrawable;
        }
    }
}
