// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.view.View;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            MediaView

final class _j
    implements android.view.View.OnClickListener
{

    final String a;
    final Activity b;
    final c4 c;

    _j(Activity activity, c4 c4, String s)
    {
        b = activity;
        c = c4;
        a = s;
        super();
    }

    public void onClick(View view)
    {
        b.startActivity(MediaView.a(c, a, b.getBaseContext(), view));
    }
}
