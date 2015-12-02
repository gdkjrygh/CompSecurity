// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.trip.tray.TrayContactLayout;
import com.ubercab.ui.Button;

public final class geo extends gfm
{

    boolean a;
    final TrayContactLayout b;

    private geo(TrayContactLayout traycontactlayout)
    {
        b = traycontactlayout;
        super(traycontactlayout);
        boolean flag;
        if (!dzk.a(traycontactlayout.a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    public geo(TrayContactLayout traycontactlayout, byte byte0)
    {
        this(traycontactlayout);
    }

    public final int a()
    {
        if (f() && TrayContactLayout.a(b) && a)
        {
            return TrayContactLayout.b(b);
        } else
        {
            return 0;
        }
    }

    protected final void a(float f)
    {
        float f1;
        if (b.mContactButton.isEnabled())
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.5F;
        }
        b.mContactButton.setAlpha(f1 * f);
    }

    public final void a(gfj gfj1)
    {
        super.a(gfj1);
        boolean flag = dre.a(dre.a(gfj1.c(), gfj1.d(), gfj1.f()));
        b.mContactButton.setEnabled(flag);
        Button button = b.mContactButton;
        float f;
        if (flag)
        {
            f = 1.0F;
        } else
        {
            f = 0.5F;
        }
        button.setAlpha(f);
        if (TrayContactLayout.a(b) && gfj1.e() != null)
        {
            a = true;
            if (h != null)
            {
                h.b();
            }
        }
    }
}
