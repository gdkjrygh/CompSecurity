// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.login;

import android.support.v4.app.FragmentManager;

// Referenced classes of package com.contextlogic.wish.ui.activity.login:
//            LoginActivity

class this._cls0
    implements Runnable
{

    final LoginActivity this$0;

    public void run()
    {
        try
        {
            getSupportFragmentManager().popBackStack("ModalFragment", 1);
            return;
        }
        catch (Throwable throwable)
        {
            return;
        }
    }

    ()
    {
        this$0 = LoginActivity.this;
        super();
    }
}
