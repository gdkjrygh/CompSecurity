// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.maps.android.heatmaps;

import android.graphics.Color;
import java.util.HashMap;

public class Gradient
{
    private class ColorInterval
    {

        private final int color1;
        private final int color2;
        private final float duration;
        final Gradient this$0;




        private ColorInterval(int i, int j, float f)
        {
            this$0 = Gradient.this;
            super();
            color1 = i;
            color2 = j;
            duration = f;
        }

    }


    private static final int DEFAULT_COLOR_MAP_SIZE = 1000;
    public final int mColorMapSize;
    public int mColors[];
    public float mStartPoints[];

    public Gradient(int ai[], float af[])
    {
        this(ai, af, 1000);
    }

    public Gradient(int ai[], float af[], int i)
    {
        if (ai.length != af.length)
        {
            throw new IllegalArgumentException("colors and startPoints should be same length");
        }
        if (ai.length == 0)
        {
            throw new IllegalArgumentException("No colors have been defined");
        }
        for (int j = 1; j < af.length; j++)
        {
            if (af[j] <= af[j - 1])
            {
                throw new IllegalArgumentException("startPoints should be in increasing order");
            }
        }

        mColorMapSize = i;
        mColors = new int[ai.length];
        mStartPoints = new float[af.length];
        System.arraycopy(ai, 0, mColors, 0, ai.length);
        System.arraycopy(af, 0, mStartPoints, 0, af.length);
    }

    private HashMap generateColorIntervals()
    {
        HashMap hashmap = new HashMap();
        if (mStartPoints[0] != 0.0F)
        {
            int i = Color.argb(0, Color.red(mColors[0]), Color.green(mColors[0]), Color.blue(mColors[0]));
            int l = mColors[0];
            float f = mColorMapSize;
            hashmap.put(Integer.valueOf(0), new ColorInterval(i, l, mStartPoints[0] * f));
        }
        for (int j = 1; j < mColors.length; j++)
        {
            hashmap.put(Integer.valueOf((int)((float)mColorMapSize * mStartPoints[j - 1])), new ColorInterval(mColors[j - 1], mColors[j], (float)mColorMapSize * (mStartPoints[j] - mStartPoints[j - 1])));
        }

        if (mStartPoints[mStartPoints.length - 1] != 1.0F)
        {
            int k = mStartPoints.length - 1;
            hashmap.put(Integer.valueOf((int)((float)mColorMapSize * mStartPoints[k])), new ColorInterval(mColors[k], mColors[k], (float)mColorMapSize * (1.0F - mStartPoints[k])));
        }
        return hashmap;
    }

    static int interpolateColor(int i, int j, float f)
    {
        float af[];
        float af1[];
        int k;
        k = (int)((float)(Color.alpha(j) - Color.alpha(i)) * f + (float)Color.alpha(i));
        af = new float[3];
        Color.RGBToHSV(Color.red(i), Color.green(i), Color.blue(i), af);
        af1 = new float[3];
        Color.RGBToHSV(Color.red(j), Color.green(j), Color.blue(j), af1);
        if (af[0] - af1[0] <= 180F) goto _L2; else goto _L1
_L1:
        af1[0] = af1[0] + 360F;
_L4:
        float af2[];
        af2 = new float[3];
        for (i = 0; i < 3; i++)
        {
            af2[i] = (af1[i] - af[i]) * f + af[i];
        }

        break; /* Loop/switch isn't completed */
_L2:
        if (af1[0] - af[0] > 180F)
        {
            af[0] = af[0] + 360F;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return Color.HSVToColor(k, af2);
    }

    int[] generateColorMap(double d)
    {
        HashMap hashmap = generateColorIntervals();
        int ai[] = new int[mColorMapSize];
        ColorInterval colorinterval = (ColorInterval)hashmap.get(Integer.valueOf(0));
        int k = 0;
        for (int i = 0; i < mColorMapSize; i++)
        {
            if (hashmap.containsKey(Integer.valueOf(i)))
            {
                colorinterval = (ColorInterval)hashmap.get(Integer.valueOf(i));
                k = i;
            }
            float f = (float)(i - k) / colorinterval.duration;
            ai[i] = interpolateColor(colorinterval.color1, colorinterval.color2, f);
        }

        if (d != 1.0D)
        {
            for (int j = 0; j < mColorMapSize; j++)
            {
                int l = ai[j];
                ai[j] = Color.argb((int)((double)Color.alpha(l) * d), Color.red(l), Color.green(l), Color.blue(l));
            }

        }
        return ai;
    }
}
