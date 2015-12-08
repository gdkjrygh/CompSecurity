// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.util.Log;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, KahunaPreferences, Event

class this._cls0
    implements Runnable
{

    final KahunaCommon this$0;

    public void run()
    {
        if (!KahunaCommon.access$100(KahunaCommon.this))
        {
            Log.e("Kahuna", "You need to call onAppCreate() before any other call to the SDK. Ignoring enablePush request");
        } else
        if (!KahunaCommon.access$1400(KahunaCommon.this))
        {
            KahunaCommon.access$1402(KahunaCommon.this, true);
            KahunaPreferences.savePushEnabled(KahunaCommon.access$1400(KahunaCommon.this), KahunaCommon.access$000(KahunaCommon.this));
            KahunaCommon.access$1500(KahunaCommon.this, new Event("k_push_enabled"));
            return;
        }
    }

    s()
    {
        this$0 = KahunaCommon.this;
        super();
    }
}
