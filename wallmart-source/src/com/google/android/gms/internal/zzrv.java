// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzrr, zzrt

public final class zzrv
{

    public static final Object zzbck = new Object();

    public static boolean equals(float af[], float af1[])
    {
        if (af == null || af.length == 0)
        {
            return af1 == null || af1.length == 0;
        } else
        {
            return Arrays.equals(af, af1);
        }
    }

    public static boolean equals(int ai[], int ai1[])
    {
        if (ai == null || ai.length == 0)
        {
            return ai1 == null || ai1.length == 0;
        } else
        {
            return Arrays.equals(ai, ai1);
        }
    }

    public static boolean equals(long al[], long al1[])
    {
        if (al == null || al.length == 0)
        {
            return al1 == null || al1.length == 0;
        } else
        {
            return Arrays.equals(al, al1);
        }
    }

    public static boolean equals(Object aobj[], Object aobj1[])
    {
        int j;
        int k;
        int l;
        boolean flag3;
        flag3 = false;
        if (aobj == null)
        {
            k = 0;
        } else
        {
            k = aobj.length;
        }
        if (aobj1 == null)
        {
            l = 0;
        } else
        {
            l = aobj1.length;
        }
        j = 0;
_L7:
        int i;
        boolean flag;
        boolean flag1;
        boolean flag2;
        for (i = 0; i < k && aobj[i] == null; i++) { }
        for (; j < l && aobj1[j] == null; j++) { }
        if (i >= k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j >= l)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag || !flag1) goto _L2; else goto _L1
_L1:
        flag2 = true;
_L4:
        return flag2;
_L2:
        flag2 = flag3;
        if (flag != flag1) goto _L4; else goto _L3
_L3:
        flag2 = flag3;
        if (!aobj[i].equals(aobj1[j])) goto _L4; else goto _L5
_L5:
        j++;
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static int hashCode(float af[])
    {
        if (af == null || af.length == 0)
        {
            return 0;
        } else
        {
            return Arrays.hashCode(af);
        }
    }

    public static int hashCode(int ai[])
    {
        if (ai == null || ai.length == 0)
        {
            return 0;
        } else
        {
            return Arrays.hashCode(ai);
        }
    }

    public static int hashCode(long al[])
    {
        if (al == null || al.length == 0)
        {
            return 0;
        } else
        {
            return Arrays.hashCode(al);
        }
    }

    public static int hashCode(Object aobj[])
    {
        int k = 0;
        int i;
        int j;
        if (aobj == null)
        {
            i = 0;
        } else
        {
            i = aobj.length;
        }
        for (j = 0; j < i;)
        {
            Object obj = aobj[j];
            int l = k;
            if (obj != null)
            {
                l = k * 31 + obj.hashCode();
            }
            j++;
            k = l;
        }

        return k;
    }

    public static int zza(byte abyte0[][])
    {
        int k = 0;
        int i;
        int j;
        if (abyte0 == null)
        {
            i = 0;
        } else
        {
            i = abyte0.length;
        }
        for (j = 0; j < i;)
        {
            byte abyte1[] = abyte0[j];
            int l = k;
            if (abyte1 != null)
            {
                l = k * 31 + Arrays.hashCode(abyte1);
            }
            j++;
            k = l;
        }

        return k;
    }

    public static void zza(zzrr zzrr1, zzrr zzrr2)
    {
        if (zzrr1.zzbca != null)
        {
            zzrr2.zzbca = zzrr1.zzbca.zzDn();
        }
    }

    public static boolean zza(byte abyte0[][], byte abyte1[][])
    {
        int j;
        int k;
        int l;
        boolean flag3;
        flag3 = false;
        if (abyte0 == null)
        {
            k = 0;
        } else
        {
            k = abyte0.length;
        }
        if (abyte1 == null)
        {
            l = 0;
        } else
        {
            l = abyte1.length;
        }
        j = 0;
_L7:
        int i;
        boolean flag;
        boolean flag1;
        boolean flag2;
        for (i = 0; i < k && abyte0[i] == null; i++) { }
        for (; j < l && abyte1[j] == null; j++) { }
        if (i >= k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j >= l)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag || !flag1) goto _L2; else goto _L1
_L1:
        flag2 = true;
_L4:
        return flag2;
_L2:
        flag2 = flag3;
        if (flag != flag1) goto _L4; else goto _L3
_L3:
        flag2 = flag3;
        if (!Arrays.equals(abyte0[i], abyte1[j])) goto _L4; else goto _L5
_L5:
        j++;
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

}
