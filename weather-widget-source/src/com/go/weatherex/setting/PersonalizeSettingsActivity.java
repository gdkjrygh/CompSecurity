// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.go.weatherex.setting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.go.weatherex.framework.fragment.BaseFragmentActivity;
import com.go.weatherex.framework.fragment.g;

// Referenced classes of package com.go.weatherex.setting:
//            n

public class PersonalizeSettingsActivity extends BaseFragmentActivity
{

    private n a;
    private String b;

    public PersonalizeSettingsActivity()
    {
    }

    public static Intent a(Context context, String s)
    {
        Intent intent = new Intent(context, com/go/weatherex/setting/PersonalizeSettingsActivity);
        intent.putExtra("cityId", s);
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        return intent;
    }

    static String a(PersonalizeSettingsActivity personalizesettingsactivity)
    {
        return personalizesettingsactivity.b;
    }

    protected g b()
    {
        a = new n(this, this);
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
        setContentView(0x7f0300df);
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
