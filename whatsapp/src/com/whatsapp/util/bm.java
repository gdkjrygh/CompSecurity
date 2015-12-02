// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.graphics.Bitmap;
import android.support.v4.util.LruCache;
import android.widget.ImageView;
import com.whatsapp.protocol.c4;
import java.util.HashMap;
import java.util.HashSet;

// Referenced classes of package com.whatsapp.util:
//            aw, y, Log

class bm
    implements Runnable
{

    private c4 a;
    private ImageView b;
    private aw c;
    final y d;
    private Bitmap e;

    public bm(y y1, Bitmap bitmap, ImageView imageview, c4 c4_1, aw aw1)
    {
        d = y1;
        super();
        e = bitmap;
        b = imageview;
        a = c4_1;
        c = aw1;
    }

    public void run()
    {
label0:
        {
            if (b.getTag() != null && b.getTag().equals(a.y))
            {
                c.a(b, e, a);
                y.a(d).remove(a.y);
                if (e == null)
                {
                    break label0;
                }
                y.c(d).put(a.y, e);
                y.d(d).add(a.y);
                if (!Log.f)
                {
                    break label0;
                }
            }
            if (e != null)
            {
                e.recycle();
            }
        }
    }
}
