// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.flow;

import com.uservoice.uservoicesdk.model.User;
import com.uservoice.uservoicesdk.rest.Callback;
import com.uservoice.uservoicesdk.rest.RestResult;

// Referenced classes of package com.uservoice.uservoicesdk.flow:
//            SigninManager

class this._cls0 extends Callback
{

    final SigninManager this$0;

    public void onError(RestResult restresult)
    {
        SigninManager.access$100(SigninManager.this);
    }

    public void onModel(User user)
    {
        SigninManager.access$000(SigninManager.this);
    }

    public volatile void onModel(Object obj)
    {
        onModel((User)obj);
    }

    ()
    {
        this$0 = SigninManager.this;
        super();
    }
}
