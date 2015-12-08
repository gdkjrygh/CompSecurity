// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.youtube.r;

// Referenced classes of package com.google.android.apps.youtube.app.ui:
//            r

public class ClingView extends View
{

    private View a;
    private View b;
    private com.google.android.apps.youtube.app.ui.r c;
    private final Drawable d;

    public ClingView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        attributeset = context.obtainStyledAttributes(attributeset, r.k);
        int i = attributeset.getResourceId(0, 0);
        attributeset.recycle();
        if (i != 0)
        {
            context = context.getResources().getDrawable(i);
        } else
        {
            context = null;
        }
        d = context;
    }

    private int[] b()
    {
        if (b == null)
        {
            return null;
        }
        int j = b.getLeft();
        int i = b.getTop();
        View view;
        for (view = (View)b.getParent(); view != a && view != null; view = (View)view.getParent())
        {
            j += view.getLeft();
            i += view.getTop();
        }

        if (view == null)
        {
            return null;
        } else
        {
            return (new int[] {
                j, i
            });
        }
    }

    public final Rect a()
    {
        int ai[] = b();
        if (ai != null)
        {
            return new Rect(ai[0], ai[1], ai[0] + b.getWidth(), ai[1] + b.getHeight());
        } else
        {
            return new Rect();
        }
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (b != null)
        {
            Paint paint = new Paint();
            paint.setStyle(android.graphics.Paint.Style.FILL);
            paint.setColor(0xd8000000);
            Object obj = b();
            if (obj == null)
            {
                obj = new Rect();
            } else
            {
                int ai[] = new int[2];
                ai[0] = obj[0] + b.getWidth() / 2;
                ai[1] = obj[1] + b.getHeight() / 2;
                int i;
                int j;
                int k;
                int l;
                if (d != null)
                {
                    i = d.getIntrinsicWidth();
                } else
                {
                    i = b.getWidth();
                }
                if (d != null)
                {
                    j = d.getIntrinsicHeight();
                } else
                {
                    j = b.getHeight();
                }
                k = ai[0] - i / 2;
                l = ai[1] - j / 2;
                obj = new Rect(k, l, k + i, j + l);
            }
            if (d != null)
            {
                d.setBounds(((Rect) (obj)));
                d.draw(canvas);
            }
            canvas.drawRect(0.0F, 0.0F, canvas.getWidth(), ((Rect) (obj)).top, paint);
            canvas.drawRect(0.0F, ((Rect) (obj)).top, ((Rect) (obj)).left, canvas.getHeight(), paint);
            if (((Rect) (obj)).right < canvas.getWidth())
            {
                canvas.drawRect(((Rect) (obj)).right, ((Rect) (obj)).top, canvas.getWidth(), canvas.getHeight(), paint);
            }
            if (((Rect) (obj)).bottom < canvas.getHeight())
            {
                canvas.drawRect(((Rect) (obj)).left, ((Rect) (obj)).bottom, ((Rect) (obj)).right, canvas.getHeight(), paint);
            }
            if (c != null)
            {
                c.a(((Rect) (obj)));
                return;
            }
        }
    }

    public void setHighlightBoundsListener(com.google.android.apps.youtube.app.ui.r r1)
    {
        c = r1;
    }

    public void setViewToCling(View view, View view1)
    {
        b = view1;
        a = view;
        postInvalidate();
    }
}
