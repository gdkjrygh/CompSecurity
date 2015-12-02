// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.messaging;

import com.whatsapp.protocol.bp;
import com.whatsapp.protocol.cu;
import com.whatsapp.util.Log;
import java.io.IOException;

// Referenced classes of package com.whatsapp.messaging:
//            h, j, ah

final class bt extends Thread
{

    private static final String z[];
    private final j a;
    private final cu b;

    public bt(cu cu1, j j1)
    {
        super(z[0]);
        b = cu1;
        a = j1;
    }

    public void run()
    {
        int i = h.a;
        boolean flag;
        do
        {
            flag = b.o();
        } while (flag);
        IOException ioexception;
        try
        {
            Log.i(z[11]);
            ah.c(j.a(a));
        }
        catch (IOException ioexception1)
        {
            try
            {
                throw ioexception1;
            }
            catch (IOException ioexception2)
            {
                throw ioexception2;
            }
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        Log.i(z[1]);
        ah.a(j.a(a));
        return;
        ioexception;
        throw ioexception;
        ioexception;
        Log.i((new StringBuilder()).append(z[4]).append(ioexception.toString()).toString());
        try
        {
            Log.i(z[2]);
            ah.a(j.a(a));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            throw ioexception;
        }
        Object obj;
        obj;
        Log.i((new StringBuilder()).append(z[5]).append(((bp) (obj)).toString()).toString());
        Log.i((new StringBuilder()).append(z[8]).append(((bp) (obj)).a()).toString());
        try
        {
            Log.i(z[6]);
            ah.a(j.a(a));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        obj;
        try
        {
            Log.i(z[7]);
            ah.a(j.a(a));
        }
        catch (IOException ioexception3)
        {
            throw ioexception3;
        }
        throw obj;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[12];
        obj = "\037K\006\004\001?z\017\022\001,J";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int k;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        k = 0;
_L8:
label0:
        {
            if (l > k)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "5C\027\020K?K\006\004\001?\001\002\022\026\"\\";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "5C\027\020K?K\006\004\001?\001\002\022\026\"\\";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "5C\027\020K?K\006\004\001?\001\013\017\003\"[\023";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "5C\027\020K?K\006\004\001?\001\016\017I(\\\025\017\026m";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "5C\027\020K?K\006\004\001?\001\004\017\026?[\027\024I>Z\025\005\005 \003\002\022\026\"\\G";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "5C\027\020K?K\006\004\001?\001\002\022\026\"\\";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "5C\027\020K?K\006\004\001?\001\002\022\026\"\\";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "5C\027\020K?K\006\004\001?\001\004\017\026?[\027\024I>Z\025\005\005 \001\024\024\005#T\006@";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "5C\027\020K?K\006\004\001?\001\013\017\003\"[\023";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "5C\027\020K?K\006\004\001?\001\013\017\003\"[\023";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "5C\027\020K?K\006\004\001?\001\013\017\003\"[\023";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[k];
        k % 5;
        JVM INSTR tableswitch 0 3: default 344
    //                   0 367
    //                   1 374
    //                   2 381
    //                   3 388;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_388;
_L3:
        byte byte1 = 100;
_L9:
        obj[k] = (char)(byte1 ^ c);
        k++;
          goto _L8
_L4:
        byte1 = 77;
          goto _L9
_L5:
        byte1 = 46;
          goto _L9
_L6:
        byte1 = 103;
          goto _L9
        byte1 = 96;
          goto _L9
    }
}
