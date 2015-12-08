// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login;

import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.ui.activity.login.LoginActivity;

// Referenced classes of package com.contextlogic.wish.ui.fragment.login:
//            SignupFragment

class this._cls0
    implements com.contextlogic.wish.api.service.manager.r.Callback
{

    final SignupFragment this$0;

    public void onFailure(boolean flag, boolean flag1, String s)
    {
        WishApplication.getAppInstance().resetUserData(true, flag, true, flag1, true);
        SignupFragment.access$800(SignupFragment.this);
        SignupFragment.access$600(SignupFragment.this, false, false, s);
    }

    public void onSuccess(boolean flag, com.contextlogic.wish.ui.activity.login.SignupFlow signupflow)
    {
        SignupFragment.access$800(SignupFragment.this);
        SignupFragment.access$702(SignupFragment.this, false);
        LoginActivity loginactivity = (LoginActivity)getActivity();
        if (loginactivity != null)
        {
            loginactivity.finishLogin(flag, signupflow);
        }
    }

    SignupFlow()
    {
        this$0 = SignupFragment.this;
        super();
    }
}
