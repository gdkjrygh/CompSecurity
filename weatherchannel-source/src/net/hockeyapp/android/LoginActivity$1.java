// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

// Referenced classes of package net.hockeyapp.android:
//            LoginActivity, LoginManager, LoginManagerListener

class this._cls0 extends Handler
{

    final LoginActivity this$0;

    public void handleMessage(Message message)
    {
        if (message.getData().getBoolean("success"))
        {
            finish();
            if (LoginManager.listener != null)
            {
                LoginManager.listener.onSuccess();
            }
            return;
        } else
        {
            Toast.makeText(LoginActivity.this, "Login failed. Check your credentials.", 2000).show();
            return;
        }
    }

    ener()
    {
        this$0 = LoginActivity.this;
        super();
    }
}
