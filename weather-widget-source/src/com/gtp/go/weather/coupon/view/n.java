// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.view;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ListView;
import com.gtp.go.weather.coupon.b.b;
import com.gtp.go.weather.sharephoto.photo.e;

// Referenced classes of package com.gtp.go.weather.coupon.view:
//            k, CouponsActivity

class n
    implements e
{

    final b a;
    final k b;

    n(k k1, b b1)
    {
        b = k1;
        a = b1;
        super();
    }

    public void a(Drawable drawable, String s, String s1, String s2)
    {
label0:
        {
            s = (ImageView)CouponsActivity.h(b.a).findViewWithTag(s1);
            if (s != null)
            {
                if (drawable == null)
                {
                    break label0;
                }
                s.setImageDrawable(drawable);
            }
            return;
        }
        s.setImageResource(0x7f0205c6);
        com.gtp.go.weather.coupon.view.CouponsActivity.b(b.a, a);
    }
}
