// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.util.Log;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon, Event

class this._cls0
    implements Runnable
{

    final KahunaCommon this$0;

    public void run()
    {
        try
        {
            KahunaCommon.access$2100(KahunaCommon.this);
            KahunaCommon.access$1500(KahunaCommon.this, new Event("k_user_logout"));
            return;
        }
        catch (Exception exception)
        {
            Log.d("Kahuna", (new StringBuilder()).append("Handled exception in KahunaCommon.logout(): ").append(exception).toString());
            exception.printStackTrace();
            return;
        }
    }

    ()
    {
        this$0 = KahunaCommon.this;
        super();
    }
}
