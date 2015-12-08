// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import com.google.android.apps.youtube.app.ui.presenter.v;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.aw;
import com.google.android.apps.youtube.core.identity.UserProfile;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            h, f

final class i
    implements b
{

    final h a;

    i(h h1)
    {
        a = h1;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        f.d(a.b).c(exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (UserProfile)obj1;
        if (obj != null)
        {
            f.a(a.b).b = ((UserProfile) (obj));
            if (!f.a(a.b, ((UserProfile) (obj))))
            {
                a.a.run();
            }
        }
    }
}
