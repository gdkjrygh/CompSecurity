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
//            zzrq, zzrs, zzrz, zzrx

class zzru
    implements Cloneable
{

    private zzrs zzbch;
    private Object zzbci;
    private List zzbcj;

    zzru()
    {
        zzbcj = new ArrayList();
    }

    private byte[] toByteArray()
        throws IOException
    {
        byte abyte0[] = new byte[zzB()];
        zza(zzrq.zzA(abyte0));
        return abyte0;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return zzDo();
    }

    public boolean equals(Object obj)
    {
        boolean flag2 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag2;
            if (obj instanceof zzru)
            {
                obj = (zzru)obj;
                if (zzbci != null && ((zzru) (obj)).zzbci != null)
                {
                    flag = flag2;
                    if (zzbch == ((zzru) (obj)).zzbch)
                    {
                        if (!zzbch.zzbcb.isArray())
                        {
                            return zzbci.equals(((zzru) (obj)).zzbci);
                        }
                        if (zzbci instanceof byte[])
                        {
                            return Arrays.equals((byte[])(byte[])zzbci, (byte[])(byte[])((zzru) (obj)).zzbci);
                        }
                        if (zzbci instanceof int[])
                        {
                            return Arrays.equals((int[])(int[])zzbci, (int[])(int[])((zzru) (obj)).zzbci);
                        }
                        if (zzbci instanceof long[])
                        {
                            return Arrays.equals((long[])(long[])zzbci, (long[])(long[])((zzru) (obj)).zzbci);
                        }
                        if (zzbci instanceof float[])
                        {
                            return Arrays.equals((float[])(float[])zzbci, (float[])(float[])((zzru) (obj)).zzbci);
                        }
                        if (zzbci instanceof double[])
                        {
                            return Arrays.equals((double[])(double[])zzbci, (double[])(double[])((zzru) (obj)).zzbci);
                        }
                        if (zzbci instanceof boolean[])
                        {
                            return Arrays.equals((boolean[])(boolean[])zzbci, (boolean[])(boolean[])((zzru) (obj)).zzbci);
                        } else
                        {
                            return Arrays.deepEquals((Object[])(Object[])zzbci, (Object[])(Object[])((zzru) (obj)).zzbci);
                        }
                    }
                } else
                {
                    if (zzbcj != null && ((zzru) (obj)).zzbcj != null)
                    {
                        return zzbcj.equals(((zzru) (obj)).zzbcj);
                    }
                    boolean flag1;
                    try
                    {
                        flag1 = Arrays.equals(toByteArray(), ((zzru) (obj)).toByteArray());
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        throw new IllegalStateException(((Throwable) (obj)));
                    }
                    return flag1;
                }
            }
        }
        return flag;
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

    int zzB()
    {
        if (zzbci == null) goto _L2; else goto _L1
_L1:
        int j = zzbch.zzS(zzbci);
_L4:
        return j;
_L2:
        Iterator iterator = zzbcj.iterator();
        int i = 0;
        do
        {
            j = i;
            if (!iterator.hasNext())
            {
                continue;
            }
            i = ((zzrz)iterator.next()).zzB() + i;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final zzru zzDo()
    {
        Object obj;
        int i;
        i = 0;
        obj = new zzru();
        obj.zzbch = zzbch;
        if (zzbcj != null) goto _L2; else goto _L1
_L1:
        obj.zzbcj = null;
_L4:
        if (zzbci == null)
        {
            return ((zzru) (obj));
        }
        break; /* Loop/switch isn't completed */
_L2:
        try
        {
            ((zzru) (obj)).zzbcj.addAll(zzbcj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!(zzbci instanceof zzrx))
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj.zzbci = ((zzrx)zzbci).zzDm();
        return ((zzru) (obj));
        if (!(zzbci instanceof byte[]))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        obj.zzbci = ((byte[])(byte[])zzbci).clone();
        return ((zzru) (obj));
        if (!(zzbci instanceof byte[][])) goto _L6; else goto _L5
_L5:
        Object obj1;
        Object obj2;
        obj1 = (byte[][])(byte[][])zzbci;
        obj2 = new byte[obj1.length][];
        obj.zzbci = obj2;
        i = 0;
_L8:
        if (i >= obj1.length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj2[i] = (byte[])obj1[i].clone();
        i++;
        if (true) goto _L8; else goto _L7
_L6:
        if (!(zzbci instanceof boolean[]))
        {
            break MISSING_BLOCK_LABEL_216;
        }
        obj.zzbci = ((boolean[])(boolean[])zzbci).clone();
        return ((zzru) (obj));
        if (!(zzbci instanceof int[]))
        {
            break MISSING_BLOCK_LABEL_245;
        }
        obj.zzbci = ((int[])(int[])zzbci).clone();
        return ((zzru) (obj));
        if (!(zzbci instanceof long[]))
        {
            break MISSING_BLOCK_LABEL_274;
        }
        obj.zzbci = ((long[])(long[])zzbci).clone();
        return ((zzru) (obj));
        if (!(zzbci instanceof float[]))
        {
            break MISSING_BLOCK_LABEL_303;
        }
        obj.zzbci = ((float[])(float[])zzbci).clone();
        return ((zzru) (obj));
        if (!(zzbci instanceof double[]))
        {
            break MISSING_BLOCK_LABEL_332;
        }
        obj.zzbci = ((double[])(double[])zzbci).clone();
        return ((zzru) (obj));
        if (!(zzbci instanceof zzrx[])) goto _L7; else goto _L9
_L9:
        obj1 = (zzrx[])(zzrx[])zzbci;
        obj2 = new zzrx[obj1.length];
        obj.zzbci = obj2;
_L11:
        if (i >= obj1.length) goto _L7; else goto _L10
_L10:
        obj2[i] = obj1[i].zzDm();
        i++;
          goto _L11
_L7:
        return ((zzru) (obj));
    }

    void zza(zzrq zzrq1)
        throws IOException
    {
        if (zzbci != null)
        {
            zzbch.zza(zzbci, zzrq1);
        } else
        {
            Iterator iterator = zzbcj.iterator();
            while (iterator.hasNext()) 
            {
                ((zzrz)iterator.next()).zza(zzrq1);
            }
        }
    }

    void zza(zzrz zzrz1)
    {
        zzbcj.add(zzrz1);
    }

    Object zzb(zzrs zzrs1)
    {
        if (zzbci != null)
        {
            if (zzbch != zzrs1)
            {
                throw new IllegalStateException("Tried to getExtension with a differernt Extension.");
            }
        } else
        {
            zzbch = zzrs1;
            zzbci = zzrs1.zzx(zzbcj);
            zzbcj = null;
        }
        return zzbci;
    }
}
