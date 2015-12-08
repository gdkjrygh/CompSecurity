// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login;

import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.ui.activity.login.LoginActivity;

// Referenced classes of package com.contextlogic.wish.ui.fragment.login:
//            SignInFragment

class this._cls0
    implements com.contextlogic.wish.api.service.manager.r.Callback
{

    final SignInFragment this$0;

    public void onFailure(boolean flag, boolean flag1, String s)
    {
        WishApplication.getAppInstance().resetUserData(true, flag, true, flag1, true);
        SignInFragment.access$600(SignInFragment.this);
        SignInFragment.access$400(SignInFragment.this, false, false, s);
    }

    public void onSuccess(boolean flag, com.contextlogic.wish.ui.activity.login.SignupFlow signupflow)
    {
        SignInFragment.access$600(SignInFragment.this);
        SignInFragment.access$502(SignInFragment.this, false);
        LoginActivity loginactivity = (LoginActivity)getActivity();
        if (loginactivity != null)
        {
            loginactivity.finishLogin(flag, signupflow);
        }
    }

    SignupFlow()
    {
        this$0 = SignInFragment.this;
        super();
    }
}
