// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.gtp.go.weather.sharephoto.b.g;
import com.jiubang.pla.listview.MultiColumnListView;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            e, PhotoActivity

class x
    implements e
{

    final g a;
    final PhotoActivity b;

    x(PhotoActivity photoactivity, g g)
    {
        b = photoactivity;
        a = g;
        super();
    }

    public void a(Drawable drawable, String s, String s1, String s2)
    {
label0:
        {
            s = PhotoActivity.h(b).findViewWithTag(s1);
            if (s != null)
            {
                s1 = PhotoActivity.h(b).findViewWithTag(s2);
                if (drawable == null)
                {
                    break label0;
                }
                s.setBackgroundDrawable(drawable);
                s.setVisibility(0);
                if (s1 != null)
                {
                    s1.setVisibility(4);
                }
            }
            return;
        }
        s.setBackgroundResource(0x7f0205c6);
        s.setVisibility(4);
        if (s1 != null)
        {
            s1.setVisibility(0);
        }
        PhotoActivity.a(b, a);
    }
}
