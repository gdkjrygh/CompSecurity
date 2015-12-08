// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewCompatHC

class _cls9 extends _cls9
{

    public int combineMeasuredStates(int i, int j)
    {
        return ViewCompatHC.combineMeasuredStates(i, j);
    }

    public float getAlpha(View view)
    {
        return ViewCompatHC.getAlpha(view);
    }

    long getFrameTime()
    {
        return ViewCompatHC.getFrameTime();
    }

    public int getLayerType(View view)
    {
        return ViewCompatHC.getLayerType(view);
    }

    public int getMeasuredHeightAndState(View view)
    {
        return ViewCompatHC.getMeasuredHeightAndState(view);
    }

    public int getMeasuredState(View view)
    {
        return ViewCompatHC.getMeasuredState(view);
    }

    public int getMeasuredWidthAndState(View view)
    {
        return ViewCompatHC.getMeasuredWidthAndState(view);
    }

    public float getPivotX(View view)
    {
        return ViewCompatHC.getPivotX(view);
    }

    public float getPivotY(View view)
    {
        return ViewCompatHC.getPivotY(view);
    }

    public float getRotation(View view)
    {
        return ViewCompatHC.getRotation(view);
    }

    public float getRotationX(View view)
    {
        return ViewCompatHC.getRotationX(view);
    }

    public float getRotationY(View view)
    {
        return ViewCompatHC.getRotationY(view);
    }

    public float getScaleX(View view)
    {
        return ViewCompatHC.getScaleX(view);
    }

    public float getScaleY(View view)
    {
        return ViewCompatHC.getScaleY(view);
    }

    public float getTranslationX(View view)
    {
        return ViewCompatHC.getTranslationX(view);
    }

    public float getTranslationY(View view)
    {
        return ViewCompatHC.getTranslationY(view);
    }

    public float getX(View view)
    {
        return ViewCompatHC.getX(view);
    }

    public float getY(View view)
    {
        return ViewCompatHC.getY(view);
    }

    public void jumpDrawablesToCurrentState(View view)
    {
        ViewCompatHC.jumpDrawablesToCurrentState(view);
    }

    public int resolveSizeAndState(int i, int j, int k)
    {
        return ViewCompatHC.resolveSizeAndState(i, j, k);
    }

    public void setActivated(View view, boolean flag)
    {
        ViewCompatHC.setActivated(view, flag);
    }

    public void setAlpha(View view, float f)
    {
        ViewCompatHC.setAlpha(view, f);
    }

    public void setLayerPaint(View view, Paint paint)
    {
        setLayerType(view, getLayerType(view), paint);
        view.invalidate();
    }

    public void setLayerType(View view, int i, Paint paint)
    {
        ViewCompatHC.setLayerType(view, i, paint);
    }

    public void setPivotX(View view, float f)
    {
        ViewCompatHC.setPivotX(view, f);
    }

    public void setPivotY(View view, float f)
    {
        ViewCompatHC.setPivotY(view, f);
    }

    public void setRotation(View view, float f)
    {
        ViewCompatHC.setRotation(view, f);
    }

    public void setRotationX(View view, float f)
    {
        ViewCompatHC.setRotationX(view, f);
    }

    public void setRotationY(View view, float f)
    {
        ViewCompatHC.setRotationY(view, f);
    }

    public void setSaveFromParentEnabled(View view, boolean flag)
    {
        ViewCompatHC.setSaveFromParentEnabled(view, flag);
    }

    public void setScaleX(View view, float f)
    {
        ViewCompatHC.setScaleX(view, f);
    }

    public void setScaleY(View view, float f)
    {
        ViewCompatHC.setScaleY(view, f);
    }

    public void setTranslationX(View view, float f)
    {
        ViewCompatHC.setTranslationX(view, f);
    }

    public void setTranslationY(View view, float f)
    {
        ViewCompatHC.setTranslationY(view, f);
    }

    public void setX(View view, float f)
    {
        ViewCompatHC.setX(view, f);
    }

    public void setY(View view, float f)
    {
        ViewCompatHC.setY(view, f);
    }

    _cls9()
    {
    }
}
