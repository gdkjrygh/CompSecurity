// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.ConditionVariable;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.whatsapp:
//            App

final class l8
    implements Runnable
{

    private static final String z[];
    final boolean a;
    final ConditionVariable b;
    final HashMap c;
    final ConditionVariable d;

    l8(HashMap hashmap, boolean flag, ConditionVariable conditionvariable, ConditionVariable conditionvariable1)
    {
        c = hashmap;
        a = flag;
        d = conditionvariable;
        b = conditionvariable1;
        super();
    }

    public void run()
    {
        ArrayList arraylist;
        int i;
        i = App.am;
        arraylist = new ArrayList();
        Iterator iterator = c.values().iterator();
_L2:
        c4 c4_1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        c4_1 = (c4)iterator.next();
        if (c4_1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        arraylist.add(c4_1);
        if (i == 0) goto _L2; else goto _L1
_L1:
        App.a(0, arraylist, true, a, d, b);
        return;
        Exception exception;
        exception;
        try
        {
            throw exception;
        }
        catch (Exception exception1)
        {
            Log.e((new StringBuilder()).append(z[0]).append(a).append(z[1]).append(exception1.toString()).toString());
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[2];
        obj = ">\0028o=2\0028o6:\034,o4--;%+;-+/+)R82 :\03784\177";
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
                obj = "\177\000-# 1\006;` -\000'2e";
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
        char c1 = obj[j];
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
        byte byte0 = 69;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 95;
          goto _L9
_L5:
        byte0 = 114;
          goto _L9
_L6:
        byte0 = 72;
          goto _L9
        byte0 = 64;
          goto _L9
    }
}
