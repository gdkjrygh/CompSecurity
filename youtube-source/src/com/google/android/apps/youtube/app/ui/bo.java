// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.identity.ak;
import com.google.android.apps.youtube.core.utils.PackageUtil;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            bm

final class bo
    implements android.content.DialogInterface.OnClickListener
{

    final bc a;
    final Activity b;
    final ak c;

    bo(bc bc1, Activity activity, ak ak1)
    {
        a = bc1;
        b = activity;
        c = ak1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.i();
        dialoginterface = new Intent("android.intent.action.VIEW", bm.a().buildUpon().appendQueryParameter("next", "/merge_identity_done").appendQueryParameter("feature", "android").appendQueryParameter("app_version", Integer.toString(PackageUtil.g(b))).appendQueryParameter("username", c.d()).build());
        b.startActivity(dialoginterface);
    }
}
