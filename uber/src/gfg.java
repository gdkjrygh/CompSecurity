// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.view.animation.Interpolator;
import com.ubercab.client.feature.trip.tray.TraySecondaryActionsLayout;
import com.ubercab.rider.realtime.model.ClientStatus;
import com.ubercab.rider.realtime.model.Eyeball;
import com.ubercab.rider.realtime.model.Trip;

public final class gfg extends gfm
{

    final TraySecondaryActionsLayout a;

    private gfg(TraySecondaryActionsLayout traysecondaryactionslayout)
    {
        a = traysecondaryactionslayout;
        super(traysecondaryactionslayout);
        a(dzk.a(traysecondaryactionslayout.a));
    }

    public gfg(TraySecondaryActionsLayout traysecondaryactionslayout, byte byte0)
    {
        this(traysecondaryactionslayout);
    }

    private static void a(View view, boolean flag)
    {
        view.setEnabled(flag);
        float f;
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.5F;
        }
        view.setAlpha(f);
    }

    private void a(ClientStatus clientstatus, Eyeball eyeball, Trip trip)
    {
        boolean flag = dre.a(dre.a(clientstatus, eyeball, trip));
        a(((View) (a.mActionCancel)), flag);
        a(((View) (a.mActionContact)), flag);
    }

    public final void a(gfj gfj1)
    {
        super.a(gfj1);
        a(gfj1.c(), gfj1.d(), gfj1.f());
    }

    public final void a(gfk gfk1)
    {
        float f;
        float f1;
        super.a(gfk1);
        if (!f() || !j())
        {
            return;
        }
        f1 = 0.0F;
        f = f1;
        com.ubercab.client.feature.trip.tray.TraySecondaryActionsLayout._cls1.a[gfk1.b().ordinal()];
        JVM INSTR tableswitch 1 3: default 60
    //                   1 71
    //                   2 62
    //                   3 76;
           goto _L1 _L2 _L3 _L4
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        f = f1;
_L6:
        c.setAlpha(f);
        return;
_L2:
        f = 1.0F;
        continue; /* Loop/switch isn't completed */
_L4:
        f = TraySecondaryActionsLayout.a(a).getInterpolation(gfk1.c());
        if (true) goto _L6; else goto _L5
_L5:
    }
}
