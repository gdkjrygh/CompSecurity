// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import com.ubercab.client.feature.trip.tray.TrayDriverLayout;

final class gft
    implements chc
{

    private final chc a;
    private final int b;
    private final Resources c;

    gft(Resources resources, int i, chc chc1)
    {
        c = resources;
        a = chc1;
        b = i;
    }

    public final Bitmap a(Bitmap bitmap)
    {
        int j = bitmap.getWidth();
        int i = bitmap.getHeight();
        Bitmap bitmap1;
        Canvas canvas;
        Paint paint;
        int k;
        int l;
        int i1;
        if (j > i)
        {
            k = (j - i) / 2;
            i = j;
            j = 0;
        } else
        {
            j = (i - j) / 2;
            k = 0;
        }
        i1 = b;
        l = i1;
        if (i > i1)
        {
            ijg.a(com/ubercab/client/feature/trip/tray/TrayDriverLayout.getSimpleName()).d("Image should be resized to below the target width %d %d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(i1)
            });
            l = i;
        }
        i = (l - i) / 2;
        bitmap1 = Bitmap.createBitmap(l, l, android.graphics.Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap1);
        l = c.getColor(0x7f0d0074);
        i1 = c.getColor(0x7f0d0071);
        canvas.drawColor(l);
        paint = new Paint();
        paint.setColorFilter(new LightingColorFilter(0, i1));
        canvas.drawBitmap(bitmap, j + i, k + i, paint);
        bitmap.recycle();
        if (a != null)
        {
            return a.a(bitmap1);
        } else
        {
            return bitmap1;
        }
    }

    public final String a()
    {
        StringBuilder stringbuilder = new StringBuilder("backup_image-");
        stringbuilder.append(b);
        if (a != null)
        {
            stringbuilder.append("__").append(a.a());
        }
        return stringbuilder.toString();
    }
}
