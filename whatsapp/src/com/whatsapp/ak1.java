// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.protocol.c4;
import java.util.HashMap;

// Referenced classes of package com.whatsapp:
//            MediaGallery, App, abl

class ak1
    implements android.view.View.OnLongClickListener
{

    final MediaGallery a;

    ak1(MediaGallery mediagallery)
    {
        a = mediagallery;
        super();
    }

    public boolean onLongClick(View view)
    {
label0:
        {
            c4 c4_1 = (c4)view.getTag(0x7f0b01b5);
            if (MediaGallery.c(a) != null)
            {
                MediaGallery.a(a, c4_1, view);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            MediaGallery.f(a).put(c4_1.y, c4_1);
            view.setSelected(true);
            MediaGallery.a(a, a.startActionMode(MediaGallery.g(a)));
            MediaGallery.k(a).setText(String.format(App.j.a(0x7f0d001e, MediaGallery.f(a).size()), new Object[] {
                Integer.valueOf(MediaGallery.f(a).size())
            }));
        }
        return true;
    }
}
