// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.fieldstats.a2;
import com.whatsapp.fieldstats.m;
import com.whatsapp.fieldstats.z;
import com.whatsapp.protocol.c3;
import com.whatsapp.protocol.ci;
import com.whatsapp.protocol.cj;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Timer;

// Referenced classes of package com.whatsapp:
//            a9v, t1, aud, App, 
//            k, og, mk

public class a9g extends a9v
    implements ci, cj
{

    public static Handler g;
    private static HashMap n;
    private static final String z[];
    private boolean f;
    private Long h;
    public c3 i;
    private long j;
    public boolean k;
    private aud l;
    public boolean m;

    public a9g(String s, byte abyte0[], byte abyte1[])
    {
        super(s, abyte0, abyte1, 0);
        k = false;
        f = false;
        h = Long.valueOf(System.currentTimeMillis());
        n.put(h.toString(), this);
        j = System.currentTimeMillis();
        l = new aud(this);
        (new Timer()).schedule(l, 32000L);
    }

    public a9g(String s, byte abyte0[], byte abyte1[], c3 c3)
    {
        this(s, abyte0, abyte1);
        i = c3;
    }

    static HashMap a()
    {
        return n;
    }

    static void a(a9g a9g1, m m1)
    {
        a9g1.a(m1);
    }

    private void a(m m1)
    {
        int j1 = 0;
        a2 a2_1 = new a2();
        byte abyte0[];
        int i1;
        try
        {
            abyte0 = d;
        }
        // Misplaced declaration of an exception variable
        catch (m m1)
        {
            throw m1;
        }
        if (abyte0 == null)
        {
            i1 = 0;
        } else
        {
            i1 = d.length;
        }
        try
        {
            abyte0 = c;
        }
        // Misplaced declaration of an exception variable
        catch (m m1)
        {
            throw m1;
        }
        if (abyte0 != null)
        {
            j1 = c.length;
        }
        a2_1.d = Double.valueOf(j1 + i1);
        a2_1.b = Double.valueOf(System.currentTimeMillis() - j);
        a2_1.a = Double.valueOf(m1.getCode());
        com.whatsapp.fieldstats.z.a(App.au, a2_1);
    }

    static boolean a(a9g a9g1)
    {
        return a9g1.f;
    }

    public static boolean a(String s)
    {
        int i1 = App.am;
        if (s == null)
        {
            return false;
        }
        Iterator iterator = n.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            a9g a9g1 = (a9g)iterator.next();
            boolean flag;
            try
            {
                flag = s.equals(a9g1.a);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            if (flag)
            {
                return true;
            }
        } while (i1 == 0);
        return false;
    }

    static Long b(a9g a9g1)
    {
        return a9g1.h;
    }

    public void a(int i1)
    {
        og og1;
        Log.i((new StringBuilder()).append(z[1]).append(i1).append(z[0]).append(a).toString());
        f = true;
        l.cancel();
        n.remove(h.toString());
        a(m.ERROR_UNKNOWN);
        if (m)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        og1 = App.az.e(a);
        if (i1 != 401 || og1 == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        boolean flag = og1.k();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        NumberFormatException numberformatexception;
        try
        {
            flag = mk.c(og1.a);
        }
        catch (NumberFormatException numberformatexception1)
        {
            try
            {
                throw numberformatexception1;
            }
            catch (NumberFormatException numberformatexception2)
            {
                throw numberformatexception2;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        g.obtainMessage(3, i1, 0, a).sendToTarget();
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        g.obtainMessage(2, i1, 0, a).sendToTarget();
        return;
        numberformatexception;
        throw numberformatexception;
    }

    public void a(String s)
    {
        og og1;
        Log.i((new StringBuilder()).append(z[3]).append(s).append(z[2]).append(a).toString());
        f = true;
        l.cancel();
        n.remove(h.toString());
        a(m.OK);
        og1 = App.az.e(a);
        if (og1 == null) goto _L2; else goto _L1
_L1:
        int i1;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        i1 = -1;
_L4:
        boolean flag;
        try
        {
            og1.a(i1, i1);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        try
        {
            flag = m;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            try
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
        }
        if (flag) goto _L2; else goto _L3
_L3:
        s = d;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        s = c;
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        og1.g();
        if (App.am == 0)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        og1.a(d, c);
        og1.t();
        g.obtainMessage(1, a).sendToTarget();
_L2:
        return;
        i1 = Integer.parseInt(s);
          goto _L4
    }

    static 
    {
        Object obj;
        String as[];
        byte byte1;
        int i1;
        as = new String[4];
        obj = "x:\032";
        byte1 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte1)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "(4U|:4#Jr<,)R{=<*_h|*#Ko6+2\032|21*_~sbf";
                i1 = 1;
                byte1 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "x:\032";
                i1 = 2;
                byte1 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                i1 = 3;
                obj = "(4U|:4#Jr<,)R{=<*_h|*#Ko6+2\032i&;%_i x|\032";
                byte1 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                z = as;
                n = new HashMap();
                g = new t1();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 196
    //                   0 217
    //                   1 223
    //                   2 229
    //                   3 235;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_235;
_L3:
        byte byte0 = 83;
_L9:
        obj[j1] = (char)(byte0 ^ c);
        j1++;
          goto _L8
_L4:
        byte0 = 88;
          goto _L9
_L5:
        byte0 = 70;
          goto _L9
_L6:
        byte0 = 58;
          goto _L9
        byte0 = 26;
          goto _L9
    }
}
