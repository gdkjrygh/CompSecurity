// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.view.View;
import android.widget.RadioButton;
import com.gau.go.launcherex.gowidget.weather.globalview.n;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            x, PublishPhotoActivity, z

class y
    implements android.view.View.OnClickListener
{

    final WeatherBean a;
    final z b;
    final x c;

    y(x x1, WeatherBean weatherbean, z z1)
    {
        c = x1;
        a = weatherbean;
        b = z1;
        super();
    }

    public void onClick(View view)
    {
        c.a.a(a);
        if (x.a(c) != null)
        {
            x.a(c).setChecked(false);
        }
        x.a(c, b.b);
        b.b.setChecked(true);
        PublishPhotoActivity.d(c.a).a();
    }
}
