// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google;


// Referenced classes of package com.google:
//            cC, gh

final class e5
{

    private static final String z[];
    private final cC a;
    private final int b[];

    e5(cC cc, int ai[])
    {
        int i = 1;
        super();
        if (ai.length == 0)
        {
            throw new IllegalArgumentException();
        }
        a = cc;
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
                catch (cC cc)
                {
                    throw cc;
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

    int a(int i)
    {
        return b[b.length - 1 - i];
    }

    e5 a(int i, int j)
    {
        int k = cC.e;
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
            e5 e5_1;
            try
            {
                e5_1 = a.b();
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
            return e5_1;
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
            ai[i] = a.a(b[i], j);
            i++;
        } while (k == 0);
        return new e5(a, ai);
    }

    e5 a(e5 e5_1)
    {
        try
        {
            if (!a.equals(e5_1.a))
            {
                throw new IllegalArgumentException(z[4]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (e5 e5_1)
        {
            throw e5_1;
        }
        boolean flag;
        try
        {
            flag = e5_1.a();
        }
        // Misplaced declaration of an exception variable
        catch (e5 e5_1)
        {
            throw e5_1;
        }
        if (flag)
        {
            return this;
        } else
        {
            return c(e5_1.c());
        }
    }

    boolean a()
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

    int b()
    {
        return b.length - 1;
    }

    int b(int i)
    {
        int k;
        int j1;
        k = 0;
        j1 = cC.e;
        if (i != 0) goto _L2; else goto _L1
_L1:
        int j;
        try
        {
            j = a(0);
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
                j = ai[k];
                j = a.c(i, j);
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
            j = a.c(a.a(i, k), b[i1]);
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

    e5 b(e5 e5_1)
    {
        int k;
        k = cC.e;
        try
        {
            if (!a.equals(e5_1.a))
            {
                throw new IllegalArgumentException(z[3]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (e5 e5_1)
        {
            throw e5_1;
        }
        boolean flag;
        try
        {
            flag = a();
        }
        // Misplaced declaration of an exception variable
        catch (e5 e5_1)
        {
            try
            {
                throw e5_1;
            }
            // Misplaced declaration of an exception variable
            catch (e5 e5_1)
            {
                throw e5_1;
            }
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        if (!e5_1.a())
        {
            break MISSING_BLOCK_LABEL_67;
        }
        return a.b();
        int ai[] = b;
        int l = ai.length;
        e5_1 = e5_1.b;
        int i1 = e5_1.length;
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
                        ai1[i + j] = a.c(ai1[i + j], a.a(j1, e5_1[j]));
                        j++;
                    } while (k == 0);
                    if (k == 0)
                    {
                        break label0;
                    }
                }
                return new e5(a, ai1);
            }
            i++;
        } while (true);
    }

    e5 c()
    {
        int j = cC.e;
        int k = b.length;
        int ai[] = new int[k];
        int i = 0;
        do
        {
            if (i >= k)
            {
                break;
            }
            ai[i] = a.d(0, b[i]);
            i++;
        } while (j == 0);
        e5 e5_1;
        try
        {
            e5_1 = new e5(a, ai);
            if (gh.a != 0)
            {
                cC.e = j + 1;
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            throw illegalargumentexception;
        }
        return e5_1;
    }

    e5 c(int i)
    {
        int k = cC.e;
        Object obj;
        if (i == 0)
        {
            try
            {
                obj = a.b();
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
                    ai[j] = a.a(b[j], i);
                    j++;
                } while (k == 0);
                return new e5(a, ai);
            }
        }
        return ((e5) (obj));
    }

    e5 c(e5 e5_1)
    {
        int k = cC.e;
        try
        {
            if (!a.equals(e5_1.a))
            {
                throw new IllegalArgumentException(z[5]);
            }
        }
        // Misplaced declaration of an exception variable
        catch (e5 e5_1)
        {
            throw e5_1;
        }
        boolean flag;
        try
        {
            flag = a();
        }
        // Misplaced declaration of an exception variable
        catch (e5 e5_1)
        {
            throw e5_1;
        }
        if (flag)
        {
            return e5_1;
        }
        try
        {
            flag = e5_1.a();
        }
        // Misplaced declaration of an exception variable
        catch (e5 e5_1)
        {
            throw e5_1;
        }
        if (flag)
        {
            return this;
        }
        int ai[] = b;
        int ai1[] = e5_1.b;
        int i;
        int j;
        if (ai.length > ai1.length)
        {
            e5_1 = ai1;
        } else
        {
            e5_1 = ai;
            ai = ai1;
        }
        ai1 = new int[ai.length];
        j = ai.length - e5_1.length;
        System.arraycopy(ai, 0, ai1, 0, j);
        i = j;
        do
        {
            if (i >= ai.length)
            {
                break;
            }
            ai1[i] = a.c(e5_1[i - j], ai[i]);
            i++;
        } while (k == 0);
        return new e5(a, ai1);
    }

    public String toString()
    {
        StringBuilder stringbuilder;
        int j;
        int l;
        l = cC.e;
        stringbuilder = new StringBuilder(b() * 8);
        j = b();
_L2:
label0:
        {
            if (j < 0)
            {
                break MISSING_BLOCK_LABEL_153;
            }
            int k = a(j);
            if (k == 0)
            {
                break MISSING_BLOCK_LABEL_148;
            }
            int i = k;
            if (k < 0)
            {
                stringbuilder.append(z[2]);
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
                if (stringbuilder.length() <= 0)
                {
                    break label0;
                }
                stringbuilder.append(z[1]);
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw illegalargumentexception;
            }
            k = i;
        }
        if (j == 0 || k != 1)
        {
            try
            {
                stringbuilder.append(k);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                throw illegalargumentexception1;
            }
        }
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        if (j == 1)
        {
            try
            {
                stringbuilder.append('x');
            }
            catch (IllegalArgumentException illegalargumentexception2)
            {
                throw illegalargumentexception2;
            }
            if (l == 0)
            {
                break MISSING_BLOCK_LABEL_148;
            }
        }
        stringbuilder.append(z[0]);
        stringbuilder.append(j);
        if (l == 0)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        return stringbuilder.toString();
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
        obj = "\\\177";
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
                obj = "\004\n,";
                i = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i] = ((String) (obj));
                obj = "\004\f,";
                i = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i] = ((String) (obj));
                obj = "iNh\020XQR\\\nX]R,\001[\004Oc\021\024L@z\000\024W@a\000\024iNh\020XQRK#\024BHi\tP";
                i = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i] = ((String) (obj));
                obj = "iNh\020XQR\\\nX]R,\001[\004Oc\021\024L@z\000\024W@a\000\024iNh\020XQRK#\024BHi\tP";
                i = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i] = ((String) (obj));
                i = 5;
                obj = "iNh\020XQR\\\nX]R,\001[\004Oc\021\024L@z\000\024W@a\000\024iNh\020XQRK#\024BHi\tP";
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
        byte byte1 = 52;
_L9:
        obj[j] = (char)(byte1 ^ c1);
        j++;
          goto _L8
_L4:
        byte1 = 36;
          goto _L9
_L5:
        byte1 = 33;
          goto _L9
_L6:
        byte1 = 12;
          goto _L9
        byte1 = 101;
          goto _L9
    }
}
