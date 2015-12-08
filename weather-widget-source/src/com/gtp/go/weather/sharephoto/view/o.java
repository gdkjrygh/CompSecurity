// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.view;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.gtp.go.weather.sharephoto.d.a;
import com.gtp.go.weather.sharephoto.d.l;

// Referenced classes of package com.gtp.go.weather.sharephoto.view:
//            UserPhotoItem

class o extends l
{

    final String a;
    final UserPhotoItem b;

    o(UserPhotoItem userphotoitem, String s)
    {
        b = userphotoitem;
        a = s;
        super();
    }

    public void a(boolean flag, String s, Bitmap bitmap, String s1)
    {
        if (flag)
        {
            com.gtp.go.weather.sharephoto.d.a.a(a, bitmap);
            com.gtp.go.weather.sharephoto.view.UserPhotoItem.a(b).setImageBitmap(bitmap);
        }
    }
}
