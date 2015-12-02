// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;

public final class no extends vf
{

    final int a;

    public no(Context context, ss ss, st st, int i)
    {
        super(context, context.getMainLooper(), 8, ss, st);
        a = i;
    }

    private static ns b(IBinder ibinder)
    {
        return nt.a(ibinder);
    }

    protected final IInterface a(IBinder ibinder)
    {
        return b(ibinder);
    }

    protected final String a()
    {
        return "com.google.android.gms.ads.service.START";
    }

    protected final String b()
    {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    public final ns c()
    {
        return (ns)super.n();
    }
}
