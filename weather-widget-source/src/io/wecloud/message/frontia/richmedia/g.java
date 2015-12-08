// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.wecloud.message.frontia.richmedia;

import android.view.View;

// Referenced classes of package io.wecloud.message.frontia.richmedia:
//            MediaViewActivity

class g
    implements android.view.View.OnClickListener
{

    final MediaViewActivity a;

    g(MediaViewActivity mediaviewactivity)
    {
        a = mediaviewactivity;
        super();
    }

    public void onClick(View view)
    {
        a.finish();
    }
}
