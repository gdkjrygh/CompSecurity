// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.DialogInterface;
import com.google.android.apps.youtube.datalib.innertube.model.am;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            fw

final class fx
    implements android.content.DialogInterface.OnClickListener
{

    final am a;
    final fw b;

    fx(fw fw1, am am)
    {
        b = fw1;
        a = am;
        super();
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        fw.a(b, a);
    }
}
