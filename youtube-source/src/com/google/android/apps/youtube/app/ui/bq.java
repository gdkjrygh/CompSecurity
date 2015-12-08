// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.utils.PackageUtil;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            bm

final class bq
    implements android.content.DialogInterface.OnClickListener
{

    final bc a;
    final Activity b;

    bq(bc bc1, Activity activity)
    {
        a = bc1;
        b = activity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.i();
        dialoginterface = new Intent("android.intent.action.VIEW", bm.b().buildUpon().appendQueryParameter("feature", "android").appendQueryParameter("app_version", Integer.toString(PackageUtil.g(b))).build());
        b.startActivity(dialoginterface);
    }
}
