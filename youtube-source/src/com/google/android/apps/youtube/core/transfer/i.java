// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.transfer;

import android.os.Handler;
import android.os.Message;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.youtube.core.transfer:
//            TransferService, h

final class i extends Handler
{

    final TransferService a;

    public i(TransferService transferservice)
    {
        a = transferservice;
        super(transferservice.getMainLooper());
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 7: default 48
    //                   1 49
    //                   2 443
    //                   3 114
    //                   4 180
    //                   5 245
    //                   6 311
    //                   7 377;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        return;
_L2:
        message = (Map)message.obj;
        TransferService.a(a, message);
        TransferService.a(a, true);
        message = TransferService.a(a).iterator();
        while (message.hasNext()) 
        {
            ((h)message.next()).m_();
        }
        continue; /* Loop/switch isn't completed */
_L4:
        message = (Transfer)message.obj;
        TransferService.b(a).put(((Transfer) (message)).a, message);
        Iterator iterator = TransferService.a(a).iterator();
        while (iterator.hasNext()) 
        {
            ((h)iterator.next()).a(message);
        }
        if (true) goto _L1; else goto _L5
_L5:
        message = (Transfer)message.obj;
        TransferService.b(a).remove(((Transfer) (message)).a);
        Iterator iterator1 = TransferService.a(a).iterator();
        while (iterator1.hasNext()) 
        {
            ((h)iterator1.next()).e(message);
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        message = (Transfer)message.obj;
        TransferService.b(a).put(((Transfer) (message)).a, message);
        Iterator iterator2 = TransferService.a(a).iterator();
        while (iterator2.hasNext()) 
        {
            ((h)iterator2.next()).b(message);
        }
        if (true) goto _L1; else goto _L7
_L7:
        message = (Transfer)message.obj;
        TransferService.b(a).put(((Transfer) (message)).a, message);
        Iterator iterator3 = TransferService.a(a).iterator();
        while (iterator3.hasNext()) 
        {
            ((h)iterator3.next()).c(message);
        }
        if (true)
        {
            continue; /* Loop/switch isn't completed */
        }
_L8:
        message = (Transfer)message.obj;
        TransferService.b(a).put(((Transfer) (message)).a, message);
        Iterator iterator4 = TransferService.a(a).iterator();
        while (iterator4.hasNext()) 
        {
            ((h)iterator4.next()).d(message);
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (message.arg1 >= TransferService.c(a))
        {
            for (message = TransferService.a(a).iterator(); message.hasNext(); ((h)message.next()).b()) { }
            a.stopSelf();
            return;
        }
        if (true) goto _L1; else goto _L9
_L9:
    }
}
