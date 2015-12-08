// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login;


// Referenced classes of package com.contextlogic.wish.ui.fragment.login:
//            SignupFragment

class this._cls0
    implements com.contextlogic.wish.facebook.oginCallback
{

    final SignupFragment this$0;

    public void onFailure()
    {
        SignupFragment.access$600(SignupFragment.this, true, false, null);
    }

    public void onSuccess()
    {
        SignupFragment.access$900(SignupFragment.this);
    }

    ack()
    {
        this$0 = SignupFragment.this;
        super();
    }
}
