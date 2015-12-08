// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.common.data:
//            AbstractDataBuffer, DataHolder

public abstract class zzf extends AbstractDataBuffer
{

    private boolean zzYK;
    private ArrayList zzYL;

    protected zzf(DataHolder dataholder)
    {
        super(dataholder);
        zzYK = false;
    }

    private void zznj()
    {
        this;
        JVM INSTR monitorenter ;
        if (zzYK) goto _L2; else goto _L1
_L1:
        int k;
        k = zzWu.getCount();
        zzYL = new ArrayList();
        if (k <= 0) goto _L4; else goto _L3
_L3:
        Object obj;
        String s1;
        zzYL.add(Integer.valueOf(0));
        s1 = zzni();
        int i = zzWu.zzbh(0);
        obj = zzWu.zzd(s1, 0, i);
        int j = 1;
_L9:
        if (j >= k) goto _L4; else goto _L5
_L5:
        String s;
        int l;
        l = zzWu.zzbh(j);
        s = zzWu.zzd(s1, j, l);
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        throw new NullPointerException((new StringBuilder()).append("Missing value for markerColumn: ").append(s1).append(", at row: ").append(j).append(", for window: ").append(l).toString());
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        if (s.equals(obj)) goto _L7; else goto _L6
_L6:
        zzYL.add(Integer.valueOf(j));
        obj = s;
          goto _L7
_L4:
        zzYK = true;
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L7:
        j++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final Object get(int i)
    {
        zznj();
        return zzj(zzbk(i), zzbl(i));
    }

    public int getCount()
    {
        zznj();
        return zzYL.size();
    }

    int zzbk(int i)
    {
        if (i < 0 || i >= zzYL.size())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Position ").append(i).append(" is out of bounds for this buffer").toString());
        } else
        {
            return ((Integer)zzYL.get(i)).intValue();
        }
    }

    protected int zzbl(int i)
    {
        int k;
        if (i < 0 || i == zzYL.size())
        {
            k = 0;
        } else
        {
            int j;
            if (i == zzYL.size() - 1)
            {
                j = zzWu.getCount() - ((Integer)zzYL.get(i)).intValue();
            } else
            {
                j = ((Integer)zzYL.get(i + 1)).intValue() - ((Integer)zzYL.get(i)).intValue();
            }
            k = j;
            if (j == 1)
            {
                i = zzbk(i);
                int l = zzWu.zzbh(i);
                String s = zznk();
                k = j;
                if (s != null)
                {
                    k = j;
                    if (zzWu.zzd(s, i, l) == null)
                    {
                        return 0;
                    }
                }
            }
        }
        return k;
    }

    protected abstract Object zzj(int i, int j);

    protected abstract String zzni();

    protected String zznk()
    {
        return null;
    }
}
