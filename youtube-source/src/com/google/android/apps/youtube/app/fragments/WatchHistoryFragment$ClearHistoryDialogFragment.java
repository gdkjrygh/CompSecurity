// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.apps.youtube.app.ui.YouTubeDialogFragment;
import com.google.android.apps.youtube.core.ui.aa;
import com.google.android.youtube.p;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            WatchHistoryFragment, cd

public class  extends YouTubeDialogFragment
{

    private WeakReference Y;

    static WeakReference a( , WeakReference weakreference)
    {
        .Y = weakreference;
        return weakreference;
    }

    static void a(Y y)
    {
        if (y.Y != null && y.Y.get() != null)
        {
            WatchHistoryFragment.d((WatchHistoryFragment)y.Y.get());
        }
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = i();
        cd cd1 = new cd(this);
        return (new aa(bundle)).setMessage(p.hh).ClearHistoryDialogFragment(0x1040013, cd1).ClearHistoryDialogFragment(0x1040009, cd1).ClearHistoryDialogFragment();
    }

    public ()
    {
    }
}
