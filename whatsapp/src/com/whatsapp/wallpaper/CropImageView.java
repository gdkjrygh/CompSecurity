// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp.wallpaper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.whatsapp.wallpaper:
//            ImageViewTouchBase, p, f, s, 
//            CropImage, m

public class CropImageView extends ImageViewTouchBase
{

    boolean n;
    ArrayList o;
    float p;
    p q;
    boolean r;
    float s;
    int t;

    public CropImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        o = new ArrayList();
        q = null;
        r = false;
    }

    private void a(MotionEvent motionevent)
    {
        boolean flag = ImageViewTouchBase.e;
        clearFocus();
        int i = 0;
        do
        {
label0:
            {
label1:
                {
                    if (i >= o.size())
                    {
                        break label1;
                    }
                    p p1 = (p)o.get(i);
                    if (p1.b(motionevent.getX(), motionevent.getY()) != 1)
                    {
                        if (p1.b())
                        {
                            break label1;
                        }
                        p1.a(true);
                        p1.d();
                        if (!flag)
                        {
                            break label1;
                        }
                    }
                    if (!flag)
                    {
                        break label0;
                    }
                }
                invalidate();
                return;
            }
            i++;
        } while (true);
    }

    static void a(CropImageView cropimageview, p p1)
    {
        cropimageview.a(p1);
    }

    private void a(p p1)
    {
        p1 = p1.f;
        int i = Math.max(0, getLeft() - ((Rect) (p1)).left);
        int l = Math.min(0, getRight() - ((Rect) (p1)).right);
        int j = Math.max(0, getTop() - ((Rect) (p1)).top);
        int k = Math.min(0, getBottom() - ((Rect) (p1)).bottom);
        if (i == 0)
        {
            i = l;
        }
        if (j == 0)
        {
            j = k;
        }
        if (i != 0 || j != 0)
        {
            a(i, j);
        }
    }

    private void c(p p1)
    {
        Rect rect = p1.f;
        float f1 = rect.width();
        float f2 = rect.height();
        float f3 = getWidth();
        float f4 = getHeight();
        f1 = Math.max(1.0F, Math.min((f3 / f1) * 0.6F, (f4 / f2) * 0.6F) * a());
        if ((double)(Math.abs(f1 - a()) / f1) > 0.10000000000000001D)
        {
            float af[] = new float[2];
            af[0] = p1.i.centerX();
            af[1] = p1.i.centerY();
            getImageMatrix().mapPoints(af);
            a(f1, af[0], af[1], 300F, new f(this, p1));
        }
    }

    protected void a(float f1, float f2, float f3)
    {
        boolean flag = ImageViewTouchBase.e;
        super.a(f1, f2, f3);
        Iterator iterator = o.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            p p1 = (p)iterator.next();
            p1.j.set(getImageMatrix());
            p1.d();
        } while (!flag);
    }

    protected void b(float f1, float f2)
    {
        boolean flag = ImageViewTouchBase.e;
        super.b(f1, f2);
        int i = 0;
        do
        {
label0:
            {
                if (i < o.size())
                {
                    p p1 = (p)o.get(i);
                    p1.j.postTranslate(f1, f2);
                    p1.d();
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return;
            }
            i++;
        } while (true);
    }

    public void b(p p1)
    {
        o.add(p1);
        invalidate();
    }

    public void c()
    {
        o.clear();
        super.c();
    }

    public void clearFocus()
    {
        boolean flag = ImageViewTouchBase.e;
        int i = 0;
        do
        {
label0:
            {
                if (i < o.size())
                {
                    p p1 = (p)o.get(i);
                    p1.a(false);
                    p1.d();
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return;
            }
            i++;
        } while (true);
    }

    protected void onDraw(Canvas canvas)
    {
        boolean flag = ImageViewTouchBase.e;
        if (!r)
        {
            super.onDraw(canvas);
        }
        int i = 0;
        do
        {
label0:
            {
                if (i < o.size())
                {
                    ((p)o.get(i)).a(canvas);
                    if (!flag)
                    {
                        break label0;
                    }
                }
                return;
            }
            i++;
        } while (true);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        boolean flag1 = ImageViewTouchBase.e;
        super.onLayout(flag, i, j, k, l);
        if (m.a() != null)
        {
            Iterator iterator = o.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                p p1 = (p)iterator.next();
                p1.j.set(getImageMatrix());
                p1.d();
                if (p1.h)
                {
                    c(p1);
                }
            } while (!flag1);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        CropImage cropimage;
        boolean flag;
        flag = ImageViewTouchBase.e;
        cropimage = (CropImage)getContext();
        if (cropimage.c)
        {
            return false;
        }
        motionevent.getAction();
        JVM INSTR tableswitch 0 2: default 52
    //                   0 86
    //                   1 204
    //                   2 276;
           goto _L1 _L2 _L3 _L4
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 1 3: default 84
    //                   1 346
    //                   2 357
    //                   3 346;
           goto _L5 _L6 _L7 _L6
_L5:
        return true;
_L2:
        int i = 0;
_L13:
        if (i >= o.size()) goto _L9; else goto _L8
_L8:
        Object obj;
        int j;
        obj = (p)o.get(i);
        j = ((p) (obj)).b(motionevent.getX(), motionevent.getY());
        if (j == 1) goto _L11; else goto _L10
_L10:
        t = j;
        q = ((p) (obj));
        s = motionevent.getX();
        p = motionevent.getY();
        p p1 = q;
        if (j == 32)
        {
            obj = m.Move;
        } else
        {
            obj = m.Grow;
        }
        p1.a(((m) (obj)));
        a(motionevent);
        if (!flag) goto _L9; else goto _L11
_L11:
        if (!flag) goto _L12; else goto _L9
_L9:
        if (!flag) goto _L1; else goto _L3
_L3:
        if (q != null)
        {
            cropimage.k = q;
            if (q.b())
            {
                q.a(false);
                q.d();
                invalidate();
            }
            c(q);
            q.a(m.None);
        }
        q = null;
        if (!flag) goto _L1; else goto _L4
_L4:
        if (q != null)
        {
            q.b(t, motionevent.getX() - s, motionevent.getY() - p);
            s = motionevent.getX();
            p = motionevent.getY();
            a(q);
        }
          goto _L1
_L6:
        a(true, true);
        if (!flag) goto _L5; else goto _L7
_L7:
        if (a() == 1.0F)
        {
            a(true, true);
        }
          goto _L5
_L12:
        i++;
          goto _L13
    }
}
