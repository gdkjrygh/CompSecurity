// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.internal.zzaq;
import com.google.android.gms.internal.zzrn;

// Referenced classes of package com.google.android.gms.drive:
//            zza

public class ChangeSequenceNumber
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zza();
    final int zzCY;
    final long zzacN;
    final long zzacO;
    final long zzacP;
    private volatile String zzacQ;

    ChangeSequenceNumber(int i, long l, long l1, long l2)
    {
        boolean flag1 = true;
        super();
        zzacQ = null;
        boolean flag;
        if (l != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzV(flag);
        if (l1 != -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzV(flag);
        if (l2 != -1L)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        zzu.zzV(flag);
        zzCY = i;
        zzacN = l;
        zzacO = l1;
        zzacP = l2;
    }

    public int describeContents()
    {
        return 0;
    }

    public final String encodeToString()
    {
        if (zzacQ == null)
        {
            String s = Base64.encodeToString(zzpb(), 10);
            zzacQ = (new StringBuilder()).append("ChangeSequenceNumber:").append(s).toString();
        }
        return zzacQ;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof ChangeSequenceNumber)
        {
            if (((ChangeSequenceNumber) (obj = (ChangeSequenceNumber)obj)).zzacO == zzacO && ((ChangeSequenceNumber) (obj)).zzacP == zzacP && ((ChangeSequenceNumber) (obj)).zzacN == zzacN)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return (new StringBuilder()).append(String.valueOf(zzacN)).append(String.valueOf(zzacO)).append(String.valueOf(zzacP)).toString().hashCode();
    }

    public String toString()
    {
        return encodeToString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza.zza(this, parcel, i);
    }

    final byte[] zzpb()
    {
        zzaq zzaq1 = new zzaq();
        zzaq1.versionCode = zzCY;
        zzaq1.zzafU = zzacN;
        zzaq1.zzafV = zzacO;
        zzaq1.zzafW = zzacP;
        return zzrn.zzf(zzaq1);
    }

}
