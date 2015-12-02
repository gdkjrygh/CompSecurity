// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp:
//            Conversation, og, ak_, uz

class tz extends AsyncTask
{

    final Conversation a;

    private tz(Conversation conversation)
    {
        a = conversation;
        super();
    }

    tz(Conversation conversation, uz uz)
    {
        this(conversation);
    }

    protected Bitmap a(Void avoid[])
    {
        Bitmap bitmap = a.aD.a(a.getResources().getDimensionPixelSize(0x7f0a0029), a.getResources().getDimension(0x7f0a0058), false);
        avoid = bitmap;
        if (bitmap == null)
        {
            avoid = a.aD.j();
        }
        return avoid;
    }

    protected void a(Bitmap bitmap)
    {
        Conversation.b(a).setImageDrawable(new ak_(a, a.getResources(), bitmap));
        Conversation.b(a).setVisibility(0);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((Bitmap)obj);
    }
}
