// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.client;

import android.net.Uri;
import com.google.android.apps.youtube.common.fromguava.d;
import com.google.android.apps.youtube.core.async.GDataRequest;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core.client:
//            v

final class ab
    implements d
{

    final v a;

    ab(v v)
    {
        a = v;
        super();
    }

    public final boolean a(Object obj)
    {
        return ((GDataRequest)obj).a.getPathSegments().contains("default");
    }
}
