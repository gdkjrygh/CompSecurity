// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto;

import android.view.View;
import android.view.animation.Animation;
import com.gau.go.launcherex.gowidget.weather.util.b;

// Referenced classes of package com.gtp.go.weather.sharephoto:
//            PhotoDetailActivity

class o extends b
{

    final PhotoDetailActivity a;

    o(PhotoDetailActivity photodetailactivity)
    {
        a = photodetailactivity;
        super();
    }

    public void onAnimationEnd(Animation animation)
    {
        PhotoDetailActivity.k(a).setEnabled(true);
        PhotoDetailActivity.k(a).setVisibility(8);
    }

    public void onAnimationStart(Animation animation)
    {
        PhotoDetailActivity.k(a).setEnabled(false);
    }
}
