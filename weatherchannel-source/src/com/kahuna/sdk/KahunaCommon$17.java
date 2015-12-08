// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.util.Log;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, KahunaUtils

class val.value
    implements Runnable
{

    final KahunaCommon this$0;
    final String val$key;
    final String val$value;

    public void run()
    {
        if (!KahunaCommon.access$100(KahunaCommon.this))
        {
            if (KahunaCommon.mDebugEnabled)
            {
                Log.e("Kahuna", "Need to call onAppCreate() before calling getKahunaDeviceId()");
            }
        } else
        if (!KahunaUtils.isNullOrEmpty(val$key) && !KahunaUtils.isNullOrEmpty(val$value))
        {
            KahunaCommon.access$3302(KahunaCommon.this, val$key);
            KahunaCommon.access$3402(KahunaCommon.this, val$value);
            return;
        }
    }

    ()
    {
        this$0 = final_kahunacommon;
        val$key = s;
        val$value = String.this;
        super();
    }
}
