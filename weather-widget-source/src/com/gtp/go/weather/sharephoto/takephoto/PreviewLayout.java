// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.gtp.go.weather.sharephoto.takephoto;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

// Referenced classes of package com.gtp.go.weather.sharephoto.takephoto:
//            PhotoPreview, WatermarkPreview

public class PreviewLayout extends FrameLayout
{

    private PhotoPreview a;
    private WatermarkPreview b;

    public PreviewLayout(Context context)
    {
        super(context);
    }

    public PreviewLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public PreviewLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public PhotoPreview a()
    {
        return a;
    }

    public WatermarkPreview b()
    {
        return b;
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        a = (PhotoPreview)findViewById(0x7f090413);
        b = (WatermarkPreview)findViewById(0x7f0904ec);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        Rect rect = a.a();
        if (rect != null)
        {
            WatermarkPreview watermarkpreview = b;
            i = a.getLeft();
            j = rect.left;
            k = a.getTop();
            l = rect.top;
            int i1 = a.getLeft();
            int j1 = rect.right;
            int k1 = a.getTop();
            watermarkpreview.layout(i + j, k + l, i1 + j1, rect.bottom + k1);
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        Rect rect = a.a();
        if (rect != null)
        {
            b.measure(android.view.View.MeasureSpec.makeMeasureSpec(rect.right - rect.left, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(rect.bottom - rect.top, 0x40000000));
        }
    }
}
