// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship;

import android.database.ContentObserver;
import android.os.Handler;

// Referenced classes of package com.urbanairship:
//            Preferences, Logger

class this._cls0 extends ContentObserver
{

    final this._cls0 this$0;

    public void onChange(boolean flag)
    {
        super.onChange(flag);
        Logger.verbose((new StringBuilder()).append("Preference updated:").append(cess._mth000(this._cls0.this)).toString());
        cess._mth102(this._cls0.this, false);
    }

    (Handler handler)
    {
        this$0 = this._cls0.this;
        super(handler);
    }
}
