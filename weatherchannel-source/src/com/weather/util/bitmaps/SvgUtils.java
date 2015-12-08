// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.util.bitmaps;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import com.larvalabs.svgandroid.SVG;
import com.larvalabs.svgandroid.SVGParser;

public final class SvgUtils
{

    private SvgUtils()
    {
    }

    public static Bitmap createBitmapFromSvgPicture(Picture picture)
    {
        Bitmap bitmap = Bitmap.createBitmap(picture.getWidth(), picture.getHeight(), android.graphics.Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmap);
        picture = new PictureDrawable(picture);
        picture.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        picture.draw(canvas);
        return bitmap;
    }

    public static Bitmap createBitmapFromSvgResourceId(Resources resources, int i)
    {
        return createBitmapFromSvgPicture(SVGParser.getSVGFromResource(resources, i).getPicture());
    }
}
