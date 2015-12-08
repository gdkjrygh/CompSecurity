// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcp

class zzaFc
    implements 
{

    final zzcp zzaFc;

    public int sizeOf(Object obj, Object obj1)
    {
        return zza((String)obj, (b)obj1);
    }

    public int zza(String s, b b)
    {
        return s.length() + b.getSize();
    }

    b(zzcp zzcp1)
    {
        zzaFc = zzcp1;
        super();
    }
}
