// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.gtp.go.weather.sharephoto.award.o;
import com.gtp.go.weather.sharephoto.b.d;
import com.gtp.go.weather.sharephoto.b.k;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            PhotoActivity, m

class l extends o
{

    final PhotoActivity a;

    l(PhotoActivity photoactivity)
    {
        a = photoactivity;
        super();
    }

    public void a(List list)
    {
label0:
        {
            if (PhotoActivity.a(a).getVisibility() != 0 || list == null || list.isEmpty())
            {
                break label0;
            }
            list = list.iterator();
            d d1;
            do
            {
                if (!list.hasNext())
                {
                    break label0;
                }
                d1 = (d)list.next();
            } while (PhotoActivity.b(a) == null || PhotoActivity.b(a).f() != d1.b());
            PhotoActivity.a(a).setVisibility(8);
            PhotoActivity.b(a).a(false);
            PhotoActivity.c(a).a(PhotoActivity.b(a));
        }
    }

    public void b(List list)
    {
        if (list != null && !list.isEmpty())
        {
            list = (k)list.get(0);
            if (list != null && list.a())
            {
                String s = list.e();
                if (!TextUtils.isEmpty(s))
                {
                    PhotoActivity.a(a, list);
                    PhotoActivity.a(a).setVisibility(0);
                    PhotoActivity.b(a).a(false);
                    PhotoActivity.c(a).a(PhotoActivity.b(a));
                    com.gtp.go.weather.sharephoto.photo.PhotoActivity.d(a).setText(s);
                    com.gtp.go.weather.sharephoto.photo.PhotoActivity.d(a).setOnClickListener(new m(this, list));
                }
            }
        }
    }
}
