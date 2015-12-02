// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;

// Referenced classes of package com.ubercab.client.core.app:
//            NetworkErrorFragment

final class a extends Dialog
{

    final NetworkErrorFragment a;

    public final void onBackPressed()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = a.getActivity();
        if (fragmentactivity != null)
        {
            fragmentactivity.finish();
        }
        super.onBackPressed();
    }

    (NetworkErrorFragment networkerrorfragment, Context context, int i)
    {
        a = networkerrorfragment;
        super(context, i);
    }
}
