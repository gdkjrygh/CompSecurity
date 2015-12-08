// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.root;

import android.net.Uri;
import com.contextlogic.wish.activity.link.WishDeepLinkActivity;
import com.contextlogic.wish.api.service.LogSignupDeepLinkService;
import com.facebook.AppLinkData;

// Referenced classes of package com.contextlogic.wish.ui.activity.root:
//            RootActivity

class val.isNewUser
    implements com.facebook.pletionHandler
{

    final RootActivity this$0;
    final boolean val$isNewUser;

    public void onDeferredAppLinkDataFetched(AppLinkData applinkdata)
    {
        if (applinkdata != null && applinkdata.getTargetUri() != null)
        {
            if (val$isNewUser)
            {
                (new LogSignupDeepLinkService()).requestService(applinkdata.getTargetUri().toString(), null, null);
            } else
            {
                com.contextlogic.wish.ApplicationDeepLinkConfig applicationdeeplinkconfig = WishDeepLinkActivity.getDeepLinkTarget(applinkdata.getTargetUri());
                Uri uri = applinkdata.getTargetUri();
                if ((uri.getScheme() != null && uri.getScheme().contains(WishDeepLinkActivity.getDeepLinkProtocol()) || uri.getHost() != null && uri.getHost().contains("wish.com")) && applicationdeeplinkconfig != null)
                {
                    RootActivity rootactivity = RootActivity.this;
                    if (rootactivity != null && !rootactivity.hasModal())
                    {
                        rootactivity.processDeepLink(applicationdeeplinkconfig, false);
                        return;
                    } else
                    {
                        (new LogSignupDeepLinkService()).requestService(applinkdata.getTargetUri().toString(), null, null);
                        return;
                    }
                }
            }
        }
    }

    ty()
    {
        this$0 = final_rootactivity;
        val$isNewUser = Z.this;
        super();
    }
}
