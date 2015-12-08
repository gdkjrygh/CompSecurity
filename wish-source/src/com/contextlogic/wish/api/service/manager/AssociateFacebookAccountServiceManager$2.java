// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.api.service.manager;

import com.contextlogic.wish.user.UserPreferences;
import com.facebook.Response;
import com.facebook.model.GraphUser;

// Referenced classes of package com.contextlogic.wish.api.service.manager:
//            AssociateFacebookAccountServiceManager

class this._cls0
    implements com.facebook.ebookAccountServiceManager._cls2
{

    final AssociateFacebookAccountServiceManager this$0;

    public void onCompleted(GraphUser graphuser, Response response)
    {
        if (response.getError() != null)
        {
            AssociateFacebookAccountServiceManager.access$100(AssociateFacebookAccountServiceManager.this, null);
            return;
        } else
        {
            graphuser = graphuser.getId();
            UserPreferences.setFbId(graphuser);
            AssociateFacebookAccountServiceManager.access$200(AssociateFacebookAccountServiceManager.this, graphuser);
            return;
        }
    }

    ()
    {
        this$0 = AssociateFacebookAccountServiceManager.this;
        super();
    }
}
