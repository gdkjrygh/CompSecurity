// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.gallerypicker;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.whatsapp.gallerypicker:
//            ImagePreview

class setLayoutTransition extends ViewGroup
{

    int a;
    final ImagePreview b;

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        l = ImagePreview.B;
        int i1 = getChildCount();
        if (a != 0)
        {
            int j1 = (int)(2.0F * getResources().getDisplayMetrics().density);
            int k1 = (k - i) / a;
            k = 0;
            do
            {
                if (k >= i1)
                {
                    break;
                }
                View view = getChildAt(k);
                int i2 = k / a;
                int l1 = (k % a) * k1;
                i2 *= k1;
                view.layout(i + l1 + j1, j + i2 + j1, (l1 + i + k1) - j1, (i2 + j + k1) - j1);
                k++;
            } while (l == 0);
        }
    }

    public void onMeasure(int i, int j)
    {
        byte byte0 = 2;
        super.onMeasure(i, j);
        i = (int)(72F * getResources().getDisplayMetrics().density);
        int k = getChildCount();
        j = getMeasuredWidth();
        if (k > 0 && j > 0)
        {
            a = j / i;
            i = ((a + k) - 1) / a;
            if (k % a == 1)
            {
                a = a + 1;
                i = ((a + k) - 1) / a;
            }
            if (i > 2)
            {
                a = ((k + 2) - 1) / 2;
                i = byte0;
            }
            j /= a;
            setMeasuredDimension(getMeasuredWidth(), i * j);
        }
    }

    public (ImagePreview imagepreview, Context context)
    {
        b = imagepreview;
        super(context);
        if (android.os.view.ThumbsGrid.b >= 11)
        {
            setLayoutTransition(new LayoutTransition());
        }
    }
}
