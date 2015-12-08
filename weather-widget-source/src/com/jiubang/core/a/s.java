// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.jiubang.core.a:
//            i, b

public class s extends i
{

    static final Paint C = new Paint();
    protected i A;
    protected boolean B;
    protected int D;
    private boolean E;
    private b F;
    protected ArrayList y;
    protected ArrayList z;

    public s(Context context, int k, int l, int i1, int j1, Bitmap bitmap, int k1, 
            int l1)
    {
        super(context, k, l, i1, j1, bitmap, k1, l1);
        y = new ArrayList();
        z = new ArrayList();
        D = 32768;
    }

    public void a(int k, int l, int i1, int j1)
    {
        super.a(k, l, i1, j1);
        if (F != null)
        {
            F.a(this);
        }
    }

    public void a(Canvas canvas, float f, float f1, float f2, int k, int l)
    {
        if (E)
        {
            canvas.save();
            canvas.clipRect(new Rect(0, 0, e, this.f));
        }
        if (j != null)
        {
            if (q != null && l < 255)
            {
                canvas.drawBitmap(q, null, this.k, i);
            }
            if (l > 0)
            {
                int i1 = i.getAlpha();
                i.setAlpha(l);
                canvas.drawBitmap(j, null, this.k, i);
                i.setAlpha(i1);
            }
        }
        b(canvas, f2, k, l);
        if (E)
        {
            canvas.restore();
        }
    }

    public void a(Canvas canvas, float f, float f1, float f2, int k, int l, boolean flag)
    {
        if (E)
        {
            canvas.save();
            canvas.clipRect(new Rect(0, 0, e, this.f));
        }
        if (j != null)
        {
            if (q != null && l != 255)
            {
                canvas.drawBitmap(q, null, this.k, i);
            }
            int i1 = i.getAlpha();
            i.setAlpha(l);
            if (l != 0)
            {
                canvas.drawBitmap(j, null, this.k, i);
            }
            i.setAlpha(i1);
        }
        b(canvas, f2, k, l);
        if (E)
        {
            canvas.restore();
        }
    }

    protected void a(Canvas canvas, float f, int k, int l)
    {
        if (l > 0)
        {
            c(canvas, f, k, l);
        }
    }

    public void a(i k)
    {
        if (k == null)
        {
            throw new IllegalArgumentException("component cannot be null");
        }
        if (b(k) >= 0)
        {
            return;
        } else
        {
            y.add(k);
            k.a(this);
            z.add(k);
            return;
        }
    }

    public boolean a(long l)
    {
        boolean flag = super.a(l);
        Iterator iterator = y.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            if (((i)iterator.next()).a(l))
            {
                flag = true;
            }
        } while (true);
        return flag;
    }

    public int b(i k)
    {
        if (k == null)
        {
            throw new IllegalArgumentException("component cannot be null");
        } else
        {
            return y.indexOf(k);
        }
    }

    protected final void c(Canvas canvas, float f, int k, int l)
    {
        int k1 = z.size();
        boolean flag = v();
        int j1 = 0;
        while (j1 < k1) 
        {
            i i1 = (i)z.get(j1);
            if (i1 != null && i1.e())
            {
                i1.f();
                Bitmap bitmap;
                if (flag && i1.n())
                {
                    bitmap = i1.a(f, k);
                } else
                {
                    bitmap = null;
                }
                if (bitmap != null && !bitmap.isRecycled())
                {
                    if (i1.m() == 255)
                    {
                        int l1 = i.getAlpha();
                        i.setAlpha(l);
                        canvas.drawBitmap(bitmap, i1.a, i1.b, i);
                        i.setAlpha(l1);
                    } else
                    {
                        int i2 = C.getAlpha();
                        i2 = (int)(((float)l / ((float)i2 + 0.0F)) * 255F);
                        C.setAlpha(i2);
                        canvas.drawBitmap(bitmap, i1.a, i1.b, C);
                    }
                } else
                {
                    i1.a(canvas, i1.a, i1.b, f, k, l, p);
                }
            }
            j1++;
        }
    }

    protected void g()
    {
        super.g();
        A = null;
        B = false;
    }

    public void j()
    {
        if (j != null && !j.isRecycled())
        {
            j.recycle();
            j = null;
        }
        if (q != null && !q.isRecycled())
        {
            q.recycle();
            q = null;
        }
        for (Iterator iterator = y.iterator(); iterator.hasNext(); ((i)iterator.next()).j()) { }
    }

    public void o()
    {
        super.o();
        int i1 = z.size();
        for (int l = 0; l < i1; l++)
        {
            i k = (i)z.get(l);
            if (k != null)
            {
                k.o();
            }
        }

    }

    public void r()
    {
        int l = y.size();
        for (int k = 0; k < l; k++)
        {
            ((i)y.get(k)).r();
        }

    }

    public void s()
    {
        int l = y.size();
        for (int k = 0; k < l; k++)
        {
            ((i)y.get(k)).s();
        }

    }

    public boolean u()
    {
        int k;
        k = 0;
        int l;
        boolean flag;
        boolean flag1;
        if (t() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (flag) goto _L2; else goto _L1
_L1:
        l = y.size();
_L7:
        flag1 = flag;
        if (k >= l) goto _L2; else goto _L3
_L3:
        flag = ((i)y.get(k)).u();
        if (!flag) goto _L5; else goto _L4
_L4:
        flag1 = flag;
_L2:
        return flag1;
_L5:
        k++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    protected boolean v()
    {
        return (D & 0x8000) == 32768;
    }

}
