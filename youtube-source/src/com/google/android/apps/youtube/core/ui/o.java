// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.ui;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.common.a.a;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.core.Analytics;
import com.google.android.apps.youtube.core.client.bj;
import com.google.android.apps.youtube.core.identity.y;
import com.google.android.apps.youtube.core.model.plus.Person;

// Referenced classes of package com.google.android.apps.youtube.core.ui:
//            n, p

final class o
    implements b
{

    final n a;

    o(n n1)
    {
        a = n1;
        super();
    }

    public final void a(Object obj, Exception exception)
    {
        a.dismiss();
        n.f(a).a("ChannelCreationError", exception.toString());
        n.g(a).a(exception);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Person)obj1;
        com.google.android.apps.youtube.core.ui.n.a(a, true);
        com.google.android.apps.youtube.core.ui.n.a(a).setVisibility(8);
        com.google.android.apps.youtube.core.ui.n.b(a).setText(((Person) (obj)).displayName);
        n.e(a).a(((Person) (obj)).imageUri, com.google.android.apps.youtube.common.a.a.a(n.c(a), new p(this)));
    }
}
