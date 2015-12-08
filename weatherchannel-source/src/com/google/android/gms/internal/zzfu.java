// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;

// Referenced classes of package com.google.android.gms.internal:
//            zzfp, zzhl, zzid

public class zzfu extends zzfp
{

    zzfu(Context context, zzha.zza zza, zzid zzid, zzft.zza zza1)
    {
        super(context, zza, zzid, zza1);
    }

    protected void zzfn()
    {
    }

    protected void zzh(long l)
        throws zzfs.zza
    {
        zzhl.zzGk.post(new _cls1());
        zzg(l);
    }

    /* member class not found */
    class _cls1 {}

}
