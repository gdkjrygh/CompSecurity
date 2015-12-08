// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.SharedPreferences;
import com.gau.go.launcherex.gowidget.weather.globalview.z;
import com.go.weatherex.framework.fragment.a;

// Referenced classes of package com.go.weatherex.setting:
//            bz

final class ca
    implements z
{

    final SharedPreferences a;
    final a b;

    ca(SharedPreferences sharedpreferences, a a1)
    {
        a = sharedpreferences;
        b = a1;
        super();
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            android.content.SharedPreferences.Editor editor = a.edit();
            editor.putBoolean("key_wear_is_choose_city_tips_shown", true);
            editor.commit();
            bz.b(b);
        }
    }
}
