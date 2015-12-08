// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.view.View;
import com.gtp.go.weather.sharephoto.d.p;
import uk.co.senab.photoview.j;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoDetailActivity

class l
    implements j
{

    final PhotoDetailActivity a;

    l(PhotoDetailActivity photodetailactivity)
    {
        a = photodetailactivity;
        super();
    }

    public void a(View view, float f, float f1)
    {
        if (PhotoDetailActivity.a(a) == 1)
        {
            PhotoDetailActivity.b(a).e();
        }
    }
}
