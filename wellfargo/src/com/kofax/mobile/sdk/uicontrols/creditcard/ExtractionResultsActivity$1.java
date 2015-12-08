// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.mobile.sdk.uicontrols.creditcard;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.kofax.mobile.sdk.uicontrols.creditcard:
//            DataExtractionTask

final class  extends Handler
{

    public void handleMessage(Message message)
    {
        if (message.arg1 == 0)
        {
            for (int i = 0; i < DataExtractionTask.data.length; i++) { }
        }
    }

    ()
    {
    }
}
