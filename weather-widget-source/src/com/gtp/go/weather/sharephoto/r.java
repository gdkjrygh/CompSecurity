// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import com.gtp.a.a.b.c;
import com.gtp.go.weather.sharephoto.b.g;
import com.gtp.go.weather.sharephoto.photo.a;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoDetailActivity

class r
    implements a
{

    final PhotoDetailActivity a;

    r(PhotoDetailActivity photodetailactivity)
    {
        a = photodetailactivity;
        super();
    }

    public void a(Long long1, g g1)
    {
        if (g1 != null)
        {
            long1 = g1.p();
            String s = g1.t();
            String s1 = g1.x();
            com.gtp.go.weather.sharephoto.PhotoDetailActivity.a(a, g1.h());
            com.gtp.go.weather.sharephoto.PhotoDetailActivity.a(a, g1.l());
            com.gtp.go.weather.sharephoto.PhotoDetailActivity.a(a, long1, s, s1);
            return;
        } else
        {
            c.a("lishen", (new StringBuilder()).append("\u627E\u4E0D\u5230id\u4E3A").append(PhotoDetailActivity.p(a)).append("\u7684\u56FE\u7247\u3002").toString());
            a.finish();
            return;
        }
    }

    public volatile void a(Object obj, Object obj1)
    {
        a((Long)obj, (g)obj1);
    }
}
