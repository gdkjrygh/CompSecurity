// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.honeycomb.ui;

import android.content.DialogInterface;

// Referenced classes of package com.google.android.apps.youtube.app.honeycomb.ui:
//            j

final class k
    implements android.content.DialogInterface.OnClickListener
{

    final j a;

    k(j j1)
    {
        a = j1;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        j.a(a);
    }
}
