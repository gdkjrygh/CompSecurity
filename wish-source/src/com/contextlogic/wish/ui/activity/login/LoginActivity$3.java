// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.login;

import android.view.View;
import com.contextlogic.wish.ui.fragment.developer.LoginDeveloperSettingsFragment;

// Referenced classes of package com.contextlogic.wish.ui.activity.login:
//            LoginActivity

class this._cls0
    implements android.view.ener
{

    final LoginActivity this$0;

    public void onClick(View view)
    {
        view = new LoginDeveloperSettingsFragment();
        setModalContentFragment(view, true);
    }

    erSettingsFragment()
    {
        this$0 = LoginActivity.this;
        super();
    }
}
