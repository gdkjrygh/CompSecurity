// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.whatsapp.protocol.c4;
import com.whatsapp.protocol.cu;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.messaging:
//            as, h

public class bl extends Handler
{

    private static final String z;
    private final as a;

    public bl(as as1)
    {
        super(as1.getLooper());
        a = as1;
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

    public static void a(Messenger messenger, c4 c4_1)
    {
        try
        {
            messenger.send(Message.obtain(null, 2, c4_1));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Messenger messenger)
        {
            throw new RuntimeException(messenger);
        }
    }

    public static void a(Messenger messenger, cu cu1)
    {
        try
        {
            messenger.send(Message.obtain(null, 1, cu1));
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
        JVM INSTR tableswitch 0 2: default 36
    //                   0 37
    //                   1 58
    //                   2 76;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        Log.i(z);
        as.a(a, message.replyTo);
        if (i == 0) goto _L1; else goto _L3
_L3:
        try
        {
            as.a(a, (cu)message.obj);
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw message;
        }
        if (i == 0) goto _L1; else goto _L4
_L4:
        as.a(a, (c4)message.obj);
        return;
        message;
        try
        {
            throw message;
        }
        // Misplaced declaration of an exception variable
        catch (Message message) { }
        throw message;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "\177\f\031=3d\016\007#yd\025\000\"r(\023\f.j(\026\033$hb\02369tu\004\b)Cu\004\b)e".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            return;
        }
        c = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 68
    //                   0 86
    //                   1 92
    //                   2 98
    //                   3 104;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_104;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 28;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 7;
          goto _L8
_L3:
        byte0 = 97;
          goto _L8
_L4:
        byte0 = 105;
          goto _L8
        byte0 = 77;
          goto _L8
    }
}
