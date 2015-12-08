// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package uk.co.senab.photoview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

// Referenced classes of package uk.co.senab.photoview:
//            IPhotoView, PhotoViewAttacher

public class PhotoView extends ImageView
    implements IPhotoView
{

    private final PhotoViewAttacher mAttacher;
    private android.widget.ImageView.ScaleType mPendingScaleType;

    public PhotoView(Context context)
    {
        this(context, null);
    }

    public PhotoView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PhotoView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        super.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
        mAttacher = new PhotoViewAttacher(this);
        if (mPendingScaleType != null)
        {
            setScaleType(mPendingScaleType);
            mPendingScaleType = null;
        }
    }

    public boolean canZoom()
    {
        return mAttacher.canZoom();
    }

    public Matrix getDisplayMatrix()
    {
        return mAttacher.getDrawMatrix();
    }

    public RectF getDisplayRect()
    {
        return mAttacher.getDisplayRect();
    }

    public IPhotoView getIPhotoViewImplementation()
    {
        return mAttacher;
    }

    public float getMaxScale()
    {
        return getMaximumScale();
    }

    public float getMaximumScale()
    {
        return mAttacher.getMaximumScale();
    }

    public float getMediumScale()
    {
        return mAttacher.getMediumScale();
    }

    public float getMidScale()
    {
        return getMediumScale();
    }

    public float getMinScale()
    {
        return getMinimumScale();
    }

    public float getMinimumScale()
    {
        return mAttacher.getMinimumScale();
    }

    public PhotoViewAttacher.OnPhotoTapListener getOnPhotoTapListener()
    {
        return mAttacher.getOnPhotoTapListener();
    }

    public PhotoViewAttacher.OnViewTapListener getOnViewTapListener()
    {
        return mAttacher.getOnViewTapListener();
    }

    public float getScale()
    {
        return mAttacher.getScale();
    }

    public android.widget.ImageView.ScaleType getScaleType()
    {
        return mAttacher.getScaleType();
    }

    public Bitmap getVisibleRectangleBitmap()
    {
        return mAttacher.getVisibleRectangleBitmap();
    }

    protected void onDetachedFromWindow()
    {
        mAttacher.cleanup();
        super.onDetachedFromWindow();
    }

    public void setAllowParentInterceptOnEdge(boolean flag)
    {
        mAttacher.setAllowParentInterceptOnEdge(flag);
    }

    public boolean setDisplayMatrix(Matrix matrix)
    {
        return mAttacher.setDisplayMatrix(matrix);
    }

    public void setImageDrawable(Drawable drawable)
    {
        super.setImageDrawable(drawable);
        if (mAttacher != null)
        {
            mAttacher.update();
        }
    }

    public void setImageResource(int i)
    {
        super.setImageResource(i);
        if (mAttacher != null)
        {
            mAttacher.update();
        }
    }

    public void setImageURI(Uri uri)
    {
        super.setImageURI(uri);
        if (mAttacher != null)
        {
            mAttacher.update();
        }
    }

    public void setMaxScale(float f)
    {
        setMaximumScale(f);
    }

    public void setMaximumScale(float f)
    {
        mAttacher.setMaximumScale(f);
    }

    public void setMediumScale(float f)
    {
        mAttacher.setMediumScale(f);
    }

    public void setMidScale(float f)
    {
        setMediumScale(f);
    }

    public void setMinScale(float f)
    {
        setMinimumScale(f);
    }

    public void setMinimumScale(float f)
    {
        mAttacher.setMinimumScale(f);
    }

    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener ondoubletaplistener)
    {
        mAttacher.setOnDoubleTapListener(ondoubletaplistener);
    }

    public void setOnLongClickListener(android.view.View.OnLongClickListener onlongclicklistener)
    {
        mAttacher.setOnLongClickListener(onlongclicklistener);
    }

    public void setOnMatrixChangeListener(PhotoViewAttacher.OnMatrixChangedListener onmatrixchangedlistener)
    {
        mAttacher.setOnMatrixChangeListener(onmatrixchangedlistener);
    }

    public void setOnPhotoTapListener(PhotoViewAttacher.OnPhotoTapListener onphototaplistener)
    {
        mAttacher.setOnPhotoTapListener(onphototaplistener);
    }

    public void setOnViewTapListener(PhotoViewAttacher.OnViewTapListener onviewtaplistener)
    {
        mAttacher.setOnViewTapListener(onviewtaplistener);
    }

    public void setPhotoViewRotation(float f)
    {
        mAttacher.setRotationTo(f);
    }

    public void setRotationBy(float f)
    {
        mAttacher.setRotationBy(f);
    }

    public void setRotationTo(float f)
    {
        mAttacher.setRotationTo(f);
    }

    public void setScale(float f)
    {
        mAttacher.setScale(f);
    }

    public void setScale(float f, float f1, float f2, boolean flag)
    {
        mAttacher.setScale(f, f1, f2, flag);
    }

    public void setScale(float f, boolean flag)
    {
        mAttacher.setScale(f, flag);
    }

    public void setScaleType(android.widget.ImageView.ScaleType scaletype)
    {
        if (mAttacher != null)
        {
            mAttacher.setScaleType(scaletype);
            return;
        } else
        {
            mPendingScaleType = scaletype;
            return;
        }
    }

    public void setZoomTransitionDuration(int i)
    {
        mAttacher.setZoomTransitionDuration(i);
    }

    public void setZoomable(boolean flag)
    {
        mAttacher.setZoomable(flag);
    }
}
