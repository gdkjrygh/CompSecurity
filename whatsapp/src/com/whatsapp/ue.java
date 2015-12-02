// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import com.whatsapp.protocol.c4;
import com.whatsapp.util.aw;

// Referenced classes of package com.whatsapp:
//            ConversationRowVideo, App

class ue
    implements aw
{

    final ConversationRowVideo a;

    ue(ConversationRowVideo conversationrowvideo)
    {
        a = conversationrowvideo;
        super();
    }

    public int a()
    {
        View view = ((Activity)a.getContext()).getWindow().getDecorView();
        return (Math.min(view.getWidth(), view.getHeight()) * 70) / 100;
    }

    public void a(ImageView imageview, Bitmap bitmap, c4 c4)
    {
label0:
        {
            if (bitmap != null)
            {
                ConversationRowVideo.b(a).setImageDrawable(new BitmapDrawable(a.getContext().getResources(), bitmap));
                if (App.am == 0)
                {
                    break label0;
                }
            }
            ConversationRowVideo.b(a).setImageDrawable(new ColorDrawable(a.getResources().getColor(0x7f09001e)));
        }
    }
}
