// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;

// Referenced classes of package com.google.android.gms.internal:
//            zzpm

public class zzpl
    implements zzpm.zza
{

    private final zzpm zzaKC;
    private boolean zzaKD;

    public zzpl(Context context, int i)
    {
        this(context, i, null);
    }

    public zzpl(Context context, int i, String s)
    {
        this(context, i, s, null, true);
    }

    public zzpl(Context context, int i, String s, String s1, boolean flag)
    {
        String s2;
        if (context != context.getApplicationContext())
        {
            s2 = context.getClass().getName();
        } else
        {
            s2 = "OneTimePlayLogger";
        }
        zzaKC = new zzpm(context, i, s, s1, this, flag, s2);
        zzaKD = true;
    }

    private void zzyz()
    {
        if (!zzaKD)
        {
            throw new IllegalStateException("Cannot reuse one-time logger after sending.");
        } else
        {
            return;
        }
    }

    public void send()
    {
        zzyz();
        zzaKC.start();
        zzaKD = false;
    }

    public transient void zza(String s, byte abyte0[], String as[])
    {
        zzyz();
        zzaKC.zzb(s, abyte0, as);
    }

    public void zzh(PendingIntent pendingintent)
    {
        Log.w("OneTimePlayLogger", (new StringBuilder()).append("logger connection failed: ").append(pendingintent).toString());
    }

    public void zzyA()
    {
        zzaKC.stop();
    }

    public void zzyB()
    {
        Log.w("OneTimePlayLogger", "logger connection failed");
    }
}
