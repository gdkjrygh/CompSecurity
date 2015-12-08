// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public abstract class zzc
{

    protected final DataHolder zzYX;
    protected int zzabg;
    private int zzabh;

    public zzc(DataHolder dataholder, int i)
    {
        zzYX = (DataHolder)zzx.zzv(dataholder);
        zzbm(i);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof zzc)
        {
            obj = (zzc)obj;
            flag = flag1;
            if (zzw.equal(Integer.valueOf(((zzc) (obj)).zzabg), Integer.valueOf(zzabg)))
            {
                flag = flag1;
                if (zzw.equal(Integer.valueOf(((zzc) (obj)).zzabh), Integer.valueOf(zzabh)))
                {
                    flag = flag1;
                    if (((zzc) (obj)).zzYX == zzYX)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    protected boolean getBoolean(String s)
    {
        return zzYX.zze(s, zzabg, zzabh);
    }

    protected byte[] getByteArray(String s)
    {
        return zzYX.zzg(s, zzabg, zzabh);
    }

    protected float getFloat(String s)
    {
        return zzYX.zzf(s, zzabg, zzabh);
    }

    protected int getInteger(String s)
    {
        return zzYX.zzc(s, zzabg, zzabh);
    }

    protected long getLong(String s)
    {
        return zzYX.zzb(s, zzabg, zzabh);
    }

    protected String getString(String s)
    {
        return zzYX.zzd(s, zzabg, zzabh);
    }

    public int hashCode()
    {
        return zzw.hashCode(new Object[] {
            Integer.valueOf(zzabg), Integer.valueOf(zzabh), zzYX
        });
    }

    public boolean isDataValid()
    {
        return !zzYX.isClosed();
    }

    protected void zza(String s, CharArrayBuffer chararraybuffer)
    {
        zzYX.zza(s, zzabg, zzabh, chararraybuffer);
    }

    protected void zzbm(int i)
    {
        boolean flag;
        if (i >= 0 && i < zzYX.getCount())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zzY(flag);
        zzabg = i;
        zzabh = zzYX.zzbo(zzabg);
    }

    public boolean zzcd(String s)
    {
        return zzYX.zzcd(s);
    }

    protected Uri zzce(String s)
    {
        return zzYX.zzh(s, zzabg, zzabh);
    }

    protected boolean zzcf(String s)
    {
        return zzYX.zzi(s, zzabg, zzabh);
    }

    protected int zznS()
    {
        return zzabg;
    }
}
