// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.settings;

import android.view.View;
import android.widget.Toast;
import com.weather.commons.config.ConfigPrefs;
import com.weather.util.prefs.Prefs;
import com.weather.util.prefs.TwcPrefs;

// Referenced classes of package com.weather.Weather.settings:
//            AboutFragment

class this._cls0
    implements android.view.ener
{

    static final int CLICKS_TO_ACTIVATE = 7;
    static final int CLICKS_TO_REVEAL = 3;
    private int onClickCount;
    final AboutFragment this$0;

    public void onClick(View view)
    {
        onClickCount = onClickCount + 1;
        view = getActivity();
        if (onClickCount > 3 && onClickCount < 7 && view != null)
        {
            if (AboutFragment.access$100(AboutFragment.this) != null)
            {
                AboutFragment.access$100(AboutFragment.this).cancel();
            }
            AboutFragment.access$102(AboutFragment.this, Toast.makeText(view, (new StringBuilder()).append(7 - onClickCount).append(" clicks away from test mode").toString(), 0));
            AboutFragment.access$100(AboutFragment.this).show();
        }
        if (onClickCount >= 7)
        {
            if (AboutFragment.access$200(AboutFragment.this) != null)
            {
                AboutFragment.access$200(AboutFragment.this).setVisibility(0);
            }
            if (view != null)
            {
                if (AboutFragment.access$100(AboutFragment.this) != null)
                {
                    AboutFragment.access$100(AboutFragment.this).cancel();
                }
                AboutFragment.access$102(AboutFragment.this, Toast.makeText(view, "Test Mode Activated, now restart the app", 1));
                AboutFragment.access$100(AboutFragment.this).show();
            }
            TwcPrefs.getInstance().putBoolean(com.weather.util.prefs.ST_MODE, true);
            ConfigPrefs.clearAll();
        }
    }

    ()
    {
        this$0 = AboutFragment.this;
        super();
    }
}
