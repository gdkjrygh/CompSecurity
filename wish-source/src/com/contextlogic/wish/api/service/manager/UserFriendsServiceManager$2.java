// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;

import com.facebook.Response;
import java.util.List;

// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            UserFriendsServiceManager

class val.cacheResults
    implements com.facebook.k
{

    final UserFriendsServiceManager this$0;
    final boolean val$cacheResults;

    public void onCompleted(List list, Response response)
    {
        if (response.getError() != null)
        {
            UserFriendsServiceManager.access$100(UserFriendsServiceManager.this);
            return;
        } else
        {
            UserFriendsServiceManager.access$200(UserFriendsServiceManager.this, list, val$cacheResults);
            return;
        }
    }

    ()
    {
        this$0 = final_userfriendsservicemanager;
        val$cacheResults = Z.this;
        super();
    }
}
