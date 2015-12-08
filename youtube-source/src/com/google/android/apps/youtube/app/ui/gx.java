// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import com.google.android.apps.youtube.common.L;
import com.google.android.apps.youtube.common.a.b;
import com.google.android.apps.youtube.common.a.d;
import com.google.android.apps.youtube.core.client.bc;
import com.google.android.apps.youtube.datalib.model.gdata.Video;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            gt

final class gx
    implements b
{

    final gt a;

    private gx(gt gt1)
    {
        a = gt1;
        super();
    }

    gx(gt gt1, byte byte0)
    {
        this(gt1);
    }

    public final volatile void a(Object obj, Exception exception)
    {
        L.a("Error retrieving video info", exception);
        gt.a(a);
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (Video)obj1;
        if (((Video) (obj)).privacy != com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.PUBLIC || ((Video) (obj)).ownerUri == null)
        {
            gt.a(a);
            return;
        } else
        {
            obj1 = d.a(com.google.android.apps.youtube.app.ui.gt.b(a));
            gt.a(a, ((d) (obj1)));
            gt.c(a).a(((Video) (obj)).ownerUri, ((b) (obj1)));
            return;
        }
    }
}
