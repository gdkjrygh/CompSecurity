// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.util.Pair;
import com.whatsapp.protocol.b0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

// Referenced classes of package com.whatsapp:
//            App, jy, k, an

class mb
    implements Runnable
{

    private static final String z;
    final an a;
    final Hashtable b;

    mb(an an, Hashtable hashtable)
    {
        a = an;
        b = hashtable;
        super();
    }

    public void run()
    {
        int i = App.am;
        ArrayList arraylist = new ArrayList(b.size());
        Iterator iterator = b.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = ((Vector)((java.util.Map.Entry) (obj)).getValue()).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                b0 b0_1 = (b0)((Iterator) (obj)).next();
                if (z.equals(b0_1.a))
                {
                    arraylist.add(new Pair(s, jy.fromText(b0_1.b)));
                }
            } while (i == 0);
        } while (i == 0);
        App.az.d(arraylist);
        App.F.sendEmptyMessage(0);
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "aV\177k".toCharArray();
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
        byte byte0 = 27;
_L8:
        ac[i] = (char)(byte0 ^ c);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 23;
          goto _L8
_L3:
        byte0 = 57;
          goto _L8
_L4:
        byte0 = 22;
          goto _L8
        byte0 = 27;
          goto _L8
    }
}
