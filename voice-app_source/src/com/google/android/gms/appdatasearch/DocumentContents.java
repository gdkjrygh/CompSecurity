// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import android.accounts.Account;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            zzb, zzh, DocumentSection

public class DocumentContents
    implements SafeParcelable
{
    public static class zza
    {

        private List zzMV;
        private String zzMW;
        private boolean zzMX;
        private Account zzMY;

        public zza zzI(boolean flag)
        {
            zzMX = flag;
            return this;
        }

        public zza zza(Account account1)
        {
            zzMY = account1;
            return this;
        }

        public zza zza(DocumentSection documentsection)
        {
            if (zzMV == null)
            {
                zzMV = new ArrayList();
            }
            zzMV.add(documentsection);
            return this;
        }

        public zza zzbp(String s)
        {
            zzMW = s;
            return this;
        }

        public DocumentContents zzkJ()
        {
            String s = zzMW;
            boolean flag = zzMX;
            Account account1 = zzMY;
            DocumentSection adocumentsection[];
            if (zzMV != null)
            {
                adocumentsection = (DocumentSection[])zzMV.toArray(new DocumentSection[zzMV.size()]);
            } else
            {
                adocumentsection = null;
            }
            return new DocumentContents(s, flag, account1, adocumentsection);
        }

        public zza()
        {
        }
    }


    public static final zzb CREATOR = new zzb();
    public final Account account;
    final int zzCY;
    final DocumentSection zzMS[];
    public final String zzMT;
    public final boolean zzMU;

    DocumentContents(int i, DocumentSection adocumentsection[], String s, boolean flag, Account account1)
    {
        zzCY = i;
        zzMS = adocumentsection;
        zzMT = s;
        zzMU = flag;
        account = account1;
    }

    transient DocumentContents(String s, boolean flag, Account account1, DocumentSection adocumentsection[])
    {
        this(1, adocumentsection, s, flag, account1);
        s = new BitSet(zzh.zzkL());
        for (int i = 0; i < adocumentsection.length; i++)
        {
            int j = adocumentsection[i].zzNg;
            if (j == -1)
            {
                continue;
            }
            if (s.get(j))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Duplicate global search section type ").append(zzh.zzai(j)).toString());
            }
            s.set(j);
        }

    }

    public int describeContents()
    {
        zzb zzb1 = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzb zzb1 = CREATOR;
        zzb.zza(this, parcel, i);
    }

}
