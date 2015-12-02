// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.protocol;


// Referenced classes of package com.whatsapp.protocol:
//            a, bg

public class c4
{

    private static final String A;
    public static int F;
    private static int K;
    private static final String P[];
    public static final int a[];
    private static final Object c;
    public Object B;
    public String C;
    public int D;
    public boolean E;
    public String G;
    public int H;
    public long I;
    private String J;
    public String L;
    public int M;
    private boolean N;
    public long O;
    public String b;
    public String d;
    public String e;
    public int f;
    private int g;
    public String h;
    private byte i[];
    public Integer j;
    public String k;
    public String l;
    public int m;
    public int n;
    public double o;
    public String p;
    public String q[];
    public boolean r;
    public String s;
    public long t;
    private byte u[];
    public double v;
    public byte w;
    public boolean x;
    public a y;
    public String z;

    public c4(a a1)
    {
        x = true;
        j = null;
        y = a1;
    }

    public c4(c4 c4_1)
    {
        this(c4_1.y);
        G = c4_1.G;
        C = c4_1.C;
        J = c4_1.J;
        i = c4_1.i;
        u = c4_1.u;
        g = c4_1.g;
        f = c4_1.f;
        I = c4_1.I;
        n = c4_1.n;
        l = c4_1.l;
        k = c4_1.k;
        e = c4_1.e;
        w = c4_1.w;
        t = c4_1.t;
        h = c4_1.h;
        H = c4_1.H;
        L = c4_1.L;
        b = c4_1.b;
        r = c4_1.r;
        o = c4_1.o;
        v = c4_1.v;
        p = c4_1.p;
        E = c4_1.E;
        m = c4_1.m;
        O = c4_1.O;
        z = c4_1.z;
        d = c4_1.d;
        B = c4_1.B;
        x = c4_1.x;
        j = c4_1.j;
    }

    public c4(String s1, String s2, Object obj)
    {
        this(s1, true);
        J = s2;
        B = obj;
        I = System.currentTimeMillis();
    }

    private c4(String s1, boolean flag)
    {
        x = true;
        j = null;
        y = a(s1, flag);
    }

    public c4(String s1, byte abyte0[], Object obj)
    {
        this(s1, true);
        i = abyte0;
        B = obj;
        I = System.currentTimeMillis();
    }

    public static a a(String s1, boolean flag)
    {
        synchronized (c)
        {
            K++;
            s1 = new a(s1, flag, (new StringBuilder()).append(A).append(Integer.toString(K)).toString());
        }
        return s1;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public static String a(byte byte0)
    {
        if (byte0 == 0)
        {
            return null;
        }
        if (byte0 == 7)
        {
            String s1;
            try
            {
                s1 = P[4];
            }
            catch (RuntimeException runtimeexception)
            {
                throw runtimeexception;
            }
            return s1;
        }
        if (byte0 == 1)
        {
            String s2;
            try
            {
                s2 = P[1];
            }
            catch (RuntimeException runtimeexception1)
            {
                throw runtimeexception1;
            }
            return s2;
        }
        if (byte0 == 2)
        {
            String s3;
            try
            {
                s3 = P[0];
            }
            catch (RuntimeException runtimeexception2)
            {
                throw runtimeexception2;
            }
            return s3;
        }
        if (byte0 == 3)
        {
            String s4;
            try
            {
                s4 = P[2];
            }
            catch (RuntimeException runtimeexception3)
            {
                throw runtimeexception3;
            }
            return s4;
        }
        if (byte0 == 4)
        {
            String s5;
            try
            {
                s5 = P[3];
            }
            catch (RuntimeException runtimeexception4)
            {
                throw runtimeexception4;
            }
            return s5;
        }
        if (byte0 == 5)
        {
            String s6;
            try
            {
                s6 = P[5];
            }
            catch (RuntimeException runtimeexception5)
            {
                throw runtimeexception5;
            }
            return s6;
        } else
        {
            return null;
        }
    }

    public static byte b(String s1)
    {
        byte byte0 = 7;
        if (s1 == null) goto _L2; else goto _L1
_L1:
        int i1;
        try
        {
            i1 = s1.length();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (i1 != 0) goto _L3; else goto _L2
_L2:
        byte0 = 0;
_L5:
        return byte0;
_L3:
        boolean flag;
        try
        {
            flag = s1.equalsIgnoreCase(P[11]);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (!flag)
        {
            boolean flag1;
            try
            {
                flag1 = s1.equalsIgnoreCase(P[7]);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (flag1)
            {
                return 1;
            }
            try
            {
                flag1 = s1.equalsIgnoreCase(P[9]);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (flag1)
            {
                return 2;
            }
            try
            {
                flag1 = s1.equalsIgnoreCase(P[12]);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (flag1)
            {
                return 3;
            }
            try
            {
                flag1 = s1.equalsIgnoreCase(P[8]);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            if (flag1)
            {
                return 4;
            }
            try
            {
                flag1 = s1.equalsIgnoreCase(P[10]);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw s1;
            }
            return ((byte)(!flag1 ? 0 : 5));
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(int i1)
    {
        if (i1 < 0 || i1 > 1)
        {
            try
            {
                throw new IllegalArgumentException();
            }
            catch (RuntimeException runtimeexception)
            {
                throw runtimeexception;
            }
        } else
        {
            g = i1;
            return;
        }
    }

    public void a(String s1)
    {
        J = s1;
        i = null;
    }

    public void a(boolean flag)
    {
        N = flag;
    }

    public void a(byte abyte0[])
    {
        i = abyte0;
        J = null;
    }

    public byte[] a()
    {
        byte abyte0[] = i;
        RuntimeException runtimeexception;
        if (abyte0 == null)
        {
            try
            {
                if (J != null)
                {
                    i = bg.a(J);
                }
            }
            catch (RuntimeException runtimeexception1)
            {
                throw runtimeexception1;
            }
        }
        return i;
        runtimeexception;
        throw runtimeexception;
    }

    public void b(byte abyte0[])
    {
        u = abyte0;
    }

    public byte[] b()
    {
        return u;
    }

    public boolean c()
    {
        return N;
    }

    public int d()
    {
        return g;
    }

    public String e()
    {
        try
        {
            if (f == 1)
            {
                throw new RuntimeException(P[6]);
            }
        }
        catch (RuntimeException runtimeexception)
        {
            throw runtimeexception;
        }
        String s1 = J;
        RuntimeException runtimeexception1;
        if (s1 == null)
        {
            try
            {
                if (i != null)
                {
                    J = bg.a(i);
                }
            }
            catch (RuntimeException runtimeexception2)
            {
                throw runtimeexception2;
            }
        }
        return J;
        runtimeexception1;
        throw runtimeexception1;
    }

    public boolean f()
    {
        String s1;
        try
        {
            s1 = J;
        }
        catch (RuntimeException runtimeexception)
        {
            try
            {
                throw runtimeexception;
            }
            catch (RuntimeException runtimeexception1)
            {
                throw runtimeexception1;
            }
        }
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        if (i == null)
        {
            return false;
        }
        return true;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[13];
        obj = "+TH>\025";
        byte0 = -1;
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
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "#LM0\037";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "<HH2\025";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "<BM%\036";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "9X_#\037'";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "&NO6\016#NB";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = ">SU>\024-\001X8Z-DXw\036+UMw\0339\001X2\002>\001C9Z8@[w\027/R_6\035/";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "#LM0\037";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "<BM%\036";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                i1 = 9;
                obj = "+TH>\025";
                byte0 = 8;
                break;

            case 8: // '\b'
                as1[i1] = ((String) (obj));
                i1 = 10;
                obj = "&NO6\016#NB";
                byte0 = 9;
                break;

            case 9: // '\t'
                as1[i1] = ((String) (obj));
                i1 = 11;
                obj = "9X_#\037'";
                byte0 = 10;
                break;

            case 10: // '\n'
                as1[i1] = ((String) (obj));
                i1 = 12;
                obj = "<HH2\025";
                byte0 = 11;
                break;

            case 11: // '\013'
                as1[i1] = ((String) (obj));
                P = as;
                a = (new int[] {
                    14, 0, 1, 2, 3, 4, 5, 11, 12, 13, 
                    8, 9, 10, 7, 6
                });
                A = (new StringBuilder()).append(System.currentTimeMillis() / 1000L).append("-").toString();
                K = 0;
                c = new Object();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 496
    //                   0 519
    //                   1 526
    //                   2 533
    //                   3 540;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_540;
_L3:
        byte byte1 = 122;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 74;
          goto _L9
_L5:
        byte1 = 33;
          goto _L9
_L6:
        byte1 = 44;
          goto _L9
        byte1 = 87;
          goto _L9
    }
}
