// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            c, cx, c4, c_, 
//            b, b0, cu

class ar extends c
{

    private static final String z[];
    final cu a;
    final cx b;

    ar(cu cu, cx cx1)
    {
        a = cu;
        b = cx1;
        super();
    }

    public void a(int i)
    {
        try
        {
            if (b != null)
            {
                b.a(i);
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
        Object obj;
        boolean flag;
        int j;
        flag = false;
        j = c4.F;
        obj = c_1.a(z[0]);
        if (obj == null) goto _L2; else goto _L1
_L1:
        int i;
        s = ((c_) (obj)).d(z[8]);
        String s1 = ((c_) (obj)).d(z[6]);
        obj = ((c_) (obj)).d(z[1]);
        boolean flag1;
        if (obj == null)
        {
            i = 0;
        } else
        {
            try
            {
                i = Integer.parseInt(((String) (obj)));
            }
            catch (NumberFormatException numberformatexception2)
            {
                i = 0;
            }
        }
        try
        {
            if (b != null)
            {
                b.a(s, s1, i);
            }
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            throw c_1;
        }
        if (j == 0) goto _L3; else goto _L2
_L2:
        c_1 = c_1.a(z[4]);
        if (c_1 == null) goto _L3; else goto _L4
_L4:
        try
        {
            s = c_1.f;
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            throw c_1;
        }
        if (s == null) goto _L3; else goto _L5
_L5:
        s = new b();
        i = ((flag) ? 1 : 0);
_L16:
        if (i >= c_1.f.length)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!z[5].equals(c_1.f[i].a)) goto _L7; else goto _L6
_L6:
        s.a = c4.b(c_1.f[i].b);
        if (j == 0) goto _L8; else goto _L7
_L7:
        flag1 = z[2].equals(c_1.f[i].a);
        if (!flag1) goto _L10; else goto _L9
_L9:
        s.b = c_1.f[i].b;
        if (j == 0) goto _L8; else goto _L10
_L10:
        flag1 = z[9].equals(c_1.f[i].a);
        if (!flag1) goto _L12; else goto _L11
_L11:
        s.e = c_1.f[i].b;
        if (j == 0) goto _L8; else goto _L12
_L12:
        try
        {
            flag1 = z[7].equals(c_1.f[i].a);
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            throw c_1;
        }
        if (!flag1) goto _L14; else goto _L13
_L13:
        s.c = Long.parseLong(c_1.f[i].b);
_L8:
        i++;
        if (j == 0) goto _L16; else goto _L15
_L15:
        if (b != null)
        {
            b.a(s);
        }
_L3:
        return;
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
        NumberFormatException numberformatexception;
        numberformatexception;
        if (j == 0) goto _L8; else goto _L14
_L14:
        boolean flag2;
        try
        {
            flag2 = z[3].equals(c_1.f[i].a);
        }
        // Misplaced declaration of an exception variable
        catch (c_ c_1)
        {
            throw c_1;
        }
        if (flag2)
        {
            try
            {
                s.f = Integer.parseInt(c_1.f[i].b);
            }
            catch (NumberFormatException numberformatexception1) { }
        }
          goto _L8
        c_1;
        throw c_1;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[10];
        obj = "d\025eo\035";
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
                obj = "{\025rs\021l";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "d\031lc\bp\000d";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "m\005sg\b`\037o";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                i = 4;
                obj = "m\005qj\025j\021uc";
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "}\tqc";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                obj = "`\0";
                byte0 = 5;
                i = 6;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                i = 7;
                obj = "z\031{c";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i] = ((String) (obj));
                i = 8;
                obj = "|\002m";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i] = ((String) (obj));
                i = 9;
                obj = "|\002m";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 300
    //                   0 323
    //                   1 330
    //                   2 337
    //                   3 343;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_343;
_L3:
        byte byte1 = 124;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 9;
          goto _L9
_L5:
        byte1 = 112;
          goto _L9
_L6:
        byte1 = 1;
          goto _L9
        byte1 = 6;
          goto _L9
    }
}
