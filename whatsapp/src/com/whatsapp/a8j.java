// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.actionbarsherlock.view.ActionMode;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            hd, MediaGallery, App, a9w

class a8j
    implements hd
{

    final ArrayList a;
    final MediaGallery b;

    a8j(MediaGallery mediagallery, ArrayList arraylist)
    {
        b = mediagallery;
        a = arraylist;
        super();
    }

    public void a()
    {
label0:
        {
            MediaGallery.m(b).removeAll(a);
            if (MediaGallery.m(b).isEmpty())
            {
                b.finish();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            b.e();
            MediaGallery.d(b).a();
            MediaGallery.d(b).notifyDataSetChanged();
            if (MediaGallery.c(b) != null)
            {
                MediaGallery.c(b).finish();
            }
        }
    }
}
