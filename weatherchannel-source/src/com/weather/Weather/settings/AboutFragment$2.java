// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import com.weather.Weather.settings.testmode.TestModeFragment;
import com.weather.util.app.FragmentHelper;

// Referenced classes of package com.weather.Weather.settings:
//            AboutFragment

class this._cls0
    implements android.view.ener
{

    final AboutFragment this$0;

    public void onClick(View view)
    {
        getFragmentManager().beginTransaction().addToBackStack(getClass().getName()).commit();
        FragmentHelper.switchToNewFragment(getFragmentManager(), new TestModeFragment());
    }

    eFragment()
    {
        this$0 = AboutFragment.this;
        super();
    }
}
