// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;

import java.util.HashMap;

// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            FacebookFriendInfoServiceManager

class val.friendMapping
    implements Runnable
{

    final FacebookFriendInfoServiceManager this$0;
    final HashMap val$friendMapping;

    public void run()
    {
        FacebookFriendInfoServiceManager.access$400(FacebookFriendInfoServiceManager.this, val$friendMapping);
    }

    ()
    {
        this$0 = final_facebookfriendinfoservicemanager;
        val$friendMapping = HashMap.this;
        super();
    }
}
