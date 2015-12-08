// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.viewframe.viewholder.b;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            k, EditPhotoActivity

class l extends b
    implements android.view.View.OnClickListener
{

    TextView a;
    ImageView b;
    ResolveInfo c;
    int d;
    final k g;

    public l(k k1, Context context)
    {
        g = k1;
        super(context);
        d = 1;
        e = k.a(k1).getLayoutInflater().inflate(0x7f0300fc, null);
        e.setOnClickListener(this);
        a = (TextView)b(0x7f09011e);
        b = (ImageView)b(0x7f09011d);
    }

    void a(ResolveInfo resolveinfo)
    {
        c = resolveinfo;
        a.setText(resolveinfo.activityInfo.loadLabel(com.gtp.go.weather.sharephoto.takephoto.k.b(g)));
        b.setImageDrawable(resolveinfo.activityInfo.loadIcon(com.gtp.go.weather.sharephoto.takephoto.k.b(g)).mutate());
    }

    public void onClick(View view)
    {
        view = EditPhotoActivity.a(k.c(g), d, c.activityInfo.packageName, c.activityInfo.name);
        k.d(g).startActivity(view);
        g.dismiss();
    }
}
