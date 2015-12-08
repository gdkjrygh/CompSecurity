// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.content.DialogInterface;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoDetailActivity

class g
    implements android.content.DialogInterface.OnCancelListener
{

    final PhotoDetailActivity a;

    g(PhotoDetailActivity photodetailactivity)
    {
        a = photodetailactivity;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a.finish();
    }
}
