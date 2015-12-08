// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;

import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.AuthError;
import com.amazon.identity.auth.device.shared.APIListener;

// Referenced classes of package com.weather.commons.ups.backend:
//            AmazonLoginManager

class this._cls0
    implements APIListener
{

    final AmazonLoginManager this$0;

    public void onError(AuthError autherror)
    {
        Log.d("AmazonLoginManager", (new StringBuilder()).append("Issue in amazon disconnect ").append(autherror).toString());
    }

    public void onSuccess(Bundle bundle)
    {
        Log.d("AmazonLoginManager", "disconnected with amazon successfully ");
    }

    ()
    {
        this$0 = AmazonLoginManager.this;
        super();
    }
}
