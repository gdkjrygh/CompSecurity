// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core;

import com.google.android.apps.youtube.common.e.f;
import com.google.android.apps.youtube.core.async.DeviceAuthorizerForV2Apis;
import com.google.android.apps.youtube.core.async.GDataRequestFactory;
import com.google.android.apps.youtube.core.identity.h;
import com.google.android.apps.youtube.core.utils.ai;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.apps.youtube.core:
//            a

final class ad extends f
{

    final a a;

    ad(a a1)
    {
        a = a1;
        super();
    }

    public final Object a()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(com.google.android.apps.youtube.core.a.b(a).b());
        return new h((GDataRequestFactory)com.google.android.apps.youtube.core.a.c(a).b(), a.aL(), a.aJ(), (DeviceAuthorizerForV2Apis)com.google.android.apps.youtube.core.a.d(a).b(), arraylist, a.aR(), (ai)com.google.android.apps.youtube.core.a.e(a).b(), a.aN());
    }
}
