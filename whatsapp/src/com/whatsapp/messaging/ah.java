// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

// Referenced classes of package com.whatsapp.messaging:
//            as, h

public class ah extends Handler
{

    private boolean a;
    private final as b;

    public ah(as as1)
    {
        super(as1.getLooper());
        a = false;
        b = as1;
    }

    public static void a(Messenger messenger)
    {
        try
        {
            messenger.send(Message.obtain(null, 2));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Messenger messenger)
        {
            throw new RuntimeException(messenger);
        }
    }

    public static void a(Messenger messenger, Message message)
    {
        message.what = 0;
        try
        {
            messenger.send(message);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Messenger messenger)
        {
            throw new RuntimeException(messenger);
        }
    }

    public static void b(Messenger messenger)
    {
        try
        {
            messenger.send(Message.obtain(null, 3));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Messenger messenger)
        {
            throw new RuntimeException(messenger);
        }
    }

    public static void c(Messenger messenger)
    {
        try
        {
            messenger.send(Message.obtain(null, 1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Messenger messenger)
        {
            throw new RuntimeException(messenger);
        }
    }

    public void a()
    {
        a = true;
    }

    public void handleMessage(Message message)
    {
        int i = h.a;
        int j = message.what;
        j;
        JVM INSTR tableswitch 0 3: default 40
    //                   0 41
    //                   1 53
    //                   2 75
    //                   3 122;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        as.a(b, message);
        if (i == 0) goto _L1; else goto _L3
_L3:
        boolean flag;
        try
        {
            flag = a;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw message;
        }
        if (flag) goto _L1; else goto _L6
_L6:
        as.c(b);
        if (i == 0) goto _L1; else goto _L4
_L4:
        try
        {
            flag = a;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw message;
        }
        if (flag) goto _L1; else goto _L7
_L7:
        flag = as.d(b);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        as.c(b);
        if (i == 0) goto _L1; else goto _L8
_L8:
        try
        {
            as.e(b);
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw message;
        }
        if (i == 0) goto _L1; else goto _L5
_L5:
        as.b(b);
        return;
        message;
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        throw message;
        message;
        throw message;
        message;
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        throw message;
    }
}
