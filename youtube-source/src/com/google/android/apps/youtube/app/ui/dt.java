// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.j;
import java.util.Map;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            du, PrivacySpinner, ds

final class dt extends du
{

    public TextView a;
    final ds b;

    public dt(ds ds, View view)
    {
        b = ds;
        super(ds, view);
        a = (TextView)view.findViewById(j.aH);
    }

    public final void a(com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy privacy)
    {
        super.a(privacy);
        if (a != null)
        {
            a.setText(((Integer)PrivacySpinner.b().get(privacy)).intValue());
        }
    }
}
