// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login.email;


// Referenced classes of package com.contextlogic.wish.ui.fragment.login.email:
//            EmailForgotPasswordFragment

class this._cls0
    implements com.contextlogic.wish.api.service.llback
{

    final EmailForgotPasswordFragment this$0;

    public void onServiceSucceeded(String s)
    {
        EmailForgotPasswordFragment.access$200(EmailForgotPasswordFragment.this);
        EmailForgotPasswordFragment.access$300(EmailForgotPasswordFragment.this, s);
        EmailForgotPasswordFragment.access$400(EmailForgotPasswordFragment.this);
    }

    Q()
    {
        this$0 = EmailForgotPasswordFragment.this;
        super();
    }
}
