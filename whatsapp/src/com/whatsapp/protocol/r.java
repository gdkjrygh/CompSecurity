// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, b_, c4, c_, 
//            cu

class r extends c
{

    private static final String z[];
    final cu a;
    final b_ b;

    r(cu cu, b_ b_1)
    {
        a = cu;
        b = b_1;
        super();
    }

    public void a(int i)
    {
        b.a(i);
    }

    public void a(c_ c_1, String s)
    {
        int i;
        long l;
        l = 0L;
        i = c4.F;
        c_1 = c_1.a(z[4]);
        if (c_1 == null) goto _L2; else goto _L1
_L1:
        s = c_1.a;
        if (s == null) goto _L2; else goto _L3
_L3:
        String s1;
        int j;
        boolean flag;
        try
        {
            j = c_1.a.length;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            throw c_1;
        }
        if (j != 1) goto _L2; else goto _L4
_L4:
        c_1 = c_1.a[0];
        c_.b(c_1, z[0]);
        s = c_1.d("t");
        if (s != null) goto _L6; else goto _L5
_L5:
        l *= 1000L;
_L8:
        s = c_1.d(z[6]);
        s1 = c_1.d(z[1]);
        c_1 = c_1.a();
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        flag = s1.equals(z[2]);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        flag = z[7].equals(s);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        flag = z[5].equals(s);
        if (flag)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        flag = z[3].equals(s);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        b.b();
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        long l1;
        try
        {
            b.a();
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            throw c_1;
        }
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        b.a(l, c_1);
        if (i == 0) goto _L7; else goto _L2
_L2:
        b.a();
_L7:
        return;
        c_1;
        throw c_1;
_L6:
        l1 = Long.parseLong(s);
        l = l1;
          goto _L5
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
        throw c_1;
        c_1;
        throw c_1;
        s;
          goto _L8
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[8];
        obj = "\n5u\007";
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
                obj = "\013?`\020";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\031'y\031";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "Kv$";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\f2q\0013\f";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "Kv#";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\034)t\020";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "Kv!";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 256
    //                   0 279
    //                   1 286
    //                   2 293
    //                   3 300;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_300;
_L3:
        byte byte1 = 70;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 127;
          goto _L9
_L5:
        byte1 = 70;
          goto _L9
_L6:
        byte1 = 16;
          goto _L9
        byte1 = 117;
          goto _L9
    }
}
