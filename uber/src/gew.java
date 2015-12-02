// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.ubercab.client.feature.music.MusicTrayView;
import com.ubercab.client.feature.trip.tray.TrayMusicLayout;

public final class gew extends gfm
{

    final TrayMusicLayout a;

    private gew(TrayMusicLayout traymusiclayout)
    {
        a = traymusiclayout;
        super(traymusiclayout);
    }

    public gew(TrayMusicLayout traymusiclayout, byte byte0)
    {
        this(traymusiclayout);
    }

    public final int a()
    {
        if (i)
        {
            gfq gfq1 = h.d();
            if (gfq1.a() == gfr.c)
            {
                return TrayMusicLayout.b(a);
            }
            if (gfq1.b() == gfr.c)
            {
                return TrayMusicLayout.a(a);
            }
        }
        return 0;
    }

    public final void a(gfj gfj1)
    {
        super.a(gfj1);
        boolean flag;
        if (h.b(gfj1.f()) && (a.a.a(dbf.bq) || a.a.a(dbf.bp)))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        if (flag)
        {
            a.mViewMusicTray.a(gfj1.b(), gfj1.g());
        }
    }

    public final void a(gfk gfk1)
    {
        super.a(gfk1);
        if (this.i) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        int j;
        int k;
        k = TrayMusicLayout.a(a);
        j = a();
        i = k;
        if (k == j) goto _L4; else goto _L3
_L3:
        i = k;
        if (j == 0) goto _L4; else goto _L5
_L5:
        i = k;
        com.ubercab.client.feature.trip.tray.TrayMusicLayout._cls1.a[gfk1.b().ordinal()];
        JVM INSTR tableswitch 1 3: default 88
    //                   1 91
    //                   2 124
    //                   3 130;
           goto _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_130;
_L7:
        break; /* Loop/switch isn't completed */
_L6:
        i = k;
_L4:
        if (c.getLayoutParams().height != i)
        {
            c.getLayoutParams().height = i;
            c.requestLayout();
            return;
        }
          goto _L10
_L8:
        i = j;
          goto _L11
        i = TrayMusicLayout.a(a);
        float f = TrayMusicLayout.a(a);
        i = (int)((float)(j - i) * (1.0F - gfk1.c()) + f);
_L11:
        if (true) goto _L4; else goto _L12
_L12:
_L10:
        if (true) goto _L1; else goto _L13
_L13:
    }

    public final int b()
    {
        if (!i)
        {
            return 0;
        } else
        {
            return TrayMusicLayout.a(a);
        }
    }
}
