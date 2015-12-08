// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.flow;

import android.content.Context;
import com.uservoice.uservoicesdk.Config;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.model.AccessTokenResult;
import com.uservoice.uservoicesdk.model.RequestToken;
import com.uservoice.uservoicesdk.model.User;
import com.uservoice.uservoicesdk.ui.DefaultCallback;

// Referenced classes of package com.uservoice.uservoicesdk.flow:
//            InitManager

class nit> extends DefaultCallback
{

    final lt this$1;

    public void onModel(AccessTokenResult accesstokenresult)
    {
        if (InitManager.access$100(_fld0))
        {
            return;
        } else
        {
            Session.getInstance().setAccessToken(InitManager.access$200(_fld0), accesstokenresult.getAccessToken());
            Session.getInstance().setUser((User)accesstokenresult.getModel());
            InitManager.access$300(_fld0);
            return;
        }
    }

    public volatile void onModel(Object obj)
    {
        onModel((AccessTokenResult)obj);
    }

    nit>(Context context)
    {
        this$1 = this._cls1.this;
        super(context);
    }

    // Unreferenced inner class com/uservoice/uservoicesdk/flow/InitManager$2

/* anonymous class */
    class InitManager._cls2 extends DefaultCallback
    {

        final InitManager this$0;

        public void onModel(RequestToken requesttoken)
        {
            if (InitManager.access$100(InitManager.this))
            {
                return;
            } else
            {
                Session.getInstance().setRequestToken(requesttoken);
                requesttoken = Session.getInstance().getConfig();
                User.findOrCreate(requesttoken.getEmail(), requesttoken.getName(), requesttoken.getGuid(), new InitManager._cls2._cls1(InitManager.access$200(InitManager.this)));
                return;
            }
        }

        public volatile void onModel(Object obj)
        {
            onModel((RequestToken)obj);
        }

            
            {
                this$0 = InitManager.this;
                super(context);
            }
    }

}
