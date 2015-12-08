// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.login;


// Referenced classes of package com.contextlogic.wish.ui.fragment.login:
//            SignInFragment

class this._cls0
    implements com.contextlogic.wish.facebook.oginCallback
{

    final SignInFragment this$0;

    public void onFailure()
    {
        SignInFragment.access$400(SignInFragment.this, true, false, null);
    }

    public void onSuccess()
    {
        SignInFragment.access$700(SignInFragment.this);
    }

    ack()
    {
        this$0 = SignInFragment.this;
        super();
    }
}
