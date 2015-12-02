// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.media.AsyncPlayer;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.whatsapp:
//            App

final class pn extends Handler
{

    pn()
    {
    }

    public void handleMessage(Message message)
    {
        App.k.stop();
    }
}
