// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gau.go.launcherex.gowidget.weather.scroller;

import android.view.MotionEvent;

public class d
{

    final float a[] = new float[10];
    final float b[] = new float[10];
    final long c[] = new long[10];
    float d;
    float e;
    int f;

    public d()
    {
    }

    public void a()
    {
        long al[] = c;
        for (int i = 0; i < 10; i++)
        {
            al[i] = 0x8000000000000000L;
        }

    }

    public void a(int i)
    {
        a(i, 3.402823E+38F);
    }

    public void a(int i, float f1)
    {
        float af[] = a;
        float af1[] = b;
        long al[] = c;
        int k1 = f;
        int j1;
        if (al[k1] != 0x8000000000000000L)
        {
            float f2 = al[k1] - 200L;
            int j = ((k1 + 10) - 1) % 10;
            int l = k1;
            do
            {
                j1 = l;
                if ((float)al[j] < f2)
                {
                    break;
                }
                j1 = l;
                if (j == k1)
                {
                    break;
                }
                l = j;
                j = ((j + 10) - 1) % 10;
            } while (true);
        } else
        {
            j1 = k1;
        }
        float f8 = af[j1];
        float f9 = af1[j1];
        long l2 = al[j1];
        float f3 = 0.0F;
        float f4 = 0.0F;
        int i1 = ((k1 - j1) + 10) % 10 + 1;
        int k = i1;
        if (i1 > 3)
        {
            k = i1 - 1;
        }
        i1 = 1;
        while (i1 < k) 
        {
            int l1 = (j1 + i1) % 10;
            int i2 = (int)(al[l1] - l2);
            float f5;
            if (i2 == 0)
            {
                f5 = f3;
                f3 = f4;
            } else
            {
                float f6 = ((af[l1] - f8) / (float)i2) * (float)i;
                float f7;
                if (f3 != 0.0F)
                {
                    f6 = (f6 + f3) * 0.5F;
                }
                f7 = ((af1[l1] - f9) / (float)i2) * (float)i;
                f5 = f6;
                f3 = f7;
                if (f4 != 0.0F)
                {
                    f3 = (f7 + f4) * 0.5F;
                    f5 = f6;
                }
            }
            i1++;
            f4 = f3;
            f3 = f5;
        }
        if (f3 < 0.0F)
        {
            f3 = Math.max(f3, -f1);
        } else
        {
            f3 = Math.min(f3, f1);
        }
        e = f3;
        if (f4 < 0.0F)
        {
            f1 = Math.max(f4, -f1);
        } else
        {
            f1 = Math.min(f4, f1);
        }
        d = f1;
    }

    public void a(MotionEvent motionevent)
    {
        int k = motionevent.getHistorySize();
        int i = f + 1;
        f = i;
        if (i >= 10)
        {
            f = 0;
        }
        for (int j = 0; j < k; j++)
        {
            a[f] = motionevent.getHistoricalX(j);
            b[f] = motionevent.getHistoricalY(j);
            c[f] = motionevent.getHistoricalEventTime(j);
            int l = f + 1;
            f = l;
            if (l >= 10)
            {
                f = 0;
            }
        }

        a[f] = motionevent.getX();
        b[f] = motionevent.getY();
        c[f] = motionevent.getEventTime();
    }

    public float b()
    {
        return e;
    }

    public float c()
    {
        return d;
    }
}
