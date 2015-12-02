// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.AsyncTask;

// Referenced classes of package com.whatsapp:
//            CallLogActivity, og, pt

class a_c extends AsyncTask
{

    final CallLogActivity a;

    a_c(CallLogActivity calllogactivity)
    {
        a = calllogactivity;
        super();
    }

    public Void a(Void avoid[])
    {
        int i = a.getResources().getDimensionPixelSize(0x7f0a004b);
        float f = a.getResources().getDimension(0x7f0a004a);
        Bitmap bitmap = CallLogActivity.b(a).a(i, f, false);
        avoid = bitmap;
        if (bitmap == null)
        {
            Bitmap bitmap1 = CallLogActivity.b(a).j();
            avoid = bitmap1;
            if (bitmap1 != null)
            {
                avoid = Bitmap.createScaledBitmap(bitmap1, i, i, true);
            }
        }
        if (avoid != null && !isCancelled())
        {
            a.runOnUiThread(new pt(this, avoid));
        }
        return null;
    }

    public Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }
}
