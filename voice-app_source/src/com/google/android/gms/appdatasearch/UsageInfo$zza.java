// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;


// Referenced classes of package com.google.android.gms.appdatasearch:
//            UsageInfo, DocumentId, DocumentContents

public static final class zzNN
{

    private String zzHZ;
    private DocumentId zzNH;
    private long zzNI;
    private int zzNJ;
    private DocumentContents zzNK;
    private boolean zzNL;
    private int zzNM;
    private int zzNN;

    public zzNN zzL(boolean flag)
    {
        zzNL = flag;
        return this;
    }

    public ts zza(DocumentContents documentcontents)
    {
        zzNK = documentcontents;
        return this;
    }

    public zzNK zza(DocumentId documentid)
    {
        zzNH = documentid;
        return this;
    }

    public zzNH zzal(int i)
    {
        zzNJ = i;
        return this;
    }

    public zzNJ zzam(int i)
    {
        zzNN = i;
        return this;
    }

    public UsageInfo zzkN()
    {
        return new UsageInfo(zzNH, zzNI, zzNJ, zzHZ, zzNK, zzNL, zzNM, zzNN, null);
    }

    public ts zzw(long l)
    {
        zzNI = l;
        return this;
    }

    public ts()
    {
        zzNI = -1L;
        zzNJ = -1;
        zzNM = -1;
        zzNL = false;
        zzNN = 0;
    }
}
