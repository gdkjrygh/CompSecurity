// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.util.Enumeration;
import java.util.Hashtable;

// Referenced classes of package com.whatsapp.protocol:
//            c, cu, bb, c4, 
//            c_

class s extends c
{

    private static final String z[];
    final Hashtable a;
    final cu b;

    s(cu cu1, Hashtable hashtable)
    {
        b = cu1;
        a = hashtable;
        super();
    }

    public void a(int i)
    {
        cu.d(b).a(new Integer(i));
    }

    public void a(c_ c_1, String s1)
    {
        int j;
        j = c4.F;
        c_1 = c_1.a(z[5]);
        if (c_1 == null) goto _L2; else goto _L1
_L1:
        Object obj;
        String s2;
        String s3;
        int i;
        long l;
        boolean flag;
        try
        {
            s1 = c_1.a;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            throw c_1;
        }
        if (s1 == null) goto _L2; else goto _L3
_L3:
        i = 0;
_L6:
        if (i >= c_1.a.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = c_1.a[i];
        c_.b(((c_) (obj)), z[6]);
        s1 = ((c_) (obj)).d(z[0]);
        s2 = ((c_) (obj)).d("t");
        if (s2 != null) goto _L5; else goto _L4
_L4:
        l = 0L;
_L7:
        l *= 1000L;
_L8:
        s2 = ((c_) (obj)).d(z[4]);
        s3 = ((c_) (obj)).d(z[8]);
        obj = ((c_) (obj)).a();
        a.remove(s1);
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        flag = s3.equals(z[3]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_240;
        }
        flag = z[1].equals(s2);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        flag = z[7].equals(s2);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        flag = z[2].equals(s2);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        cu.d(b).c(s1);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        NumberFormatException numberformatexception;
        try
        {
            cu.d(b).d(s1);
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            throw c_1;
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        cu.d(b).a(s1, l, ((String) (obj)));
        i++;
        if (j == 0) goto _L6; else goto _L2
_L2:
        c_1 = a.keys();
        do
        {
            if (!c_1.hasMoreElements())
            {
                break;
            }
            s1 = (String)c_1.nextElement();
            cu.d(b).d(s1);
        } while (j == 0);
        cu.d(b).a(null);
        return;
_L5:
        l = Long.parseLong(s2);
          goto _L7
        numberformatexception;
        l = 0L;
          goto _L8
        c_1;
        try
        {
            throw c_1;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1) { }
        try
        {
            throw c_1;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1) { }
        try
        {
            throw c_1;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1) { }
        try
        {
            throw c_1;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1) { }
        try
        {
            throw c_1;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1) { }
        throw c_1;
          goto _L7
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[9];
        obj = ":|<";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "d%i";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "d%l";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "6t1$";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "3z<-";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "#a9<\005#";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "%f=:";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "d%k";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "$l(-";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 280
    //                   0 303
    //                   1 310
    //                   2 317
    //                   3 324;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_324;
_L3:
        byte byte1 = 112;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 80;
          goto _L9
_L5:
        byte1 = 21;
          goto _L9
_L6:
        byte1 = 88;
          goto _L9
        byte1 = 72;
          goto _L9
    }
}
