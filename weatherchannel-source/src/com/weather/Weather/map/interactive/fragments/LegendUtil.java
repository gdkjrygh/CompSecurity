// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.weather.Weather.map.interactive.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextPaint;
import android.text.TextUtils;

public final class LegendUtil
{

    private static final TextItem CLOUDS[];
    private static final TextItem CLOUDS_HIGHEST;
    private static final TextItem CLOUDS_LOWEST;
    private static final TextItem DEW[];
    private static final TextItem DEW_COMFORTABLE;
    private static final TextItem DEW_DRY;
    private static final TextItem DEW_HUMID;
    private static final TextItem FEELS[];
    private static final TextItem FEELS_HEAT_INDEX;
    private static final TextItem FEELS_WIND_CHILL_INDEX;
    private static final TextItem FIRE[];
    private static final TextItem FIRE_HIGH;
    private static final TextItem FIRE_LOW;
    private static final TextItem FIRE_MID;
    private static final TextItem RADAR[];
    private static final TextItem RADAR_MIX;
    private static final TextItem RADAR_RAIN;
    private static final TextItem RADAR_SNOW;
    private static final String TAG = "LegendUtil";
    private static final TextItem UV[];
    private static final TextItem UV_EXTREME;
    private static final TextItem UV_LOW;

    private LegendUtil()
    {
    }

    private static void drawText(Context context, Canvas canvas, TextItem atextitem[], TextPaint textpaint, int i, int j)
    {
        int l = atextitem.length;
        for (int k = 0; k < l; k++)
        {
            TextItem textitem = atextitem[k];
    /* block-local class not found */
    class TextItem {}

            String s = TextUtils.ellipsize(context.getResources().getString(textitem.textResourceId), textpaint, textitem.normalizeWidth(i), android.text.TextUtils.TruncateAt.END).toString();
            int i1 = textitem.normalizeStartX(i, textpaint, s);
            int j1 = textitem.normalizeStartY(j);
            canvas.drawText(s, i1, j1, textpaint);
        }

    }

    private static Bitmap getBitmap(Context context, int i)
        throws OutOfMemoryError
    {
        TextItem atextitem[] = BitmapFactory.decodeResource(context.getResources(), i);
        Object obj = null;
        if (atextitem != null)
        {
            if (atextitem.isMutable())
            {
                obj = atextitem;
            } else
            {
                obj = atextitem.copy(android.graphics.Bitmap.Config.ARGB_8888, true);
            }
        }
        if (obj != null)
        {
            atextitem = getTextItems(i);
            if (atextitem != null)
            {
                drawText(context, new Canvas(((Bitmap) (obj))), atextitem, getPaint(context), ((Bitmap) (obj)).getWidth(), ((Bitmap) (obj)).getHeight());
            }
        }
        return ((Bitmap) (obj));
    }

    public static BitmapDrawable getDrawable(Context context, int i)
        throws OutOfMemoryError
    {
        return new BitmapDrawable(context.getResources(), getBitmap(context, i));
    }

    private static TextPaint getPaint(Context context)
    {
        TextPaint textpaint = new TextPaint(1);
        textpaint.setColor(0xff000000);
        textpaint.setTextSize(context.getResources().getDimension(0x7f0a015f));
        textpaint.setTypeface(Typeface.SANS_SERIF);
        return textpaint;
    }

    private static TextItem[] getTextItems(int i)
    {
        TextItem atextitem[] = null;
        if (i == 0x7f02035b)
        {
            atextitem = RADAR;
        } else
        {
            if (i == 0x7f02001e)
            {
                return CLOUDS;
            }
            if (i == 0x7f0204a1)
            {
                return UV;
            }
            if (i == 0x7f02007f)
            {
                return DEW;
            }
            if (i == 0x7f020087)
            {
                return FEELS;
            }
            if (i == 0x7f0200c8)
            {
                return FIRE;
            }
        }
        return atextitem;
    }

    static 
    {
        CLOUDS_LOWEST = new TextItem(320, 22, 54, 18, 90, 0, 0x7f07019a);
        CLOUDS_HIGHEST = new TextItem(320, 22, 42, 18, 90, 2, 0x7f070198);
        CLOUDS = (new TextItem[] {
            CLOUDS_LOWEST, CLOUDS_HIGHEST
        });
        UV_LOW = new TextItem(320, 26, 46, 22, 80, 0, 0x7f070199);
        UV_EXTREME = new TextItem(320, 26, 44, 22, 80, 2, 0x7f070196);
        UV = (new TextItem[] {
            UV_LOW, UV_EXTREME
        });
        DEW_DRY = new TextItem(320, 26, 46, 22, 70, 0, 0x7f07019e);
        DEW_COMFORTABLE = new TextItem(320, 26, 160, 22, 70, 1, 0x7f070195);
        DEW_HUMID = new TextItem(320, 26, 46, 22, 70, 2, 0x7f07019f);
        DEW = (new TextItem[] {
            DEW_DRY, DEW_COMFORTABLE, DEW_HUMID
        });
        FEELS_WIND_CHILL_INDEX = new TextItem(320, 42, 106, 40, 110, 1, 0x7f0701a0);
        FEELS_HEAT_INDEX = new TextItem(320, 42, 234, 40, 84, 1, 0x7f070197);
        FEELS = (new TextItem[] {
            FEELS_WIND_CHILL_INDEX, FEELS_HEAT_INDEX
        });
        RADAR_RAIN = new TextItem(320, 20, 92, 18, 80, 1, 0x7f07019c);
        RADAR_MIX = new TextItem(320, 20, 190, 18, 50, 1, 0x7f07019b);
        RADAR_SNOW = new TextItem(320, 20, 254, 18, 50, 1, 0x7f07019d);
        RADAR = (new TextItem[] {
            RADAR_RAIN, RADAR_MIX, RADAR_SNOW
        });
        FIRE_LOW = new TextItem(320, 23, 44, 22, 80, 0, 0x7f070469);
        FIRE_MID = new TextItem(320, 23, 160, 22, 70, 1, 0x7f07053d);
        FIRE_HIGH = new TextItem(320, 23, 44, 22, 80, 2, 0x7f070468);
        FIRE = (new TextItem[] {
            FIRE_LOW, FIRE_MID, FIRE_HIGH
        });
    }
}
