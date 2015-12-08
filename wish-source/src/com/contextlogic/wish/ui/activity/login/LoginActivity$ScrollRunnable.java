// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.login;


// Referenced classes of package com.contextlogic.wish.ui.activity.login:
//            LoginActivity

private class <init>
    implements Runnable
{

    final LoginActivity this$0;

    private void scrollComplete()
    {
        LoginActivity.access$1502(LoginActivity.this, false);
        LoginActivity.access$1800(LoginActivity.this, 30L);
    }

    public void run()
    {
        if (LoginActivity.access$1500(LoginActivity.this))
        {
            return;
        }
        LoginActivity.access$1502(LoginActivity.this, true);
        LoginActivity.access$1600(LoginActivity.this);
        if (!LoginActivity.access$1700(LoginActivity.this))
        {
            stopScroll();
            return;
        } else
        {
            scrollComplete();
            return;
        }
    }

    private ()
    {
        this$0 = LoginActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
