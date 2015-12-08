// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.commons.ups.backend;


// Referenced classes of package com.weather.commons.ups.backend:
//            UpsCommonUtil, GooglePlusConnectionManager

class this._cls0
    implements Runnable
{

    final this._cls0 this$0;

    public void run()
    {
        GooglePlusConnectionManager.getInstance().disconnectAndRevoke();
        cess._mth002(this._cls0.this, true);
        cess._mth100(this._cls0.this);
    }

    ()
    {
        this$0 = this._cls0.this;
        super();
    }
}
