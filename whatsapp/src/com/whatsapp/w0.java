// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.aw;

// Referenced classes of package com.whatsapp:
//            ConversationRowImage

class w0
    implements aw
{

    final ConversationRowImage a;

    w0(ConversationRowImage conversationrowimage)
    {
        a = conversationrowimage;
        super();
    }

    public int a()
    {
        View view = ((Activity)a.getContext()).getWindow().getDecorView();
        return (Math.min(view.getWidth(), view.getHeight()) * 70) / 100;
    }

    public void a(ImageView imageview, Bitmap bitmap, c4 c4)
    {
        if (bitmap != null)
        {
            ConversationRowImage.RowImageView.a(ConversationRowImage.a(a), bitmap);
            ConversationRowImage.a(a).invalidate();
        }
    }
}
