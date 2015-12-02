// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;

// Referenced classes of package com.google:
//            aI, gv, eL, w

public abstract class a3
    implements Iterable
{

    static final boolean a;
    public static final a3 b;
    private static final String z[];

    a3()
    {
    }

    public static a3 a(String s)
    {
        try
        {
            s = new aI(s.getBytes(z[0]));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(z[1], s);
        }
        return s;
    }

    public static a3 a(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public static a3 a(byte abyte0[], int j, int k)
    {
        byte abyte1[] = new byte[k];
        System.arraycopy(abyte0, j, abyte1, 0, k);
        return new aI(abyte1);
    }

    static gv a(int j)
    {
        return new gv(j, null);
    }

    protected abstract int a(int j, int k, int l);

    public abstract InputStream a();

    public void a(byte abyte0[], int j, int k, int l)
    {
        if (j < 0)
        {
            try
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append(z[7]).append(j).toString());
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        if (k < 0)
        {
            try
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append(z[6]).append(k).toString());
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        if (l < 0)
        {
            try
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append(z[5]).append(l).toString());
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw abyte0;
            }
        }
        try
        {
            if (j + l > c())
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append(z[8]).append(j + l).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        try
        {
            if (k + l > abyte0.length)
            {
                throw new IndexOutOfBoundsException((new StringBuilder()).append(z[9]).append(k + l).toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw abyte0;
        }
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        b(abyte0, j, k, l);
        return;
        abyte0;
        throw abyte0;
    }

    public abstract byte b(int j);

    protected abstract int b(int j, int k, int l);

    public abstract String b(String s);

    protected abstract void b(byte abyte0[], int j, int k, int l);

    public boolean b()
    {
        int j;
        try
        {
            j = c();
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        return j == 0;
    }

    public abstract int c();

    public abstract eL d();

    public abstract w e();

    public abstract boolean equals(Object obj);

    public byte[] f()
    {
        int j = c();
        byte abyte0[] = new byte[j];
        b(abyte0, 0, 0, j);
        return abyte0;
    }

    protected abstract int g();

    public String h()
    {
        String s;
        try
        {
            s = b(z[4]);
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new RuntimeException(z[3], unsupportedencodingexception);
        }
        return s;
    }

    public abstract int hashCode();

    public abstract boolean i();

    public Iterator iterator()
    {
        return e();
    }

    public String toString()
    {
        return String.format(z[2], new Object[] {
            Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(c())
        });
    }

    static 
    {
        Object obj;
        int j;
        int k;
        obj = "\\jZiP".toCharArray();
        k = obj.length;
        j = 0;
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        char ac[];
        char c1;
        boolean flag;
        if (k <= j)
        {
            obj = (new String(((char []) (obj)))).intern();
            obj1 = "\\jZiP)Ps0HzKl4\007{Jy W".toCharArray();
            k = obj1.length;
            j = 0;
            break MISSING_BLOCK_LABEL_45;
        }
        c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 480
    //                   0 503
    //                   1 510
    //                   2 517
    //                   3 524;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_524;
_L1:
        byte0 = 104;
_L7:
        obj[j] = (char)(byte0 ^ c1);
        j++;
          goto _L6
_L2:
        byte0 = 9;
          goto _L7
_L3:
        byte0 = 62;
          goto _L7
_L4:
        byte0 = 28;
          goto _L7
        byte0 = 68;
          goto _L7
_L13:
        byte byte0;
        if (k <= j)
        {
            obj1 = (new String(((char []) (obj1)))).intern();
            obj2 = "5|e0\rZJn-\006n~97HzWf!U,Z\"".toCharArray();
            k = obj2.length;
            j = 0;
            break MISSING_BLOCK_LABEL_77;
        }
        c1 = obj1[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 572
    //                   0 595
    //                   1 602
    //                   2 609
    //                   3 616;
           goto _L8 _L9 _L10 _L11 _L12
_L12:
        break MISSING_BLOCK_LABEL_616;
_L8:
        byte1 = 104;
_L14:
        obj1[j] = (char)(byte1 ^ c1);
        j++;
          goto _L13
_L9:
        byte1 = 9;
          goto _L14
_L10:
        byte1 = 62;
          goto _L14
_L11:
        byte1 = 28;
          goto _L14
        byte1 = 68;
          goto _L14
_L20:
        byte byte1;
        if (k <= j)
        {
            obj2 = (new String(((char []) (obj2)))).intern();
            obj3 = "\\jZiP)Ps0HzKl4\007{Jy W".toCharArray();
            k = obj3.length;
            j = 0;
            break MISSING_BLOCK_LABEL_109;
        }
        c1 = obj2[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 664
    //                   0 687
    //                   1 694
    //                   2 701
    //                   3 708;
           goto _L15 _L16 _L17 _L18 _L19
_L19:
        break MISSING_BLOCK_LABEL_708;
_L15:
        byte2 = 104;
_L21:
        obj2[j] = (char)(byte2 ^ c1);
        j++;
          goto _L20
_L16:
        byte2 = 9;
          goto _L21
_L17:
        byte2 = 62;
          goto _L21
_L18:
        byte2 = 28;
          goto _L21
        byte2 = 68;
          goto _L21
_L27:
        byte byte2;
        if (k <= j)
        {
            obj3 = (new String(((char []) (obj3)))).intern();
            obj4 = "\\jZiP".toCharArray();
            k = obj4.length;
            j = 0;
            break MISSING_BLOCK_LABEL_143;
        }
        c1 = obj3[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 756
    //                   0 779
    //                   1 786
    //                   2 793
    //                   3 800;
           goto _L22 _L23 _L24 _L25 _L26
_L26:
        break MISSING_BLOCK_LABEL_800;
_L22:
        byte3 = 104;
_L28:
        obj3[j] = (char)(byte3 ^ c1);
        j++;
          goto _L27
_L23:
        byte3 = 9;
          goto _L28
_L24:
        byte3 = 62;
          goto _L28
_L25:
        byte3 = 28;
          goto _L28
        byte3 = 68;
          goto _L28
_L34:
        byte byte3;
        if (k <= j)
        {
            obj4 = (new String(((char []) (obj4)))).intern();
            obj5 = "E[r#\034a\036 dX3\036".toCharArray();
            k = obj5.length;
            j = 0;
            break MISSING_BLOCK_LABEL_179;
        }
        c1 = obj4[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 848
    //                   0 872
    //                   1 879
    //                   2 886
    //                   3 893;
           goto _L29 _L30 _L31 _L32 _L33
_L33:
        break MISSING_BLOCK_LABEL_893;
_L29:
        byte4 = 104;
_L35:
        obj4[j] = (char)(byte4 ^ c1);
        j++;
          goto _L34
_L30:
        byte4 = 9;
          goto _L35
_L31:
        byte4 = 62;
          goto _L35
_L32:
        byte4 = 28;
          goto _L35
        byte4 = 68;
          goto _L35
_L41:
        byte byte4;
        if (k <= j)
        {
            obj5 = (new String(((char []) (obj5)))).intern();
            obj6 = "]_n#\r}\036s\"\016z[hdT)\016&d".toCharArray();
            k = obj6.length;
            j = 0;
            break MISSING_BLOCK_LABEL_215;
        }
        c1 = obj5[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 940
    //                   0 964
    //                   1 971
    //                   2 978
    //                   3 985;
           goto _L36 _L37 _L38 _L39 _L40
_L40:
        break MISSING_BLOCK_LABEL_985;
_L36:
        byte5 = 104;
_L42:
        obj5[j] = (char)(byte5 ^ c1);
        j++;
          goto _L41
_L37:
        byte5 = 9;
          goto _L42
_L38:
        byte5 = 62;
          goto _L42
_L39:
        byte5 = 28;
          goto _L42
        byte5 = 68;
          goto _L42
_L48:
        byte byte5;
        if (k <= j)
        {
            obj6 = (new String(((char []) (obj6)))).intern();
            obj7 = "ZQi6\013l\036s\"\016z[hdT)\016&d".toCharArray();
            k = obj7.length;
            j = 0;
            break MISSING_BLOCK_LABEL_251;
        }
        c1 = obj6[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1032
    //                   0 1056
    //                   1 1063
    //                   2 1070
    //                   3 1077;
           goto _L43 _L44 _L45 _L46 _L47
_L47:
        break MISSING_BLOCK_LABEL_1077;
_L43:
        byte6 = 104;
_L49:
        obj6[j] = (char)(byte6 ^ c1);
        j++;
          goto _L48
_L44:
        byte6 = 9;
          goto _L49
_L45:
        byte6 = 62;
          goto _L49
_L46:
        byte6 = 28;
          goto _L49
        byte6 = 68;
          goto _L49
_L55:
        byte byte6;
        if (k <= j)
        {
            obj7 = (new String(((char []) (obj7)))).intern();
            obj8 = "ZQi6\013l\036y*\f)Qz\"\033lJ<xH9\004<".toCharArray();
            k = obj8.length;
            j = 0;
            break MISSING_BLOCK_LABEL_287;
        }
        c1 = obj7[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1124
    //                   0 1148
    //                   1 1155
    //                   2 1162
    //                   3 1169;
           goto _L50 _L51 _L52 _L53 _L54
_L54:
        break MISSING_BLOCK_LABEL_1169;
_L50:
        byte7 = 104;
_L56:
        obj7[j] = (char)(byte7 ^ c1);
        j++;
          goto _L55
_L51:
        byte7 = 9;
          goto _L56
_L52:
        byte7 = 62;
          goto _L56
_L53:
        byte7 = 28;
          goto _L56
        byte7 = 68;
          goto _L56
_L62:
        byte byte7;
        if (k <= j)
        {
            obj8 = (new String(((char []) (obj8)))).intern();
            ac = "]_n#\r}\036y*\f)Qz\"\033lJ<xH9\004<".toCharArray();
            k = ac.length;
            j = 0;
            break MISSING_BLOCK_LABEL_323;
        }
        c1 = obj8[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1216
    //                   0 1240
    //                   1 1247
    //                   2 1254
    //                   3 1261;
           goto _L57 _L58 _L59 _L60 _L61
_L61:
        break MISSING_BLOCK_LABEL_1261;
_L57:
        byte8 = 104;
_L63:
        obj8[j] = (char)(byte8 ^ c1);
        j++;
          goto _L62
_L58:
        byte8 = 9;
          goto _L63
_L59:
        byte8 = 62;
          goto _L63
_L60:
        byte8 = 28;
          goto _L63
        byte8 = 68;
          goto _L63
_L70:
        byte byte8;
        if (k <= j)
        {
            z = (new String[] {
                obj, obj1, obj2, obj3, obj4, obj5, obj6, obj7, obj8, (new String(ac)).intern()
            });
            try
            {
                flag = com/google/a3.desiredAssertionStatus();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
            b = new aI(new byte[0]);
            return;
        }
        c1 = ac[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 1308
    //                   0 1332
    //                   1 1339
    //                   2 1346
    //                   3 1353;
           goto _L64 _L65 _L66 _L67 _L68
_L65:
        break; /* Loop/switch isn't completed */
_L68:
        break MISSING_BLOCK_LABEL_1353;
_L64:
        byte byte9 = 104;
_L71:
        ac[j] = (char)(byte9 ^ c1);
        j++;
        if (true) goto _L70; else goto _L69
_L69:
        byte9 = 9;
          goto _L71
_L66:
        byte9 = 62;
          goto _L71
_L67:
        byte9 = 28;
          goto _L71
        byte9 = 68;
          goto _L71
    }
}
