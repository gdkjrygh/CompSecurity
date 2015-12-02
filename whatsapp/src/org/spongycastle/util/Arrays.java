// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.util;

import java.math.BigInteger;

// Referenced classes of package org.spongycastle.util:
//            Pack

public final class Arrays
{

    private Arrays()
    {
    }

    public static boolean areEqual(byte abyte0[], byte abyte1[])
    {
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = Pack.a;
        if (abyte0 != abyte1) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (abyte0 == null) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (abyte1 == null) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (abyte0.length != abyte1.length) goto _L4; else goto _L6
_L6:
        int i = 0;
_L9:
        if (i == abyte0.length)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (abyte0[i] != abyte1[i]) goto _L4; else goto _L7
_L7:
        i++;
        if (!flag2) goto _L9; else goto _L8
_L8:
        return true;
    }

    public static boolean areEqual(int ai[], int ai1[])
    {
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = Pack.a;
        if (ai != ai1) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (ai == null) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (ai1 == null) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (ai.length != ai1.length) goto _L4; else goto _L6
_L6:
        int i = 0;
_L9:
        if (i == ai.length)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (ai[i] != ai1[i]) goto _L4; else goto _L7
_L7:
        i++;
        if (!flag2) goto _L9; else goto _L8
_L8:
        return true;
    }

    public static byte[] clone(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        } else
        {
            byte abyte1[] = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
            return abyte1;
        }
    }

    public static byte[] clone(byte abyte0[], byte abyte1[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        if (abyte1 == null || abyte1.length != abyte0.length)
        {
            return clone(abyte0);
        } else
        {
            System.arraycopy(abyte0, 0, abyte1, 0, abyte1.length);
            return abyte1;
        }
    }

    public static int[] clone(int ai[])
    {
        if (ai == null)
        {
            return null;
        } else
        {
            int ai1[] = new int[ai.length];
            System.arraycopy(ai, 0, ai1, 0, ai.length);
            return ai1;
        }
    }

    public static long[] clone(long al[])
    {
        if (al == null)
        {
            return null;
        } else
        {
            long al1[] = new long[al.length];
            System.arraycopy(al, 0, al1, 0, al.length);
            return al1;
        }
    }

    public static long[] clone(long al[], long al1[])
    {
        if (al == null)
        {
            return null;
        }
        if (al1 == null || al1.length != al.length)
        {
            return clone(al);
        } else
        {
            System.arraycopy(al, 0, al1, 0, al1.length);
            return al1;
        }
    }

    public static BigInteger[] clone(BigInteger abiginteger[])
    {
        if (abiginteger == null)
        {
            return null;
        } else
        {
            BigInteger abiginteger1[] = new BigInteger[abiginteger.length];
            System.arraycopy(abiginteger, 0, abiginteger1, 0, abiginteger.length);
            return abiginteger1;
        }
    }

    public static short[] clone(short aword0[])
    {
        if (aword0 == null)
        {
            return null;
        } else
        {
            short aword1[] = new short[aword0.length];
            System.arraycopy(aword0, 0, aword1, 0, aword0.length);
            return aword1;
        }
    }

    public static byte[][] clone(byte abyte0[][])
    {
        boolean flag = Pack.a;
        if (abyte0 == null)
        {
            return (byte[][])null;
        }
        byte abyte1[][] = new byte[abyte0.length][];
        int i = 0;
        do
        {
            if (i == abyte1.length)
            {
                break;
            }
            abyte1[i] = clone(abyte0[i]);
            i++;
        } while (!flag);
        return abyte1;
    }

    public static byte[][][] clone(byte abyte0[][][])
    {
        boolean flag = Pack.a;
        if (abyte0 == null)
        {
            return (byte[][][])null;
        }
        byte abyte1[][][] = new byte[abyte0.length][][];
        int i = 0;
        do
        {
            if (i == abyte1.length)
            {
                break;
            }
            abyte1[i] = clone(abyte0[i]);
            i++;
        } while (!flag);
        return abyte1;
    }

    public static boolean constantTimeAreEqual(byte abyte0[], byte abyte1[])
    {
        boolean flag1 = false;
        boolean flag2 = Pack.a;
        boolean flag;
        if (abyte0 == abyte1)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (abyte0 != null)
            {
                flag = flag1;
                if (abyte1 != null)
                {
                    flag = flag1;
                    if (abyte0.length == abyte1.length)
                    {
                        int j = 0;
                        int i = 0;
                        int k;
                        do
                        {
                            k = i;
                            if (j == abyte0.length)
                            {
                                break;
                            }
                            k = i | abyte0[j] ^ abyte1[j];
                            j++;
                            i = k;
                        } while (!flag2);
                        flag = flag1;
                        if (k == 0)
                        {
                            return true;
                        }
                    }
                }
            }
        }
        return flag;
    }

    public static void fill(byte abyte0[], byte byte0)
    {
        boolean flag = Pack.a;
        int i = 0;
        do
        {
            if (i >= abyte0.length)
            {
                break;
            }
            abyte0[i] = byte0;
            i++;
        } while (!flag);
    }
}
