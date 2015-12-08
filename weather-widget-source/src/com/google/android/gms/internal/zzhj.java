// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import java.util.Collections;
import java.util.List;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            zzip, zziq, zzea, zzdz, 
//            zzei, zzec

public class zzhj
{
    public static final class zza
    {

        public final int errorCode;
        public final JSONObject zzGF;
        public final zzea zzGG;
        public final long zzGI;
        public final long zzGJ;
        public final AdRequestInfoParcel zzGL;
        public final AdResponseParcel zzGM;
        public final AdSizeParcel zzqf;

        public zza(AdRequestInfoParcel adrequestinfoparcel, AdResponseParcel adresponseparcel, zzea zzea, AdSizeParcel adsizeparcel, int i, long l, 
                long l1, JSONObject jsonobject)
        {
            zzGL = adrequestinfoparcel;
            zzGM = adresponseparcel;
            zzGG = zzea;
            zzqf = adsizeparcel;
            errorCode = i;
            zzGI = l;
            zzGJ = l1;
            zzGF = jsonobject;
        }
    }


    public final int errorCode;
    public final int orientation;
    public final zzip zzAR;
    public final String zzDB;
    public final String zzDO;
    public final long zzDW;
    public final boolean zzDX;
    public final long zzDY;
    public final List zzDZ;
    public final AdRequestParcel zzDy;
    public final String zzEc;
    public final JSONObject zzGF;
    public final zzea zzGG;
    public final AdSizeParcel zzGH;
    public final long zzGI;
    public final long zzGJ;
    public final com.google.android.gms.ads.internal.formats.zzh.zza zzGK;
    public final long zzyA;
    public final zzdz zzyQ;
    public final zzei zzyR;
    public final String zzyS;
    public final zzec zzyT;
    public final List zzyw;
    public final List zzyx;

    public zzhj(AdRequestParcel adrequestparcel, zzip zzip1, List list, int i, List list1, List list2, int j, 
            long l, String s, boolean flag, zzdz zzdz, zzei zzei, String s1, 
            zzea zzea, zzec zzec, long l1, AdSizeParcel adsizeparcel, long l2, 
            long l3, long l4, String s2, JSONObject jsonobject, com.google.android.gms.ads.internal.formats.zzh.zza zza1, 
            String s3)
    {
        zzDy = adrequestparcel;
        zzAR = zzip1;
        if (list != null)
        {
            adrequestparcel = Collections.unmodifiableList(list);
        } else
        {
            adrequestparcel = null;
        }
        zzyw = adrequestparcel;
        errorCode = i;
        if (list1 != null)
        {
            adrequestparcel = Collections.unmodifiableList(list1);
        } else
        {
            adrequestparcel = null;
        }
        zzyx = adrequestparcel;
        if (list2 != null)
        {
            adrequestparcel = Collections.unmodifiableList(list2);
        } else
        {
            adrequestparcel = null;
        }
        zzDZ = adrequestparcel;
        orientation = j;
        zzyA = l;
        zzDB = s;
        zzDX = flag;
        zzyQ = zzdz;
        zzyR = zzei;
        zzyS = s1;
        zzGG = zzea;
        zzyT = zzec;
        zzDY = l1;
        zzGH = adsizeparcel;
        zzDW = l2;
        zzGI = l3;
        zzGJ = l4;
        zzEc = s2;
        zzGF = jsonobject;
        zzGK = zza1;
        zzDO = s3;
    }

    public zzhj(zza zza1, zzip zzip1, zzdz zzdz, zzei zzei, String s, zzec zzec, com.google.android.gms.ads.internal.formats.zzh.zza zza2)
    {
        this(zza1.zzGL.zzDy, zzip1, zza1.zzGM.zzyw, zza1.errorCode, zza1.zzGM.zzyx, zza1.zzGM.zzDZ, zza1.zzGM.orientation, zza1.zzGM.zzyA, zza1.zzGL.zzDB, zza1.zzGM.zzDX, zzdz, zzei, s, zza1.zzGG, zzec, zza1.zzGM.zzDY, zza1.zzqf, zza1.zzGM.zzDW, zza1.zzGI, zza1.zzGJ, zza1.zzGM.zzEc, zza1.zzGF, zza2, zza1.zzGL.zzDO);
    }

    public boolean zzbY()
    {
        if (zzAR == null || zzAR.zzgS() == null)
        {
            return false;
        } else
        {
            return zzAR.zzgS().zzbY();
        }
    }
}
