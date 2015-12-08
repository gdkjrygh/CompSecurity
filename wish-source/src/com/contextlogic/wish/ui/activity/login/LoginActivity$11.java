// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.activity.login;

import android.app.Activity;

// Referenced classes of package com.contextlogic.wish.ui.activity.login:
//            LoginActivity

class val.initialCheck
    implements com.contextlogic.wish.googleplus..LoginCallback
{

    final LoginActivity this$0;
    final boolean val$initialCheck;

    public Activity getActivityForErrorResolution()
    {
        if (val$initialCheck)
        {
            return null;
        } else
        {
            return LoginActivity.this;
        }
    }

    public void onFailure()
    {
        if (val$initialCheck)
        {
            LoginActivity.access$900(LoginActivity.this);
            return;
        } else
        {
            LoginActivity.access$1000(LoginActivity.this, false, true);
            return;
        }
    }

    public void onSilentFailure()
    {
        LoginActivity.access$1102(LoginActivity.this, false);
        LoginActivity.access$1200(LoginActivity.this);
    }

    public void onSuccess()
    {
        LoginActivity.access$800(LoginActivity.this);
    }

    allback()
    {
        this$0 = final_loginactivity;
        val$initialCheck = Z.this;
        super();
    }
}
