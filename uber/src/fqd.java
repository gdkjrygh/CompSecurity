// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.DynamicFare;
import com.ubercab.rider.realtime.model.Eyeball;
import java.util.Map;

final class fqd
    implements ide
{

    final fqc a;

    private fqd(fqc fqc1)
    {
        a = fqc1;
        super();
    }

    fqd(fqc fqc1, byte byte0)
    {
        this(fqc1);
    }

    private void a(fqe fqe1)
    {
        if (fqc.a(a) != null)
        {
            Object obj = (City)fqe1.a.d();
            if (obj != null)
            {
                obj = ((City) (obj)).findVehicleViewById(fqc.a(a));
            } else
            {
                obj = null;
            }
            if (obj != null)
            {
                fqe1 = (Eyeball)fqe1.b.d();
                float f;
                if (fqe1 != null)
                {
                    fqe1 = fqe1.getDynamicFares();
                } else
                {
                    fqe1 = null;
                }
                if (fqe1 != null)
                {
                    fqe1 = (DynamicFare)fqe1.get(fqc.a(a));
                } else
                {
                    fqe1 = null;
                }
                obj = a;
                if (fqe1 != null)
                {
                    f = fqe1.getMultiplier();
                } else
                {
                    f = 1.0F;
                }
                fqc.a(((fqc) (obj)), f);
                if (!a.f())
                {
                    a.e();
                    return;
                }
            }
        }
    }

    public final void call(Object obj)
    {
        a((fqe)obj);
    }
}
