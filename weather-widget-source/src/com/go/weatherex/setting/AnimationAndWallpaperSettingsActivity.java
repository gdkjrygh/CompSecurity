// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.go.weatherex.framework.fragment.BaseFragmentActivity;
import com.go.weatherex.framework.fragment.g;

// Referenced classes of package com.go.weatherex.setting:
//            a

public class AnimationAndWallpaperSettingsActivity extends BaseFragmentActivity
{

    private a a;
    private String b;

    public AnimationAndWallpaperSettingsActivity()
    {
    }

    static String a(AnimationAndWallpaperSettingsActivity animationandwallpapersettingsactivity)
    {
        return animationandwallpapersettingsactivity.b;
    }

    protected g b()
    {
        a = new a(this, this);
        return a;
    }

    public void onBackPressed()
    {
        if (a.b())
        {
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001a);
        getWindow().setFormat(-3);
        getWindow().clearFlags(0x8000000);
        bundle = getIntent();
        if (bundle != null)
        {
            b = bundle.getStringExtra("cityId");
        }
        a.e();
    }
}
