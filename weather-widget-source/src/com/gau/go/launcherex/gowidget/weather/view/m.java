// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.view;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.List;

// Referenced classes of package com.gau.go.launcherex.gowidget.weather.view:
//            l, AppListActivity

class m
    implements android.view.View.OnClickListener
{

    View a;
    ImageView b;
    TextView c;
    CheckBox d;
    final l e;
    private int f;

    m(l l1)
    {
        e = l1;
        super();
        a = l.a(l1).inflate(0x7f03001d, null);
        b = (ImageView)a.findViewById(0x7f09011d);
        c = (TextView)a.findViewById(0x7f09011e);
        d = (CheckBox)a.findViewById(0x7f09011f);
        a.setOnClickListener(this);
    }

    void a(int i)
    {
        f = i;
        Object obj = ((ResolveInfo)l.b(e).get(i)).activityInfo.loadIcon(e.a.getPackageManager()).mutate();
        if (obj != null)
        {
            b.setImageDrawable(((Drawable) (obj)));
        }
        obj = ((ResolveInfo)l.b(e).get(i)).activityInfo.loadLabel(e.a.getPackageManager()).toString();
        if (!((String) (obj)).equals(""))
        {
            c.setText(((CharSequence) (obj)));
        }
        if (AppListActivity.g(e.a) != null && AppListActivity.g(e.a).equals((new StringBuilder()).append(((ResolveInfo)l.b(e).get(i)).activityInfo.packageName).append("#").append(((ResolveInfo)l.b(e).get(i)).activityInfo.name).toString()))
        {
            d.setChecked(true);
            return;
        } else
        {
            d.setChecked(false);
            return;
        }
    }

    public void onClick(View view)
    {
        if (!TextUtils.isEmpty(AppListActivity.g(e.a)) && (new StringBuilder()).append(((ResolveInfo)AppListActivity.b(e.a).get(f)).activityInfo.packageName).append("#").append(((ResolveInfo)AppListActivity.b(e.a).get(f)).activityInfo.name).toString().equals(AppListActivity.g(e.a)))
        {
            Toast.makeText(e.a, e.a.getString(0x7f080453), 0).show();
            return;
        } else
        {
            AppListActivity.a(e.a, f);
            return;
        }
    }
}
