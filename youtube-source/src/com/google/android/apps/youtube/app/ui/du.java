// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.h;
import com.google.android.youtube.j;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            ds

class du
{

    public ImageView c;
    public TextView d;
    final ds e;

    public du(ds ds, View view)
    {
        e = ds;
        super();
        c = (ImageView)view.findViewById(j.bE);
        d = (TextView)view.findViewById(j.bW);
    }

    public void a(com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy privacy)
    {
        if (c != null)
        {
            if (privacy == com.google.android.apps.youtube.datalib.model.gdata.Video.Privacy.PRIVATE)
            {
                c.setImageResource(h.ai);
            } else
            {
                c.setImageResource(h.aj);
            }
        }
        if (d != null)
        {
            d.setText(privacy.nameId);
        }
    }
}
