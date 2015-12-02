// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.fieldstats;

import android.content.Context;
import android.os.Message;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.whatsapp.fieldstats:
//            z

final class bf
    implements android.os.Handler.Callback
{

    private static final String z;

    bf()
    {
    }

    private void a(Context context)
    {
        if (com.whatsapp.fieldstats.z.b() != null)
        {
            try
            {
                com.whatsapp.fieldstats.z.b().flush();
            }
            catch (IOException ioexception)
            {
                Log.a(z, ioexception);
            }
            com.whatsapp.fieldstats.z.m(context);
        }
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            a((Context)message.obj);
            com.whatsapp.fieldstats.z.k((Context)message.obj);
            return true;

        case 1: // '\001'
            a((Context)message.obj);
            break;
        }
        return true;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "`\rm\024\0253\026y\024Fu\025y\023\0163\034~\022\ta".toCharArray();
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
        byte byte0 = 102;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 19;
          goto _L8
_L3:
        byte0 = 121;
          goto _L8
_L4:
        byte0 = 12;
          goto _L8
        byte0 = 96;
          goto _L8
    }
}
