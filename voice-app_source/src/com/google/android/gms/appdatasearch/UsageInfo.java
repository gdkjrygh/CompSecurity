// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzrn;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.zip.CRC32;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            zzj, DocumentSection, DocumentId, DocumentContents

public class UsageInfo
    implements SafeParcelable
{
    public static final class zza
    {

        private String zzHZ;
        private DocumentId zzNH;
        private long zzNI;
        private int zzNJ;
        private DocumentContents zzNK;
        private boolean zzNL;
        private int zzNM;
        private int zzNN;

        public zza zzL(boolean flag)
        {
            zzNL = flag;
            return this;
        }

        public zza zza(DocumentContents documentcontents)
        {
            zzNK = documentcontents;
            return this;
        }

        public zza zza(DocumentId documentid)
        {
            zzNH = documentid;
            return this;
        }

        public zza zzal(int i)
        {
            zzNJ = i;
            return this;
        }

        public zza zzam(int i)
        {
            zzNN = i;
            return this;
        }

        public UsageInfo zzkN()
        {
            return new UsageInfo(zzNH, zzNI, zzNJ, zzHZ, zzNK, zzNL, zzNM, zzNN);
        }

        public zza zzw(long l)
        {
            zzNI = l;
            return this;
        }

        public zza()
        {
            zzNI = -1L;
            zzNJ = -1;
            zzNM = -1;
            zzNL = false;
            zzNN = 0;
        }
    }


    public static final zzj CREATOR = new zzj();
    final int zzCY;
    final DocumentId zzNH;
    final long zzNI;
    int zzNJ;
    final DocumentContents zzNK;
    final boolean zzNL;
    int zzNM;
    int zzNN;
    public final String zztt;

    UsageInfo(int i, DocumentId documentid, long l, int j, String s, DocumentContents documentcontents, 
            boolean flag, int k, int i1)
    {
        zzCY = i;
        zzNH = documentid;
        zzNI = l;
        zzNJ = j;
        zztt = s;
        zzNK = documentcontents;
        zzNL = flag;
        zzNM = k;
        zzNN = i1;
    }

    private UsageInfo(DocumentId documentid, long l, int i, String s, DocumentContents documentcontents, boolean flag, 
            int j, int k)
    {
        this(1, documentid, l, i, s, documentcontents, flag, j, k);
    }

    UsageInfo(DocumentId documentid, long l, int i, String s, DocumentContents documentcontents, boolean flag, 
            int j, int k, _cls1 _pcls1)
    {
        this(documentid, l, i, s, documentcontents, flag, j, k);
    }

    public UsageInfo(String s, Intent intent, String s1, Uri uri, String s2, List list, int i)
    {
        this(1, zza(s, intent), System.currentTimeMillis(), 0, ((String) (null)), zza(intent, s1, uri, s2, list).zzkJ(), false, -1, i);
    }

    public static DocumentContents.zza zza(Intent intent, String s, Uri uri, String s1, List list)
    {
        DocumentContents.zza zza1 = new DocumentContents.zza();
        zza1.zza(zzbt(s));
        if (uri != null)
        {
            zza1.zza(zzh(uri));
        }
        if (list != null)
        {
            zza1.zza(zzh(list));
        }
        s = intent.getAction();
        if (s != null)
        {
            zza1.zza(zzp("intent_action", s));
        }
        s = intent.getDataString();
        if (s != null)
        {
            zza1.zza(zzp("intent_data", s));
        }
        s = intent.getComponent();
        if (s != null)
        {
            zza1.zza(zzp("intent_activity", s.getClassName()));
        }
        intent = intent.getExtras();
        if (intent != null)
        {
            intent = intent.getString("intent_extra_data_key");
            if (intent != null)
            {
                zza1.zza(zzp("intent_extra_data", intent));
            }
        }
        return zza1.zzbp(s1).zzI(true);
    }

    public static DocumentId zza(String s, Intent intent)
    {
        return zzo(s, zzg(intent));
    }

    private static DocumentSection zzbt(String s)
    {
        return new DocumentSection(s, (new RegisterSectionInfo.zza("title")).zzaj(1).zzK(true).zzbs("name").zzkM(), "text1");
    }

    private static String zzg(Intent intent)
    {
        intent = intent.toUri(1);
        CRC32 crc32 = new CRC32();
        try
        {
            crc32.update(intent.getBytes("UTF-8"));
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            throw new IllegalStateException(intent);
        }
        return Long.toHexString(crc32.getValue());
    }

    private static DocumentSection zzh(Uri uri)
    {
        return new DocumentSection(uri.toString(), (new RegisterSectionInfo.zza("web_url")).zzaj(4).zzJ(true).zzbs("url").zzkM());
    }

    private static DocumentSection zzh(List list)
    {
        com.google.android.gms.internal.zznj.zza zza1 = new com.google.android.gms.internal.zznj.zza();
        com.google.android.gms.internal.zznj.zza.zza azza[] = new com.google.android.gms.internal.zznj.zza.zza[list.size()];
        for (int i = 0; i < azza.length; i++)
        {
            azza[i] = new com.google.android.gms.internal.zznj.zza.zza();
            com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink appindexinglink = (com.google.android.gms.appindexing.AppIndexApi.AppIndexingLink)list.get(i);
            azza[i].zzawm = appindexinglink.appIndexingUrl.toString();
            azza[i].viewId = appindexinglink.viewId;
            if (appindexinglink.webUrl != null)
            {
                azza[i].zzawn = appindexinglink.webUrl.toString();
            }
        }

        zza1.zzawk = azza;
        return new DocumentSection(zzrn.zzf(zza1), (new RegisterSectionInfo.zza("outlinks")).zzJ(true).zzbs(".private:outLinks").zzbr("blob").zzkM());
    }

    private static DocumentId zzo(String s, String s1)
    {
        return new DocumentId(s, "", s1);
    }

    private static DocumentSection zzp(String s, String s1)
    {
        return new DocumentSection(s1, (new RegisterSectionInfo.zza(s)).zzJ(true).zzkM(), s);
    }

    public int describeContents()
    {
        zzj zzj1 = CREATOR;
        return 0;
    }

    public String toString()
    {
        return String.format("UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", new Object[] {
            zzNH, Long.valueOf(zzNI), Integer.valueOf(zzNJ), Integer.valueOf(zzNN)
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzj zzj1 = CREATOR;
        zzj.zza(this, parcel, i);
    }

}
