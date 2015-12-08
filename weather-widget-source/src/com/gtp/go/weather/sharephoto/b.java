// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.graphics.Bitmap;
import com.gtp.go.weather.sharephoto.d.l;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoDetailActivity

class b extends l
{

    final PhotoDetailActivity a;

    b(PhotoDetailActivity photodetailactivity)
    {
        a = photodetailactivity;
        super();
    }

    public void a(boolean flag, String s, Bitmap bitmap, String s1)
    {
        PhotoDetailActivity.b(a, bitmap);
        PhotoDetailActivity.c(a, true);
        PhotoDetailActivity.q(a);
    }
}
