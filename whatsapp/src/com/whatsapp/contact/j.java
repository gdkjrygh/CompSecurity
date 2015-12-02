// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.contact;


// Referenced classes of package com.whatsapp.contact:
//            m, k, b

public final class j extends Enum
{

    public static final j BACKGROUND_DELTA;
    public static final j BACKGROUND_FULL;
    public static final j INTERACTIVE_DELTA;
    public static final j INTERACTIVE_FULL;
    public static final j REGISTRATION_FULL;
    private static final j b[];
    private static final String z[];
    private final k a;
    private final m c;

    private j(String s, int i, m m1, k k1)
    {
        super(s, i);
        c = m1;
        a = k1;
    }

    private static j a(m m1, k k1)
    {
        j aj[];
        int i;
        int l;
        boolean flag;
        flag = b.b;
        aj = values();
        l = aj.length;
        i = 0;
_L2:
        if (i >= l)
        {
            break; /* Loop/switch isn't completed */
        }
        j j1 = aj[i];
        m m2;
        try
        {
            m2 = j1.c;
        }
        // Misplaced declaration of an exception variable
        catch (m m1)
        {
            try
            {
                throw m1;
            }
            // Misplaced declaration of an exception variable
            catch (m m1)
            {
                throw m1;
            }
        }
        if (m2 != m1)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        if (j1.a == k1)
        {
            return j1;
        }
        i++;
        if (!flag) goto _L2; else goto _L1
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append(z[1]).append(m1).append("/").append(k1).append(z[0]).toString());
    }

    public static j combine(j j1, j j2)
    {
        j j3;
        if (j1 == j2 || j2 == null)
        {
            j3 = j1;
        } else
        {
            j3 = j2;
            if (j1 != null)
            {
                m m1 = j1.c;
                m m2 = j2.c;
                int i;
                try
                {
                    i = m1.compareTo(m2);
                }
                // Misplaced declaration of an exception variable
                catch (j j1)
                {
                    throw j1;
                }
                if (i >= 0)
                {
                    m1 = m2;
                }
                j1 = j1.a;
                j2 = j2.a;
                try
                {
                    i = j1.compareTo(j2);
                }
                // Misplaced declaration of an exception variable
                catch (j j1)
                {
                    throw j1;
                }
                if (i >= 0)
                {
                    j1 = j2;
                }
                return a(m1, j1);
            }
        }
        return j3;
    }

    public static j valueOf(String s)
    {
        return (j)Enum.valueOf(com/whatsapp/contact/j, s);
    }

    public static j[] values()
    {
        return (j[])b.clone();
    }

    public String getSyncContext()
    {
        return c.getContextString();
    }

    public String getSyncMode()
    {
        return a.getModeString();
    }

    public boolean isFullSync()
    {
        k k1;
        k k2;
        try
        {
            k1 = a;
            k2 = k.FULL;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        return k1 == k2;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[7];
        obj = "c\025c*u$Zse'/Eu &/[se4jGb&:-[n?0.\025T<;)a~50";
        byte0 = -1;
        i = 0;
_L2:
        String as1[];
        int l;
        int i1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        i1 = obj.length;
        l = 0;
_L8:
label0:
        {
            if (i1 > l)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i] = ((String) (obj));
                obj = "\tZi102A(\b:.P'm";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\003{S\000\007\013vS\f\003\017jC\000\031\036t";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "\030p@\f\006\036gF\021\034\005{X\003\000\006y";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\003{S\000\007\013vS\f\003\017jA\020\031\006";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\btD\016\022\030zR\013\021\025sR\t\031";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                i = 6;
                obj = "\btD\016\022\030zR\013\021\025qB\t\001\013";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i] = ((String) (obj));
                z = as;
                REGISTRATION_FULL = new j(z[3], 0, m.REGISTRATION, k.FULL);
                INTERACTIVE_FULL = new j(z[4], 1, m.INTERACTIVE, k.FULL);
                INTERACTIVE_DELTA = new j(z[2], 2, m.INTERACTIVE, k.DELTA);
                BACKGROUND_FULL = new j(z[5], 3, m.BACKGROUND, k.FULL);
                BACKGROUND_DELTA = new j(z[6], 4, m.BACKGROUND, k.DELTA);
                b = (new j[] {
                    REGISTRATION_FULL, INTERACTIVE_FULL, INTERACTIVE_DELTA, BACKGROUND_FULL, BACKGROUND_DELTA
                });
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[l];
        l % 5;
        JVM INSTR tableswitch 0 3: default 384
    //                   0 407
    //                   1 414
    //                   2 421
    //                   3 428;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_428;
_L3:
        byte byte1 = 85;
_L9:
        obj[l] = (char)(byte1 ^ c1);
        l++;
          goto _L8
_L4:
        byte1 = 74;
          goto _L9
_L5:
        byte1 = 53;
          goto _L9
_L6:
        byte1 = 7;
          goto _L9
        byte1 = 69;
          goto _L9
    }
}
