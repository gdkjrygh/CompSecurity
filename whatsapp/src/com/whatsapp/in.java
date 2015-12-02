// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

// Referenced classes of package com.whatsapp:
//            ao0, VideoPreviewActivity, VideoView

class in
    implements Runnable
{

    final ao0 a;
    final Bitmap b;

    in(ao0 ao0_1, Bitmap bitmap)
    {
        a = ao0_1;
        b = bitmap;
        super();
    }

    public void run()
    {
        if (!VideoPreviewActivity.a(a.b).isPlaying())
        {
            VideoPreviewActivity.a(a.b).setBackgroundDrawable(new BitmapDrawable(a.b.getResources(), b));
        }
    }
}
