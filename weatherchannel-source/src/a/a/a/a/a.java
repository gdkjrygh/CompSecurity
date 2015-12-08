// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.a.a;


public class a
{

    public static final Object a[] = new Object[0];
    public static final Class b[] = new Class[0];
    public static final String c[] = new String[0];
    public static final long d[] = new long[0];
    public static final Long e[] = new Long[0];
    public static final int f[] = new int[0];
    public static final Integer g[] = new Integer[0];
    public static final short h[] = new short[0];
    public static final Short i[] = new Short[0];
    public static final byte j[] = new byte[0];
    public static final Byte k[] = new Byte[0];
    public static final double l[] = new double[0];
    public static final Double m[] = new Double[0];
    public static final float n[] = new float[0];
    public static final Float o[] = new Float[0];
    public static final boolean p[] = new boolean[0];
    public static final Boolean q[] = new Boolean[0];
    public static final char r[] = new char[0];
    public static final Character s[] = new Character[0];

    public static int a(Object aobj[], Object obj)
    {
        return a(aobj, obj, 0);
    }

    public static int a(Object aobj[], Object obj, int i1)
    {
        if (aobj != null) goto _L2; else goto _L1
_L1:
        i1 = -1;
_L4:
        return i1;
_L2:
label0:
        {
            if (i1 < 0)
            {
                i1 = 0;
            }
            if (obj == null)
            {
                int j1 = i1;
                do
                {
                    if (j1 >= aobj.length)
                    {
                        break label0;
                    }
                    i1 = j1;
                    if (aobj[j1] == null)
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    j1++;
                } while (true);
            }
            if (!((Object) (aobj)).getClass().getComponentType().isInstance(obj))
            {
                break label0;
            }
            int k1 = i1;
            do
            {
                if (k1 >= aobj.length)
                {
                    break label0;
                }
                i1 = k1;
                if (obj.equals(aobj[k1]))
                {
                    break;
                }
                k1++;
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public static boolean b(Object aobj[], Object obj)
    {
        return a(aobj, obj) != -1;
    }

}
