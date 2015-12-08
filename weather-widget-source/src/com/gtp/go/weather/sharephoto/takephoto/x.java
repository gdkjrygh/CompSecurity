// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import java.util.List;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            PublishPhotoActivity, z, y

class x extends BaseAdapter
{

    final PublishPhotoActivity a;
    private RadioButton b;

    public x(PublishPhotoActivity publishphotoactivity)
    {
        a = publishphotoactivity;
        super();
        b = null;
    }

    static RadioButton a(x x1)
    {
        return x1.b;
    }

    static RadioButton a(x x1, RadioButton radiobutton)
    {
        x1.b = radiobutton;
        return radiobutton;
    }

    public int getCount()
    {
        return PublishPhotoActivity.b(a).size();
    }

    public Object getItem(int i)
    {
        return PublishPhotoActivity.b(a).get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        WeatherBean weatherbean;
        if (view == null)
        {
            viewgroup = new z(this);
            view = ((z) (viewgroup)).a;
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (z)view.getTag();
        }
        weatherbean = (WeatherBean)PublishPhotoActivity.b(a).get(i);
        ((z) (viewgroup)).c.setText(weatherbean.d());
        ((z) (viewgroup)).b.setId(i);
        if (!TextUtils.isEmpty(weatherbean.c()) && PublishPhotoActivity.c(a) != null && weatherbean.c().equals(PublishPhotoActivity.c(a).c()))
        {
            b = ((z) (viewgroup)).b;
            ((z) (viewgroup)).b.setChecked(true);
        } else
        {
            ((z) (viewgroup)).b.setChecked(false);
        }
        ((z) (viewgroup)).a.setOnClickListener(new y(this, weatherbean, viewgroup));
        return view;
    }
}
