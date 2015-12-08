// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.commerce.ad.j.a;

import android.graphics.Bitmap;
import android.widget.ImageView;

// Referenced classes of package com.jiubang.commerce.ad.j.a:
//            b

class c
    implements Runnable
{

    final Bitmap a;
    final b b;

    c(b b1, Bitmap bitmap)
    {
        b = b1;
        a = bitmap;
        super();
    }

    public void run()
    {
        b.a.setImageBitmap(a);
    }
}
