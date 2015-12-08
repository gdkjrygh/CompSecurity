// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FastJsonResponse, zza, SafeParcelResponse, FieldMappingDictionary

public static class zzaeZ
    implements SafeParcelable
{

    public static final zza CREATOR = new zza();
    private final int mVersionCode;
    protected final int zzaeQ;
    protected final boolean zzaeR;
    protected final int zzaeS;
    protected final boolean zzaeT;
    protected final String zzaeU;
    protected final int zzaeV;
    protected final Class zzaeW;
    protected final String zzaeX;
    private FieldMappingDictionary zzaeY;
    private zzaeX zzaeZ;

    public static zzaeZ zza(String s, int i, zzaeZ zzaez, boolean flag)
    {
        return new <init>(zzaez.oZ(), flag, zzaez.pa(), false, s, i, null, zzaez);
    }

    public static pa zza(String s, int i, Class class1)
    {
        return new <init>(11, false, 11, false, s, i, class1, null);
    }

    public static <init> zzb(String s, int i, Class class1)
    {
        return new <init>(11, true, 11, true, s, i, class1, null);
    }

    static <init> zzc(<init> <init>1)
    {
        return <init>1.zzaeZ;
    }

    public static zzaeZ zzj(String s, int i)
    {
        return new <init>(0, false, 0, false, s, i, null, null);
    }

    public static <init> zzk(String s, int i)
    {
        return new <init>(4, false, 4, false, s, i, null, null);
    }

    public static <init> zzl(String s, int i)
    {
        return new <init>(6, false, 6, false, s, i, null, null);
    }

    public static <init> zzm(String s, int i)
    {
        return new <init>(7, false, 7, false, s, i, null, null);
    }

    public static <init> zzn(String s, int i)
    {
        return new <init>(7, true, 7, true, s, i, null, null);
    }

    public Object convertBack(Object obj)
    {
        return zzaeZ.nvertBack(obj);
    }

    public int describeContents()
    {
        zza zza1 = CREATOR;
        return 0;
    }

    public int getVersionCode()
    {
        return mVersionCode;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Field\n");
        stringbuilder.append("            versionCode=").append(mVersionCode).append('\n');
        stringbuilder.append("                 typeIn=").append(zzaeQ).append('\n');
        stringbuilder.append("            typeInArray=").append(zzaeR).append('\n');
        stringbuilder.append("                typeOut=").append(zzaeS).append('\n');
        stringbuilder.append("           typeOutArray=").append(zzaeT).append('\n');
        stringbuilder.append("        outputFieldName=").append(zzaeU).append('\n');
        stringbuilder.append("      safeParcelFieldId=").append(zzaeV).append('\n');
        stringbuilder.append("       concreteTypeName=").append(zzpk()).append('\n');
        if (zzpj() != null)
        {
            stringbuilder.append("     concreteType.class=").append(zzpj().getCanonicalName()).append('\n');
        }
        StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
        String s;
        if (zzaeZ == null)
        {
            s = "null";
        } else
        {
            s = zzaeZ.getClass().getCanonicalName();
        }
        stringbuilder1.append(s).append('\n');
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zza zza1 = CREATOR;
        com.google.android.gms.common.server.response.zza.zza(this, parcel, i);
    }

    public void zza(FieldMappingDictionary fieldmappingdictionary)
    {
        zzaeY = fieldmappingdictionary;
    }

    public int zzoZ()
    {
        return zzaeQ;
    }

    public int zzpa()
    {
        return zzaeS;
    }

    public zzaeS zzpe()
    {
        return new <init>(mVersionCode, zzaeQ, zzaeR, zzaeS, zzaeT, zzaeU, zzaeV, zzaeX, zzpm());
    }

    public boolean zzpf()
    {
        return zzaeR;
    }

    public boolean zzpg()
    {
        return zzaeT;
    }

    public String zzph()
    {
        return zzaeU;
    }

    public int zzpi()
    {
        return zzaeV;
    }

    public Class zzpj()
    {
        return zzaeW;
    }

    String zzpk()
    {
        if (zzaeX == null)
        {
            return null;
        } else
        {
            return zzaeX;
        }
    }

    public boolean zzpl()
    {
        return zzaeZ != null;
    }

    ConverterWrapper zzpm()
    {
        if (zzaeZ == null)
        {
            return null;
        } else
        {
            return ConverterWrapper.zza(zzaeZ);
        }
    }

    public Map zzpn()
    {
        zzx.zzv(zzaeX);
        zzx.zzv(zzaeY);
        return zzaeY.zzcx(zzaeX);
    }


    (int i, int j, boolean flag, int k, boolean flag1, String s, int l, 
            String s1, ConverterWrapper converterwrapper)
    {
        mVersionCode = i;
        zzaeQ = j;
        zzaeR = flag;
        zzaeS = k;
        zzaeT = flag1;
        zzaeU = s;
        zzaeV = l;
        if (s1 == null)
        {
            zzaeW = null;
            zzaeX = null;
        } else
        {
            zzaeW = com/google/android/gms/common/server/response/SafeParcelResponse;
            zzaeX = s1;
        }
        if (converterwrapper == null)
        {
            zzaeZ = null;
            return;
        } else
        {
            zzaeZ = converterwrapper.zzoX();
            return;
        }
    }

    protected zzaeZ(int i, boolean flag, int j, boolean flag1, String s, int k, Class class1, 
            zzaeZ zzaez)
    {
        mVersionCode = 1;
        zzaeQ = i;
        zzaeR = flag;
        zzaeS = j;
        zzaeT = flag1;
        zzaeU = s;
        zzaeV = k;
        zzaeW = class1;
        if (class1 == null)
        {
            zzaeX = null;
        } else
        {
            zzaeX = class1.getCanonicalName();
        }
        zzaeZ = zzaez;
    }
}
