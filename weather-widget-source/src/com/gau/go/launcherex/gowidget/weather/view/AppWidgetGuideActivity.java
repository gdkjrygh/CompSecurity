// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.language.GoWeatherEXActivity;
import com.go.weatherex.themestore.an;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            p

public class AppWidgetGuideActivity extends GoWeatherEXActivity
    implements android.view.View.OnClickListener
{

    private View a;
    private View b;
    private an c;

    public AppWidgetGuideActivity()
    {
    }

    private void a(ImageView imageview)
    {
        int i = (int)((float)imageview.getWidth() / 0.6033058F);
        imageview.getLayoutParams().height = i;
        imageview.requestLayout();
    }

    static void a(AppWidgetGuideActivity appwidgetguideactivity, ImageView imageview)
    {
        appwidgetguideactivity.a(imageview);
    }

    public void onClick(View view)
    {
        if (view.equals(c.a))
        {
            finish();
        } else
        if (view.equals(b))
        {
            view = new Intent("android.intent.action.MAIN");
            view.addCategory("android.intent.category.HOME");
            startActivity(view);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030030);
        getWindow().clearFlags(0x8000000);
        c = new an(this, findViewById(0x7f090050));
        c.b.setText(0x7f080541);
        c.b().setBackgroundResource(0x7f0205a9);
        c.g.setVisibility(8);
        c.c.setVisibility(8);
        c.d.setVisibility(8);
        c.a.setOnClickListener(this);
        b = findViewById(0x7f0901b4);
        b.setOnClickListener(this);
        a = findViewById(0x7f0901a9);
        a.post(new p(this));
    }
}
