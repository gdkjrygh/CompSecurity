// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            zzbd, zzbb, zzhs, zzhl

public class zzbc
{

    public zzbc()
    {
    }

    protected zzbb zza(Context context, VersionInfoParcel versioninfoparcel, zzhs zzhs1)
    {
        context = new zzbd(context, versioninfoparcel);
        context.zza(new _cls2(zzhs1, context));
        return context;
    }

    public Future zza(Context context, VersionInfoParcel versioninfoparcel, String s)
    {
        zzhs zzhs1 = new zzhs();
        zzhl.zzGk.post(new _cls1(context, versioninfoparcel, zzhs1, s));
        return zzhs1;
    }

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
