// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.view.View;
import com.gtp.go.weather.sharephoto.b.k;
import com.gtp.go.weather.sharephoto.takephoto.aa;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            l, PhotoActivity

class m
    implements android.view.View.OnClickListener
{

    final k a;
    final l b;

    m(l l1, k k1)
    {
        b = l1;
        a = k1;
        super();
    }

    public void onClick(View view)
    {
        PhotoActivity.a(b.a).setVisibility(8);
        if (a.c() == 1)
        {
            PhotoActivity.e(b.a).a();
        }
    }
}
