// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.widget.ImageView;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

class CircleImageView extends ImageView
{

    private android.view.animation.Animation.AnimationListener mListener;
    private int mShadowRadius;

    public CircleImageView(Context context, int i, float f)
    {
label0:
        {
            super(context);
            float f1 = getContext().getResources().getDisplayMetrics().density;
            int j = (int)(f * f1 * 2.0F);
            int k = (int)(1.75F * f1);
            int l = (int)(0.0F * f1);
            mShadowRadius = (int)(3.5F * f1);
            if (elevationSupported())
            {
                context = new ShapeDrawable(new OvalShape());
                ViewCompat.setElevation(this, f1 * 4F);
                if (SlidingPaneLayout.a == 0)
                {
                    break label0;
                }
            }
            context = new ShapeDrawable(new OvalShadow(mShadowRadius, j));
            ViewCompat.setLayerType(this, 1, context.getPaint());
            context.getPaint().setShadowLayer(mShadowRadius, l, k, 0x1e000000);
            j = mShadowRadius;
            setPadding(j, j, j, j);
        }
        context.getPaint().setColor(i);
        setBackgroundDrawable(context);
    }

    private boolean elevationSupported()
    {
        return android.os.Build.VERSION.SDK_INT >= 21;
    }

    public void onAnimationEnd()
    {
        super.onAnimationEnd();
        if (mListener != null)
        {
            mListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart()
    {
        super.onAnimationStart();
        if (mListener != null)
        {
            mListener.onAnimationStart(getAnimation());
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (!elevationSupported())
        {
            setMeasuredDimension(getMeasuredWidth() + mShadowRadius * 2, getMeasuredHeight() + mShadowRadius * 2);
        }
    }

    public void setAnimationListener(android.view.animation.Animation.AnimationListener animationlistener)
    {
        mListener = animationlistener;
    }

    public void setBackgroundColor(int i)
    {
        if (getBackground() instanceof ShapeDrawable)
        {
            Resources resources = getResources();
            ((ShapeDrawable)getBackground()).getPaint().setColor(resources.getColor(i));
        }
    }

    private class OvalShadow extends OvalShape
    {

        private int mCircleDiameter;
        private RadialGradient mRadialGradient;
        private Paint mShadowPaint;
        private int mShadowRadius;
        final CircleImageView this$0;

        public void draw(Canvas canvas, Paint paint)
        {
            int i = getWidth();
            int j = getHeight();
            canvas.drawCircle(i / 2, j / 2, mCircleDiameter / 2 + mShadowRadius, mShadowPaint);
            canvas.drawCircle(i / 2, j / 2, mCircleDiameter / 2, paint);
        }

        public OvalShadow(int i, int j)
        {
            this$0 = CircleImageView.this;
            super();
            mShadowPaint = new Paint();
            mShadowRadius = i;
            mCircleDiameter = j;
            float f = mCircleDiameter / 2;
            float f1 = mCircleDiameter / 2;
            float f2 = mShadowRadius;
            circleimageview = android.graphics.Shader.TileMode.CLAMP;
            mRadialGradient = new RadialGradient(f, f1, f2, new int[] {
                0x3d000000, 0
            }, null, CircleImageView.this);
            mShadowPaint.setShader(mRadialGradient);
        }
    }

}
