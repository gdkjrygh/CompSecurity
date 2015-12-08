// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.home.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.gau.go.launcherex.gowidget.framework.GoWidgetApplication;
import com.gau.go.launcherex.gowidget.weather.c.c;
import com.gau.go.launcherex.gowidget.weather.c.g;
import com.gau.go.launcherex.gowidget.weather.model.NowBean;
import com.gau.go.launcherex.gowidget.weather.model.WeatherBean;
import com.gau.go.launcherex.gowidget.weather.util.f;
import com.gau.go.launcherex.gowidget.weather.util.r;
import com.go.weatherex.framework.fragment.a;

// Referenced classes of package com.go.weatherex.home.a:
//            c

public class d extends a
{

    private ImageView a;
    private Bitmap b;

    public d()
    {
    }

    private int a(int i, boolean flag)
    {
        i;
        JVM INSTR tableswitch 1 8: default 48
    //                   1 122
    //                   2 55
    //                   3 62
    //                   4 72
    //                   5 82
    //                   6 92
    //                   7 102
    //                   8 112;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (!flag) goto _L11; else goto _L10
_L10:
        return 0x7f0201f1;
_L3:
        if (!flag)
        {
            return 0x7f0201f2;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        return !flag ? 0x7f0201e8 : 0x7f0201e7;
_L5:
        return !flag ? 0x7f0201ec : 0x7f0201eb;
_L6:
        return !flag ? 0x7f0201f0 : 0x7f0201ef;
_L7:
        return !flag ? 0x7f0201ea : 0x7f0201e9;
_L8:
        return !flag ? 0x7f0201ee : 0x7f0201ed;
_L9:
        return !flag ? 0x7f0201f4 : 0x7f0201f3;
_L2:
        if (!flag)
        {
            return 0x7f0201f2;
        }
        if (true) goto _L10; else goto _L11
_L11:
        return 0x7f0201f2;
    }

    public static Bundle a(String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("cityId", s);
        return bundle;
    }

    public void onActivityCreated(Bundle bundle)
    {
        boolean flag = true;
        super.onActivityCreated(bundle);
        bundle = getArguments();
        Object obj;
        c c1;
        int i;
        if (bundle != null)
        {
            bundle = bundle.getString("cityId");
        } else
        {
            bundle = null;
        }
        obj = bundle;
        if (bundle == null)
        {
            obj = "";
        }
        c1 = c.a(getActivity().getApplicationContext());
        bundle = c1.g();
        obj = c1.h().a(((String) (obj)));
        if (obj != null)
        {
            i = ((WeatherBean) (obj)).l.d();
            String s = ((WeatherBean) (obj)).l.j();
            String s1 = ((WeatherBean) (obj)).l.k();
            if (GoWidgetApplication.b(getActivity().getApplicationContext()).b() && bundle.d())
            {
                flag = r.a(s, s1, bundle.b(((WeatherBean) (obj)).l.n()));
            } else
            {
                flag = r.a(s, s1);
            }
        } else
        {
            i = 1;
        }
        bundle = new android.graphics.BitmapFactory.Options();
        bundle.inSampleSize = 3;
        bundle.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        b = BitmapFactory.decodeResource(getResources(), a(i, flag), bundle);
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        bundle = com.go.weatherex.home.a.c.a(getActivity().getApplicationContext(), b, 15);
        if (bundle == null) goto _L2; else goto _L1
_L1:
        try
        {
            b.recycle();
            b = bundle;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            if (b != null && !b.isRecycled())
            {
                b.recycle();
                b = null;
            }
        }
_L3:
        a = (ImageView)c(0x7f0902e1);
        if (b != null)
        {
            a.setImageBitmap(b);
        }
        return;
_L2:
        ((FrameLayout)c(0x7f0902e0)).setForeground(new ColorDrawable(Color.argb(90, 0, 0, 0)));
        break MISSING_BLOCK_LABEL_211;
        ((FrameLayout)c(0x7f0902e0)).setForeground(new ColorDrawable(Color.argb(90, 0, 0, 0)));
          goto _L3
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030080, viewgroup, false);
    }

    public void onDestroy()
    {
        super.onDestroy();
        if (b != null && !b.isRecycled())
        {
            b.recycle();
            b = null;
        }
    }
}
