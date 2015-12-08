// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.identity;

import android.text.TextUtils;
import com.google.android.apps.youtube.common.a.b;

// Referenced classes of package com.google.android.apps.youtube.core.identity:
//            aa, UserProfile, z, f

final class ac
    implements b
{

    final f a;
    final aa b;

    ac(aa aa1, f f)
    {
        b = aa1;
        a = f;
        super();
    }

    public final volatile void a(Object obj, Exception exception)
    {
        b.a(exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (UserProfile)obj1;
        if (TextUtils.isEmpty(((UserProfile) (obj)).username) || TextUtils.isEmpty(((UserProfile) (obj)).channelId))
        {
            b.a(new IllegalStateException("Username or channel id is empty."));
            return;
        } else
        {
            aa.a(b, ((UserProfile) (obj)).username, ((UserProfile) (obj)).channelId);
            b.a(a, z.a(a, ((UserProfile) (obj))));
            return;
        }
    }
}
