// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            zzd, zzh, RegisterSectionInfo

public class DocumentSection
    implements SafeParcelable
{

    public static final zzd CREATOR = new zzd();
    public static final int zzNc = Integer.parseInt("-1");
    private static final RegisterSectionInfo zzNd = (new RegisterSectionInfo.zza("SsbContext")).zzJ(true).zzbr("blob").zzkM();
    final int zzCY;
    public final String zzNe;
    final RegisterSectionInfo zzNf;
    public final int zzNg;
    public final byte zzNh[];

    DocumentSection(int i, String s, RegisterSectionInfo registersectioninfo, int j, byte abyte0[])
    {
        boolean flag;
        if (j == zzNc || com.google.android.gms.appdatasearch.zzh.zzai(j) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.zzb(flag, (new StringBuilder()).append("Invalid section type ").append(j).toString());
        zzCY = i;
        zzNe = s;
        zzNf = registersectioninfo;
        zzNg = j;
        zzNh = abyte0;
        s = zzkK();
        if (s != null)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public DocumentSection(String s, RegisterSectionInfo registersectioninfo)
    {
        this(1, s, registersectioninfo, zzNc, null);
    }

    public DocumentSection(String s, RegisterSectionInfo registersectioninfo, String s1)
    {
        this(1, s, registersectioninfo, com.google.android.gms.appdatasearch.zzh.zzbq(s1), null);
    }

    public DocumentSection(byte abyte0[], RegisterSectionInfo registersectioninfo)
    {
        this(1, null, registersectioninfo, zzNc, abyte0);
    }

    public static DocumentSection zzh(byte abyte0[])
    {
        return new DocumentSection(abyte0, zzNd);
    }

    public int describeContents()
    {
        zzd zzd1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzd zzd1 = CREATOR;
        zzd.zza(this, parcel, i);
    }

    public String zzkK()
    {
        if (zzNg != zzNc && com.google.android.gms.appdatasearch.zzh.zzai(zzNg) == null)
        {
            return (new StringBuilder()).append("Invalid section type ").append(zzNg).toString();
        }
        if (zzNe != null && zzNh != null)
        {
            return "Both content and blobContent set";
        } else
        {
            return null;
        }
    }

}
