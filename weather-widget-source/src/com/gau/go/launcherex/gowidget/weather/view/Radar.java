// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            ae

public class Radar extends RelativeLayout
{

    private ImageView a;

    public Radar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    static ImageView a(Radar radar)
    {
        return radar.a;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (ImageView)findViewById(0x7f0904d4);
        post(new ae(this));
    }
}
