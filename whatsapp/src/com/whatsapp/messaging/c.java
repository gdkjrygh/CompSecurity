// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.whatsapp.util.Log;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp.messaging:
//            as, h

public class c extends Handler
{

    private static final String z[];
    private final as a;

    public c(as as1)
    {
        super(as1.getLooper());
        a = as1;
    }

    public static void a(Messenger messenger)
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

    public static void a(Messenger messenger, Message message)
    {
        message.what = 3;
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

    public static void a(Messenger messenger, String s, byte abyte0[], String s1, boolean flag, boolean flag1, ArrayList arraylist, boolean flag2)
    {
        Bundle bundle = new Bundle(6);
        bundle.putString(z[12], s);
        bundle.putByteArray(z[8], abyte0);
        bundle.putString(z[9], s1);
        bundle.putBoolean(z[13], flag);
        bundle.putBoolean(z[10], flag1);
        bundle.putSerializable(z[11], arraylist);
        bundle.putBoolean(z[14], flag2);
        try
        {
            messenger.send(Message.obtain(null, 0, bundle));
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
        int i = 1;
        if (!flag || h.a != 0)
        {
            i = 0;
        }
        try
        {
            messenger.send(Message.obtain(null, 1, i, 0));
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
            messenger.send(Message.obtain(null, 4));
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
        if (messenger == null)
        {
            try
            {
                Log.i(z[15]);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Messenger messenger)
            {
                throw messenger;
            }
        }
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
            messenger.send(Message.obtain(null, 5));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Messenger messenger)
        {
            throw new RuntimeException(messenger);
        }
    }

    public static void e(Messenger messenger)
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

    public void handleMessage(Message message)
    {
        int i = h.a;
        message.what;
        JVM INSTR tableswitch 0 7: default 56
    //                   0 57
    //                   1 152
    //                   2 204
    //                   3 215
    //                   4 227
    //                   5 182
    //                   6 193
    //                   7 238;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        return;
_L2:
        Bundle bundle;
        Log.i(z[6]);
        bundle = (Bundle)message.obj;
        as.a(a, bundle.getString(z[5]), bundle.getByteArray(z[1]), bundle.getString(z[0]), bundle.getBoolean(z[4]), bundle.getBoolean(z[2]), (ArrayList)bundle.getSerializable(z[3]), bundle.getBoolean(z[7]));
        if (i == 0) goto _L1; else goto _L3
_L3:
        as as1;
        int j;
        boolean flag;
        try
        {
            as1 = a;
            j = message.arg1;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw message;
        }
        if (j == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        as.a(as1, flag);
        if (i == 0) goto _L1; else goto _L7
_L7:
        as.g(a);
        if (i == 0) goto _L1; else goto _L8
_L8:
        as.i(a);
        if (i == 0) goto _L1; else goto _L4
_L4:
        as.a(a);
        if (i == 0) goto _L1; else goto _L5
_L5:
        as.b(a, message);
        if (i == 0) goto _L1; else goto _L6
_L6:
        try
        {
            as.f(a);
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            throw message;
        }
        if (i == 0) goto _L1; else goto _L9
_L9:
        as.j(a);
        return;
        message;
        throw message;
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
    }

    static 
    {
        Object obj;
        String as1[];
        byte byte0;
        int i;
        as1 = new String[16];
        obj = "k\033`u@p\016rb";
        byte0 = -1;
        i = 0;
_L2:
        String as2[];
        int j;
        int k;
        as2 = as1;
        obj = ((String) (obj)).toCharArray();
        k = obj.length;
        j = 0;
_L8:
label0:
        {
            if (k > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as2[i] = ((String) (obj));
                obj = "r\034";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as2[i] = ((String) (obj));
                obj = "c\buxRg4b~Jl\016beMm\005";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as2[i] = ((String) (obj));
                obj = "d\nm}Fc\bjb";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as2[i] = ((String) (obj));
                obj = "c\035`xHc\tmt";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as2[i] = ((String) (obj));
                i = 5;
                obj = "h\002e";
                byte0 = 4;
                break;

            case 4: // '\004'
                as2[i] = ((String) (obj));
                i = 6;
                obj = "z\006qa\013a\004o\177Aa\037h~J-\031drR-\bn\177Jg\bu";
                byte0 = 5;
                break;

            case 5: // '\005'
                as2[i] = ((String) (obj));
                i = 7;
                obj = "m\035dcVk\017dNAz\033hcAf";
                byte0 = 6;
                break;

            case 6: // '\006'
                as2[i] = ((String) (obj));
                i = 8;
                obj = "r\034";
                byte0 = 7;
                break;

            case 7: // '\007'
                as2[i] = ((String) (obj));
                i = 9;
                obj = "k\033`u@p\016rb";
                byte0 = 8;
                break;

            case 8: // '\b'
                as2[i] = ((String) (obj));
                i = 10;
                obj = "c\buxRg4b~Jl\016beMm\005";
                byte0 = 9;
                break;

            case 9: // '\t'
                as2[i] = ((String) (obj));
                i = 11;
                obj = "d\nm}Fc\bjb";
                byte0 = 10;
                break;

            case 10: // '\n'
                as2[i] = ((String) (obj));
                i = 12;
                obj = "h\002e";
                byte0 = 11;
                break;

            case 11: // '\013'
                as2[i] = ((String) (obj));
                i = 13;
                obj = "c\035`xHc\tmt";
                byte0 = 12;
                break;

            case 12: // '\f'
                as2[i] = ((String) (obj));
                i = 14;
                obj = "m\035dcVk\017dNAz\033hcAf";
                byte0 = 13;
                break;

            case 13: // '\r'
                as2[i] = ((String) (obj));
                i = 15;
                obj = "z\006qa\013a\004o\177Aa\037h~J-\030d\177@-\033h\177Cv\002ltKw\037.bOk\033";
                byte0 = 14;
                break;

            case 14: // '\016'
                as2[i] = ((String) (obj));
                z = as1;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 432
    //                   0 455
    //                   1 461
    //                   2 468
    //                   3 474;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_474;
_L3:
        byte byte1 = 36;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 2;
          goto _L9
_L5:
        byte1 = 107;
          goto _L9
_L6:
        byte1 = 1;
          goto _L9
        byte1 = 17;
          goto _L9
    }
}
