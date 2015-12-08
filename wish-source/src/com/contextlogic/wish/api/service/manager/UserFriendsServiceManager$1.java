// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;

import com.contextlogic.wish.http.StringHttpResponseHandler;

// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            UserFriendsServiceManager

class this._cls0 extends StringHttpResponseHandler
{

    final UserFriendsServiceManager this$0;

    public void onFailure(Throwable throwable, String s)
    {
        UserFriendsServiceManager.access$000(UserFriendsServiceManager.this, false);
    }

    public void onSuccess(String s)
    {
        processFriendJs(s);
    }

    ()
    {
        this$0 = UserFriendsServiceManager.this;
        super();
    }
}
