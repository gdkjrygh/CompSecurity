// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.Trip;

final class fsy
    implements ide
{

    final fsx a;

    private fsy(fsx fsx1)
    {
        a = fsx1;
        super();
    }

    fsy(fsx fsx1, byte byte0)
    {
        this(fsx1);
    }

    private void a(fsz fsz1)
    {
        a.a(fsz1.a, (Trip)fsz1.b.d());
    }

    public final void call(Object obj)
    {
        a((fsz)obj);
    }
}
