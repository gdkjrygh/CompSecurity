// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.whatsapp.protocol.cf;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

// Referenced classes of package com.whatsapp:
//            App, k, og, tn

class auf
    implements Runnable
{

    private static final String z[];
    final tn a;
    final String b;
    final String c;
    final cf d;
    final int e;

    auf(tn tn, cf cf1, String s, int i, String s1)
    {
        a = tn;
        d = cf1;
        c = s;
        e = i;
        b = s1;
        super();
    }

    public void run()
    {
        FileInputStream fileinputstream;
        cf cf1;
        og og1;
        int i;
        int j;
        i = 0;
        fileinputstream = null;
        j = App.am;
        cf1 = new cf();
        og1 = App.az.f(d.f);
        if (og1 == null) goto _L2; else goto _L1
_L1:
        Object obj1 = og1.h();
        if (!Integer.toString(og1.q).equals(d.s)) goto _L4; else goto _L3
_L3:
        cf1.s = d.s;
        if (j == 0) goto _L2; else goto _L4
_L4:
        Object obj = fileinputstream;
        if (og1.q == -1) goto _L6; else goto _L5
_L5:
        boolean flag = ((File) (obj1)).exists();
        obj = fileinputstream;
        if (!flag) goto _L6; else goto _L7
_L7:
        fileinputstream = new FileInputStream(((File) (obj1)));
        obj = fileinputstream;
        obj1 = new byte[(int)((File) (obj1)).length()];
_L9:
        obj = fileinputstream;
        if (i >= obj1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = fileinputstream;
        int l = fileinputstream.read(((byte []) (obj1)), i, obj1.length - i);
        if (l == -1 && j == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i += l;
        if (j == 0) goto _L9; else goto _L8
_L8:
        Exception exception;
        obj = obj1;
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = obj1;
                continue; /* Loop/switch isn't completed */
            }
            obj = obj1;
        }
_L15:
        cf1.s = Integer.toString(og1.q);
_L6:
        cf1.g = ((byte []) (obj));
_L2:
        App.a(c, cf1, e);
        App.d(c, b, z[2]);
        return;
        obj;
        throw obj;
        obj;
        throw obj;
        obj1;
        fileinputstream = null;
_L13:
        obj = fileinputstream;
        Log.a((new StringBuilder()).append(z[0]).append(d.f).append(z[1]).toString(), ((Throwable) (obj1)));
        if (fileinputstream != null)
        {
            try
            {
                fileinputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = null;
                continue; /* Loop/switch isn't completed */
            }
            obj = null;
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_336;
        exception;
        obj = null;
_L11:
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw exception;
        exception;
        if (true) goto _L11; else goto _L10
_L10:
        obj1;
        if (true) goto _L13; else goto _L12
_L12:
        obj = null;
        if (true) goto _L15; else goto _L14
_L14:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "iv\006 \005ev\006 \017me\000 \nmd)~\bmt\017 \rzc\000f\030\177&";
        byte1 = -1;
        i = 0;
_L2:
        String as1[];
        int j;
        int l;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        l = obj.length;
        j = 0;
_L8:
label0:
        {
            if (l > j)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "'`\027f\021mb";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\177c\024";
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 156
    //                   0 177
    //                   1 183
    //                   2 189
    //                   3 195;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_195;
_L3:
        byte byte0 = 125;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 8;
          goto _L9
_L5:
        byte0 = 6;
          goto _L9
_L6:
        byte0 = 118;
          goto _L9
        byte0 = 15;
          goto _L9
    }
}
