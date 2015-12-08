// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.drive.internal.zzar;
import com.google.android.gms.drive.internal.zzas;
import com.google.android.gms.drive.internal.zzx;
import com.google.android.gms.internal.zzrm;
import com.google.android.gms.internal.zzrn;

// Referenced classes of package com.google.android.gms.drive:
//            zzd

public class DriveId
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new zzd();
    public static final int RESOURCE_TYPE_FILE = 0;
    public static final int RESOURCE_TYPE_FOLDER = 1;
    public static final int RESOURCE_TYPE_UNKNOWN = -1;
    final int zzCY;
    final long zzacO;
    private volatile String zzacQ;
    final String zzadd;
    final long zzade;
    final int zzadf;
    private volatile String zzadg;

    DriveId(int i, String s, long l, long l1, int j)
    {
label0:
        {
            boolean flag1 = false;
            super();
            zzacQ = null;
            zzadg = null;
            zzCY = i;
            zzadd = s;
            boolean flag;
            if (!"".equals(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzu.zzV(flag);
            if (s == null)
            {
                flag = flag1;
                if (l == -1L)
                {
                    break label0;
                }
            }
            flag = true;
        }
        zzu.zzV(flag);
        zzade = l;
        zzacO = l1;
        zzadf = j;
    }

    public DriveId(String s, long l, long l1, int i)
    {
        if (s != null && s.startsWith("generated-android-"))
        {
            s = null;
        }
        this(1, s, l, l1, i);
    }

    public static DriveId decodeFromString(String s)
    {
        zzu.zzb(s.startsWith("DriveId:"), (new StringBuilder()).append("Invalid DriveId: ").append(s).toString());
        return zzk(Base64.decode(s.substring("DriveId:".length()), 10));
    }

    public static DriveId zzcs(String s)
    {
        zzu.zzu(s);
        return new DriveId(s, -1L, -1L, -1);
    }

    static DriveId zzk(byte abyte0[])
    {
        zzar zzar1;
        try
        {
            zzar1 = zzar.zzl(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new IllegalArgumentException();
        }
        if ("".equals(zzar1.zzafX))
        {
            abyte0 = null;
        } else
        {
            abyte0 = zzar1.zzafX;
        }
        return new DriveId(zzar1.versionCode, abyte0, zzar1.zzafY, zzar1.zzafV, zzar1.zzafZ);
    }

    private byte[] zzph()
    {
        zzas zzas1 = new zzas();
        zzas1.zzafY = zzade;
        zzas1.zzafV = zzacO;
        return zzrn.zzf(zzas1);
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
            zzacQ = (new StringBuilder()).append("DriveId:").append(s).toString();
        }
        return zzacQ;
    }

    public boolean equals(Object obj)
    {
        boolean flag = true;
        if (obj instanceof DriveId)
        {
            obj = (DriveId)obj;
            if (((DriveId) (obj)).zzacO != zzacO)
            {
                zzx.zzu("DriveId", "Attempt to compare invalid DriveId detected. Has local storage been cleared?");
                return false;
            }
            if (((DriveId) (obj)).zzade == -1L && zzade == -1L)
            {
                return ((DriveId) (obj)).zzadd.equals(zzadd);
            }
            if (zzadd == null || ((DriveId) (obj)).zzadd == null)
            {
                if (((DriveId) (obj)).zzade != zzade)
                {
                    flag = false;
                }
                return flag;
            }
            if (((DriveId) (obj)).zzade == zzade)
            {
                if (((DriveId) (obj)).zzadd.equals(zzadd))
                {
                    return true;
                } else
                {
                    zzx.zzu("DriveId", "Unexpected unequal resourceId for same DriveId object.");
                    return false;
                }
            }
        }
        return false;
    }

    public String getResourceId()
    {
        return zzadd;
    }

    public int getResourceType()
    {
        return zzadf;
    }

    public int hashCode()
    {
        if (zzade == -1L)
        {
            return zzadd.hashCode();
        } else
        {
            return (new StringBuilder()).append(String.valueOf(zzacO)).append(String.valueOf(zzade)).toString().hashCode();
        }
    }

    public final String toInvariantString()
    {
        if (zzadg == null)
        {
            zzadg = Base64.encodeToString(zzph(), 10);
        }
        return zzadg;
    }

    public String toString()
    {
        return encodeToString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd.zza(this, parcel, i);
    }

    final byte[] zzpb()
    {
        zzar zzar1 = new zzar();
        zzar1.versionCode = zzCY;
        String s;
        if (zzadd == null)
        {
            s = "";
        } else
        {
            s = zzadd;
        }
        zzar1.zzafX = s;
        zzar1.zzafY = zzade;
        zzar1.zzafV = zzacO;
        zzar1.zzafZ = zzadf;
        return zzrn.zzf(zzar1);
    }

}
