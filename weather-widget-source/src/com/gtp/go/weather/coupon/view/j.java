// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.coupon.view;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.ListView;
import com.gtp.go.weather.sharephoto.photo.e;

// Referenced classes of package com.gtp.go.weather.coupon.view:
//            CouponsActivity

class j
    implements e
{

    final CouponsActivity a;

    j(CouponsActivity couponsactivity)
    {
        a = couponsactivity;
        super();
    }

    public void a(Drawable drawable, String s, String s1, String s2)
    {
label0:
        {
            s = (ImageView)CouponsActivity.h(a).findViewWithTag(s1);
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
    }
}
