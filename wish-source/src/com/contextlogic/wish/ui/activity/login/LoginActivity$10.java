// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.login;

import android.view.View;

// Referenced classes of package com.contextlogic.wish.ui.activity.login:
//            LoginActivity

class this._cls0
    implements android.view.OnGlobalLayoutListener
{

    final LoginActivity this$0;

    public void onGlobalLayout()
    {
        int i = LoginActivity.access$500(LoginActivity.this).getHeight();
        if (i > 0)
        {
            LoginActivity.access$600(LoginActivity.this, i);
        }
    }

    ()
    {
        this$0 = LoginActivity.this;
        super();
    }
}
