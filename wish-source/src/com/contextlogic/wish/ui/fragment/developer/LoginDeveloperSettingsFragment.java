// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.developer;

import android.view.View;
import com.contextlogic.wish.ui.components.navigation.WishNavigationBar;
import com.contextlogic.wish.ui.fragment.base.BaseLoginContentFragment;

// Referenced classes of package com.contextlogic.wish.ui.fragment.developer:
//            DeveloperHelper

public class LoginDeveloperSettingsFragment extends BaseLoginContentFragment
{

    public LoginDeveloperSettingsFragment()
    {
    }

    protected com.contextlogic.wish.analytics.Analytics.PageViewType getAnalyticsPageViewType()
    {
        return com.contextlogic.wish.analytics.Analytics.PageViewType.DeveloperSettings;
    }

    protected int getLayoutResourceId()
    {
        return 0x7f03004c;
    }

    protected void initializeUi(View view)
    {
        getNavigationBar().setTitle(getString(0x7f060125));
        DeveloperHelper.initDeveloperSettingsFragment(getActivity(), view);
    }
}
