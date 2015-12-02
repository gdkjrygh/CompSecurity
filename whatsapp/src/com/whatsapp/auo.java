// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp:
//            App, VoipActivity, k, og

class auo extends AsyncTask
{

    final int a;
    final VoipActivity b;

    auo(VoipActivity voipactivity, int i)
    {
        b = voipactivity;
        a = i;
        super();
    }

    protected Bitmap a(Void avoid[])
    {
        avoid = App.az.f(VoipActivity.g(b));
        if (avoid == null)
        {
            return null;
        } else
        {
            return avoid.a(a, 0.0F, false);
        }
    }

    protected void a(Bitmap bitmap)
    {
label0:
        {
            ImageView imageview = (ImageView)b.findViewById(0x7f0b02dd);
            if (bitmap != null)
            {
                imageview.setImageBitmap(bitmap);
                if (App.am == 0)
                {
                    break label0;
                }
            }
            imageview.setImageResource(0x7f02055a);
        }
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
