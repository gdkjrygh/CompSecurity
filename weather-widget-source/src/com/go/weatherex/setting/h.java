// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.go.weatherex.framework.fragment.a;
import com.go.weatherex.framework.fragment.g;
import com.go.weatherex.home.a.d;

// Referenced classes of package com.go.weatherex.setting:
//            b, ba, LiveWallpaperSettingsActivity

class h extends g
{

    final LiveWallpaperSettingsActivity b;

    public h(LiveWallpaperSettingsActivity livewallpapersettingsactivity, FragmentActivity fragmentactivity)
    {
        b = livewallpapersettingsactivity;
        super(fragmentactivity);
    }

    protected void a(a a1, Class class1, Bundle bundle)
    {
    }

    public void e()
    {
        d d1 = new d();
        d1.b(a);
        d1.setArguments(d.a(""));
        b b1 = new b();
        b1.b(a);
        FragmentTransaction fragmenttransaction = a().beginTransaction();
        fragmenttransaction.add(0x7f090422, d1, com/go/weatherex/home/a/d.getName());
        fragmenttransaction.add(0x7f090422, b1, com/go/weatherex/setting/ba.getName());
        fragmenttransaction.commit();
    }
}
