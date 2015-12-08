// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.app.Activity;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;
import com.google.android.youtube.p;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ei

final class ek
    implements b
{

    final ei a;

    ek(ei ei1)
    {
        a = ei1;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        a.b(ei.i(a).getString(p.gm));
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (PlaybackPair)obj1;
        ei.a(a, ((PlaybackPair) (obj)).getPlayerResponse());
    }
}
