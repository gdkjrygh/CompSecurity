// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.ubercab.client.feature.trip.tray.TraySafetyNetLayout;

public final class gfe extends gfl
{

    final TraySafetyNetLayout a;

    public gfe(TraySafetyNetLayout traysafetynetlayout)
    {
        a = traysafetynetlayout;
        super(traysafetynetlayout, TraySafetyNetLayout.a(traysafetynetlayout));
    }

    public final void a(gfj gfj)
    {
        super.a(gfj);
        a(a.b.g());
    }

    public final void a(gfk gfk1)
    {
        float f;
        float f1;
        super.a(gfk1);
        if (!f())
        {
            return;
        }
        f1 = 0.0F;
        f = f1;
        if (!c()) goto _L2; else goto _L1
_L1:
        f = f1;
        com.ubercab.client.feature.trip.tray.TraySafetyNetLayout._cls2.a[gfk1.b().ordinal()];
        JVM INSTR tableswitch 1 3: default 64
    //                   1 66
    //                   2 75
    //                   3 80;
           goto _L3 _L4 _L5 _L6
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        f = f1;
_L2:
        c.setAlpha(f);
        return;
_L5:
        f = 1.0F;
        continue; /* Loop/switch isn't completed */
_L6:
        f = 1.0F - gfk1.c();
        if (true) goto _L2; else goto _L7
_L7:
    }

    final boolean c()
    {
        return h != null && h.d().b() == gfr.f;
    }
}
