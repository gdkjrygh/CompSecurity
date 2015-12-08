// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.util.Log;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon

public class KahunaBackgroundRunnable
    implements Runnable
{

    private final Runnable _flddelegate;

    public KahunaBackgroundRunnable(Runnable runnable)
    {
        _flddelegate = runnable;
    }

    public void run()
    {
        _flddelegate.run();
_L1:
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        if (KahunaCommon.mDebugEnabled)
        {
            Log.w("Kahuna", (new StringBuilder()).append("Exception while running background task: ").append(runtimeexception).toString());
            runtimeexception.printStackTrace();
            return;
        }
          goto _L1
    }
}
