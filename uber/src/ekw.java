// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;

final class ekw
    implements chc
{

    final eku a;

    private ekw(eku eku1)
    {
        a = eku1;
        super();
    }

    ekw(eku eku1, byte byte0)
    {
        this(eku1);
    }

    public final Bitmap a(Bitmap bitmap)
    {
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setColorFilter(new PorterDuffColorFilter(eku.a(a).getResources().getColor(0x106000b), android.graphics.PorterDuff.Mode.SRC_ATOP));
        (new Canvas(bitmap1)).drawBitmap(bitmap, 0.0F, 0.0F, paint);
        bitmap.recycle();
        return bitmap1;
    }

    public final String a()
    {
        return "invert()";
    }
}
