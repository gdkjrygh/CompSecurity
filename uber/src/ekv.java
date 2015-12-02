// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.Canvas;

final class ekv
    implements chc
{

    private final int a;

    ekv(int i)
    {
        a = i;
    }

    public final Bitmap a(Bitmap bitmap)
    {
        Bitmap bitmap1;
label0:
        {
            if (bitmap.getWidth() == a && bitmap.getHeight() == a)
            {
                return bitmap;
            }
            if (bitmap.getWidth() <= a)
            {
                bitmap1 = bitmap;
                if (bitmap.getHeight() <= a)
                {
                    break label0;
                }
            }
            bitmap1 = cwn.a(bitmap, a);
            bitmap.recycle();
        }
        int i = a / 2;
        int j = bitmap1.getWidth() / 2;
        int k = a / 2;
        int l = bitmap1.getHeight() / 2;
        bitmap = Bitmap.createBitmap(a, a, android.graphics.Bitmap.Config.ARGB_8888);
        (new Canvas(bitmap)).drawBitmap(bitmap1, i - j, k - l, null);
        bitmap1.recycle();
        return bitmap;
    }

    public final String a()
    {
        return "square()";
    }
}
