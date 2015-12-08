// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.frontia.richmedia;

import android.view.View;
import io.wecloud.message.h;

// Referenced classes of package io.wecloud.message.frontia.richmedia:
//            c, b

class d
    implements android.view.View.OnClickListener
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public void onClick(View view)
    {
        while (a.a == null || view == null || view.getId() != h.a) 
        {
            return;
        }
        a.a.a(view, 9);
    }
}
