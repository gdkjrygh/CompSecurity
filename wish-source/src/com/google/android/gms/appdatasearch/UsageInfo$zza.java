// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;


// Referenced classes of package com.google.android.gms.appdatasearch:
//            UsageInfo, DocumentId, DocumentContents

public static final class zzJR
{

    private String zzEa;
    private DocumentId zzJL;
    private long zzJM;
    private int zzJN;
    private DocumentContents zzJO;
    private boolean zzJP;
    private int zzJQ;
    private int zzJR;

    public zzJR zzL(boolean flag)
    {
        zzJP = flag;
        return this;
    }

    public ts zza(DocumentContents documentcontents)
    {
        zzJO = documentcontents;
        return this;
    }

    public zzJO zza(DocumentId documentid)
    {
        zzJL = documentid;
        return this;
    }

    public zzJL zzac(int i)
    {
        zzJN = i;
        return this;
    }

    public zzJN zzad(int i)
    {
        zzJR = i;
        return this;
    }

    public UsageInfo zzjG()
    {
        return new UsageInfo(zzJL, zzJM, zzJN, zzEa, zzJO, zzJP, zzJQ, zzJR, null);
    }

    public ts zzu(long l)
    {
        zzJM = l;
        return this;
    }

    public ts()
    {
        zzJM = -1L;
        zzJN = -1;
        zzJQ = -1;
        zzJP = false;
        zzJR = 0;
    }
}
