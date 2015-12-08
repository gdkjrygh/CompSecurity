// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import com.facebook.internal.Validate;

// Referenced classes of package com.facebook.login:
//            StartActivityDelegate, LoginManager

private static class fragment
    implements StartActivityDelegate
{

    private final Fragment fragment;

    public Activity getActivityContext()
    {
        return fragment.getActivity();
    }

    public void startActivityForResult(Intent intent, int i)
    {
        fragment.startActivityForResult(intent, i);
    }

    (Fragment fragment1)
    {
        Validate.notNull(fragment1, "fragment");
        fragment = fragment1;
    }
}
