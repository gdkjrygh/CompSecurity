// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.graphics.drawable.AnimationDrawable;
import android.widget.ImageView;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            Radar

class ae
    implements Runnable
{

    final Radar a;

    ae(Radar radar)
    {
        a = radar;
        super();
    }

    public void run()
    {
        AnimationDrawable animationdrawable = (AnimationDrawable)Radar.a(a).getBackground();
        if (animationdrawable != null)
        {
            animationdrawable.start();
        }
    }
}
