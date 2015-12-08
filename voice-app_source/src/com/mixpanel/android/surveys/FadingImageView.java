// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

public class FadingImageView extends ImageView
{

    private Paint mAlphaGradientPaint;
    private Shader mAlphaGradientShader;
    private Paint mDarkenGradientPaint;
    private Shader mDarkenGradientShader;
    private Matrix mGradientMatrix;
    private int mHeight;
    private int mWidth;

    public FadingImageView(Context context)
    {
        super(context);
        initFadingImageView();
    }

    public FadingImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        initFadingImageView();
    }

    public FadingImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        initFadingImageView();
    }

    private void initFadingImageView()
    {
        mGradientMatrix = new Matrix();
        mAlphaGradientPaint = new Paint();
        int ai[] = new int[4];
        ai[0] = 0xff000000;
        ai[1] = 0xff000000;
        ai[2] = 0xe5000000;
        android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
        mAlphaGradientShader = new LinearGradient(0.0F, 0.0F, 0.0F, 1.0F, ai, new float[] {
            0.0F, 0.7F, 0.8F, 1.0F
        }, tilemode);
        mAlphaGradientPaint.setShader(mAlphaGradientShader);
        mAlphaGradientPaint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        mDarkenGradientPaint = new Paint();
        ai = new int[4];
        ai[2] = 0xff000000;
        ai[3] = 0xff000000;
        tilemode = android.graphics.Shader.TileMode.CLAMP;
        mDarkenGradientShader = new LinearGradient(0.0F, 0.0F, 0.0F, 1.0F, ai, new float[] {
            0.0F, 0.85F, 0.98F, 1.0F
        }, tilemode);
        mDarkenGradientPaint.setShader(mDarkenGradientShader);
        mAlphaGradientPaint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
    }

    public void draw(Canvas canvas)
    {
        Rect rect = canvas.getClipBounds();
        int i = canvas.saveLayer(0.0F, 0.0F, rect.width(), rect.height(), null, 31);
        super.draw(canvas);
        if (getResources().getConfiguration().orientation == 1)
        {
            canvas.drawRect(0.0F, 0.0F, mWidth, mHeight, mAlphaGradientPaint);
        } else
        {
            canvas.drawRect(getPaddingLeft(), getPaddingTop(), mWidth - getPaddingRight(), mHeight - getPaddingBottom(), mDarkenGradientPaint);
        }
        canvas.restoreToCount(i);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        mHeight = getHeight();
        mWidth = getWidth();
        int k = android.view.View.MeasureSpec.getSize(j);
        if (getResources().getConfiguration().orientation == 1)
        {
            View view = getRootView().findViewById(com.mixpanel.android.R.id.com_mixpanel_android_notification_bottom_wrapper);
            j = 0;
            i = j;
            if (view != null)
            {
                i = j;
                if (view.getHeight() != 0)
                {
                    i = view.getHeight();
                }
            }
            float f = TypedValue.applyDimension(1, 15F, getResources().getDisplayMetrics());
            mGradientMatrix.setScale(1.0F, (float)(k - i) + f);
        } else
        {
            mGradientMatrix.setScale(1.0F, k);
        }
        mAlphaGradientShader.setLocalMatrix(mGradientMatrix);
        mDarkenGradientShader.setLocalMatrix(mGradientMatrix);
    }
}
