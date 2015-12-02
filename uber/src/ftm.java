// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.ubercab.rider.realtime.model.City;
import com.ubercab.rider.realtime.model.VehicleView;

public final class ftm
{

    private final hkr a;
    private final fte b;
    private int c;

    public ftm(hkr hkr1, fte fte1)
    {
        c = 0;
        a = hkr1;
        b = fte1;
    }

    private int d()
    {
        int j = b.g();
        if (j == 7)
        {
            return 2;
        }
        return j != 6 && j != 5 ? -1 : 4;
    }

    private int e()
    {
        String s;
        byte byte0;
        s = h();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 4: default 52
    //                   -1294005119: 104
    //                   -1217487446: 118
    //                   -79017120: 132
    //                   1020382520: 90;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        byte0;
        JVM INSTR tableswitch 0 2: default 80
    //                   0 146
    //                   1 146
    //                   2 178;
           goto _L6 _L7 _L7 _L8
_L6:
        if (c != 1) goto _L10; else goto _L9
_L9:
        return 3;
_L5:
        if (s.equals("requiredNotEditable"))
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s.equals("preferred"))
        {
            byte0 = 1;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (s.equals("hidden"))
        {
            byte0 = 2;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (s.equals("optional"))
        {
            byte0 = 3;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (c == 1) goto _L9; else goto _L11
_L11:
        if (c == 2)
        {
            return 1;
        }
        return !b.j() ? 0 : 0;
_L8:
        return 4;
_L10:
        if (c == 2)
        {
            return 1;
        }
        if (!b.j()) goto _L9; else goto _L12
_L12:
        return 0;
        if (true) goto _L1; else goto _L13
_L13:
    }

    private int f()
    {
        String s;
        byte byte0;
        s = h();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 4: default 52
    //                   -1294005119: 104
    //                   -1217487446: 118
    //                   -79017120: 132
    //                   1020382520: 90;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        byte0;
        JVM INSTR tableswitch 0 2: default 80
    //                   0 146
    //                   1 146
    //                   2 168;
           goto _L6 _L7 _L7 _L8
_L6:
        if (c != 2) goto _L10; else goto _L9
_L9:
        return 1;
_L5:
        if (s.equals("requiredNotEditable"))
        {
            byte0 = 0;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (s.equals("preferred"))
        {
            byte0 = 1;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (s.equals("hidden"))
        {
            byte0 = 2;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (s.equals("optional"))
        {
            byte0 = 3;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (c == 2) goto _L9; else goto _L11
_L11:
        return !b.j() ? 0 : 0;
_L8:
        return 4;
_L10:
        if (b.j())
        {
            return 0;
        }
        return 0;
        if (true) goto _L1; else goto _L12
_L12:
    }

    private int g()
    {
        String s;
        byte byte0;
        s = h();
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 4: default 52
    //                   -1294005119: 102
    //                   -1217487446: 74
    //                   -79017120: 88
    //                   1020382520: 116;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break MISSING_BLOCK_LABEL_116;
_L6:
        switch (byte0)
        {
        default:
            return 2;

        case 0: // '\0'
            return 4;
        }
_L3:
        if (s.equals("hidden"))
        {
            byte0 = 0;
        }
          goto _L6
_L4:
        if (s.equals("optional"))
        {
            byte0 = 1;
        }
          goto _L6
_L2:
        if (s.equals("preferred"))
        {
            byte0 = 2;
        }
          goto _L6
        if (s.equals("requiredNotEditable"))
        {
            byte0 = 3;
        }
          goto _L6
    }

    private String h()
    {
        Object obj = b.m();
        City city = a.b();
        if (city != null)
        {
            obj = city.findVehicleViewById(((String) (obj)));
            if (obj != null && !TextUtils.isEmpty(((VehicleView) (obj)).getDestinationEntry()))
            {
                return ((VehicleView) (obj)).getDestinationEntry();
            }
        }
        return "optional";
    }

    private boolean i()
    {
        com.ubercab.rider.realtime.model.FareSplit faresplit = dre.a(a.d(), a.e(), a.f());
        return faresplit != null && !dre.a(faresplit);
    }

    public final int a()
    {
        if (i())
        {
            return d();
        }
        switch (b.g())
        {
        default:
            return -1;

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return e();

        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return f();

        case 7: // '\007'
            return g();
        }
    }

    public final void a(int j)
    {
        c = j;
    }

    public final int b()
    {
        byte byte0 = 1;
        if (fte.b(b.g()))
        {
            byte0 = 2;
        } else
        if (c == 1)
        {
            return 0;
        }
        return byte0;
    }

    public final int c()
    {
        String s = h();
        if ("hidden".equals(s) || fte.b(b.g()) && "requiredNotEditable".equals(s))
        {
            return 2;
        }
        return c != 2 ? 1 : 0;
    }
}
