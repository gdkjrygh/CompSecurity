// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;


// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            UserFriendsServiceManager

class val.cacheResults
    implements Runnable
{

    final UserFriendsServiceManager this$0;
    final boolean val$cacheResults;

    public void run()
    {
        UserFriendsServiceManager.access$300(UserFriendsServiceManager.this, val$cacheResults);
    }

    ()
    {
        this$0 = final_userfriendsservicemanager;
        val$cacheResults = Z.this;
        super();
    }
}
