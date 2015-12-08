// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.contextlogic.wish.ui.fragment.developer;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import com.contextlogic.wish.WishApplication;
import com.contextlogic.wish.ui.activity.login.LoginActivity;
import com.contextlogic.wish.ui.activity.root.RootActivity;
import com.contextlogic.wish.user.UserPreferences;

// Referenced classes of package com.contextlogic.wish.ui.fragment.developer:
//            DeveloperHelper

static final class val.activity
    implements android.view.er
{

    final Activity val$activity;
    final EditText val$loginCodeText;

    public void onClick(View view)
    {
        UserPreferences.setAdminLoginCode(val$loginCodeText.getText().toString());
        WishApplication.getAppInstance().logout(val$activity, true, false, true);
        if (val$activity instanceof RootActivity)
        {
            ((RootActivity)val$activity).dismissModal();
            return;
        } else
        {
            ((LoginActivity)val$activity).dismissModal();
            return;
        }
    }

    (EditText edittext, Activity activity1)
    {
        val$loginCodeText = edittext;
        val$activity = activity1;
        super();
    }
}
