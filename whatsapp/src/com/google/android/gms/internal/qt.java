// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            qp, qw, qr, qy

class qt
{

    private qr azd;
    private Object aze;
    private List azf;

    qt()
    {
        azf = new ArrayList();
    }

    private byte[] toByteArray()
    {
        byte abyte0[] = new byte[c()];
        a(qp.q(abyte0));
        return abyte0;
    }

    void a(qp qp1)
    {
label0:
        {
label1:
            {
                boolean flag = qw.a;
                Iterator iterator;
                try
                {
                    if (aze == null)
                    {
                        break label1;
                    }
                    azd.a(aze, qp1);
                }
                // Misplaced declaration of an exception variable
                catch (qp qp1)
                {
                    throw qp1;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            iterator = azf.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ((qy)iterator.next()).a(qp1);
            } while (!flag);
        }
    }

    int c()
    {
        int i;
        boolean flag;
        flag = qw.a;
        i = 0;
        if (aze == null) goto _L2; else goto _L1
_L1:
        int j;
        i = azd.B(aze);
        j = i;
        if (!flag) goto _L3; else goto _L2
_L2:
        Iterator iterator = azf.iterator();
_L6:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        j = ((qy)iterator.next()).c() + i;
        if (!flag) goto _L4; else goto _L3
_L3:
        return j;
_L4:
        i = j;
        if (true) goto _L6; else goto _L5
_L5:
        return i;
    }

    public boolean equals(Object obj)
    {
        boolean flag8 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        Object obj1;
        qr qr1;
        boolean flag9;
        try
        {
            flag9 = obj instanceof qt;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        flag = flag8;
        if (!flag9) goto _L4; else goto _L3
_L3:
        obj = (qt)obj;
        try
        {
            if (aze == null)
            {
                break MISSING_BLOCK_LABEL_383;
            }
            obj1 = ((qt) (obj)).aze;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            try
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_383;
        }
        obj1 = azd;
        qr1 = ((qt) (obj)).azd;
        flag = flag8;
        if (obj1 != qr1) goto _L4; else goto _L5
_L5:
label0:
        {
            try
            {
                if (azd.ayX.isArray())
                {
                    break label0;
                }
                flag = aze.equals(((qt) (obj)).aze);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return flag;
        }
label1:
        {
            boolean flag1;
            try
            {
                if (!(aze instanceof byte[]))
                {
                    break label1;
                }
                flag1 = Arrays.equals((byte[])(byte[])aze, (byte[])(byte[])((qt) (obj)).aze);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return flag1;
        }
label2:
        {
            boolean flag2;
            try
            {
                if (!(aze instanceof int[]))
                {
                    break label2;
                }
                flag2 = Arrays.equals((int[])(int[])aze, (int[])(int[])((qt) (obj)).aze);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return flag2;
        }
label3:
        {
            boolean flag3;
            try
            {
                if (!(aze instanceof long[]))
                {
                    break label3;
                }
                flag3 = Arrays.equals((long[])(long[])aze, (long[])(long[])((qt) (obj)).aze);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return flag3;
        }
label4:
        {
            boolean flag4;
            try
            {
                if (!(aze instanceof float[]))
                {
                    break label4;
                }
                flag4 = Arrays.equals((float[])(float[])aze, (float[])(float[])((qt) (obj)).aze);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return flag4;
        }
label5:
        {
            boolean flag5;
            try
            {
                if (!(aze instanceof double[]))
                {
                    break label5;
                }
                flag5 = Arrays.equals((double[])(double[])aze, (double[])(double[])((qt) (obj)).aze);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return flag5;
        }
label6:
        {
            boolean flag6;
            try
            {
                if (!(aze instanceof boolean[]))
                {
                    break label6;
                }
                flag6 = Arrays.equals((boolean[])(boolean[])aze, (boolean[])(boolean[])((qt) (obj)).aze);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            return flag6;
        }
        return Arrays.deepEquals((Object[])(Object[])aze, (Object[])(Object[])((qt) (obj)).aze);
        List list;
        if (azf == null)
        {
            break MISSING_BLOCK_LABEL_419;
        }
        list = ((qt) (obj)).azf;
        if (list != null)
        {
            try
            {
                return azf.equals(((qt) (obj)).azf);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
        }
        break MISSING_BLOCK_LABEL_419;
        obj;
        throw obj;
        boolean flag7;
        try
        {
            flag7 = Arrays.equals(toByteArray(), ((qt) (obj)).toByteArray());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
        return flag7;
    }

    public int hashCode()
    {
        int i;
        try
        {
            i = Arrays.hashCode(toByteArray());
        }
        catch (IOException ioexception)
        {
            throw new IllegalStateException(ioexception);
        }
        return i + 527;
    }
}
