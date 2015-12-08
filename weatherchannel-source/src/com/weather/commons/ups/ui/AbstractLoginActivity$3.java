// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import android.widget.EditText;
import com.weather.commons.ups.facade.DsxAccount;

// Referenced classes of package com.weather.commons.ups.ui:
//            AbstractLoginActivity

class this._cls0
    implements Runnable
{

    final AbstractLoginActivity this$0;

    public void run()
    {
        DsxAccount dsxaccount = new DsxAccount(AbstractLoginActivity.access$200(AbstractLoginActivity.this).getText().toString(), AbstractLoginActivity.access$300(AbstractLoginActivity.this).getText().toString(), com.weather.commons.ups.facade.er.PROVIDER_WEATHER_CHANNEL);
        AbstractLoginActivity.access$400(AbstractLoginActivity.this, null, dsxaccount);
    }

    ovider()
    {
        this$0 = AbstractLoginActivity.this;
        super();
    }
}
