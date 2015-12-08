// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.views;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Iterator;
import java.util.Stack;

public class PaintView extends ImageView
{

    private static final float TOUCH_TOLERANCE = 4F;
    private float mX;
    private float mY;
    private Paint paint;
    private Path path;
    private Stack paths;

    public PaintView(Context context, Uri uri, int i, int j)
    {
        super(context);
        path = new Path();
        paths = new Stack();
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(0xffff0000);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStrokeWidth(12F);
        (new AsyncTask() {

            final PaintView this$0;

            protected transient Bitmap doInBackground(Object aobj[])
            {
                Context context1 = (Context)aobj[0];
                Uri uri1 = (Uri)aobj[1];
                Integer integer = (Integer)aobj[2];
                aobj = (Integer)aobj[3];
                try
                {
                    aobj = PaintView.decodeSampledBitmapFromResource(context1.getContentResolver(), uri1, integer.intValue(), ((Integer) (aobj)).intValue());
                }
                // Misplaced declaration of an exception variable
                catch (Object aobj[])
                {
                    Log.e("HockeyApp", "Could not load image into ImageView.", ((Throwable) (aobj)));
                    return null;
                }
                return ((Bitmap) (aobj));
            }

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground(aobj);
            }

            protected void onPostExecute(Bitmap bitmap)
            {
                if (bitmap == null)
                {
                    return;
                } else
                {
                    setImageBitmap(bitmap);
                    return;
                }
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((Bitmap)obj);
            }

            protected void onPreExecute()
            {
                setAdjustViewBounds(true);
            }

            
            {
                this$0 = PaintView.this;
                super();
            }
        }).execute(new Object[] {
            context, uri, Integer.valueOf(i), Integer.valueOf(j)
        });
    }

    private static int calculateInSampleSize(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        int i1 = options.outHeight;
        int j1 = options.outWidth;
        int l = 1;
        int k = 1;
        if (i1 > j || j1 > i)
        {
            i1 /= 2;
            j1 /= 2;
            do
            {
                l = k;
                if (i1 / k <= j)
                {
                    break;
                }
                l = k;
                if (j1 / k <= i)
                {
                    break;
                }
                k *= 2;
            } while (true);
        }
        return l;
    }

    private static Bitmap decodeSampledBitmapFromResource(ContentResolver contentresolver, Uri uri, int i, int j)
        throws IOException
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(contentresolver.openInputStream(uri), null, options);
        options.inSampleSize = calculateInSampleSize(options, i, j);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(contentresolver.openInputStream(uri), null, options);
    }

    public static int determineOrientation(ContentResolver contentresolver, Uri uri)
    {
        int i = 1;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        float f;
        int j;
        try
        {
            BitmapFactory.decodeStream(contentresolver.openInputStream(uri), null, options);
            f = options.outWidth;
            j = options.outHeight;
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            Log.e("HockeyApp", "Unable to determine necessary screen orientation.", contentresolver);
            return 1;
        }
        if (f / (float)j > 1.0F)
        {
            i = 0;
        }
        return i;
    }

    private void touchMove(float f, float f1)
    {
        float f2 = Math.abs(f - mX);
        float f3 = Math.abs(f1 - mY);
        if (f2 >= 4F || f3 >= 4F)
        {
            path.quadTo(mX, mY, (mX + f) / 2.0F, (mY + f1) / 2.0F);
            mX = f;
            mY = f1;
        }
    }

    private void touchStart(float f, float f1)
    {
        path.reset();
        path.moveTo(f, f1);
        mX = f;
        mY = f1;
    }

    private void touchUp()
    {
        path.lineTo(mX, mY);
        paths.push(path);
        path = new Path();
    }

    public void clearImage()
    {
        paths.clear();
        invalidate();
    }

    public boolean isClear()
    {
        return paths.empty();
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        for (Iterator iterator = paths.iterator(); iterator.hasNext(); canvas.drawPath((Path)iterator.next(), paint)) { }
        canvas.drawPath(path, paint);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        float f;
        float f1;
        f = motionevent.getX();
        f1 = motionevent.getY();
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 40
    //                   0 42
    //                   1 68
    //                   2 55;
           goto _L1 _L2 _L3 _L4
_L1:
        return true;
_L2:
        touchStart(f, f1);
        invalidate();
        continue; /* Loop/switch isn't completed */
_L4:
        touchMove(f, f1);
        invalidate();
        continue; /* Loop/switch isn't completed */
_L3:
        touchUp();
        invalidate();
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void undo()
    {
        if (!paths.empty())
        {
            paths.pop();
            invalidate();
        }
    }

}
