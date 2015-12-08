// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

public class CaptureMessage
{

    private int a;
    private int b;
    private Drawable c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private Typeface i;
    private String j;
    private boolean k;
    private KUIMessageOrientation l;

    public CaptureMessage()
    {
        a = -11;
        b = -11;
        d = -1;
        e = -1;
        f = -1;
        g = -1;
        h = -1;
        k = true;
        l = KUIMessageOrientation.UNKNOWN;
    }

    public Drawable getBackground()
    {
        return c;
    }

    public int getBackgroundColor()
    {
        return b;
    }

    public int getHeight()
    {
        return g;
    }

    public String getMessage()
    {
        return j;
    }

    public KUIMessageOrientation getOrientation()
    {
        return l;
    }

    public int getTextColor()
    {
        return a;
    }

    public int getTextPosX()
    {
        return d;
    }

    public int getTextPosY()
    {
        return e;
    }

    public int getTextSize()
    {
        return h;
    }

    public Typeface getTypeface()
    {
        return i;
    }

    public boolean getVisibility()
    {
        return k;
    }

    public int getWidth()
    {
        return f;
    }

    public void setBackground(Drawable drawable)
    {
        c = drawable;
    }

    public void setBackgroundColor(int i1)
    {
        b = i1;
    }

    public void setHeight(int i1)
    {
        g = i1;
    }

    public void setMessage(String s)
    {
        j = s;
    }

    public void setOrientation(KUIMessageOrientation kuimessageorientation)
    {
        l = kuimessageorientation;
    }

    public void setTextColor(int i1)
    {
        a = i1;
    }

    public void setTextPosX(int i1)
    {
        d = i1;
    }

    public void setTextPosY(int i1)
    {
        e = i1;
    }

    public void setTextSize(int i1)
    {
        h = i1;
    }

    public void setTypeface(Typeface typeface)
    {
        i = typeface;
    }

    public void setVisibility(boolean flag)
    {
        k = flag;
    }

    public void setWidth(int i1)
    {
        f = i1;
    }

    private class KUIMessageOrientation extends Enum
    {

        public static final KUIMessageOrientation LANDSCAPE;
        public static final KUIMessageOrientation PORTRAIT;
        public static final KUIMessageOrientation REVERSELANDSCAPE;
        public static final KUIMessageOrientation REVERSEPORTRAIT;
        public static final KUIMessageOrientation UNKNOWN;
        private static final KUIMessageOrientation a[];

        public static KUIMessageOrientation valueOf(String s)
        {
            return (KUIMessageOrientation)Enum.valueOf(com/kofax/kmc/kui/uicontrols/captureanimations/CaptureMessage$KUIMessageOrientation, s);
        }

        public static KUIMessageOrientation[] values()
        {
            return (KUIMessageOrientation[])a.clone();
        }

        static 
        {
            PORTRAIT = new KUIMessageOrientation("PORTRAIT", 0);
            LANDSCAPE = new KUIMessageOrientation("LANDSCAPE", 1);
            REVERSEPORTRAIT = new KUIMessageOrientation("REVERSEPORTRAIT", 2);
            REVERSELANDSCAPE = new KUIMessageOrientation("REVERSELANDSCAPE", 3);
            UNKNOWN = new KUIMessageOrientation("UNKNOWN", 4);
            a = (new KUIMessageOrientation[] {
                PORTRAIT, LANDSCAPE, REVERSEPORTRAIT, REVERSELANDSCAPE, UNKNOWN
            });
        }

        private KUIMessageOrientation(String s, int i1)
        {
            super(s, i1);
        }
    }

}
