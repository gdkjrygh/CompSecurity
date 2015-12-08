// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.fragments;

import android.net.Uri;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.async.GDataRequest;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.core.client.bq;

// Referenced classes of package com.google.android.apps.youtube.app.fragments:
//            ag

final class af
    implements com.google.android.apps.youtube.core.async.af
{

    private final bc a;
    private final bq b;

    public af(bc bc, bq bq1)
    {
        a = bc;
        b = bq1;
    }

    static bc a(af af1)
    {
        return af1.a;
    }

    public final void a(Object obj, b b1)
    {
        obj = (GDataRequest)obj;
        b.a(((GDataRequest) (obj)).a.getAuthority(), new ag(this, b1, ((GDataRequest) (obj))));
    }
}
