// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcp, zzbw

private static class zzaNw
{

    private zzbw zzaNv;
    private com.google.android.gms.internal.b.zzaNw zzaNw;

    public int getSize()
    {
        int j = ((com.google.android.gms.internal.b)zzaNv.getObject()).zzBU();
        int i;
        if (zzaNw == null)
        {
            i = 0;
        } else
        {
            i = zzaNw.zzBU();
        }
        return i + j;
    }

    public zzbw zzzr()
    {
        return zzaNv;
    }

    public com.google.android.gms.internal.b zzzs()
    {
        return zzaNw;
    }

    public (zzbw zzbw1, com.google.android.gms.internal.b b)
    {
        zzaNv = zzbw1;
        zzaNw = b;
    }
}
