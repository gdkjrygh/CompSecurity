// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.util;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.whatsapp.a1g;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp.util:
//            aw

public class b
    implements aw
{

    public b()
    {
    }

    public int a()
    {
        return (int)(88F * a1g.a().g);
    }

    public void a(ImageView imageview, Bitmap bitmap, c4 c4)
    {
        if (bitmap != null)
        {
            imageview.setImageBitmap(bitmap);
        }
    }
}
