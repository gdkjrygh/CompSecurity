// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.nextlauncher.widget.weatherwidget;

import com.go.gl.view.GLView;

// Referenced classes of package com.gtp.nextlauncher.widget.weatherwidget:
//            HourlyTypeView, y, WeatherTrendView

class v
    implements com.go.gl.view.GLView.OnClickListener
{

    final HourlyTypeView a;

    v(HourlyTypeView hourlytypeview)
    {
        a = hourlytypeview;
        super();
    }

    public void onClick(GLView glview)
    {
        while (HourlyTypeView.access$000(a) != 5 || !HourlyTypeView.access$300(a).getIfHourSwitchReady() || !HourlyTypeView.access$300(a).getIfTrendSwitchReady()) 
        {
            return;
        }
        a.startDisppearAnimation();
        if (HourlyTypeView.access$400(a) == null)
        {
            HourlyTypeView.access$402(a, HourlyTypeView.access$300(a).getTrendView());
        }
        HourlyTypeView.access$400(a).startAppearAnimation();
        HourlyTypeView.access$300(a).setHourDisappearStart();
    }
}
