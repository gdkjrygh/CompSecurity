// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.util.DisplayMetrics;

// Referenced classes of package com.jiubang.core.a:
//            r, q, i

public class d extends r
{

    private float A;
    private float B;
    private float C;
    private float u;
    private float v;
    private float w;
    private float x;
    private float y;
    private float z;

    public d(int j, int k, int l, int i1, int j1, int k1, int l1, 
            int i2, int j2, int k2, float f, float f1, boolean flag, boolean flag1, 
            long l2, long l3)
    {
        super(j, l, i1, j1, k1, l1, i2, j2, k2, flag, flag1, l2, l3);
        B = 0.5F;
        C = 0.5F;
        j = j1 - l;
        l = k1 - i1;
        k;
        JVM INSTR tableswitch 1 5: default 88
    //                   1 117
    //                   2 202
    //                   3 232
    //                   4 435
    //                   5 491;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        A = 0.1666667F;
        if (j1 < 0)
        {
            B = -0.5F;
        }
        if (k1 < 0)
        {
            C = -0.5F;
        }
        return;
_L2:
        float f2 = 1.0F / (float)(h * h);
        u = f;
        v = f1;
        if (j != 0)
        {
            w = ((float)(j << 1) - u * (float)h * 2.0F) * f2;
        }
        if (l != 0)
        {
            y = ((float)(l << 1) - v * (float)h * 2.0F) * f2;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        f = 1.0F / (float)h;
        u = (float)j * f;
        v = (float)l * f;
        continue; /* Loop/switch isn't completed */
_L4:
        u = f;
        v = f1;
        if (j != 0)
        {
            w = ((float)(j * 6) - (float)(h * 4) * u) / (float)(h * h);
            x = ((float)(h * 6) * u - (float)(j * 12)) / (float)(h * h * h);
        } else
        {
            u = 0.0F;
            w = 0.0F;
            x = 0.0F;
        }
        if (l != 0)
        {
            y = ((float)(l * 6) - (float)(h * 4) * v) / (float)(h * h);
            z = ((float)(h * 6) * v - (float)(l * 12)) / (float)(h * h * h);
        } else
        {
            v = 0.0F;
            y = 0.0F;
            z = 0.0F;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        u = j / h;
        v = f1;
        if (l != 0)
        {
            y = ((float)(l << 1) - v * (float)h * 2.0F) / (float)(h * h);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        u = f;
        if (j != 0)
        {
            w = ((float)(j << 1) - u * (float)h * 2.0F) / (float)(h * h);
        }
        v = l / h;
        if (true) goto _L1; else goto _L7
_L7:
    }

    protected void a(q q1, i j)
    {
label0:
        {
            if (!c())
            {
                if (this.j != 1)
                {
                    break label0;
                }
                q = (int)((float)m + (u + w * 0.5F * (float)this.k + x * (float)this.k * (float)this.k * A) * (float)this.k + B);
                r = (int)((float)o + (v + y * 0.5F * (float)this.k + z * (float)this.k * (float)this.k * A) * (float)this.k + C);
                q1.a().postTranslate(q, r);
            }
            return;
        }
        float f = a();
        q = (int)((float)m + (float)(n - m) * f);
        float f1 = o;
        r = (int)(f * (float)(p - o) + f1);
        if (!s)
        {
            int k = j.a();
            int i1;
            if (q > k)
            {
                q = q - (k + j.c());
            } else
            if (q + j.c() < 0)
            {
                int j1 = q;
                q = k + j.c() + j1;
            }
        }
        if (!t)
        {
            DisplayMetrics displaymetrics = j.l().getResources().getDisplayMetrics();
            if (r > displaymetrics.heightPixels)
            {
                r = r - (displaymetrics.heightPixels + j.d());
            } else
            if (r + j.d() < 0)
            {
                int l = r;
                r = displaymetrics.heightPixels + j.d() + l;
            }
        }
        k = j.h();
        i1 = j.i();
        q1.a().postTranslate(-k, -i1);
        q1.a().postTranslate(q, r);
        j.a(q, r);
    }
}
