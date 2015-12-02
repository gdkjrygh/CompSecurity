// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.animation.Interpolator;
import com.ubercab.client.feature.trip.tray.TrayMessageLayout;
import com.ubercab.ui.TextView;

public final class geu extends gfl
{

    final TrayMessageLayout a;

    public geu(TrayMessageLayout traymessagelayout)
    {
        a = traymessagelayout;
        super(traymessagelayout, TrayMessageLayout.a(traymessagelayout));
        boolean flag;
        if (!traymessagelayout.a.w())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        h().bottomMargin = -TrayMessageLayout.b(traymessagelayout);
    }

    public final int a()
    {
        if (i)
        {
            return super.a() - TrayMessageLayout.b(a);
        } else
        {
            return 0;
        }
    }

    public final void a(gfk gfk1)
    {
        super.a(gfk1);
        if (i)
        {
            a.mTextView.setAlpha(1.0F - TrayMessageLayout.c(a).getInterpolation(gfk1.c()));
            a.setAlpha(TrayMessageLayout.d(a));
            if (gfk1.e() && gfk1.b() == gdq.a)
            {
                a.a.d(true);
                a(false);
                return;
            }
        }
    }
}
