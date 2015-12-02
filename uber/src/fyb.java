// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.feature.trip.estimate.TripTimeEstimateDialogFragment;

public final class fyb
    implements hsr
{

    static final boolean a;
    private final hsr b;
    private final hzb c;
    private final hzb d;
    private final hzb e;

    private fyb(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        if (!a && hsr1 == null)
        {
            throw new AssertionError();
        }
        b = hsr1;
        if (!a && hzb1 == null)
        {
            throw new AssertionError();
        }
        c = hzb1;
        if (!a && hzb2 == null)
        {
            throw new AssertionError();
        }
        d = hzb2;
        if (!a && hzb3 == null)
        {
            throw new AssertionError();
        } else
        {
            e = hzb3;
            return;
        }
    }

    public static hsr a(hsr hsr1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        return new fyb(hsr1, hzb1, hzb2, hzb3);
    }

    private void a(TripTimeEstimateDialogFragment triptimeestimatedialogfragment)
    {
        if (triptimeestimatedialogfragment == null)
        {
            throw new NullPointerException("Cannot inject members into a null reference");
        } else
        {
            b.injectMembers(triptimeestimatedialogfragment);
            triptimeestimatedialogfragment.a = (RiderApplication)c.a();
            triptimeestimatedialogfragment.b = (dce)d.a();
            triptimeestimatedialogfragment.c = (fte)e.a();
            return;
        }
    }

    public final void injectMembers(Object obj)
    {
        a((TripTimeEstimateDialogFragment)obj);
    }

    static 
    {
        boolean flag;
        if (!fyb.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
