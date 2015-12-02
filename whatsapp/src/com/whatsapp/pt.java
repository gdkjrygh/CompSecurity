// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Bitmap;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp:
//            a_c, CallLogActivity

class pt
    implements Runnable
{

    final a_c a;
    final Bitmap b;

    pt(a_c a_c1, Bitmap bitmap)
    {
        a = a_c1;
        b = bitmap;
        super();
    }

    public void run()
    {
        CallLogActivity.c(a.a).setImageBitmap(b);
    }
}
