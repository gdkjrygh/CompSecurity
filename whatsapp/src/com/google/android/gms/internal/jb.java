// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.widget.ImageView;

// Referenced classes of package com.google.android.gms.internal:
//            qw

public final class jb extends ImageView
{

    private int Mp;
    private a Mq;
    private int Mr;
    private float Ms;

    protected void onDraw(Canvas canvas)
    {
        if (Mq != null)
        {
            canvas.clipPath(Mq.g(getWidth(), getHeight()));
        }
        super.onDraw(canvas);
        if (Mp != 0)
        {
            canvas.drawColor(Mp);
        }
    }

    protected void onMeasure(int i, int j)
    {
        boolean flag;
        flag = qw.a;
        super.onMeasure(i, j);
        Mr;
        JVM INSTR tableswitch 1 2: default 36
    //                   1 37
    //                   2 55;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        i = getMeasuredHeight();
        j = (int)((float)i * Ms);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        j = getMeasuredWidth();
        i = (int)((float)j / Ms);
        if (flag) goto _L1; else goto _L4
_L4:
        setMeasuredDimension(j, i);
        return;
    }

    private class a
    {

        public abstract Path g(int i, int j);
    }

}
