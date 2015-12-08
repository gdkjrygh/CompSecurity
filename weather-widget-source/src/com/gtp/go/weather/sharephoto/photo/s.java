// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.photo;

import android.widget.Toast;
import com.gau.go.launcherex.gowidget.weather.globalview.c;

// Referenced classes of package com.gtp.go.weather.sharephoto.photo:
//            PhotoActivity

class s
    implements c
{

    final PhotoActivity a;

    s(PhotoActivity photoactivity)
    {
        a = photoactivity;
        super();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            Toast.makeText(a.getApplicationContext(), a.getString(0x7f080484), 0).show();
            PhotoActivity.a(a, true);
        }
    }
}
