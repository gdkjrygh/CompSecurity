// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.os.Message;
import java.util.LinkedList;

// Referenced classes of package com.whatsapp.util:
//            Log

public class w
    implements android.os.Handler.Callback
{

    private static final String z[];
    private final LinkedList a = new LinkedList();
    private boolean b;

    public w()
    {
        b = true;
    }

    public void a()
    {
        Log.i(z[1]);
        b = true;
    }

    public void b()
    {
        boolean flag = Log.f;
        Log.i((new StringBuilder()).append(z[0]).append(a.size()).toString());
        b = false;
        do
        {
            if (a.isEmpty())
            {
                break;
            }
            ((Message)a.remove()).sendToTarget();
        } while (!flag);
    }

    public boolean handleMessage(Message message)
    {
        if (b)
        {
            a.add(Message.obtain(message));
            return true;
        } else
        {
            return false;
        }
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = "e\nu\037Lm\fw\034\026{\r}\036\031{\020h\013\004";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int k;
        as1 = as;
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
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                i = 1;
                obj = "e\nu\037Lm\fw\034\026{\rs\034M";
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 136
    //                   0 157
    //                   1 163
    //                   2 169
    //                   3 175;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_175;
_L3:
        byte byte0 = 57;
_L9:
        obj[j] = (char)(byte0 ^ c);
        j++;
          goto _L8
_L4:
        byte0 = 8;
          goto _L9
_L5:
        byte0 = 121;
          goto _L9
_L6:
        byte0 = 18;
          goto _L9
        byte0 = 110;
          goto _L9
    }
}
