// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.whatsapp.protocol.cq;

// Referenced classes of package com.whatsapp.messaging:
//            h, MessageService

public class a5 extends Handler
{

    private final MessageService a;

    public a5(MessageService messageservice)
    {
        a = messageservice;
    }

    public static void a(Messenger messenger)
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

    public static void a(Messenger messenger, Message message)
    {
        message.what = 5;
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

    public static void a(Messenger messenger, Messenger messenger1)
    {
        Message message = Message.obtain(null, 0);
        message.replyTo = messenger1;
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

    public static void a(Messenger messenger, cq cq1)
    {
        try
        {
            messenger.send(Message.obtain(null, 2, cq1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Messenger messenger)
        {
            throw new RuntimeException(messenger);
        }
    }

    public static void a(Messenger messenger, boolean flag)
    {
        int i = 0;
        if (flag)
        {
            i = 1;
        }
        try
        {
            messenger.send(Message.obtain(null, 4, i, 0));
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
            messenger.send(Message.obtain(null, 7));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Messenger messenger)
        {
            throw new RuntimeException(messenger);
        }
    }

    public static void d(Messenger messenger)
    {
        try
        {
            messenger.send(Message.obtain(null, 6));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Messenger messenger)
        {
            throw new RuntimeException(messenger);
        }
    }

    public void handleMessage(Message message)
    {
        int i = h.a;
        int j = message.what;
        j;
        JVM INSTR tableswitch 0 7: default 60
    //                   0 61
    //                   1 76
    //                   2 87
    //                   3 105
    //                   4 116
    //                   5 168
    //                   6 146
    //                   7 157;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        return;
_L2:
        MessageService.a(a, message.replyTo);
        if (i == 0) goto _L1; else goto _L3
_L3:
        MessageService.b(a);
        if (i == 0) goto _L1; else goto _L4
_L4:
        MessageService.a(a, (cq)message.obj);
        if (i == 0) goto _L1; else goto _L5
_L5:
        MessageService.f(a);
        if (i == 0) goto _L1; else goto _L6
_L6:
        MessageService messageservice;
        int k;
        boolean flag;
        try
        {
            messageservice = a;
            k = message.arg1;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw message;
        }
        if (k == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        MessageService.a(messageservice, flag);
        if (i == 0) goto _L1; else goto _L8
_L8:
        MessageService.i(a);
        if (i == 0) goto _L1; else goto _L9
_L9:
        try
        {
            MessageService.a(a);
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw message;
        }
        if (i == 0) goto _L1; else goto _L7
_L7:
        MessageService.a(a, message);
        return;
        message;
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
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
