// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.widget.Toast;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoDetailActivity

class h
    implements Runnable
{

    final String a;
    final PhotoDetailActivity b;

    h(PhotoDetailActivity photodetailactivity, String s)
    {
        b = photodetailactivity;
        a = s;
        super();
    }

    public void run()
    {
        Toast.makeText(b, a, 0).show();
    }
}
