// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.d;

import com.google.android.apps.youtube.app.ui.presenter.v;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.identity.UserProfile;
import com.google.android.apps.youtube.uilib.a.h;

// Referenced classes of package com.google.android.apps.youtube.app.d:
//            f

final class g
    implements b
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        f.a(a).b = null;
        com.google.android.apps.youtube.app.d.f.b(a).notifyDataSetChanged();
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (UserProfile)obj1;
        f.a(a).b = ((UserProfile) (obj));
        com.google.android.apps.youtube.app.d.f.b(a).notifyDataSetChanged();
    }
}
