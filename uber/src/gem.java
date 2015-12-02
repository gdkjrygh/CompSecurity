// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.ViewGroup;
import com.ubercab.client.feature.trip.tray.TrayActionsLayout;
import com.ubercab.ui.TextView;

public final class gem extends gfm
{

    final TrayActionsLayout a;

    private gem(TrayActionsLayout trayactionslayout)
    {
        a = trayactionslayout;
        super(trayactionslayout);
    }

    public gem(TrayActionsLayout trayactionslayout, byte byte0)
    {
        this(trayactionslayout);
    }

    public static void a(gem gem1)
    {
        gem1.l();
    }

    private void b(gfk gfk1)
    {
        float f;
        float f1;
        int i;
        f1 = 0.0F;
        if (a.mActionCancel.isEnabled())
        {
            f = 1.0F;
        } else
        {
            f = 0.5F;
        }
        if (!c()) goto _L2; else goto _L1
_L1:
        com.ubercab.client.feature.trip.tray.TrayActionsLayout._cls1.a[gfk1.b().ordinal()];
        JVM INSTR tableswitch 1 3: default 60
    //                   1 146
    //                   2 159
    //                   3 173;
           goto _L2 _L3 _L4 _L5
_L2:
        f1 = 1.0F;
        i = 0;
_L7:
        if (f1 == 1.0F)
        {
            l();
        }
        a.mActionCancel.setVisibility(i);
        a.mActionCancel.setAlpha(f);
        gfk1 = (android.widget.LinearLayout.LayoutParams)a.mActionCancel.getLayoutParams();
        if (Math.abs(((android.widget.LinearLayout.LayoutParams) (gfk1)).weight - f1) > 0.01F)
        {
            gfk1.weight = f1;
            a.requestLayout();
        }
        return;
_L3:
        b(true);
        f1 = 1.0F;
        i = 0;
        continue; /* Loop/switch isn't completed */
_L4:
        b(true);
        i = 8;
        f = 0.0F;
        continue; /* Loop/switch isn't completed */
_L5:
        f1 = gfk1.c();
        f *= gfk1.c();
        i = 0;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private boolean c()
    {
        return h.d().a() == gfr.b;
    }

    private void l()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            int i = a.mActionCancelText.getLineCount();
            if (a.mActionCancelText.getMeasuredHeight() != 0 && i <= a.mActionCancelText.getMaxLines())
            {
                a.mActionCancelText.setMaxLines(i);
                return;
            }
        }
    }

    public final int a()
    {
        if (!c())
        {
            return 0;
        } else
        {
            return b();
        }
    }

    public final void a(gfj gfj1)
    {
        super.a(gfj1);
        a.a(gfj1.c(), gfj1.d(), gfj1.f());
    }

    public final void a(gfk gfk1)
    {
        super.a(gfk1);
        while (gfk1 == null || dzk.a(a.b)) 
        {
            return;
        }
        b(gfk1);
    }

    public final int b()
    {
        return TrayActionsLayout.a(a);
    }
}
