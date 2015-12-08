// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.util.Log;
import java.util.concurrent.Callable;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon

class this._cls0
    implements Callable
{

    final KahunaCommon this$0;

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    public String call()
    {
        if (!KahunaCommon.access$100(KahunaCommon.this))
        {
            if (KahunaCommon.mDebugEnabled)
            {
                Log.e("Kahuna", "Need to call onAppCreate() before calling getKahunaDeviceId()");
            }
            return null;
        } else
        {
            return KahunaCommon.access$1200(KahunaCommon.this);
        }
    }

    ()
    {
        this$0 = KahunaCommon.this;
        super();
    }
}
