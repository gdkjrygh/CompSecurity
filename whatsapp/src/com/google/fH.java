// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            fW, fc, P, bd

public class fH extends Exception
{

    private static final long serialVersionUID = 0x4fccd5afd98283ccL;
    private static final String z[];
    private final String a;
    private final String b;
    private final P c;

    private fH(fW fw, String s)
    {
        super((new StringBuilder()).append(fw.d()).append(z[1]).append(s).toString());
        a = fw.d();
        c = fw.a();
        b = s;
    }

    fH(fW fw, String s, bd bd)
    {
        this(fw, s);
    }

    private fH(fc fc1, String s)
    {
        super((new StringBuilder()).append(fc1.c()).append(z[0]).append(s).toString());
        a = fc1.c();
        c = fc1.d();
        b = s;
    }

    fH(fc fc1, String s, bd bd)
    {
        this(fc1, s);
    }

    private fH(fc fc1, String s, Throwable throwable)
    {
        this(fc1, s);
        initCause(throwable);
    }

    fH(fc fc1, String s, Throwable throwable, bd bd)
    {
        this(fc1, s, throwable);
    }

    public String a()
    {
        return b;
    }

    public P b()
    {
        return c;
    }

    public String c()
    {
        return a;
    }

    static 
    {
        Object obj;
        int i;
        int j;
        obj = "5i".toCharArray();
        j = obj.length;
        i = 0;
_L6:
        char ac[];
        char c1;
        if (j <= i)
        {
            obj = (new String(((char []) (obj)))).intern();
            ac = "5i".toCharArray();
            j = ac.length;
            i = 0;
            break MISSING_BLOCK_LABEL_42;
        }
        c1 = obj[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 112
    //                   0 130
    //                   1 136
    //                   2 142
    //                   3 148;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_148;
_L1:
        byte0 = 75;
_L7:
        obj[i] = (char)(byte0 ^ c1);
        i++;
          goto _L6
_L2:
        byte0 = 15;
          goto _L7
_L3:
        byte0 = 73;
          goto _L7
_L4:
        byte0 = 49;
          goto _L7
        byte0 = 51;
          goto _L7
_L14:
        byte byte0;
        if (j <= i)
        {
            z = (new String[] {
                obj, (new String(ac)).intern()
            });
            return;
        }
        c1 = ac[i];
        i % 5;
        JVM INSTR tableswitch 0 3: default 192
    //                   0 210
    //                   1 216
    //                   2 222
    //                   3 228;
           goto _L8 _L9 _L10 _L11 _L12
_L9:
        break; /* Loop/switch isn't completed */
_L12:
        break MISSING_BLOCK_LABEL_228;
_L8:
        byte byte1 = 75;
_L15:
        ac[i] = (char)(byte1 ^ c1);
        i++;
        if (true) goto _L14; else goto _L13
_L13:
        byte1 = 15;
          goto _L15
_L10:
        byte1 = 73;
          goto _L15
_L11:
        byte1 = 49;
          goto _L15
        byte1 = 51;
          goto _L15
    }
}
