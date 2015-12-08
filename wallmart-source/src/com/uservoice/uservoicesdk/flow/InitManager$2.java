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

class <init> extends DefaultCallback
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
            User.findOrCreate(requesttoken.getEmail(), requesttoken.getName(), requesttoken.getGuid(), new DefaultCallback(InitManager.access$200(InitManager.this)) {

                final InitManager._cls2 this$1;

                public void onModel(AccessTokenResult accesstokenresult)
                {
                    if (InitManager.access$100(this$0))
                    {
                        return;
                    } else
                    {
                        Session.getInstance().setAccessToken(InitManager.access$200(this$0), accesstokenresult.getAccessToken());
                        Session.getInstance().setUser((User)accesstokenresult.getModel());
                        InitManager.access$300(this$0);
                        return;
                    }
                }

                public volatile void onModel(Object obj)
                {
                    onModel((AccessTokenResult)obj);
                }

            
            {
                this$1 = InitManager._cls2.this;
                super(context);
            }
            });
            return;
        }
    }

    public volatile void onModel(Object obj)
    {
        onModel((RequestToken)obj);
    }

    <init>(Context context)
    {
        this$0 = InitManager.this;
        super(context);
    }
}
