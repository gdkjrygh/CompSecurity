// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            MediaView, aoh

class a1v
    implements android.view.View.OnClickListener
{

    final MediaView a;
    final aoh b;

    a1v(MediaView mediaview, aoh aoh)
    {
        a = mediaview;
        b = aoh;
        super();
    }

    public void onClick(View view)
    {
        view.setOnClickListener(b);
        view = a;
        boolean flag;
        if (!MediaView.b(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        MediaView.b(view, flag);
    }
}
