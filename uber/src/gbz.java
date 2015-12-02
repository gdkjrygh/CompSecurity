// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;

final class gbz
    implements chc
{

    gbz()
    {
    }

    public final Bitmap a(Bitmap bitmap)
    {
        Bitmap bitmap1 = bitmap;
        if (bitmap.getDensity() != 320)
        {
            float f = (float)bitmap.getDensity() / 320F;
            bitmap1 = Bitmap.createScaledBitmap(bitmap, (int)((float)bitmap.getWidth() * f), (int)(f * (float)bitmap.getHeight()), true);
            if (bitmap != bitmap1)
            {
                bitmap.recycle();
            }
        }
        return bitmap1;
    }

    public final String a()
    {
        return "fixXHDPIDensity()";
    }
}
