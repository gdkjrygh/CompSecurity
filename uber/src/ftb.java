// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;

final class ftb
    implements ide
{

    final fta a;

    private ftb(fta fta1)
    {
        a = fta1;
        super();
    }

    ftb(fta fta1, byte byte0)
    {
        this(fta1);
    }

    private void a(ftc ftc1)
    {
        Eyeball eyeball;
        byte byte0;
        if (!ftc1.a.b() || !ftc1.b.b())
        {
            return;
        }
        eyeball = (Eyeball)ftc1.b.c();
        ftc1 = ((ClientStatus)ftc1.a.c()).getStatus();
        byte0 = -1;
        ftc1.hashCode();
        JVM INSTR lookupswitch 2: default 80
    //                   -1929061692: 137
    //                   2014441667: 123;
           goto _L1 _L2 _L3
_L1:
        byte0;
        JVM INSTR tableswitch 0 1: default 104
    //                   0 151
    //                   1 174;
           goto _L4 _L5 _L6
_L4:
        fta.a(a, fta.a(a).b());
        return;
_L3:
        if (ftc1.equals("Looking"))
        {
            byte0 = 0;
        }
          goto _L1
_L2:
        if (ftc1.equals("OnTrip"))
        {
            byte0 = 1;
        }
          goto _L1
_L5:
        a.l();
        a.a(eyeball.getReverseGeocode());
          goto _L4
_L6:
        a.k();
          goto _L4
    }

    public final void call(Object obj)
    {
        a((ftc)obj);
    }
}
