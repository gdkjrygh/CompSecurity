// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import java.util.Map;

// Referenced classes of package com.google.android.gms.common.server.response:
//            FastJsonResponse, zza, SafeParcelResponse, FieldMappingDictionary

public static class zzabP
    implements SafeParcelable
{

    public static final zza CREATOR = new zza();
    private final int zzCY;
    protected final int zzabG;
    protected final boolean zzabH;
    protected final int zzabI;
    protected final boolean zzabJ;
    protected final String zzabK;
    protected final int zzabL;
    protected final Class zzabM;
    protected final String zzabN;
    private FieldMappingDictionary zzabO;
    private zzabN zzabP;

    public static zzabP zza(String s, int i, zzabP zzabp, boolean flag)
    {
        return new <init>(zzabp.ok(), flag, zzabp.ol(), false, s, i, null, zzabp);
    }

    public static ol zza(String s, int i, Class class1)
    {
        return new <init>(11, false, 11, false, s, i, class1, null);
    }

    public static <init> zzb(String s, int i, Class class1)
    {
        return new <init>(11, true, 11, true, s, i, class1, null);
    }

    static <init> zzc(<init> <init>1)
    {
        return <init>1.zzabP;
    }

    public static zzabP zzi(String s, int i)
    {
        return new <init>(0, false, 0, false, s, i, null, null);
    }

    public static <init> zzj(String s, int i)
    {
        return new <init>(4, false, 4, false, s, i, null, null);
    }

    public static <init> zzk(String s, int i)
    {
        return new <init>(6, false, 6, false, s, i, null, null);
    }

    public static <init> zzl(String s, int i)
    {
        return new <init>(7, false, 7, false, s, i, null, null);
    }

    public static <init> zzm(String s, int i)
    {
        return new <init>(7, true, 7, true, s, i, null, null);
    }

    public Object convertBack(Object obj)
    {
        return zzabP.nvertBack(obj);
    }

    public int describeContents()
    {
        zza zza1 = CREATOR;
        return 0;
    }

    public int getVersionCode()
    {
        return zzCY;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Field\n");
        stringbuilder.append("            versionCode=").append(zzCY).append('\n');
        stringbuilder.append("                 typeIn=").append(zzabG).append('\n');
        stringbuilder.append("            typeInArray=").append(zzabH).append('\n');
        stringbuilder.append("                typeOut=").append(zzabI).append('\n');
        stringbuilder.append("           typeOutArray=").append(zzabJ).append('\n');
        stringbuilder.append("        outputFieldName=").append(zzabK).append('\n');
        stringbuilder.append("      safeParcelFieldId=").append(zzabL).append('\n');
        stringbuilder.append("       concreteTypeName=").append(zzov()).append('\n');
        if (zzou() != null)
        {
            stringbuilder.append("     concreteType.class=").append(zzou().getCanonicalName()).append('\n');
        }
        StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
        String s;
        if (zzabP == null)
        {
            s = "null";
        } else
        {
            s = zzabP.getClass().getCanonicalName();
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
        zzabO = fieldmappingdictionary;
    }

    public int zzok()
    {
        return zzabG;
    }

    public int zzol()
    {
        return zzabI;
    }

    public zzabI zzop()
    {
        return new <init>(zzCY, zzabG, zzabH, zzabI, zzabJ, zzabK, zzabL, zzabN, zzox());
    }

    public boolean zzoq()
    {
        return zzabH;
    }

    public boolean zzor()
    {
        return zzabJ;
    }

    public String zzos()
    {
        return zzabK;
    }

    public int zzot()
    {
        return zzabL;
    }

    public Class zzou()
    {
        return zzabM;
    }

    String zzov()
    {
        if (zzabN == null)
        {
            return null;
        } else
        {
            return zzabN;
        }
    }

    public boolean zzow()
    {
        return zzabP != null;
    }

    ConverterWrapper zzox()
    {
        if (zzabP == null)
        {
            return null;
        } else
        {
            return ConverterWrapper.zza(zzabP);
        }
    }

    public Map zzoy()
    {
        zzu.zzu(zzabN);
        zzu.zzu(zzabO);
        return zzabO.zzco(zzabN);
    }


    (int i, int j, boolean flag, int k, boolean flag1, String s, int l, 
            String s1, ConverterWrapper converterwrapper)
    {
        zzCY = i;
        zzabG = j;
        zzabH = flag;
        zzabI = k;
        zzabJ = flag1;
        zzabK = s;
        zzabL = l;
        if (s1 == null)
        {
            zzabM = null;
            zzabN = null;
        } else
        {
            zzabM = com/google/android/gms/common/server/response/SafeParcelResponse;
            zzabN = s1;
        }
        if (converterwrapper == null)
        {
            zzabP = null;
            return;
        } else
        {
            zzabP = converterwrapper.zzoi();
            return;
        }
    }

    protected zzabP(int i, boolean flag, int j, boolean flag1, String s, int k, Class class1, 
            zzabP zzabp)
    {
        zzCY = 1;
        zzabG = i;
        zzabH = flag;
        zzabI = j;
        zzabJ = flag1;
        zzabK = s;
        zzabL = k;
        zzabM = class1;
        if (class1 == null)
        {
            zzabN = null;
        } else
        {
            zzabN = class1.getCanonicalName();
        }
        zzabP = zzabp;
    }
}
