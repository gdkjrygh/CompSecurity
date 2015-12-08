// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.view.View;
import android.widget.Toast;
import com.gtp.go.weather.sharephoto.photo.a;
import com.gtp.go.weather.sharephoto.photo.ad;
import com.gtp.go.weather.sharephoto.view.UserPhotoItem;
import com.gtp.go.weather.sharephoto.view.g;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            UserPhotosActivity

class ab
    implements a
{

    final long a;
    final View b;
    final UserPhotoItem c;
    final UserPhotosActivity d;

    ab(UserPhotosActivity userphotosactivity, long l, View view, UserPhotoItem userphotoitem)
    {
        d = userphotosactivity;
        a = l;
        b = view;
        c = userphotoitem;
        super();
    }

    public void a(Long long1, Boolean boolean1)
    {
        UserPhotosActivity.d(d);
        if (boolean1.booleanValue())
        {
            UserPhotosActivity.e(d).a(a, b, c);
            UserPhotosActivity.f(d).a(d, a);
            return;
        } else
        {
            Toast.makeText(d.getApplicationContext(), 0x7f0804ad, 0).show();
            return;
        }
    }

    public volatile void a(Object obj, Object obj1)
    {
        a((Long)obj, (Boolean)obj1);
    }
}
