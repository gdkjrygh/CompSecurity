// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.graphics.Bitmap;
import com.gtp.go.weather.sharephoto.d.k;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoDetailActivity

class s
    implements k
{

    final PhotoDetailActivity a;

    s(PhotoDetailActivity photodetailactivity)
    {
        a = photodetailactivity;
        super();
    }

    public void a()
    {
        PhotoDetailActivity.a(a, a.getString(0x7f08048b), true);
    }

    public void a(int i)
    {
        PhotoDetailActivity.a(a, a.getString(0x7f08048c, new Object[] {
            Integer.valueOf(i)
        }), false);
    }

    public void a(boolean flag, String s1, Bitmap bitmap, String s2)
    {
        PhotoDetailActivity.a(a, bitmap);
        PhotoDetailActivity.b(a, true);
        PhotoDetailActivity.q(a);
    }
}
