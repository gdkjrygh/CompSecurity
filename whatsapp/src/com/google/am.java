// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            a6, gh

final class am
{

    private static final String z[];
    private final a6 a;
    private final int b[];

    am(a6 a6_1, int ai[])
    {
        int i = 1;
        super();
        if (ai.length == 0)
        {
            throw new IllegalArgumentException();
        }
        a = a6_1;
        int j = ai.length;
        if (j > 1 && ai[0] == 0)
        {
            for (; i < j && ai[i] == 0; i++) { }
            if (i == j)
            {
                try
                {
                    b = (new int[] {
                        0
                    });
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (a6 a6_1)
                {
                    throw a6_1;
                }
            } else
            {
                b = new int[j - i];
                System.arraycopy(ai, i, b, 0, b.length);
                return;
            }
        } else
        {
            b = ai;
            return;
        }
    }

    int a()
    {
        return b.length - 1;
    }

    am a(int i)
    {
        int k = a6.n;
        Object obj;
        if (i == 0)
        {
            try
            {
                obj = a.d();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        } else
        {
            obj = this;
            if (i != 1)
            {
                int l = b.length;
                int ai[] = new int[l];
                int j = 0;
                do
                {
                    if (j >= l)
                    {
                        break;
                    }
                    ai[j] = a.c(b[j], i);
                    j++;
                } while (k == 0);
                return new am(a, ai);
            }
        }
        return ((am) (obj));
    }

    am a(int i, int j)
    {
        int k = a6.n;
        if (i < 0)
        {
            try
            {
                throw new IllegalArgumentException();
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
        }
        if (j == 0)
        {
            am am1;
            try
            {
                am1 = a.d();
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            return am1;
        }
        int l = b.length;
        int ai[] = new int[l + i];
        i = 0;
        do
        {
            if (i >= l)
            {
                break;
            }
            ai[i] = a.c(b[i], j);
            i++;
        } while (k == 0);
        return new am(a, ai);
    }

    am a(am am1)
    {
        int k = a6.n;
        try
        {
            if (!a.equals(am1.a))
            {
                throw new IllegalArgumentException(z[5]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (am am1)
        {
            throw am1;
        }
        boolean flag;
        try
        {
            flag = b();
        }
        // Misplaced declaration of an exception variable
        catch (am am1)
        {
            throw am1;
        }
        if (flag)
        {
            return am1;
        }
        try
        {
            flag = am1.b();
        }
        // Misplaced declaration of an exception variable
        catch (am am1)
        {
            throw am1;
        }
        if (flag)
        {
            return this;
        }
        int ai[] = b;
        int ai1[] = am1.b;
        int i;
        int j;
        if (ai.length > ai1.length)
        {
            am1 = ai1;
        } else
        {
            am1 = ai;
            ai = ai1;
        }
        ai1 = new int[ai.length];
        j = ai.length - am1.length;
        System.arraycopy(ai, 0, ai1, 0, j);
        i = j;
        do
        {
            if (i >= ai.length)
            {
                break;
            }
            ai1[i] = a6.b(am1[i - j], ai[i]);
            i++;
        } while (k == 0);
        return new am(a, ai1);
    }

    int b(int i)
    {
        int k;
        int j1;
        k = 0;
        j1 = a6.n;
        if (i != 0) goto _L2; else goto _L1
_L1:
        int j;
        try
        {
            j = c(0);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
_L4:
        return j;
_L2:
        int k1 = b.length;
        if (i == 1)
        {
            int ai[] = b;
            int l = ai.length;
            i = 0;
            do
            {
                j = i;
                if (k >= l)
                {
                    continue; /* Loop/switch isn't completed */
                }
                j = a6.b(i, ai[k]);
                k++;
                i = j;
            } while (j1 == 0);
            return j;
        }
        k = b[0];
        int i1 = 1;
        do
        {
            j = k;
            if (i1 >= k1)
            {
                continue; /* Loop/switch isn't completed */
            }
            j = a6.b(a.c(i, k), b[i1]);
            i1++;
            k = j;
            if (j1 != 0)
            {
                return j;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    am b(am am1)
    {
        int k;
        k = a6.n;
        try
        {
            if (!a.equals(am1.a))
            {
                throw new IllegalArgumentException(z[4]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (am am1)
        {
            throw am1;
        }
        boolean flag;
        try
        {
            flag = b();
        }
        // Misplaced declaration of an exception variable
        catch (am am1)
        {
            try
            {
                throw am1;
            }
            // Misplaced declaration of an exception variable
            catch (am am1)
            {
                throw am1;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (!am1.b())
        {
            break MISSING_BLOCK_LABEL_67;
        }
        return a.d();
        int ai[] = b;
        int l = ai.length;
        am1 = am1.b;
        int i1 = am1.length;
        int ai1[] = new int[(l + i1) - 1];
        int i = 0;
        do
        {
label0:
            {
                if (i < l)
                {
                    int j1 = ai[i];
                    int j = 0;
                    do
                    {
                        if (j >= i1)
                        {
                            break;
                        }
                        ai1[i + j] = a6.b(ai1[i + j], a.c(j1, am1[j]));
                        j++;
                    } while (k == 0);
                    if (k == 0)
                    {
                        break label0;
                    }
                }
                return new am(a, ai1);
            }
            i++;
        } while (true);
    }

    boolean b()
    {
        boolean flag = false;
        int i;
        try
        {
            i = b[0];
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        if (i == 0)
        {
            flag = true;
        }
        return flag;
    }

    int c(int i)
    {
        return b[b.length - 1 - i];
    }

    public String toString()
    {
        Object obj;
        int j;
        int l;
        l = a6.n;
        obj = new StringBuilder(a() * 8);
        j = a();
_L2:
label0:
        {
            if (j < 0)
            {
                break MISSING_BLOCK_LABEL_205;
            }
            int k = c(j);
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_200;
            }
            int i = k;
            if (k < 0)
            {
                ((StringBuilder) (obj)).append(z[1]);
                i = -k;
                k = i;
                if (l == 0)
                {
                    break label0;
                }
            }
            k = i;
            try
            {
                if (((StringBuilder) (obj)).length() <= 0)
                {
                    break label0;
                }
                ((StringBuilder) (obj)).append(z[3]);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            k = i;
        }
        if (j != 0 && k == 1)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        i = a.b(k);
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        ((StringBuilder) (obj)).append('1');
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        if (i == 1)
        {
            IllegalArgumentException illegalargumentexception1;
            try
            {
                ((StringBuilder) (obj)).append('a');
            }
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
            if (l == 0)
            {
                break MISSING_BLOCK_LABEL_163;
            }
        }
        ((StringBuilder) (obj)).append(z[0]);
        ((StringBuilder) (obj)).append(i);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        if (j == 1)
        {
            try
            {
                ((StringBuilder) (obj)).append('x');
            }
            catch (IllegalArgumentException illegalargumentexception3)
            {
                throw illegalargumentexception3;
            }
            if (l == 0)
            {
                break MISSING_BLOCK_LABEL_200;
            }
        }
        ((StringBuilder) (obj)).append(z[2]);
        ((StringBuilder) (obj)).append(j);
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_243;
        }
        try
        {
            obj = ((StringBuilder) (obj)).toString();
            if (gh.a != 0)
            {
                a6.n = l + 1;
            }
        }
        catch (IllegalArgumentException illegalargumentexception4)
        {
            throw illegalargumentexception4;
        }
        return ((String) (obj));
        illegalargumentexception1;
        throw illegalargumentexception1;
        illegalargumentexception1;
        throw illegalargumentexception1;
        j--;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i;
        as = new String[6];
        obj = " 4";
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
                obj = "aGC";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "94";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "aAC";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "\006\017\r!1(\t$\002\023.\006\0327c%\005C*,5J\013%5$J\020%.$J$!-$\030\n'\004\007J\005-&-\016";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "\006\017\r!1(\t$\002\023.\006\0327c%\005C*,5J\013%5$J\020%.$J$!-$\030\n'\004\007J\005-&-\016";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i] = ((String) (obj));
                z = as;
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j];
        j % 5;
        JVM INSTR tableswitch 0 3: default 216
    //                   0 239
    //                   1 246
    //                   2 253
    //                   3 260;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_260;
_L3:
        byte byte1 = 67;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 65;
          goto _L9
_L5:
        byte1 = 106;
          goto _L9
_L6:
        byte1 = 99;
          goto _L9
        byte1 = 68;
          goto _L9
    }
}
