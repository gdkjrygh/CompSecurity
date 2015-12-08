// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v7.media.ad;
import android.widget.SeekBar;

// Referenced classes of package android.support.v7.app:
//            w, u

final class v
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final u a;
    private final Runnable b = new w(this);

    v(u u1)
    {
        a = u1;
        super();
    }

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (flag)
        {
            u.d(a).a(i);
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
        if (u.a(a))
        {
            u.c(a).removeCallbacks(b);
            return;
        } else
        {
            u.a(a, true);
            return;
        }
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
        u.c(a).postDelayed(b, 250L);
    }
}
