// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ev

final class fb
    implements android.view.View.OnClickListener
{

    final Activity a;
    final ev b;

    fb(ev ev1, Activity activity)
    {
        b = ev1;
        a = activity;
        super();
    }

    public final void onClick(View view)
    {
        ev.d(b).setVisibility(0);
        ev.e(b).setVisibility(8);
        ev.a(b).setSelected(true);
        view = new Intent("com.google.zxing.client.android.YOUTUBE_SCAN");
        view.putExtra("SCAN_MODE", "QR_CODE_MODE");
        view.setPackage(a.getPackageName());
        a.startActivityForResult(view, 1718);
    }
}
