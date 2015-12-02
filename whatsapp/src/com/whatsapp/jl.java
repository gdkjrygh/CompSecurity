// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            MediaView

class jl
    implements android.view.View.OnClickListener
{

    final MediaView a;

    jl(MediaView mediaview)
    {
        a = mediaview;
        super();
    }

    public void onClick(View view)
    {
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
