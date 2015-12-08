// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;

import android.widget.Toast;
import com.weather.util.app.AbstractTwcApplication;

// Referenced classes of package com.weather.commons.ups.backend:
//            AmazonLoginManager

class this._cls0
    implements Runnable
{

    final this._cls0 this$0;

    public void run()
    {
        Toast.makeText(AbstractTwcApplication.getRootContext(), "Authorization cancelled", 0).show();
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
