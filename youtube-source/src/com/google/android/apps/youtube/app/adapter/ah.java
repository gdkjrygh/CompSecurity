// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import android.view.View;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.UserProfile;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            k

final class ah extends k
{

    final bj a;

    ah(Context context, int i, bj bj1)
    {
        a = bj1;
        super(context, i);
    }

    protected final volatile void a(Object obj, View view, b b1)
    {
        obj = (UserProfile)obj;
        if (((UserProfile) (obj)).thumbnailUri != null)
        {
            a.a(((UserProfile) (obj)).thumbnailUri, b1);
            return;
        } else
        {
            b1.a(null, null);
            return;
        }
    }
}
