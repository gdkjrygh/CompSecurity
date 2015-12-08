// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzrz, zzrp, zzrx, zzsa, 
//            zzrq

public class zzrs
{

    public final int tag;
    protected final int type;
    protected final Class zzbcb;
    protected final boolean zzbcc;

    private zzrs(int i, Class class1, int j, boolean flag)
    {
        type = i;
        zzbcb = class1;
        tag = j;
        zzbcc = flag;
    }

    public static zzrs zza(int i, Class class1, int j)
    {
        return new zzrs(i, class1, j, false);
    }

    private Object zzy(List list)
    {
        ArrayList arraylist;
        boolean flag;
        int k;
        flag = false;
        arraylist = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            zzrz zzrz1 = (zzrz)list.get(i);
            if (zzrz1.zzbcm.length != 0)
            {
                zza(zzrz1, arraylist);
            }
        }

        k = arraylist.size();
        if (k != 0) goto _L2; else goto _L1
_L1:
        list = null;
_L4:
        return list;
_L2:
        Object obj = zzbcb.cast(Array.newInstance(zzbcb.getComponentType(), k));
        int j = ((flag) ? 1 : 0);
        do
        {
            list = ((List) (obj));
            if (j >= k)
            {
                continue;
            }
            Array.set(obj, j, arraylist.get(j));
            j++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Object zzz(List list)
    {
        if (list.isEmpty())
        {
            return null;
        } else
        {
            list = (zzrz)list.get(list.size() - 1);
            return zzbcb.cast(zzA(zzrp.zzz(((zzrz) (list)).zzbcm)));
        }
    }

    protected Object zzA(zzrp zzrp1)
    {
        Class class1;
        if (zzbcc)
        {
            class1 = zzbcb.getComponentType();
        } else
        {
            class1 = zzbcb;
        }
        type;
        JVM INSTR tableswitch 10 11: default 185
    //                   10 107
    //                   11 129;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());
_L2:
        zzrx zzrx1;
        try
        {
            zzrx1 = (zzrx)class1.newInstance();
            zzrp1.zza(zzrx1, zzsa.zzlE(tag));
        }
        // Misplaced declaration of an exception variable
        catch (zzrp zzrp1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Error creating instance of class ").append(class1).toString(), zzrp1);
        }
        // Misplaced declaration of an exception variable
        catch (zzrp zzrp1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Error creating instance of class ").append(class1).toString(), zzrp1);
        }
        // Misplaced declaration of an exception variable
        catch (zzrp zzrp1)
        {
            throw new IllegalArgumentException("Error reading extension field", zzrp1);
        }
        return zzrx1;
_L3:
        zzrx1 = (zzrx)class1.newInstance();
        zzrp1.zza(zzrx1);
        return zzrx1;
    }

    int zzS(Object obj)
    {
        if (zzbcc)
        {
            return zzT(obj);
        } else
        {
            return zzU(obj);
        }
    }

    protected int zzT(Object obj)
    {
        int j = 0;
        int l = Array.getLength(obj);
        for (int i = 0; i < l;)
        {
            int k = j;
            if (Array.get(obj, i) != null)
            {
                k = j + zzU(Array.get(obj, i));
            }
            i++;
            j = k;
        }

        return j;
    }

    protected int zzU(Object obj)
    {
        int i = zzsa.zzlE(tag);
        switch (type)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());

        case 10: // '\n'
            return zzrq.zzb(i, (zzrx)obj);

        case 11: // '\013'
            return zzrq.zzc(i, (zzrx)obj);
        }
    }

    protected void zza(zzrz zzrz1, List list)
    {
        list.add(zzA(zzrp.zzz(zzrz1.zzbcm)));
    }

    void zza(Object obj, zzrq zzrq1)
        throws IOException
    {
        if (zzbcc)
        {
            zzc(obj, zzrq1);
            return;
        } else
        {
            zzb(obj, zzrq1);
            return;
        }
    }

    protected void zzb(Object obj, zzrq zzrq1)
    {
        zzrq1.zzlw(tag);
        type;
        JVM INSTR tableswitch 10 11: default 110
    //                   10 76
    //                   11 101;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());
_L2:
        try
        {
            obj = (zzrx)obj;
            int i = zzsa.zzlE(tag);
            zzrq1.zzb(((zzrx) (obj)));
            zzrq1.zzD(i, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        zzrq1.zzc((zzrx)obj);
        return;
    }

    protected void zzc(Object obj, zzrq zzrq1)
    {
        int j = Array.getLength(obj);
        for (int i = 0; i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            if (obj1 != null)
            {
                zzb(obj1, zzrq1);
            }
        }

    }

    final Object zzx(List list)
    {
        if (list == null)
        {
            return null;
        }
        if (zzbcc)
        {
            return zzy(list);
        } else
        {
            return zzz(list);
        }
    }
}
