// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.ui;

import com.weather.commons.ups.backend.GooglePlusConnectionManager;

// Referenced classes of package com.weather.commons.ups.ui:
//            AccountSettingsFragment

class this._cls1
    implements Runnable
{

    final this._cls1 this$1;

    public void run()
    {
        GooglePlusConnectionManager.getInstance().disconnectAndRevoke();
        cess._mth1902(this._cls1.this, true);
        cess._mth2000(this._cls1.this);
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
