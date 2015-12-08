// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public abstract class zzc
{

    protected final DataHolder zzPy;
    protected int zzRw;
    private int zzRx;

    public zzc(DataHolder dataholder, int i)
    {
        zzPy = (DataHolder)zzv.zzr(dataholder);
        zzaB(i);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof zzc)
        {
            obj = (zzc)obj;
            flag = flag1;
            if (zzu.equal(Integer.valueOf(((zzc) (obj)).zzRw), Integer.valueOf(zzRw)))
            {
                flag = flag1;
                if (zzu.equal(Integer.valueOf(((zzc) (obj)).zzRx), Integer.valueOf(zzRx)))
                {
                    flag = flag1;
                    if (((zzc) (obj)).zzPy == zzPy)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    protected String getString(String s)
    {
        return zzPy.zzd(s, zzRw, zzRx);
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            Integer.valueOf(zzRw), Integer.valueOf(zzRx), zzPy
        });
    }

    protected void zzaB(int i)
    {
        boolean flag;
        if (i >= 0 && i < zzPy.getCount())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zzP(flag);
        zzRw = i;
        zzRx = zzPy.zzaD(zzRw);
    }
}
