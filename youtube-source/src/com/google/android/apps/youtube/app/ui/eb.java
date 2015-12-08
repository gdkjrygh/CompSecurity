// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.app.remote.RemoteControl;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.async.af;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.datalib.innertube.model.h;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ab, ea, eg

final class eb
    implements ab
{

    final RemoteControl a;
    final ea b;

    eb(ea ea1, RemoteControl remotecontrol)
    {
        b = ea1;
        a = remotecontrol;
        super();
    }

    public final void a(Object obj)
    {
        obj = (h)obj;
        a a1 = com.google.android.apps.youtube.common.a.a.a(b.a, new eg(b.b, a, b.c, b.d, (byte)0));
        b.e.b().a(b.e.a().a(((h) (obj)).a()), a1);
    }
}
