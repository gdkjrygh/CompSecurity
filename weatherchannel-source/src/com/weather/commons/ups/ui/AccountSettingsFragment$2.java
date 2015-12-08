// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.view.View;
import com.weather.util.app.FragmentHelper;

// Referenced classes of package com.weather.commons.ups.ui:
//            AccountSettingsFragment, ChangeEmailFragment

class this._cls0
    implements android.view.ngsFragment._cls2
{

    final AccountSettingsFragment this$0;

    public void onClick(View view)
    {
        view = getFragmentManager();
        if (view != null)
        {
            AccountSettingsFragment.access$202(AccountSettingsFragment.this, true);
            AccountSettingsFragment.access$302(AccountSettingsFragment.this, false);
            FragmentHelper.switchToNewFragment(view, new ChangeEmailFragment());
        }
    }

    ()
    {
        this$0 = AccountSettingsFragment.this;
        super();
    }
}
