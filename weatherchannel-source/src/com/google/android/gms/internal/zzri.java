// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzrp, zzrf, zzrn, zzrq, 
//            zzrg

public class zzri
{

    public final int tag;
    protected final int type;
    protected final Class zzaVV;
    protected final boolean zzaVW;

    private zzri(int i, Class class1, int j, boolean flag)
    {
        type = i;
        zzaVV = class1;
        tag = j;
        zzaVW = flag;
    }

    public static zzri zza(int i, Class class1, int j)
    {
        return new zzri(i, class1, j, false);
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
            zzrp zzrp1 = (zzrp)list.get(i);
            if (zzrp1.zzaWg.length != 0)
            {
                zza(zzrp1, arraylist);
            }
        }

        k = arraylist.size();
        if (k != 0) goto _L2; else goto _L1
_L1:
        list = null;
_L4:
        return list;
_L2:
        Object obj = zzaVV.cast(Array.newInstance(zzaVV.getComponentType(), k));
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
            list = (zzrp)list.get(list.size() - 1);
            return zzaVV.cast(zzA(zzrf.zzz(((zzrp) (list)).zzaWg)));
        }
    }

    protected Object zzA(zzrf zzrf1)
    {
        Class class1;
        if (zzaVW)
        {
            class1 = zzaVV.getComponentType();
        } else
        {
            class1 = zzaVV;
        }
        type;
        JVM INSTR tableswitch 10 11: default 185
    //                   10 107
    //                   11 129;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());
_L2:
        zzrn zzrn1;
        try
        {
            zzrn1 = (zzrn)class1.newInstance();
            zzrf1.zza(zzrn1, zzrq.zzkV(tag));
        }
        // Misplaced declaration of an exception variable
        catch (zzrf zzrf1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Error creating instance of class ").append(class1).toString(), zzrf1);
        }
        // Misplaced declaration of an exception variable
        catch (zzrf zzrf1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Error creating instance of class ").append(class1).toString(), zzrf1);
        }
        // Misplaced declaration of an exception variable
        catch (zzrf zzrf1)
        {
            throw new IllegalArgumentException("Error reading extension field", zzrf1);
        }
        return zzrn1;
_L3:
        zzrn1 = (zzrn)class1.newInstance();
        zzrf1.zza(zzrn1);
        return zzrn1;
    }

    int zzQ(Object obj)
    {
        if (zzaVW)
        {
            return zzR(obj);
        } else
        {
            return zzS(obj);
        }
    }

    protected int zzR(Object obj)
    {
        int j = 0;
        int l = Array.getLength(obj);
        for (int i = 0; i < l;)
        {
            int k = j;
            if (Array.get(obj, i) != null)
            {
                k = j + zzS(Array.get(obj, i));
            }
            i++;
            j = k;
        }

        return j;
    }

    protected int zzS(Object obj)
    {
        int i = zzrq.zzkV(tag);
        switch (type)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type ").append(type).toString());

        case 10: // '\n'
            return zzrg.zzb(i, (zzrn)obj);

        case 11: // '\013'
            return zzrg.zzc(i, (zzrn)obj);
        }
    }

    protected void zza(zzrp zzrp1, List list)
    {
        list.add(zzA(zzrf.zzz(zzrp1.zzaWg)));
    }

    void zza(Object obj, zzrg zzrg1)
        throws IOException
    {
        if (zzaVW)
        {
            zzc(obj, zzrg1);
            return;
        } else
        {
            zzb(obj, zzrg1);
            return;
        }
    }

    protected void zzb(Object obj, zzrg zzrg1)
    {
        zzrg1.zzkN(tag);
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
            obj = (zzrn)obj;
            int i = zzrq.zzkV(tag);
            zzrg1.zzb(((zzrn) (obj)));
            zzrg1.zzC(i, 4);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalStateException(((Throwable) (obj)));
        }
_L3:
        zzrg1.zzc((zzrn)obj);
        return;
    }

    protected void zzc(Object obj, zzrg zzrg1)
    {
        int j = Array.getLength(obj);
        for (int i = 0; i < j; i++)
        {
            Object obj1 = Array.get(obj, i);
            if (obj1 != null)
            {
                zzb(obj1, zzrg1);
            }
        }

    }

    final Object zzx(List list)
    {
        if (list == null)
        {
            return null;
        }
        if (zzaVW)
        {
            return zzy(list);
        } else
        {
            return zzz(list);
        }
    }
}
