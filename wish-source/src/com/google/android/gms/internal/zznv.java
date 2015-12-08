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
//            zznr, zznt, zzoa, zzny

class zznv
    implements Cloneable
{

    private zznt zzaOa;
    private Object zzaOb;
    private List zzaOc;

    zznv()
    {
        zzaOc = new ArrayList();
    }

    private byte[] toByteArray()
        throws IOException
    {
        byte abyte0[] = new byte[zzc()];
        zza(zznr.zzw(abyte0));
        return abyte0;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return zzzQ();
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
            if (obj instanceof zznv)
            {
                obj = (zznv)obj;
                if (zzaOb != null && ((zznv) (obj)).zzaOb != null)
                {
                    flag = flag2;
                    if (zzaOa == ((zznv) (obj)).zzaOa)
                    {
                        if (!zzaOa.zzaNU.isArray())
                        {
                            return zzaOb.equals(((zznv) (obj)).zzaOb);
                        }
                        if (zzaOb instanceof byte[])
                        {
                            return Arrays.equals((byte[])(byte[])zzaOb, (byte[])(byte[])((zznv) (obj)).zzaOb);
                        }
                        if (zzaOb instanceof int[])
                        {
                            return Arrays.equals((int[])(int[])zzaOb, (int[])(int[])((zznv) (obj)).zzaOb);
                        }
                        if (zzaOb instanceof long[])
                        {
                            return Arrays.equals((long[])(long[])zzaOb, (long[])(long[])((zznv) (obj)).zzaOb);
                        }
                        if (zzaOb instanceof float[])
                        {
                            return Arrays.equals((float[])(float[])zzaOb, (float[])(float[])((zznv) (obj)).zzaOb);
                        }
                        if (zzaOb instanceof double[])
                        {
                            return Arrays.equals((double[])(double[])zzaOb, (double[])(double[])((zznv) (obj)).zzaOb);
                        }
                        if (zzaOb instanceof boolean[])
                        {
                            return Arrays.equals((boolean[])(boolean[])zzaOb, (boolean[])(boolean[])((zznv) (obj)).zzaOb);
                        } else
                        {
                            return Arrays.deepEquals((Object[])(Object[])zzaOb, (Object[])(Object[])((zznv) (obj)).zzaOb);
                        }
                    }
                } else
                {
                    if (zzaOc != null && ((zznv) (obj)).zzaOc != null)
                    {
                        return zzaOc.equals(((zznv) (obj)).zzaOc);
                    }
                    boolean flag1;
                    try
                    {
                        flag1 = Arrays.equals(toByteArray(), ((zznv) (obj)).toByteArray());
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

    void zza(zznr zznr1)
        throws IOException
    {
        if (zzaOb != null)
        {
            zzaOa.zza(zzaOb, zznr1);
        } else
        {
            Iterator iterator = zzaOc.iterator();
            while (iterator.hasNext()) 
            {
                ((zzoa)iterator.next()).zza(zznr1);
            }
        }
    }

    int zzc()
    {
        if (zzaOb == null) goto _L2; else goto _L1
_L1:
        int j = zzaOa.zzM(zzaOb);
_L4:
        return j;
_L2:
        Iterator iterator = zzaOc.iterator();
        int i = 0;
        do
        {
            j = i;
            if (!iterator.hasNext())
            {
                continue;
            }
            i = ((zzoa)iterator.next()).zzc() + i;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final zznv zzzQ()
    {
        Object obj;
        int i;
        i = 0;
        obj = new zznv();
        obj.zzaOa = zzaOa;
        if (zzaOc != null) goto _L2; else goto _L1
_L1:
        obj.zzaOc = null;
_L4:
        if (zzaOb == null)
        {
            return ((zznv) (obj));
        }
        break; /* Loop/switch isn't completed */
_L2:
        try
        {
            ((zznv) (obj)).zzaOc.addAll(zzaOc);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!(zzaOb instanceof zzny))
        {
            break MISSING_BLOCK_LABEL_93;
        }
        obj.zzaOb = ((zzny)zzaOb).zzzO();
        return ((zznv) (obj));
        if (!(zzaOb instanceof byte[]))
        {
            break MISSING_BLOCK_LABEL_122;
        }
        obj.zzaOb = ((byte[])(byte[])zzaOb).clone();
        return ((zznv) (obj));
        if (!(zzaOb instanceof byte[][])) goto _L6; else goto _L5
_L5:
        Object obj1;
        Object obj2;
        obj1 = (byte[][])(byte[][])zzaOb;
        obj2 = new byte[obj1.length][];
        obj.zzaOb = obj2;
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
        if (!(zzaOb instanceof boolean[]))
        {
            break MISSING_BLOCK_LABEL_216;
        }
        obj.zzaOb = ((boolean[])(boolean[])zzaOb).clone();
        return ((zznv) (obj));
        if (!(zzaOb instanceof int[]))
        {
            break MISSING_BLOCK_LABEL_245;
        }
        obj.zzaOb = ((int[])(int[])zzaOb).clone();
        return ((zznv) (obj));
        if (!(zzaOb instanceof long[]))
        {
            break MISSING_BLOCK_LABEL_274;
        }
        obj.zzaOb = ((long[])(long[])zzaOb).clone();
        return ((zznv) (obj));
        if (!(zzaOb instanceof float[]))
        {
            break MISSING_BLOCK_LABEL_303;
        }
        obj.zzaOb = ((float[])(float[])zzaOb).clone();
        return ((zznv) (obj));
        if (!(zzaOb instanceof double[]))
        {
            break MISSING_BLOCK_LABEL_332;
        }
        obj.zzaOb = ((double[])(double[])zzaOb).clone();
        return ((zznv) (obj));
        if (!(zzaOb instanceof zzny[])) goto _L7; else goto _L9
_L9:
        obj1 = (zzny[])(zzny[])zzaOb;
        obj2 = new zzny[obj1.length];
        obj.zzaOb = obj2;
_L11:
        if (i >= obj1.length) goto _L7; else goto _L10
_L10:
        obj2[i] = obj1[i].zzzO();
        i++;
          goto _L11
_L7:
        return ((zznv) (obj));
    }
}
