// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.developer;

import android.app.Activity;
import android.view.View;
import com.contextlogic.wish.ui.activity.login.LoginActivity;
import com.contextlogic.wish.ui.activity.root.RootActivity;

// Referenced classes of package com.contextlogic.wish.ui.fragment.developer:
//            DeveloperHelper, ExperimentsFragment, LoginExperimentsFragment

static final class val.activity
    implements android.view.er
{

    final Activity val$activity;

    public void onClick(View view)
    {
        if (val$activity instanceof RootActivity)
        {
            view = new ExperimentsFragment();
            ((RootActivity)val$activity).setModalContentFragment(view, false);
            return;
        } else
        {
            view = new LoginExperimentsFragment();
            ((LoginActivity)val$activity).setModalContentFragment(view, false);
            return;
        }
    }

    agment(Activity activity1)
    {
        val$activity = activity1;
        super();
    }
}
