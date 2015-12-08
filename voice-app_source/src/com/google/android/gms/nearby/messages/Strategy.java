// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.nearby.messages:
//            zzf

public class Strategy
    implements SafeParcelable
{
    public static class zza
    {

        private int zzaFU;
        private int zzaFV;
        private int zzaFX;
        private int zzaFY;

        public zza zzie(int i)
        {
            zzaFX = i;
            return this;
        }

        public zza zzif(int i)
        {
            boolean flag;
            if (i == 0x7fffffff || i > 0 && i <= 0x15180)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzb(flag, "ttlSeconds(%d) must either be TTL_SECONDS_INFINITE, or it must be between 1 and TTL_SECONDS_MAX(%d) inclusive", new Object[] {
                Integer.valueOf(i), Integer.valueOf(0x15180)
            });
            zzaFU = i;
            return this;
        }

        public Strategy zzwZ()
        {
            if (zzaFX == 2)
            {
                if (zzaFY != 3)
                {
                    throw new IllegalStateException("Discovery mode must be DISCOVERY_MODE_DEFAULT.");
                }
                if (zzaFV == 1)
                {
                    throw new IllegalStateException("Cannot set EARSHOT with BLE only mode.");
                }
            }
            return new Strategy(2, 0, zzaFU, zzaFV, false, zzaFX, zzaFY);
        }

        public zza()
        {
            zzaFY = 3;
            zzaFU = 300;
            zzaFV = 0;
            zzaFX = 1;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new zzf();
    public static final Strategy zzaFQ = (new zza()).zzwZ();
    public static final Strategy zzaFR;
    public static final Strategy zzaFS;
    final int versionCode;
    final int zzaFT;
    final int zzaFU;
    final int zzaFV;
    final boolean zzaFW;
    final int zzaFX;
    final int zzaFY;

    Strategy(int i, int j, int k, int l, boolean flag, int i1, int j1)
    {
        versionCode = i;
        zzaFT = j;
        if (j == 0)
        {
            zzaFY = j1;
            break MISSING_BLOCK_LABEL_24;
        } else
        {
            switch (j)
            {
            default:
                zzaFY = 3;
                break;

            case 2: // '\002'
                zzaFY = 1;
                break;

            case 3: // '\003'
                zzaFY = 2;
                break;
            }
            continue;
        }
        do
        {
            zzaFV = l;
            zzaFW = flag;
            if (flag)
            {
                zzaFX = 2;
                zzaFU = 0x7fffffff;
                return;
            }
            if (i1 == 0)
            {
                zzaFX = 1;
                zzaFU = k;
                return;
            }
            zzaFX = i1;
            zzaFU = k;
            break;
        } while (true);
        return;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Strategy))
            {
                return false;
            }
            obj = (Strategy)obj;
            if (versionCode != ((Strategy) (obj)).versionCode || zzaFY != ((Strategy) (obj)).zzaFY || zzaFU != ((Strategy) (obj)).zzaFU || zzaFV != ((Strategy) (obj)).zzaFV || zzaFX != ((Strategy) (obj)).zzaFX)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (((versionCode * 31 + zzaFY) * 31 + zzaFU) * 31 + zzaFV) * 31 + zzaFX;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzf.zza(this, parcel, i);
    }

    static 
    {
        zzaFR = (new zza()).zzie(2).zzif(0x7fffffff).zzwZ();
        zzaFS = zzaFR;
    }
}
