// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.protocol.a;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.aw;
import com.whatsapp.util.cl;

// Referenced classes of package com.whatsapp:
//            a1g, aob, App

final class al9
    implements aw
{

    al9()
    {
    }

    public int a()
    {
        return (int)(88F * com.whatsapp.a1g.a().g);
    }

    public void a(ImageView imageview, Bitmap bitmap, c4 c4_1)
    {
label0:
        {
            if (bitmap != null)
            {
                imageview.setImageDrawable(new aob(imageview.getContext(), bitmap, c4_1.y.b));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            imageview.setImageDrawable(new aob(imageview.getContext(), cl.c(imageview.getContext()), c4_1.y.b));
        }
    }
}
