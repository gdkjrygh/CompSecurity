// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kahuna.sdk;

import android.util.Log;

// Referenced classes of package com.kahuna.sdk:
//            KahunaCommon

class this._cls0
    implements Runnable
{

    final KahunaCommon this$0;

    public void run()
    {
        if (KahunaCommon.access$000(KahunaCommon.this) == null)
        {
            Log.w("Kahuna", "You should call onAppCreate() before forcing debug build.");
        }
        KahunaCommon.access$802(KahunaCommon.this, true);
    }

    ()
    {
        this$0 = KahunaCommon.this;
        super();
    }
}
