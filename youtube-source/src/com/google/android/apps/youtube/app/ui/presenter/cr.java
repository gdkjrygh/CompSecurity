// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui.presenter;

import android.view.View;
import com.google.android.apps.youtube.datalib.distiller.model.TopLevelComment;

// Referenced classes of package com.google.android.apps.youtube.app.ui.presenter:
//            cq, cu

final class cr
    implements android.view.View.OnClickListener
{

    final TopLevelComment a;
    final cq b;

    cr(cq cq1, TopLevelComment toplevelcomment)
    {
        b = cq1;
        a = toplevelcomment;
        super();
    }

    public final void onClick(View view)
    {
        cq.a(b).a(a);
    }
}
