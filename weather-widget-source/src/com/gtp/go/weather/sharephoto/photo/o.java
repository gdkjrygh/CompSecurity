// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.jiubang.pla.listview.MultiColumnListView;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            e, PhotoActivity

class o
    implements e
{

    final PhotoActivity a;

    o(PhotoActivity photoactivity)
    {
        a = photoactivity;
        super();
    }

    public void a(Drawable drawable, String s, String s1, String s2)
    {
        s = PhotoActivity.h(a).findViewWithTag(s1);
        if (s != null)
        {
            s1 = PhotoActivity.h(a).findViewWithTag(s2);
            if (drawable != null)
            {
                if (s1 != null)
                {
                    s1.setVisibility(4);
                }
                s.setVisibility(0);
                s.setBackgroundDrawable(drawable);
            } else
            {
                s.setBackgroundResource(0x7f0205c6);
                s.setVisibility(4);
                if (s1 != null)
                {
                    s1.setVisibility(0);
                    return;
                }
            }
        }
    }
}
