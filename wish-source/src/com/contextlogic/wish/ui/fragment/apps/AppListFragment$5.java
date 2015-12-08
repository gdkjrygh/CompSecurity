// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.apps;

import com.contextlogic.wish.ApplicationDeepLinkConfig;
import com.contextlogic.wish.ui.activity.root.RootActivity;

// Referenced classes of package com.contextlogic.wish.ui.fragment.apps:
//            AppListFragment

class val.deepLinkConfig
    implements com.contextlogic.wish.api.service.Callback
{

    final AppListFragment this$0;
    final ApplicationDeepLinkConfig val$deepLinkConfig;

    public void onServiceFailed()
    {
        hideFragmentLoadingSpinner();
        if (val$deepLinkConfig != null)
        {
            RootActivity rootactivity = (RootActivity)getActivity();
            if (rootactivity != null)
            {
                rootactivity.processDeepLink(val$deepLinkConfig, false);
            }
        }
    }

    ack()
    {
        this$0 = final_applistfragment;
        val$deepLinkConfig = ApplicationDeepLinkConfig.this;
        super();
    }
}
