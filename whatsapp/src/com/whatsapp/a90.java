// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import com.whatsapp.protocol.bd;
import com.whatsapp.util.Log;
import org.whispersystems.a_;
import org.whispersystems.aa;
import org.whispersystems.ae;
import org.whispersystems.b9;
import org.whispersystems.bA;
import org.whispersystems.bW;
import org.whispersystems.bs;

// Referenced classes of package com.whatsapp:
//            tt, e5, App, ss, 
//            aoz

class a90
    implements Runnable
{

    private static final String z[];
    final byte a[];
    final bd b;
    final byte c;
    final bd d;
    final String e;
    final e5 f;
    final byte g[];

    a90(e5 e5_1, String s, byte abyte0[], byte byte0, bd bd1, bd bd2, byte abyte1[])
    {
        f = e5_1;
        e = s;
        g = abyte0;
        c = byte0;
        d = bd1;
        b = bd2;
        a = abyte1;
        super();
    }

    public void run()
    {
        Object obj;
        org.whispersystems.a0 a0;
        int i;
        long l = tt.a(e);
        byte abyte1[];
        ae ae1;
        byte abyte2[];
        bA ba;
        bd bd1;
        int j;
        try
        {
            byte abyte0[] = new byte[g.length + 1];
            abyte0[0] = c;
            System.arraycopy(g, 0, abyte0, 1, g.length);
            ae1 = new ae(abyte0, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.a((new StringBuilder()).append(z[0]).append(e).toString(), ((Throwable) (obj)));
            ae1 = null;
        }
        ba = new bA(e5.a(f).aq, e5.a(f).aq, e5.a(f).aq.f(), e5.a(f).aq, l, 0);
        if (d == null) goto _L2; else goto _L1
_L1:
        abyte1 = d.a;
        if (abyte1 != null) goto _L3; else goto _L2
_L2:
        obj = null;
_L6:
        try
        {
            abyte2 = new byte[b.a.length + 1];
            abyte2[0] = c;
            System.arraycopy(b.a, 0, abyte2, 1, b.a.length);
            a0 = bs.a(abyte2, 0);
        }
        catch (b9 b9_2)
        {
            Log.a((new StringBuilder()).append(z[2]).append(e).toString(), b9_2);
            b9_2 = null;
        }
        j = aa.a(a);
        bd1 = d;
        if (bd1 != null) goto _L5; else goto _L4
_L4:
        i = -1;
_L7:
        ba.a(new bW(j, 0, i, ((org.whispersystems.a0) (obj)), aa.b(b.c, 0), a0, b.b, ae1));
        e5.a(f).ab().post(new ss(this, App.ah.c(e)));
        return;
        obj;
        throw obj;
_L3:
        try
        {
            obj = new byte[d.a.length + 1];
            obj[0] = c;
            System.arraycopy(d.a, 0, obj, 1, d.a.length);
            obj = bs.a(((byte []) (obj)), 0);
        }
        catch (b9 b9_1)
        {
            Log.a((new StringBuilder()).append(z[1]).append(e).toString(), b9_1);
            b9_1 = null;
        }
          goto _L6
        Object obj1;
        obj1;
        throw obj1;
        obj1;
_L8:
        Log.a(((Throwable) (obj1)));
        e5.a(f).ab().post(new ss(this, false));
        return;
_L5:
        i = aa.b(d.c, 0);
          goto _L7
        obj1;
          goto _L8
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i;
        as = new String[3];
        obj = "\fX\026si\fR@{a\000X\024{q\034\026\013w|ED\005fp\027X\005v%\003D\017\177%\026S\022d`\027\026\004gw\fX\0072u\027S@y`\034\026\006wq\006^@tj\027\026\n{aE";
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
                obj = "\fX\026si\fR@bw\000\026\013w|ED\005fp\027X\005v%\003D\017\177%\026S\022d`\027\026\004gw\fX\0072u\027S@y`\034\026\006wq\006^@tj\027\026";
                i = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                i = 2;
                obj = "\fX\026si\fR@al\002X\005v%\025D\0052n\000O@``\021C\022|`\001\026\006`j\b\026\023ww\023S\0222a\020D\t|bEF\022w%\016S\0312c\000B\003z%\003Y\0222";
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
    //                   0 176
    //                   1 182
    //                   2 188
    //                   3 194;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_194;
_L3:
        byte byte0 = 5;
_L9:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L8
_L4:
        byte0 = 101;
          goto _L9
_L5:
        byte0 = 54;
          goto _L9
_L6:
        byte0 = 96;
          goto _L9
        byte0 = 18;
          goto _L9
    }
}
