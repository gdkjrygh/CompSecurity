// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            MediaView

class alk
    implements android.view.View.OnClickListener
{

    final c4 a;
    final MediaView b;

    alk(MediaView mediaview, c4 c4)
    {
        b = mediaview;
        a = c4;
        super();
    }

    public void onClick(View view)
    {
        MediaView.a(b, a, 0);
    }
}
