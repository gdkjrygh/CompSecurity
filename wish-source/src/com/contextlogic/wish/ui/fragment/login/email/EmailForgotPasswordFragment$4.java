// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login.email;

import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.contextlogic.wish.ui.fragment.login.email:
//            EmailForgotPasswordFragment

class this._cls0
    implements com.contextlogic.wish.api.service.llback
{

    final EmailForgotPasswordFragment this$0;

    public void onServiceFailed(String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = s;
            if (getActivity() != null)
            {
                s1 = getActivity().getString(0x7f060149);
            }
        }
        EmailForgotPasswordFragment.access$200(EmailForgotPasswordFragment.this);
        EmailForgotPasswordFragment.access$500(EmailForgotPasswordFragment.this, s1);
    }

    Q()
    {
        this$0 = EmailForgotPasswordFragment.this;
        super();
    }
}
