// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

// Referenced classes of package com.whatsapp:
//            App, MediaData, ConversationRowImage

public class a extends ImageView
{

    private boolean a;
    private int b;
    private boolean c;
    private MediaData d;
    private Bitmap e;
    private Paint f;
    private int g;

    static int a(a a1)
    {
        return a1.g;
    }

    static int a(g g1, int i)
    {
        g1.g = i;
        return i;
    }

    static Bitmap a(g g1, Bitmap bitmap)
    {
        g1.e = bitmap;
        return bitmap;
    }

    static MediaData a(e e1, MediaData mediadata)
    {
        e1.d = mediadata;
        return mediadata;
    }

    private void a()
    {
        f.setAntiAlias(true);
        f.setDither(true);
        f.setFilterBitmap(true);
        f.setColor(-1);
    }

    static boolean a(f f1, boolean flag)
    {
        f1.c = flag;
        return flag;
    }

    static int b(c c1, int i)
    {
        c1.b = i;
        return i;
    }

    static boolean b(b b1, boolean flag)
    {
        b1.a = flag;
        return flag;
    }

    protected void onDraw(Canvas canvas)
    {
        Object obj;
label0:
        {
label1:
            {
                int j = App.am;
                f.setColor(-1);
                Rect rect = new Rect(0, 0, getWidth(), getHeight());
                if (e == null)
                {
                    break label0;
                }
                obj = new Rect(0, 0, e.getWidth(), e.getHeight());
                if (e.getHeight() > e.getWidth())
                {
                    obj.bottom = e.getWidth();
                    int i;
                    if (d.faceY > 0)
                    {
                        i = d.faceY;
                    } else
                    {
                        i = b / 3;
                    }
                    if (i > g / 3)
                    {
                        int k = ((Rect) (obj)).bottom;
                        obj.bottom = Math.min(e.getHeight(), (i * e.getHeight()) / b + (k * 2) / 3);
                        obj.top = ((Rect) (obj)).bottom - k;
                        if (((Rect) (obj)).top < 0)
                        {
                            obj.top = 0;
                            obj.bottom = k;
                        }
                    }
                    if (j == 0)
                    {
                        break label1;
                    }
                }
                if (e.getWidth() * 10 > e.getHeight() * 24)
                {
                    obj.left = (e.getWidth() - (e.getHeight() * 24) / 10) / 2;
                    obj.right = (e.getWidth() + (e.getHeight() * 24) / 10) / 2;
                }
            }
            canvas.drawBitmap(e, ((Rect) (obj)), rect, f);
        }
label2:
        {
            if (c)
            {
                if (a)
                {
                    obj = ConversationRowImage.c();
                } else
                {
                    obj = ConversationRowImage.d();
                }
                if (j == 0)
                {
                    break label2;
                }
            }
            if (a)
            {
                obj = ConversationRowImage.b();
            } else
            {
                obj = ConversationRowImage.a();
            }
        }
        ((Drawable) (obj)).setBounds(rect);
        ((Drawable) (obj)).draw(canvas);
        f.setColor(0x33000000);
        f.setStrokeWidth(1.0F);
        f.setStyle(android.graphics.eight);
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        View view = ((Activity)getContext()).getWindow().getDecorView();
        k = (Math.min(view.getWidth(), view.getHeight()) * 70) / 100;
        j = (b * k) / g;
        i = j;
        if (j <= k) goto _L2; else goto _L1
_L1:
        if (App.am == 0) goto _L4; else goto _L3
_L3:
        i = k;
_L2:
        j = i;
        if (k * 10 > i * 24)
        {
            j = (k * 10) / 24;
        }
_L6:
        setMeasuredDimension(k, j);
        return;
_L4:
        j = k;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public (Context context)
    {
        super(context);
        f = new Paint();
        a();
    }

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = new Paint();
        a();
    }

    public a(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        f = new Paint();
        a();
    }
}
