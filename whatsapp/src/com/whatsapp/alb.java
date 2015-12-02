// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

class alb extends ReplacementSpan
{

    int a;
    int b;

    alb(int i, int j)
    {
        b = i;
        a = j;
    }

    public void draw(Canvas canvas, CharSequence charsequence, int i, int j, float f, int k, int l, 
            int i1, Paint paint)
    {
    }

    public int getSize(Paint paint, CharSequence charsequence, int i, int j, android.graphics.Paint.FontMetricsInt fontmetricsint)
    {
        if (fontmetricsint != null)
        {
            fontmetricsint.ascent = -a;
            fontmetricsint.descent = 0;
            fontmetricsint.top = fontmetricsint.ascent;
            fontmetricsint.bottom = 0;
        }
        return b;
    }
}
