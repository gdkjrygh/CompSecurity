// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;

import com.contextlogic.wish.user.UserPreferences;
import com.facebook.Response;
import com.facebook.model.GraphUser;

// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            LoginServiceManager

class this._cls0
    implements com.facebook.ack
{

    final LoginServiceManager this$0;

    public void onCompleted(GraphUser graphuser, Response response)
    {
        if (response.getError() != null)
        {
            LoginServiceManager.access$100(LoginServiceManager.this, true, false, null);
            return;
        } else
        {
            graphuser = graphuser.getId();
            UserPreferences.setFbId(graphuser);
            LoginServiceManager.access$200(LoginServiceManager.this, graphuser, false);
            return;
        }
    }

    ()
    {
        this$0 = LoginServiceManager.this;
        super();
    }
}
