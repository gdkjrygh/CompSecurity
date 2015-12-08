// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.login;


// Referenced classes of package com.contextlogic.wish.ui.activity.login:
//            LoginActivity

class this._cls0
    implements com.contextlogic.wish.facebook.oginCallback
{

    final LoginActivity this$0;

    public void onFailure()
    {
        LoginActivity.access$1000(LoginActivity.this, true, false);
    }

    public void onSuccess()
    {
        LoginActivity.access$1300(LoginActivity.this);
    }

    ack()
    {
        this$0 = LoginActivity.this;
        super();
    }
}
