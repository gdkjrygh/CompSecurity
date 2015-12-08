// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.settings;

import android.support.v4.app.FragmentActivity;
import com.contextlogic.wish.ui.components.alert.PopupAlertDialog;

// Referenced classes of package com.contextlogic.wish.ui.fragment.settings:
//            SettingsFragment

class this._cls0
    implements com.contextlogic.wish.api.service.e.FailureCallback
{

    final SettingsFragment this$0;

    public void onServiceFailed(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = getActivity().getString(0x7f060111);
        }
        SettingsFragment.access$600(SettingsFragment.this);
        PopupAlertDialog.showError(getActivity(), getActivity().getString(0x7f06030d), s1);
    }

    Callback()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
