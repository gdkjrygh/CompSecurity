// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.request;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.ads.internal.request:
//            zzh, StringParcel, LargeParcelTeleporter, AdRequestInfoParcel

public final class AdResponseParcel
    implements SafeParcelable
{

    public static final zzh CREATOR = new zzh();
    public final int errorCode;
    public final int orientation;
    public final int versionCode;
    public String zzCI;
    public final long zzCJ;
    public final boolean zzCK;
    public final long zzCL;
    public final List zzCM;
    public final String zzCN;
    public final long zzCO;
    public final String zzCP;
    public final boolean zzCQ;
    public final String zzCR;
    public final String zzCS;
    public final boolean zzCT;
    public final boolean zzCU;
    public final boolean zzCV;
    public final int zzCW;
    public LargeParcelTeleporter zzCX;
    public final boolean zzCu;
    public final boolean zzsp;
    public final List zzxF;
    public final List zzxG;
    public final long zzxJ;
    private AdRequestInfoParcel zzxm;
    public final String zzzG;

    public AdResponseParcel(int i)
    {
        this(12, null, null, null, i, null, -1L, false, -1L, null, -1L, -1, null, -1L, null, false, null, null, false, false, false, true, false, 0, null);
    }

    public AdResponseParcel(int i, long l)
    {
        this(12, null, null, null, i, null, -1L, false, -1L, null, l, -1, null, -1L, null, false, null, null, false, false, false, true, false, 0, null);
    }

    AdResponseParcel(int i, String s, String s1, List list, int j, List list1, long l, boolean flag, long l1, List list2, long l2, 
            int k, String s2, long l3, String s3, boolean flag1, String s4, 
            String s5, boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6, int i1, 
            LargeParcelTeleporter largeparcelteleporter)
    {
        versionCode = i;
        zzzG = s;
        zzCI = s1;
        if (list != null)
        {
            s = Collections.unmodifiableList(list);
        } else
        {
            s = null;
        }
        zzxF = s;
        errorCode = j;
        if (list1 != null)
        {
            s = Collections.unmodifiableList(list1);
        } else
        {
            s = null;
        }
        zzxG = s;
        zzCJ = l;
        zzCK = flag;
        zzCL = l1;
        if (list2 != null)
        {
            s = Collections.unmodifiableList(list2);
        } else
        {
            s = null;
        }
        zzCM = s;
        zzxJ = l2;
        orientation = k;
        zzCN = s2;
        zzCO = l3;
        zzCP = s3;
        zzCQ = flag1;
        zzCR = s4;
        zzCS = s5;
        zzCT = flag2;
        zzsp = flag3;
        zzCu = flag4;
        zzCU = flag5;
        zzCV = flag6;
        zzCW = i1;
        zzCX = largeparcelteleporter;
        if (zzCI == null && zzCX != null)
        {
            s = (StringParcel)zzCX.zza(StringParcel.CREATOR);
            if (s != null && !TextUtils.isEmpty(s.zzfB()))
            {
                zzCI = s.zzfB();
            }
        }
    }

    public AdResponseParcel(AdRequestInfoParcel adrequestinfoparcel, String s, String s1, List list, List list1, long l, 
            boolean flag, long l1, List list2, long l2, int i, 
            String s2, long l3, String s3, String s4, boolean flag1, boolean flag2, 
            boolean flag3, boolean flag4, boolean flag5, int j)
    {
        this(12, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2, l3, s3, false, null, s4, flag1, flag2, flag3, flag4, flag5, j, null);
        zzxm = adrequestinfoparcel;
    }

    public AdResponseParcel(AdRequestInfoParcel adrequestinfoparcel, String s, String s1, List list, List list1, long l, 
            boolean flag, long l1, List list2, long l2, int i, 
            String s2, long l3, String s3, boolean flag1, String s4, String s5, 
            boolean flag2, boolean flag3, boolean flag4, boolean flag5, boolean flag6, int j)
    {
        this(12, s, s1, list, -2, list1, l, flag, l1, list2, l2, i, s2, l3, s3, flag1, s4, s5, flag2, flag3, flag4, flag5, flag6, j, null);
        zzxm = adrequestinfoparcel;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (zzxm != null && zzxm.versionCode >= 9 && !TextUtils.isEmpty(zzCI) && zzCI.length() > 0x12c00)
        {
            zzCX = new LargeParcelTeleporter(new StringParcel(zzCI));
            zzCI = null;
        }
        zzh.zza(this, parcel, i);
    }

}
