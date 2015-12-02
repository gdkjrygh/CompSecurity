// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package com.whatsapp.protocol:
//            c, ci, c4, c_, 
//            cu, cp

class as extends c
{

    private static final String z[];
    final cu a;
    final Runnable b;
    final ci c;

    as(cu cu1, Runnable runnable, ci ci1)
    {
        a = cu1;
        b = runnable;
        c = ci1;
        super();
    }

    public void a(int i)
    {
        try
        {
            if (c != null)
            {
                c.a(i);
            }
            return;
        }
        catch (NumberFormatException numberformatexception)
        {
            throw numberformatexception;
        }
    }

    public void a(c_ c_1, String s)
    {
        int j;
        j = c4.F;
        s = new Vector();
        c_1 = c_1.a(z[1]);
        if (c_1 == null) goto _L2; else goto _L1
_L1:
        int i;
        c_1 = c_1.b(z[5]);
        i = 0;
_L9:
        if (i >= c_1.size()) goto _L2; else goto _L3
_L3:
        c_ c_2;
        String s1;
        String s2;
        Object obj;
        long l2;
        c_2 = (c_)c_1.elementAt(i);
        s1 = c_2.d(z[10]);
        s1 = cu.a(a, s1);
        s2 = c_2.d(z[2]);
        obj = c_2.d(z[7]);
        l2 = 0L;
        long l = Long.parseLong(((String) (obj)));
        l2 = l * 1000L;
_L5:
        String s3;
        String s4;
        long l3;
        s3 = c_2.d(z[3]);
        s4 = c_2.d(z[4]);
        l3 = 0L;
        l = Long.parseLong(s4);
        l3 = l * 1000L;
_L6:
        String s5 = c_2.d(z[8]);
        String s6 = c_2.d(z[0]);
        long l4 = 0L;
        String s7 = c_2.d(z[6]);
        long l1 = l4;
        if (s7 == null)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        boolean flag;
        try
        {
            flag = s7.equals(z[9]);
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            throw c_1;
        }
        l1 = l4;
        if (flag)
        {
            l4 = -1L;
            l1 = l4;
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_269;
            }
            l1 = l4;
        }
        l4 = Math.max(0L, Long.parseLong(((String) (obj))) * 1000L);
        l1 = l4;
_L7:
        obj = new Hashtable();
        cu.a(a, c_2, ((Hashtable) (obj)));
        cu.a(a).b(s1, s2, l2, s3, l3, s5, s6, l1, ((Hashtable) (obj)));
        s.addElement(s1);
        if (j == 0) goto _L4; else goto _L2
_L2:
        try
        {
            cu.a(a).b(s);
            if (b != null)
            {
                b.run();
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            throw c_1;
        }
        NumberFormatException numberformatexception;
        numberformatexception;
          goto _L5
        NumberFormatException numberformatexception2;
        numberformatexception2;
          goto _L6
        NumberFormatException numberformatexception1;
        numberformatexception1;
          goto _L7
_L4:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    static 
    {
        Object obj;
        String as1[];
        byte byte0;
        int i;
        as1 = new String[11];
        obj = "\n\027Z\017";
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
                obj = "\031\034E\0374\r";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as2[i] = ((String) (obj));
                obj = "\035\034O\0130\021\034";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as2[i] = ((String) (obj));
                obj = "\r\033H\000!\035\032";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as2[i] = ((String) (obj));
                obj = "\r1^";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as2[i] = ((String) (obj));
                i = 5;
                obj = "\031\034E\0374";
                byte0 = 4;
                break;

            case 4: // '\004'
                as2[i] = ((String) (obj));
                i = 6;
                obj = "\022\001I\0130\027\001D";
                byte0 = 5;
                break;

            case 5: // '\005'
                as2[i] = ((String) (obj));
                i = 7;
                obj = "\035\034O\0130\027\001D";
                byte0 = 6;
                break;

            case 6: // '\006'
                as2[i] = ((String) (obj));
                i = 8;
                obj = "\r1E";
                byte0 = 7;
                break;

            case 7: // '\007'
                as2[i] = ((String) (obj));
                i = 9;
                obj = "\037\030K\003(\037\fF\017";
                byte0 = 8;
                break;

            case 8: // '\b'
                as2[i] = ((String) (obj));
                i = 10;
                obj = "\027\n";
                byte0 = 9;
                break;

            case 9: // '\t'
                as2[i] = ((String) (obj));
                z = as1;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 324
    //                   0 347
    //                   1 354
    //                   2 361
    //                   3 368;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_368;
_L3:
        byte byte1 = 68;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 126;
          goto _L9
_L5:
        byte1 = 110;
          goto _L9
_L6:
        byte1 = 42;
          goto _L9
        byte1 = 106;
          goto _L9
    }
}
