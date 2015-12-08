// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.iid:
//            MessengerCompat

private final class handler extends handler
{

    Handler handler;
    final MessengerCompat zzaBe;

    public void send(Message message)
        throws RemoteException
    {
        message.arg2 = Binder.getCallingUid();
        handler.dispatchMessage(message);
    }

    (MessengerCompat messengercompat, Handler handler1)
    {
        zzaBe = messengercompat;
        super();
        handler = handler1;
    }
}
