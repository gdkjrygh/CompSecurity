// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.content.DialogInterface;
import com.gtp.go.weather.sharephoto.d.p;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoDetailActivity

class i
    implements android.content.DialogInterface.OnShowListener
{

    final PhotoDetailActivity a;

    i(PhotoDetailActivity photodetailactivity)
    {
        a = photodetailactivity;
        super();
    }

    public void onShow(DialogInterface dialoginterface)
    {
        PhotoDetailActivity.b(a).f();
    }
}
