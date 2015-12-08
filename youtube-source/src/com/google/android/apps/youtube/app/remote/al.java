// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.remote;

import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.datalib.legacy.model.PlaybackPair;

// Referenced classes of package com.google.android.apps.youtube.app.remote:
//            ak

final class al
    implements b
{

    final ak a;

    al(ak ak1)
    {
        a = ak1;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        ak.a(a, null);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (PlaybackPair)obj1;
        ak.a(a, ((PlaybackPair) (obj)).getPlayerResponse());
    }
}
