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
//            OfflineFragment, ay

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
            OfflineFragment.d((OfflineFragment)y.Y.get());
        }
    }

    public final Dialog c(Bundle bundle)
    {
        bundle = i();
        ay ay1 = new ay(this);
        return (new aa(bundle)).setMessage(p.al).ClearOfflineDialogFragment(0x1040013, ay1).ClearOfflineDialogFragment(0x1040009, ay1).ClearOfflineDialogFragment();
    }

    public ()
    {
    }
}
