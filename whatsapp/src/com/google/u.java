// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google:
//            c9, af, a8, c_, 
//            e_

class u
{

    private static final Logger a;
    private static final Set b;
    private static final Map c;
    private static final String z;

    private u()
    {
    }

    private static void a(int i)
    {
        Object obj;
        int j;
        j = af.k;
        obj = com/google/a8.getResourceAsStream((new StringBuilder()).append(z).append(i).toString());
        ObjectInputStream objectinputstream = new ObjectInputStream(((InputStream) (obj)));
        obj = objectinputstream;
        Object obj1 = new c_();
        obj = objectinputstream;
        ((c_) (obj1)).readExternal(objectinputstream);
        obj = objectinputstream;
        obj1 = ((c_) (obj1)).c().iterator();
_L2:
        obj = objectinputstream;
        if (!((Iterator) (obj1)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = objectinputstream;
        e_ e_1 = (e_)((Iterator) (obj1)).next();
        obj = objectinputstream;
        c.put(Integer.valueOf(e_1.ad()), e_1);
        if (j == 0) goto _L2; else goto _L1
_L1:
        a(((InputStream) (objectinputstream)));
        return;
        IOException ioexception;
        ioexception;
        objectinputstream = null;
_L6:
        obj = objectinputstream;
        a.log(Level.WARNING, ioexception.toString());
        a(((InputStream) (objectinputstream)));
        return;
        Exception exception;
        exception;
        obj = null;
_L4:
        a(((InputStream) (obj)));
        throw exception;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
        ioexception;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static void a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        inputstream.close();
        return;
        inputstream;
        a.log(Level.WARNING, inputstream.toString());
        return;
    }

    static e_ b(int i)
    {
        if (!b.contains(Integer.valueOf(i)))
        {
            return null;
        }
        synchronized (c)
        {
            if (!c.containsKey(Integer.valueOf(i)))
            {
                a(i);
            }
        }
        return (e_)c.get(Integer.valueOf(i));
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        char ac[];
        int i;
        int j;
        ac = "DJ\002f\b\fF\002lK\016\006\004:\037\005\006\035cH\005L\003~J\tL\037x\b\017H\031j\b;A\002eB%\\\000iB\031h\001\177B\031G\f\177B-F\037fF\037Z=yH\037F2".toCharArray();
        j = ac.length;
        i = 0;
_L7:
        char c1;
        if (j <= i)
        {
            z = (new String(ac)).intern();
            a = Logger.getLogger(com/google/u.getName());
            c = Collections.synchronizedMap(new HashMap());
            b = c9.a();
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 100
    //                   0 118
    //                   1 124
    //                   2 130
    //                   3 136;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_136;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        byte byte0 = 39;
_L8:
        ac[i] = (char)(byte0 ^ c1);
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        byte0 = 107;
          goto _L8
_L3:
        byte0 = 41;
          goto _L8
_L4:
        byte0 = 109;
          goto _L8
        byte0 = 11;
          goto _L8
    }
}
