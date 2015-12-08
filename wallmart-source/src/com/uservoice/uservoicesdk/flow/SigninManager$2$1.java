// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk.flow;

import android.content.Context;
import com.uservoice.uservoicesdk.Session;
import com.uservoice.uservoicesdk.babayaga.Babayaga;
import com.uservoice.uservoicesdk.model.AccessTokenResult;
import com.uservoice.uservoicesdk.model.RequestToken;
import com.uservoice.uservoicesdk.model.User;
import com.uservoice.uservoicesdk.ui.DefaultCallback;

// Referenced classes of package com.uservoice.uservoicesdk.flow:
//            SigninManager

class t> extends DefaultCallback
{

    final  this$1;

    public void onModel(AccessTokenResult accesstokenresult)
    {
        Session.getInstance().setUser((User)accesstokenresult.getModel());
        Session.getInstance().setAccessToken(SigninManager.access$400(_fld0), accesstokenresult.getAccessToken());
        Babayaga.track(com.uservoice.uservoicesdk.babayaga.NTIFY);
        SigninManager.access$500(_fld0).run();
    }

    public volatile void onModel(Object obj)
    {
        onModel((AccessTokenResult)obj);
    }

    t>(Context context)
    {
        this$1 = this._cls1.this;
        super(context);
    }

    // Unreferenced inner class com/uservoice/uservoicesdk/flow/SigninManager$2

/* anonymous class */
    class SigninManager._cls2 extends DefaultCallback
    {

        final SigninManager this$0;

        public void onModel(RequestToken requesttoken)
        {
            Session.getInstance().setRequestToken(requesttoken);
            User.findOrCreate(SigninManager.access$200(SigninManager.this), SigninManager.access$300(SigninManager.this), new SigninManager._cls2._cls1(SigninManager.access$400(SigninManager.this)));
        }

        public volatile void onModel(Object obj)
        {
            onModel((RequestToken)obj);
        }

            
            {
                this$0 = SigninManager.this;
                super(context);
            }
    }

}
