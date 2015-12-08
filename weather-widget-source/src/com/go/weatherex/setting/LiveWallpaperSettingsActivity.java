// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.os.Bundle;
import android.view.Window;
import com.go.weatherex.framework.fragment.BaseFragmentActivity;
import com.go.weatherex.framework.fragment.g;

// Referenced classes of package com.go.weatherex.setting:
//            h

public class LiveWallpaperSettingsActivity extends BaseFragmentActivity
{

    private h a;

    public LiveWallpaperSettingsActivity()
    {
    }

    protected g b()
    {
        a = new h(this, this);
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
        setContentView(0x7f0300c4);
        getWindow().setFormat(-3);
        getWindow().clearFlags(0x8000000);
        a.e();
    }
}
