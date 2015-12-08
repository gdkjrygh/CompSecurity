// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login.email;


// Referenced classes of package com.contextlogic.wish.ui.fragment.login.email:
//            EmailChangePasswordFragment

class val.oldPassword
    implements com.contextlogic.wish.api.service.allback
{

    final EmailChangePasswordFragment this$0;
    final String val$oldPassword;

    public void onServiceSucceeded()
    {
        EmailChangePasswordFragment.access$200(EmailChangePasswordFragment.this);
        EmailChangePasswordFragment emailchangepasswordfragment = EmailChangePasswordFragment.this;
        boolean flag;
        if (val$oldPassword == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        EmailChangePasswordFragment.access$300(emailchangepasswordfragment, flag);
        EmailChangePasswordFragment.access$400(EmailChangePasswordFragment.this);
    }

    Q()
    {
        this$0 = final_emailchangepasswordfragment;
        val$oldPassword = String.this;
        super();
    }
}
