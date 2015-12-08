// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login;

import com.contextlogic.wish.ui.activity.login.LoginActivity;
import com.contextlogic.wish.user.LoggedInUser;

// Referenced classes of package com.contextlogic.wish.ui.fragment.login:
//            SignupFragment

class this._cls0
    implements com.contextlogic.wish.api.service.manager.er.Callback
{

    final SignupFragment this$0;

    public void onFailure(boolean flag, boolean flag1, String s)
    {
        SignupFragment.access$600(SignupFragment.this, flag, flag1, s);
    }

    public void onSuccess(boolean flag, com.contextlogic.wish.ui.activity.login.hSignupFlow hsignupflow)
    {
        SignupFragment.access$702(SignupFragment.this, false);
        if (LoggedInUser.getInstance().getCurrentUser() != null)
        {
            LoginActivity loginactivity = (LoginActivity)getActivity();
            if (loginactivity != null)
            {
                loginactivity.finishLogin(flag, hsignupflow);
            }
        }
    }

    hSignupFlow()
    {
        this$0 = SignupFragment.this;
        super();
    }
}
