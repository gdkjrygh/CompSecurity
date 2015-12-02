// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.actionbarsherlock.view.ActionMode;
import com.whatsapp.protocol.c4;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            MediaGallery, App, MediaView

class n3
    implements android.view.View.OnClickListener
{

    final MediaGallery a;

    n3(MediaGallery mediagallery)
    {
        a = mediagallery;
        super();
    }

    public void onClick(View view)
    {
label0:
        {
            c4 c4_1 = (c4)view.getTag(0x7f0b01b5);
            if (MediaGallery.c(a) != null)
            {
                MediaGallery.a(a, c4_1, view);
                if (!MediaGallery.f(a).isEmpty())
                {
                    break label0;
                }
                MediaGallery.c(a).finish();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            a.startActivity(MediaView.a(c4_1, MediaGallery.e(a), a, view));
            if (c4_1.w == 1 && MediaView.c())
            {
                a.overridePendingTransition(0, 0);
            }
        }
    }
}
