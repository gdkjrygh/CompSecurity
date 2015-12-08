// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcp, zzbw

private static class zzaRQ
{

    private zzbw zzaRP;
    private com.google.android.gms.internal.b.zzaRQ zzaRQ;

    public int getSize()
    {
        int j = ((com.google.android.gms.internal.b)zzaRP.getObject()).zzDw();
        int i;
        if (zzaRQ == null)
        {
            i = 0;
        } else
        {
            i = zzaRQ.zzDw();
        }
        return i + j;
    }

    public zzbw zzAH()
    {
        return zzaRP;
    }

    public com.google.android.gms.internal.b zzAI()
    {
        return zzaRQ;
    }

    public (zzbw zzbw1, com.google.android.gms.internal.b b)
    {
        zzaRP = zzbw1;
        zzaRQ = b;
    }
}
