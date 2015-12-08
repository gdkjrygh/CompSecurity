// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.youtube.app.YouTubeApplication;
import com.google.android.apps.youtube.app.ax;
import com.google.android.apps.youtube.app.honeycomb.phone.NewVersionAvailableActivity;
import com.google.android.apps.youtube.core.utils.l;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb:
//            Shell

abstract class o extends Activity
{

    private o()
    {
    }

    o(byte byte0)
    {
        this();
    }

    private Intent d()
    {
        Intent intent = new Intent(getIntent());
        Class class1;
        if (l.b(this))
        {
            class1 = a();
        } else
        {
            class1 = a();
        }
        intent.setComponent(new ComponentName(this, class1));
        intent.putExtra("alias", getClass().getName());
        intent.setFlags(b());
        return intent;
    }

    protected abstract Class a();

    protected int b()
    {
        return 0x20000000;
    }

    protected boolean c()
    {
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        YouTubeApplication youtubeapplication = (YouTubeApplication)getApplication();
        bundle = youtubeapplication.d().aP();
        Shell.a(youtubeapplication, youtubeapplication.d().b(), bundle);
        long l1 = System.currentTimeMillis();
        long l2 = Shell.a();
        boolean flag;
        if (Shell.b() || Shell.c() && l1 - l2 > Shell.d() && c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Intent intent = new Intent(getIntent());
            intent.setComponent(new ComponentName(this, com/google/android/apps/youtube/app/honeycomb/phone/NewVersionAvailableActivity));
            intent.setFlags(0x10000000);
            if (!Shell.b())
            {
                intent.putExtra("forward_intent", d());
            }
            Shell.a(0x7fffffffffffffffL);
            bundle.edit().putLong("upgrade_prompt_shown_millis", System.currentTimeMillis()).apply();
            startActivity(intent);
        } else
        {
            startActivity(d());
        }
        finish();
    }
}
