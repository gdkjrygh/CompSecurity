// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.settings;

import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.api.data.WishSettingsSpec;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.ui.fragment.developer.DeveloperSettingsFragment;
import com.contextlogic.wish.ui.fragment.login.email.EmailChangePasswordFragment;
import com.contextlogic.wish.ui.fragment.signup.SignupUpdateProfileFragment;
import com.contextlogic.wish.user.UserStatusManager;
import java.util.ArrayList;

// Referenced classes of package com.contextlogic.wish.ui.fragment.settings:
//            SettingsFragment, SettingsAdapter, SettingsItem

class this._cls0
    implements android.widget.lickListener
{

    final SettingsFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = SettingsItem.resolveIndexForSet(i, SettingsFragment.access$000(SettingsFragment.this).getCurrentMenuSet());
        ..SwitchMap.com.contextlogic.wish.ui.fragment.settings.SettingsItem[adapterview.ordinal()];
        JVM INSTR tableswitch 1 6: default 60
    //                   1 61
    //                   2 104
    //                   3 144
    //                   4 162
    //                   5 180
    //                   6 204;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L5:
        break MISSING_BLOCK_LABEL_162;
_L6:
        break MISSING_BLOCK_LABEL_180;
_L1:
        break; /* Loop/switch isn't completed */
_L7:
        break MISSING_BLOCK_LABEL_204;
_L8:
        return;
_L2:
        if ((adapterview = WishDeepLinkActivity.getDeepLinkTarget(Uri.parse(((WishSettingsSpec)UserStatusManager.getInstance().getSettings().get(i)).action()))) != null)
        {
            ((RootActivity)getActivity()).processDeepLink(adapterview, true);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        trackClick(com.contextlogic.wish.analytics..ChangePasswordSelect);
        adapterview = new EmailChangePasswordFragment();
        view = (RootActivity)getActivity();
        if (view != null)
        {
            view.setContentFragment(adapterview, false);
            return;
        }
        if (true) goto _L8; else goto _L4
_L4:
        trackClick(com.contextlogic.wish.analytics..Logout);
        SettingsFragment.access$100(SettingsFragment.this);
        return;
        trackClick(com.contextlogic.wish.analytics..DeleteAccount);
        SettingsFragment.access$200(SettingsFragment.this);
        return;
        adapterview = new DeveloperSettingsFragment();
        ((RootActivity)getActivity()).setModalContentFragment(adapterview, true);
        return;
        adapterview = new SignupUpdateProfileFragment();
        ((RootActivity)getActivity()).setModalContentFragment(adapterview, true);
        return;
    }

    agment()
    {
        this$0 = SettingsFragment.this;
        super();
    }
}
