// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;

import java.util.Hashtable;
import java.util.Vector;

// Referenced classes of package com.whatsapp.protocol:
//            c, c4, c_, bp, 
//            bd, cu, bn

class aw extends c
{

    private static final String z[];
    final String a[];
    final cu b;

    aw(cu cu1, String as[])
    {
        b = cu1;
        a = as;
        super();
    }

    public void a(c_ c_1, String s)
    {
        Vector vector;
        Hashtable hashtable;
        int j;
        j = c4.F;
        s = c_.a(c_1.a(z[1]));
        vector = new Vector(a.length);
        hashtable = new Hashtable(a.length);
        if (((c_) (s)).a == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        if (i >= ((c_) (s)).a.length) goto _L2; else goto _L3
_L3:
        String s1;
        Object obj;
        c_ c_2;
        c_ c_3;
        c_ c_4;
        c_4 = ((c_) (s)).a[i];
        s1 = c_4.d(z[6]);
        if (s1 == null)
        {
            try
            {
                throw new bp(z[7]);
            }
            // Misplaced declaration of an exception variable
            catch (c_ c_1)
            {
                throw c_1;
            }
        }
        if (c_4.a(z[8]) != null)
        {
            c_1 = c_4.e(z[15]);
            try
            {
                obj = new Integer(Integer.parseInt(c_1));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new bp((new StringBuilder()).append(z[14]).append(c_1).toString());
            }
            vector.addElement(s1);
            hashtable.put(s1, obj);
            if (j == 0)
            {
                break MISSING_BLOCK_LABEL_482;
            }
        }
        obj = c_.a(c_4.a(z[0]));
        c_2 = c_.a(c_4.a(z[16]));
        c_3 = c_.a(c_4.a(z[11]));
        try
        {
            c_1 = c_3.b;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            try
            {
                throw c_1;
            }
            // Misplaced declaration of an exception variable
            catch (c_ c_1)
            {
                throw c_1;
            }
        }
        if (c_1 == null)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        if (c_3.b.length == 1)
        {
            break MISSING_BLOCK_LABEL_287;
        }
        throw new bp(z[4]);
label0:
        {
            c_ c_5 = c_4.a(z[13]);
            if (c_5 != null)
            {
                c_1 = c_.a(c_5.a(z[12]));
                c_5 = c_.a(c_5.a(z[10]));
                c_1 = new bd(c_1.b, c_5.b, null);
                if (j == 0)
                {
                    break label0;
                }
            }
            c_1 = null;
        }
        c_ c_7 = c_.a(c_4.a(z[2]));
        c_4 = c_.a(c_7.a(z[9]));
        c_ c_6 = c_.a(c_7.a(z[3]));
        c_7 = c_.a(c_7.a(z[5]));
        cu.c(b).a(s1, ((c_) (obj)).b, c_2.b, c_3.b[0], c_1, new bd(c_4.b, c_6.b, c_7.b));
        vector.addElement(s1);
        if (j == 0) goto _L4; else goto _L2
_L2:
        i = 0;
        do
        {
label1:
            {
                if (i < a.length)
                {
                    try
                    {
                        if (!vector.contains(a[i]))
                        {
                            cu.c(b).a(a[i]);
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (c_ c_1)
                    {
                        throw c_1;
                    }
                    try
                    {
                        if (hashtable.containsKey(a[i]))
                        {
                            cu.c(b).a(a[i], ((Integer)hashtable.get(a[i])).intValue());
                        }
                    }
                    // Misplaced declaration of an exception variable
                    catch (c_ c_1)
                    {
                        throw c_1;
                    }
                    if (j == 0)
                    {
                        break label1;
                    }
                }
                return;
            }
            i++;
        } while (true);
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[17];
        obj = ",\037 \005S,\017<";
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
                obj = ")\0226\037";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "6\020 \022";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "3\032)\036B";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "1\0025\016\007+\024!\016\0076\023*\036K![&\004I1\032,\005\007 \003$\bS)\002eZ\007'\0021\016";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "6\022\"\005F1\0167\016";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "/\022!";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "(\0226\030N+\034e\001N![*\005\0070\b \031\007+\024!\016";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = " \t7\004U";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = ",\037";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                i = 10;
                obj = "3\032)\036B";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i] = ((String) (obj));
                i = 11;
                obj = "1\0025\016";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i] = ((String) (obj));
                i = 12;
                obj = ",\037";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i] = ((String) (obj));
                i = 13;
                obj = ".\036<";
                byte0 = 12;
                break;

            case 12: // '\f'
                as1[i] = ((String) (obj));
                i = 14;
                obj = " \t7\004Ue\025*\017Be\b-\004R)\037e\003F3\036e\005R(\0367\002De\030*\017Be\0321\037U,\0310\037B\177[";
                byte0 = 13;
                break;

            case 13: // '\r'
                as1[i] = ((String) (obj));
                i = 15;
                obj = "&\024!\016";
                byte0 = 14;
                break;

            case 14: // '\016'
                as1[i] = ((String) (obj));
                i = 16;
                obj = "7\036\"\002T1\t$\037N*\025";
                byte0 = 15;
                break;

            case 15: // '\017'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 456
    //                   0 479
    //                   1 486
    //                   2 493
    //                   3 500;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_500;
_L3:
        byte byte1 = 39;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 69;
          goto _L9
_L5:
        byte1 = 123;
          goto _L9
_L6:
        byte1 = 69;
          goto _L9
        byte1 = 107;
          goto _L9
    }
}
