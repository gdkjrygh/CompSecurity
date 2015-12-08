// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.DialogInterface;

// Referenced classes of package com.crashlytics.android:
//            p, u

final class r
    implements android.content.DialogInterface.OnClickListener
{

    private p a;

    r(p p1)
    {
        a = p1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        a.a.a(false);
        dialoginterface.dismiss();
    }
}
