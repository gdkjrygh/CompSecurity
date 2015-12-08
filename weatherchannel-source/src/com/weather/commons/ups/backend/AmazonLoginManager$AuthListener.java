// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.authorization.api.AmazonAuthorizationManager;
import com.amazon.identity.auth.device.authorization.api.AuthorizationListener;
import com.weather.util.app.AbstractTwcApplication;

// Referenced classes of package com.weather.commons.ups.backend:
//            AmazonLoginManager

private static class <init>
    implements AuthorizationListener
{

    public void onCancel(Bundle bundle)
    {
        Log.e("AmazonLoginManager", "User cancelled authorization");
        if (AmazonLoginManager.access$300() instanceof Activity)
        {
            ((Activity)AmazonLoginManager.access$300()).runOnUiThread(new Runnable() {

                final AmazonLoginManager.AuthListener this$0;

                public void run()
                {
                    Toast.makeText(AbstractTwcApplication.getRootContext(), "Authorization cancelled", 0).show();
                }

            
            {
                this$0 = AmazonLoginManager.AuthListener.this;
                super();
            }
            });
        }
    }

    public void onError(AuthError autherror)
    {
        Log.e("AmazonLoginManager", "AuthError during authorization", autherror);
    }

    public void onSuccess(Bundle bundle)
    {
        if (AmazonLoginManager.access$100() != null)
        {
            AmazonLoginManager.access$100().getProfile(new er(null));
        }
    }

    private _cls1.this._cls0()
    {
    }

    _cls1.this._cls0(_cls1.this._cls0 _pcls0)
    {
        this();
    }
}
