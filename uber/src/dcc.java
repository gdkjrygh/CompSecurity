// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import com.security.class1.Class1;
import com.security.class3.Class3;
import com.ubercab.rider.realtime.request.param.DeviceData;

public final class dcc
    implements hst
{

    static final boolean a;
    private final dcb b;
    private final hzb c;
    private final hzb d;
    private final hzb e;

    private dcc(dcb dcb1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        if (!a && dcb1 == null)
        {
            throw new AssertionError();
        }
        b = dcb1;
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

    public static hst a(dcb dcb1, hzb hzb1, hzb hzb2, hzb hzb3)
    {
        return new dcc(dcb1, hzb1, hzb2, hzb3);
    }

    private DeviceData b()
    {
        DeviceData devicedata = dcb.a((Application)c.a(), (Class1)d.a(), (Class3)e.a());
        if (devicedata == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        } else
        {
            return devicedata;
        }
    }

    public final Object a()
    {
        return b();
    }

    static 
    {
        boolean flag;
        if (!dcc.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
