// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.widget.ProgressBar;
import com.ubercab.client.feature.verification.MobileVerificationWaitFragment;
import com.ubercab.ui.Button;

public final class gjk
    implements Runnable
{

    final MobileVerificationWaitFragment a;

    public gjk(MobileVerificationWaitFragment mobileverificationwaitfragment)
    {
        a = mobileverificationwaitfragment;
        super();
    }

    public final void run()
    {
        if (!a.isAdded())
        {
            return;
        }
        int i = (int)((SystemClock.elapsedRealtime() + 100L) - MobileVerificationWaitFragment.b(a));
        if (MobileVerificationWaitFragment.c(a) && i > MobileVerificationWaitFragment.d(a) && a.mButtonDialog.getVisibility() != 0)
        {
            a.mButtonDialog.setVisibility(0);
        }
        if (MobileVerificationWaitFragment.e(a))
        {
            a.getActivity().finish();
            return;
        }
        if (MobileVerificationWaitFragment.f(a))
        {
            MobileVerificationWaitFragment.g(a);
            a.mTimerProgressBar.setProgress(MobileVerificationWaitFragment.h(a));
            MobileVerificationWaitFragment.j(a).postDelayed(MobileVerificationWaitFragment.i(a), 1500L);
            return;
        }
        if (i > MobileVerificationWaitFragment.k(a))
        {
            a.g();
            return;
        } else
        {
            a.mTimerProgressBar.setProgress(i);
            MobileVerificationWaitFragment.j(a).postDelayed(MobileVerificationWaitFragment.i(a), 100L);
            return;
        }
    }
}
