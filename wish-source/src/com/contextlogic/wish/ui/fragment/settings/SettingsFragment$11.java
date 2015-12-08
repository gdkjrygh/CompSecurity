// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.settings;

import android.content.DialogInterface;
import com.contextlogic.wish.WishApplication;

// Referenced classes of package com.contextlogic.wish.ui.fragment.settings:
//            SettingsFragment

class this._cls0
    implements android.content.ickListener
{

    final SettingsFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        WishApplication.getAppInstance().clearAllNotifications();
        WishApplication.getAppInstance().logout(getActivity(), false, false, true);
    }

    ()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
