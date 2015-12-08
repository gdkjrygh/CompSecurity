// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uk.co.senab.photoview;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;

public interface IPhotoView
{

    public static final float DEFAULT_MAX_SCALE = 3F;
    public static final float DEFAULT_MID_SCALE = 1.75F;
    public static final float DEFAULT_MIN_SCALE = 1F;
    public static final int DEFAULT_ZOOM_DURATION = 200;

    public abstract boolean canZoom();

    public abstract Matrix getDisplayMatrix();

    public abstract RectF getDisplayRect();

    public abstract IPhotoView getIPhotoViewImplementation();

    public abstract float getMaxScale();

    public abstract float getMaximumScale();

    public abstract float getMediumScale();

    public abstract float getMidScale();

    public abstract float getMinScale();

    public abstract float getMinimumScale();

    public abstract PhotoViewAttacher.OnPhotoTapListener getOnPhotoTapListener();

    public abstract PhotoViewAttacher.OnViewTapListener getOnViewTapListener();

    public abstract float getScale();

    public abstract android.widget.ImageView.ScaleType getScaleType();

    public abstract Bitmap getVisibleRectangleBitmap();

    public abstract void setAllowParentInterceptOnEdge(boolean flag);

    public abstract boolean setDisplayMatrix(Matrix matrix);

    public abstract void setMaxScale(float f);

    public abstract void setMaximumScale(float f);

    public abstract void setMediumScale(float f);

    public abstract void setMidScale(float f);

    public abstract void setMinScale(float f);

    public abstract void setMinimumScale(float f);

    public abstract void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener);

    public abstract void setOnLongClickListener(android.view.View.OnLongClickListener onlongclicklistener);

    public abstract void setOnMatrixChangeListener(PhotoViewAttacher.OnMatrixChangedListener onmatrixchangedlistener);

    public abstract void setOnPhotoTapListener(PhotoViewAttacher.OnPhotoTapListener onphototaplistener);

    public abstract void setOnViewTapListener(PhotoViewAttacher.OnViewTapListener onviewtaplistener);

    public abstract void setPhotoViewRotation(float f);

    public abstract void setRotationBy(float f);

    public abstract void setRotationTo(float f);

    public abstract void setScale(float f);

    public abstract void setScale(float f, float f1, float f2, boolean flag);

    public abstract void setScale(float f, boolean flag);

    public abstract void setScaleType(android.widget.ImageView.ScaleType scaletype);

    public abstract void setZoomTransitionDuration(int i);

    public abstract void setZoomable(boolean flag);
}
