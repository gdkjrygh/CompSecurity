// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.whatsapp.protocol.cu;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp.messaging:
//            f

public class a4 extends Handler
{

    private static final String z;
    private final f a;

    public a4(f f1)
    {
        super(f1.getLooper());
        a = f1;
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
        message.what = 2;
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

    public static void a(Messenger messenger, cu cu1)
    {
        try
        {
            messenger.send(Message.obtain(null, 0, cu1));
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
        message.what;
        JVM INSTR tableswitch 0 2: default 73
    //                   0 32
    //                   1 56
    //                   2 64;
           goto _L1 _L2 _L3 _L4
_L2:
        Log.i(z);
        f.a(a, (cu)message.obj);
        return;
        message;
        throw message;
_L3:
        f.c(a);
        return;
_L4:
        f.a(a, message);
        return;
_L1:
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "9.\177J261fNx3l}_~7llUs/&lNx%".toCharArray();
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
        byte byte0 = 29;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 65;
          goto _L8
_L3:
        byte0 = 67;
          goto _L8
_L4:
        byte0 = 15;
          goto _L8
        byte0 = 58;
          goto _L8
    }
}
