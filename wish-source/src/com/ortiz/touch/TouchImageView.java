// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ortiz.touch;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import android.widget.Scroller;

public class TouchImageView extends ImageView
{
    private class CompatScroller
    {

        boolean isPreGingerbread;
        OverScroller overScroller;
        Scroller scroller;
        final TouchImageView this$0;

        public boolean computeScrollOffset()
        {
            if (isPreGingerbread)
            {
                return scroller.computeScrollOffset();
            } else
            {
                overScroller.computeScrollOffset();
                return overScroller.computeScrollOffset();
            }
        }

        public void fling(int i, int j, int k, int l, int i1, int j1, int k1, 
                int l1)
        {
            if (isPreGingerbread)
            {
                scroller.fling(i, j, k, l, i1, j1, k1, l1);
                return;
            } else
            {
                overScroller.fling(i, j, k, l, i1, j1, k1, l1);
                return;
            }
        }

        public void forceFinished(boolean flag)
        {
            if (isPreGingerbread)
            {
                scroller.forceFinished(flag);
                return;
            } else
            {
                overScroller.forceFinished(flag);
                return;
            }
        }

        public int getCurrX()
        {
            if (isPreGingerbread)
            {
                return scroller.getCurrX();
            } else
            {
                return overScroller.getCurrX();
            }
        }

        public int getCurrY()
        {
            if (isPreGingerbread)
            {
                return scroller.getCurrY();
            } else
            {
                return overScroller.getCurrY();
            }
        }

        public boolean isFinished()
        {
            if (isPreGingerbread)
            {
                return scroller.isFinished();
            } else
            {
                return overScroller.isFinished();
            }
        }

        public CompatScroller(Context context1)
        {
            this$0 = TouchImageView.this;
            super();
            if (android.os.Build.VERSION.SDK_INT < 9)
            {
                isPreGingerbread = true;
                scroller = new Scroller(context1);
                return;
            } else
            {
                isPreGingerbread = false;
                overScroller = new OverScroller(context1);
                return;
            }
        }
    }

    private class DoubleTapZoom
        implements Runnable
    {

        private static final float ZOOM_TIME = 500F;
        private float bitmapX;
        private float bitmapY;
        private PointF endTouch;
        private AccelerateDecelerateInterpolator interpolator;
        private long startTime;
        private PointF startTouch;
        private float startZoom;
        private boolean stretchImageToSuper;
        private float targetZoom;
        final TouchImageView this$0;

        private double calculateDeltaScale(float f)
        {
            return (double)(startZoom + (targetZoom - startZoom) * f) / (double)normalizedScale;
        }

        private float interpolate()
        {
            float f = Math.min(1.0F, (float)(System.currentTimeMillis() - startTime) / 500F);
            return interpolator.getInterpolation(f);
        }

        private void translateImageToCenterTouchPosition(float f)
        {
            float f1 = startTouch.x;
            float f2 = endTouch.x;
            float f3 = startTouch.x;
            float f4 = startTouch.y;
            float f5 = endTouch.y;
            float f6 = startTouch.y;
            PointF pointf = transformCoordBitmapToTouch(bitmapX, bitmapY);
            matrix.postTranslate((f1 + (f2 - f3) * f) - pointf.x, (f4 + (f5 - f6) * f) - pointf.y);
        }

        public void run()
        {
            float f = interpolate();
            double d = calculateDeltaScale(f);
            scaleImage(d, bitmapX, bitmapY, stretchImageToSuper);
            translateImageToCenterTouchPosition(f);
            fixScaleTrans();
            setImageMatrix(matrix);
            if (touchImageViewListener != null)
            {
                touchImageViewListener.onMove();
            }
            if (f < 1.0F)
            {
                compatPostOnAnimation(this);
                return;
            } else
            {
                setState(State.NONE);
                return;
            }
        }

        DoubleTapZoom(float f, float f1, float f2, boolean flag)
        {
            this$0 = TouchImageView.this;
            super();
            interpolator = new AccelerateDecelerateInterpolator();
            setState(State.ANIMATE_ZOOM);
            startTime = System.currentTimeMillis();
            startZoom = normalizedScale;
            targetZoom = f;
            stretchImageToSuper = flag;
            PointF pointf = transformCoordTouchToBitmap(f1, f2, false);
            bitmapX = pointf.x;
            bitmapY = pointf.y;
            startTouch = transformCoordBitmapToTouch(bitmapX, bitmapY);
            endTouch = new PointF(viewWidth / 2, viewHeight / 2);
        }
    }

    private class Fling
        implements Runnable
    {

        int currX;
        int currY;
        CompatScroller scroller;
        final TouchImageView this$0;

        public void cancelFling()
        {
            if (scroller != null)
            {
                setState(State.NONE);
                scroller.forceFinished(true);
            }
        }

        public void run()
        {
            if (touchImageViewListener != null)
            {
                touchImageViewListener.onMove();
            }
            if (scroller.isFinished())
            {
                scroller = null;
            } else
            if (scroller.computeScrollOffset())
            {
                int i = scroller.getCurrX();
                int j = scroller.getCurrY();
                int k = currX;
                int l = currY;
                currX = i;
                currY = j;
                matrix.postTranslate(i - k, j - l);
                fixTrans();
                setImageMatrix(matrix);
                compatPostOnAnimation(this);
                return;
            }
        }

        Fling(int i, int j)
        {
            this$0 = TouchImageView.this;
            super();
            setState(State.FLING);
            scroller = new CompatScroller(context);
            matrix.getValues(m);
            int k = (int)m[2];
            int l = (int)m[5];
            int i1;
            int j1;
            int k1;
            int l1;
            if (getImageWidth() > (float)viewWidth)
            {
                i1 = viewWidth - (int)getImageWidth();
                j1 = 0;
            } else
            {
                j1 = k;
                i1 = k;
            }
            if (getImageHeight() > (float)viewHeight)
            {
                k1 = viewHeight - (int)getImageHeight();
                l1 = 0;
            } else
            {
                l1 = l;
                k1 = l;
            }
            scroller.fling(k, l, i, j, i1, j1, k1, l1);
            currX = k;
            currY = l;
        }
    }

    private class GestureListener extends android.view.GestureDetector.SimpleOnGestureListener
    {

        final TouchImageView this$0;

        public boolean onDoubleTap(MotionEvent motionevent)
        {
            boolean flag = false;
            if (doubleTapListener != null)
            {
                flag = doubleTapListener.onDoubleTap(motionevent);
            }
            if (state == State.NONE)
            {
                float f;
                if (normalizedScale == minScale)
                {
                    f = maxScale;
                } else
                {
                    f = minScale;
                }
                motionevent = new DoubleTapZoom(f, motionevent.getX(), motionevent.getY(), false);
                compatPostOnAnimation(motionevent);
                flag = true;
            }
            return flag;
        }

        public boolean onDoubleTapEvent(MotionEvent motionevent)
        {
            if (doubleTapListener != null)
            {
                return doubleTapListener.onDoubleTapEvent(motionevent);
            } else
            {
                return false;
            }
        }

        public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
        {
            if (fling != null)
            {
                fling.cancelFling();
            }
            fling = new Fling((int)f, (int)f1);
            compatPostOnAnimation(fling);
            return super.onFling(motionevent, motionevent1, f, f1);
        }

        public void onLongPress(MotionEvent motionevent)
        {
            performLongClick();
        }

        public boolean onSingleTapConfirmed(MotionEvent motionevent)
        {
            if (doubleTapListener != null)
            {
                return doubleTapListener.onSingleTapConfirmed(motionevent);
            } else
            {
                return performClick();
            }
        }

        private GestureListener()
        {
            this$0 = TouchImageView.this;
            super();
        }

    }

    public static interface OnTouchImageViewListener
    {

        public abstract void onMove();
    }

    private class PrivateOnTouchListener
        implements android.view.View.OnTouchListener
    {

        private PointF last;
        final TouchImageView this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            PointF pointf;
            mScaleDetector.onTouchEvent(motionevent);
            mGestureDetector.onTouchEvent(motionevent);
            pointf = new PointF(motionevent.getX(), motionevent.getY());
            if (state != State.NONE && state != State.DRAG && state != State.FLING) goto _L2; else goto _L1
_L1:
            motionevent.getAction();
            JVM INSTR tableswitch 0 6: default 128
        //                       0 191
        //                       1 374
        //                       2 233
        //                       3 128
        //                       4 128
        //                       5 128
        //                       6 374;
               goto _L2 _L3 _L4 _L5 _L2 _L2 _L2 _L4
_L2:
            setImageMatrix(matrix);
            if (userTouchListener != null)
            {
                userTouchListener.onTouch(view, motionevent);
            }
            if (touchImageViewListener != null)
            {
                touchImageViewListener.onMove();
            }
            return true;
_L3:
            last.set(pointf);
            if (fling != null)
            {
                fling.cancelFling();
            }
            setState(State.DRAG);
            continue; /* Loop/switch isn't completed */
_L5:
            if (state == State.DRAG)
            {
                float f2 = pointf.x;
                float f3 = last.x;
                float f = pointf.y;
                float f1 = last.y;
                f2 = getFixDragTrans(f2 - f3, viewWidth, getImageWidth());
                f = getFixDragTrans(f - f1, viewHeight, getImageHeight());
                matrix.postTranslate(f2, f);
                fixTrans();
                last.set(pointf.x, pointf.y);
            }
            continue; /* Loop/switch isn't completed */
_L4:
            setState(State.NONE);
            if (true) goto _L2; else goto _L6
_L6:
        }

        private PrivateOnTouchListener()
        {
            this$0 = TouchImageView.this;
            super();
            last = new PointF();
        }

    }

    private class ScaleListener extends android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
    {

        final TouchImageView this$0;

        public boolean onScale(ScaleGestureDetector scalegesturedetector)
        {
            scaleImage(scalegesturedetector.getScaleFactor(), scalegesturedetector.getFocusX(), scalegesturedetector.getFocusY(), true);
            if (touchImageViewListener != null)
            {
                touchImageViewListener.onMove();
            }
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scalegesturedetector)
        {
            setState(State.ZOOM);
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scalegesturedetector)
        {
            float f;
            boolean flag;
            super.onScaleEnd(scalegesturedetector);
            setState(State.NONE);
            flag = false;
            f = normalizedScale;
            if (normalizedScale <= maxScale) goto _L2; else goto _L1
_L1:
            f = maxScale;
            flag = true;
_L4:
            if (flag)
            {
                scalegesturedetector = new DoubleTapZoom(f, viewWidth / 2, viewHeight / 2, true);
                compatPostOnAnimation(scalegesturedetector);
            }
            return;
_L2:
            if (normalizedScale < minScale)
            {
                f = minScale;
                flag = true;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        private ScaleListener()
        {
            this$0 = TouchImageView.this;
            super();
        }

    }

    private static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State ANIMATE_ZOOM;
        public static final State DRAG;
        public static final State FLING;
        public static final State NONE;
        public static final State ZOOM;

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/ortiz/touch/TouchImageView$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        static 
        {
            NONE = new State("NONE", 0);
            DRAG = new State("DRAG", 1);
            ZOOM = new State("ZOOM", 2);
            FLING = new State("FLING", 3);
            ANIMATE_ZOOM = new State("ANIMATE_ZOOM", 4);
            $VALUES = (new State[] {
                NONE, DRAG, ZOOM, FLING, ANIMATE_ZOOM
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }

    private class ZoomVariables
    {

        public float focusX;
        public float focusY;
        public float scale;
        public android.widget.ImageView.ScaleType scaleType;
        final TouchImageView this$0;

        public ZoomVariables(float f, float f1, float f2, android.widget.ImageView.ScaleType scaletype)
        {
            this$0 = TouchImageView.this;
            super();
            scale = f;
            focusX = f1;
            focusY = f2;
            scaleType = scaletype;
        }
    }


    private static final String DEBUG = "DEBUG";
    private static final float SUPER_MAX_MULTIPLIER = 1.25F;
    private static final float SUPER_MIN_MULTIPLIER = 0.75F;
    private Context context;
    private ZoomVariables delayedZoomVariables;
    private android.view.GestureDetector.OnDoubleTapListener doubleTapListener;
    private Fling fling;
    private boolean imageRenderedAtLeastOnce;
    private float m[];
    private GestureDetector mGestureDetector;
    private ScaleGestureDetector mScaleDetector;
    private android.widget.ImageView.ScaleType mScaleType;
    private float matchViewHeight;
    private float matchViewWidth;
    private Matrix matrix;
    private float maxScale;
    private float minScale;
    private float normalizedScale;
    private boolean onDrawReady;
    private float prevMatchViewHeight;
    private float prevMatchViewWidth;
    private Matrix prevMatrix;
    private int prevViewHeight;
    private int prevViewWidth;
    private State state;
    private float superMaxScale;
    private float superMinScale;
    private OnTouchImageViewListener touchImageViewListener;
    private android.view.View.OnTouchListener userTouchListener;
    private int viewHeight;
    private int viewWidth;

    public TouchImageView(Context context1)
    {
        super(context1);
        doubleTapListener = null;
        userTouchListener = null;
        touchImageViewListener = null;
        sharedConstructing(context1);
    }

    public TouchImageView(Context context1, AttributeSet attributeset)
    {
        super(context1, attributeset);
        doubleTapListener = null;
        userTouchListener = null;
        touchImageViewListener = null;
        sharedConstructing(context1);
    }

    public TouchImageView(Context context1, AttributeSet attributeset, int i)
    {
        super(context1, attributeset, i);
        doubleTapListener = null;
        userTouchListener = null;
        touchImageViewListener = null;
        sharedConstructing(context1);
    }

    private void compatPostOnAnimation(Runnable runnable)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            postOnAnimation(runnable);
            return;
        } else
        {
            postDelayed(runnable, 16L);
            return;
        }
    }

    private void fitImageToView()
    {
        float f;
        float f2;
        float f4;
        float f5;
        float f6;
        float f7;
        int i;
        int j;
        Drawable drawable;
        for (drawable = getDrawable(); drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0 || matrix == null || prevMatrix == null;)
        {
            return;
        }

        i = drawable.getIntrinsicWidth();
        j = drawable.getIntrinsicHeight();
        f5 = (float)viewWidth / (float)i;
        f6 = (float)viewHeight / (float)j;
        f = f5;
        f2 = f6;
        f7 = f5;
        f4 = f6;
        static class _cls1
        {

            static final int $SwitchMap$android$widget$ImageView$ScaleType[];

            static 
            {
                $SwitchMap$android$widget$ImageView$ScaleType = new int[android.widget.ImageView.ScaleType.values().length];
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$android$widget$ImageView$ScaleType[android.widget.ImageView.ScaleType.FIT_XY.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.android.widget.ImageView.ScaleType[mScaleType.ordinal()];
        JVM INSTR tableswitch 1 5: default 136
    //                   1 147
    //                   2 255
    //                   3 268
    //                   4 283
    //                   5 151;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L5:
        break MISSING_BLOCK_LABEL_283;
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
_L2:
        f2 = 1.0F;
        f = 1.0F;
_L7:
        f4 = (float)viewWidth - (float)i * f;
        f5 = (float)viewHeight - (float)j * f2;
        matchViewWidth = (float)viewWidth - f4;
        matchViewHeight = (float)viewHeight - f5;
        if (!isZoomed() && !imageRenderedAtLeastOnce)
        {
            matrix.setScale(f, f2);
            matrix.postTranslate(f4 / 2.0F, f5 / 2.0F);
            normalizedScale = 1.0F;
        } else
        {
            if (prevMatchViewWidth == 0.0F || prevMatchViewHeight == 0.0F)
            {
                savePreviousImageValues();
            }
            prevMatrix.getValues(m);
            m[0] = (matchViewWidth / (float)i) * normalizedScale;
            m[4] = (matchViewHeight / (float)j) * normalizedScale;
            float f1 = m[2];
            float f3 = m[5];
            translateMatrixAfterRotate(2, f1, prevMatchViewWidth * normalizedScale, getImageWidth(), prevViewWidth, viewWidth, i);
            translateMatrixAfterRotate(5, f3, prevMatchViewHeight * normalizedScale, getImageHeight(), prevViewHeight, viewHeight, j);
            matrix.setValues(m);
        }
        fixTrans();
        setImageMatrix(matrix);
        return;
_L3:
        f2 = Math.max(f5, f6);
        f = f2;
          goto _L7
_L4:
        f4 = Math.min(1.0F, Math.min(f5, f6));
        f7 = f4;
        f2 = Math.min(f7, f4);
        f = f2;
          goto _L7
    }

    private void fixScaleTrans()
    {
        fixTrans();
        matrix.getValues(m);
        if (getImageWidth() < (float)viewWidth)
        {
            m[2] = ((float)viewWidth - getImageWidth()) / 2.0F;
        }
        if (getImageHeight() < (float)viewHeight)
        {
            m[5] = ((float)viewHeight - getImageHeight()) / 2.0F;
        }
        matrix.setValues(m);
    }

    private void fixTrans()
    {
        matrix.getValues(m);
        float f1 = m[2];
        float f = m[5];
        f1 = getFixTrans(f1, viewWidth, getImageWidth());
        f = getFixTrans(f, viewHeight, getImageHeight());
        if (f1 != 0.0F || f != 0.0F)
        {
            matrix.postTranslate(f1, f);
        }
    }

    private float getFixDragTrans(float f, float f1, float f2)
    {
        if (f2 <= f1)
        {
            f = 0.0F;
        }
        return f;
    }

    private float getFixTrans(float f, float f1, float f2)
    {
        if (f2 <= f1)
        {
            float f3 = 0.0F;
            f1 -= f2;
            f2 = f3;
        } else
        {
            f2 = f1 - f2;
            f1 = 0.0F;
        }
        if (f < f2)
        {
            return -f + f2;
        }
        if (f > f1)
        {
            return -f + f1;
        } else
        {
            return 0.0F;
        }
    }

    private float getImageHeight()
    {
        return matchViewHeight * normalizedScale;
    }

    private float getImageWidth()
    {
        return matchViewWidth * normalizedScale;
    }

    private void printMatrixInfo()
    {
        float af[] = new float[9];
        matrix.getValues(af);
        Log.d("DEBUG", (new StringBuilder()).append("Scale: ").append(af[0]).append(" TransX: ").append(af[2]).append(" TransY: ").append(af[5]).toString());
    }

    private void savePreviousImageValues()
    {
        if (matrix != null && viewHeight != 0 && viewWidth != 0)
        {
            matrix.getValues(m);
            prevMatrix.setValues(m);
            prevMatchViewHeight = matchViewHeight;
            prevMatchViewWidth = matchViewWidth;
            prevViewHeight = viewHeight;
            prevViewWidth = viewWidth;
        }
    }

    private void scaleImage(double d, float f, float f1, boolean flag)
    {
        float f2;
        float f4;
        float f3;
        if (flag)
        {
            f2 = superMinScale;
            f3 = superMaxScale;
        } else
        {
            f2 = minScale;
            f3 = maxScale;
        }
        f4 = normalizedScale;
        normalizedScale = (float)((double)normalizedScale * d);
        if (normalizedScale <= f3) goto _L2; else goto _L1
_L1:
        normalizedScale = f3;
        d = f3 / f4;
_L4:
        matrix.postScale((float)d, (float)d, f, f1);
        fixScaleTrans();
        return;
_L2:
        if (normalizedScale < f2)
        {
            normalizedScale = f2;
            d = f2 / f4;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void setState(State state1)
    {
        state = state1;
    }

    private int setViewSize(int i, int j, int k)
    {
        switch (i)
        {
        default:
            return j;

        case 1073741824: 
            return j;

        case -2147483648: 
            return Math.min(k, j);

        case 0: // '\0'
            return k;
        }
    }

    private void sharedConstructing(Context context1)
    {
        super.setClickable(true);
        context = context1;
        mScaleDetector = new ScaleGestureDetector(context1, new ScaleListener(null));
        mGestureDetector = new GestureDetector(context1, new GestureListener(null));
        matrix = new Matrix();
        prevMatrix = new Matrix();
        m = new float[9];
        normalizedScale = 1.0F;
        if (mScaleType == null)
        {
            mScaleType = android.widget.ImageView.ScaleType.FIT_CENTER;
        }
        minScale = 1.0F;
        maxScale = 3F;
        superMinScale = 0.75F * minScale;
        superMaxScale = 1.25F * maxScale;
        setImageMatrix(matrix);
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        setState(State.NONE);
        onDrawReady = false;
        super.setOnTouchListener(new PrivateOnTouchListener(null));
    }

    private PointF transformCoordBitmapToTouch(float f, float f1)
    {
        matrix.getValues(m);
        float f2;
        float f3;
        if (getDrawable() == null)
        {
            f2 = 0.0F;
        } else
        {
            f2 = getDrawable().getIntrinsicWidth();
        }
        if (getDrawable() == null)
        {
            f3 = 0.0F;
        } else
        {
            f3 = getDrawable().getIntrinsicHeight();
        }
        f /= f2;
        f1 /= f3;
        return new PointF(m[2] + getImageWidth() * f, m[5] + getImageHeight() * f1);
    }

    private PointF transformCoordTouchToBitmap(float f, float f1, boolean flag)
    {
        matrix.getValues(m);
        float f2;
        float f3;
        float f4;
        float f5;
        if (getDrawable() == null)
        {
            f2 = 0.0F;
        } else
        {
            f2 = getDrawable().getIntrinsicWidth();
        }
        if (getDrawable() == null)
        {
            f3 = 0.0F;
        } else
        {
            f3 = getDrawable().getIntrinsicHeight();
        }
        f4 = m[2];
        f5 = m[5];
        f4 = ((f - f4) * f2) / getImageWidth();
        f5 = ((f1 - f5) * f3) / getImageHeight();
        f1 = f4;
        f = f5;
        if (flag)
        {
            f1 = Math.min(Math.max(f4, 0.0F), f2);
            f = Math.min(Math.max(f5, 0.0F), f3);
        }
        return new PointF(f1, f);
    }

    private void translateMatrixAfterRotate(int i, float f, float f1, float f2, int j, int k, int l)
    {
        if (f2 < (float)k)
        {
            m[i] = ((float)k - (float)l * m[0]) * 0.5F;
            return;
        }
        if (f > 0.0F)
        {
            m[i] = -((f2 - (float)k) * 0.5F);
            return;
        } else
        {
            f = (Math.abs(f) + (float)j * 0.5F) / f1;
            m[i] = -(f * f2 - (float)k * 0.5F);
            return;
        }
    }

    public boolean canScrollHorizontally(int i)
    {
        matrix.getValues(m);
        for (float f = m[2]; getImageWidth() < (float)viewWidth || f >= -1F && i < 0 || Math.abs(f) + (float)viewWidth + 1.0F >= getImageWidth() && i > 0;)
        {
            return false;
        }

        return true;
    }

    public boolean canScrollHorizontallyFroyo(int i)
    {
        return canScrollHorizontally(i);
    }

    public float getCurrentZoom()
    {
        return normalizedScale;
    }

    public float getMaxZoom()
    {
        return maxScale;
    }

    public float getMinZoom()
    {
        return minScale;
    }

    public android.widget.ImageView.ScaleType getScaleType()
    {
        return mScaleType;
    }

    public PointF getScrollPosition()
    {
        Object obj = getDrawable();
        if (obj == null)
        {
            return null;
        } else
        {
            int i = ((Drawable) (obj)).getIntrinsicWidth();
            int j = ((Drawable) (obj)).getIntrinsicHeight();
            obj = transformCoordTouchToBitmap(viewWidth / 2, viewHeight / 2, true);
            obj.x = ((PointF) (obj)).x / (float)i;
            obj.y = ((PointF) (obj)).y / (float)j;
            return ((PointF) (obj));
        }
    }

    public RectF getZoomedRect()
    {
        if (mScaleType == android.widget.ImageView.ScaleType.FIT_XY)
        {
            throw new UnsupportedOperationException("getZoomedRect() not supported with FIT_XY");
        } else
        {
            PointF pointf = transformCoordTouchToBitmap(0.0F, 0.0F, true);
            PointF pointf1 = transformCoordTouchToBitmap(viewWidth, viewHeight, true);
            float f = getDrawable().getIntrinsicWidth();
            float f1 = getDrawable().getIntrinsicHeight();
            return new RectF(pointf.x / f, pointf.y / f1, pointf1.x / f, pointf1.y / f1);
        }
    }

    public boolean isZoomed()
    {
        return normalizedScale != 1.0F;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        savePreviousImageValues();
    }

    protected void onDraw(Canvas canvas)
    {
        onDrawReady = true;
        imageRenderedAtLeastOnce = true;
        if (delayedZoomVariables != null)
        {
            setZoom(delayedZoomVariables.scale, delayedZoomVariables.focusX, delayedZoomVariables.focusY, delayedZoomVariables.scaleType);
            delayedZoomVariables = null;
        }
        super.onDraw(canvas);
    }

    protected void onMeasure(int i, int j)
    {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() == 0 || drawable.getIntrinsicHeight() == 0)
        {
            setMeasuredDimension(0, 0);
            return;
        } else
        {
            int k = drawable.getIntrinsicWidth();
            int l = drawable.getIntrinsicHeight();
            int i1 = android.view.View.MeasureSpec.getSize(i);
            i = android.view.View.MeasureSpec.getMode(i);
            int j1 = android.view.View.MeasureSpec.getSize(j);
            j = android.view.View.MeasureSpec.getMode(j);
            viewWidth = setViewSize(i, i1, k);
            viewHeight = setViewSize(j, j1, l);
            setMeasuredDimension(viewWidth, viewHeight);
            fitImageToView();
            return;
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (parcelable instanceof Bundle)
        {
            parcelable = (Bundle)parcelable;
            normalizedScale = parcelable.getFloat("saveScale");
            m = parcelable.getFloatArray("matrix");
            prevMatrix.setValues(m);
            prevMatchViewHeight = parcelable.getFloat("matchViewHeight");
            prevMatchViewWidth = parcelable.getFloat("matchViewWidth");
            prevViewHeight = parcelable.getInt("viewHeight");
            prevViewWidth = parcelable.getInt("viewWidth");
            imageRenderedAtLeastOnce = parcelable.getBoolean("imageRendered");
            super.onRestoreInstanceState(parcelable.getParcelable("instanceState"));
            return;
        } else
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
    }

    public Parcelable onSaveInstanceState()
    {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putFloat("saveScale", normalizedScale);
        bundle.putFloat("matchViewHeight", matchViewHeight);
        bundle.putFloat("matchViewWidth", matchViewWidth);
        bundle.putInt("viewWidth", viewWidth);
        bundle.putInt("viewHeight", viewHeight);
        matrix.getValues(m);
        bundle.putFloatArray("matrix", m);
        bundle.putBoolean("imageRendered", imageRenderedAtLeastOnce);
        return bundle;
    }

    public void resetZoom()
    {
        normalizedScale = 1.0F;
        fitImageToView();
    }

    public void setImageBitmap(Bitmap bitmap)
    {
        super.setImageBitmap(bitmap);
        savePreviousImageValues();
        fitImageToView();
    }

    public void setImageDrawable(Drawable drawable)
    {
        super.setImageDrawable(drawable);
        savePreviousImageValues();
        fitImageToView();
    }

    public void setImageResource(int i)
    {
        super.setImageResource(i);
        savePreviousImageValues();
        fitImageToView();
    }

    public void setImageURI(Uri uri)
    {
        super.setImageURI(uri);
        savePreviousImageValues();
        fitImageToView();
    }

    public void setMaxZoom(float f)
    {
        maxScale = f;
        superMaxScale = 1.25F * maxScale;
    }

    public void setMinZoom(float f)
    {
        minScale = f;
        superMinScale = 0.75F * minScale;
    }

    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
    {
        doubleTapListener = ondoubletaplistener;
    }

    public void setOnTouchImageViewListener(OnTouchImageViewListener ontouchimageviewlistener)
    {
        touchImageViewListener = ontouchimageviewlistener;
    }

    public void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener)
    {
        userTouchListener = ontouchlistener;
    }

    public void setScaleType(android.widget.ImageView.ScaleType scaletype)
    {
        if (scaletype == android.widget.ImageView.ScaleType.FIT_START || scaletype == android.widget.ImageView.ScaleType.FIT_END)
        {
            throw new UnsupportedOperationException("TouchImageView does not support FIT_START or FIT_END");
        }
        if (scaletype == android.widget.ImageView.ScaleType.MATRIX)
        {
            super.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        } else
        {
            mScaleType = scaletype;
            if (onDrawReady)
            {
                setZoom(this);
                return;
            }
        }
    }

    public void setScrollPosition(float f, float f1)
    {
        setZoom(normalizedScale, f, f1);
    }

    public void setZoom(float f)
    {
        setZoom(f, 0.5F, 0.5F);
    }

    public void setZoom(float f, float f1, float f2)
    {
        setZoom(f, f1, f2, mScaleType);
    }

    public void setZoom(float f, float f1, float f2, android.widget.ImageView.ScaleType scaletype)
    {
        if (!onDrawReady)
        {
            delayedZoomVariables = new ZoomVariables(f, f1, f2, scaletype);
            return;
        }
        if (scaletype != mScaleType)
        {
            setScaleType(scaletype);
        }
        resetZoom();
        scaleImage(f, viewWidth / 2, viewHeight / 2, true);
        matrix.getValues(m);
        m[2] = -(getImageWidth() * f1 - (float)viewWidth * 0.5F);
        m[5] = -(getImageHeight() * f2 - (float)viewHeight * 0.5F);
        matrix.setValues(m);
        fixTrans();
        setImageMatrix(matrix);
    }

    public void setZoom(TouchImageView touchimageview)
    {
        PointF pointf1 = touchimageview.getScrollPosition();
        PointF pointf = pointf1;
        if (pointf1 == null)
        {
            pointf = new PointF(0.0F, 0.0F);
        }
        setZoom(touchimageview.getCurrentZoom(), pointf.x, pointf.y, touchimageview.getScaleType());
    }






















/*
    static Fling access$402(TouchImageView touchimageview, Fling fling1)
    {
        touchimageview.fling = fling1;
        return fling1;
    }

*/





}
