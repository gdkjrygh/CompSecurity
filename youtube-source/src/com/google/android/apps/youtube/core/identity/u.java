// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            o

final class u
    implements android.content.DialogInterface.OnClickListener
{

    final Activity a;
    final o b;

    u(o o1, Activity activity)
    {
        b = o1;
        a = activity;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new Intent("android.intent.action.VIEW", o.a());
        a.startActivity(dialoginterface);
        o.b(b);
    }
}
