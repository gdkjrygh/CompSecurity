// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.Scroller;
import com.whatsapp.util.Log;

// Referenced classes of package com.whatsapp:
//            ke, a1s, mi, App, 
//            TouchImageView, y

public class GalleryView extends ViewGroup
    implements android.view.GestureDetector.OnDoubleTapListener
{

    private static final String G[];
    private static Interpolator k;
    private int A;
    private VelocityTracker B;
    private GestureDetector C;
    private int D;
    private boolean E;
    private int F;
    private int a;
    private int b;
    private int c;
    private int d;
    private Canvas e;
    private y f;
    private int g;
    boolean h;
    private Paint i;
    private Bitmap j;
    private boolean l;
    private Paint m;
    private RectF n;
    private float o;
    private mi p;
    private int q;
    private boolean r;
    private int s;
    Bitmap t;
    private float u;
    private float v;
    private int w;
    private Paint x;
    private RectF y;
    public Scroller z;

    public GalleryView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public GalleryView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        w = -1;
        q = -1;
        D = 0;
        d = 0;
        a();
        C = new GestureDetector(new a1s(this));
        C.setOnDoubleTapListener(this);
    }

    static int a(GalleryView galleryview)
    {
        return galleryview.D;
    }

    static Bitmap a(Bitmap bitmap, int i1, int j1, Context context)
    {
label0:
        {
            int i2 = bitmap.getWidth();
            int j2 = bitmap.getHeight();
            if (i2 >= i1)
            {
                context = bitmap;
                if (j2 >= j1)
                {
                    break label0;
                }
            }
            int k2 = Integer.valueOf(G[0], 16).intValue();
            Canvas canvas;
            int k1;
            int l1;
            if (i2 < i1)
            {
                k1 = i1;
            } else
            {
                k1 = i2;
            }
            if (j2 < j1)
            {
                l1 = j1;
            } else
            {
                l1 = j2;
            }
            context = Bitmap.createBitmap(k1, l1, android.graphics.Bitmap.Config.RGB_565);
            canvas = new Canvas(context);
            canvas.drawColor(k2);
            canvas.drawBitmap(bitmap, (float)(i1 - i2) / 2.0F, (float)(j1 - j2) / 2.0F, null);
        }
        return context;
    }

    private void a()
    {
        z = new Scroller(getContext(), k);
        c = d;
        m = new Paint();
        m.setDither(false);
        ViewConfiguration viewconfiguration = ViewConfiguration.get(getContext());
        A = viewconfiguration.getScaledTouchSlop();
        b = viewconfiguration.getScaledMaximumFlingVelocity();
        i = new Paint();
        i.setColor(0xffff0000);
        i.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        x = new Paint();
        x.setColor(0xff888888);
        x.setStyle(android.graphics.Paint.Style.FILL);
    }

    private void a(int i1, boolean flag)
    {
        Object obj;
        int j1;
        int k1;
        int l1;
        if (i1 != c)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        q = i1;
        obj = getFocusedChild();
        if (obj != null && j1 != 0 && obj == getChildAt(c))
        {
            ((View) (obj)).clearFocus();
        }
        k1 = getWidth() * i1 - getScrollX();
        obj = z;
        l1 = getScrollX();
        if (flag)
        {
            j1 = 0;
        } else
        {
            j1 = Math.abs(k1) * 2;
        }
        ((Scroller) (obj)).startScroll(l1, 0, k1, 0, j1);
        if (p != null)
        {
            p.a(i1);
        }
        invalidate();
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = (motionevent.getAction() & 0xff00) >> 8;
        if (motionevent.getPointerId(i1) == w)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            v = motionevent.getX(i1);
            o = motionevent.getY(i1);
            w = motionevent.getPointerId(i1);
            if (B != null)
            {
                B.clear();
            }
        }
    }

    static int b(GalleryView galleryview)
    {
        return galleryview.c;
    }

    private void b()
    {
        int i1;
        int j1;
        if (!E)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        i1 = getMeasuredWidth();
        j1 = getMeasuredHeight();
        n = new RectF(0.0F, 0.0F, i1, (j1 * 2) / 100);
        int k1 = getScrollX() / getChildCount();
        y = new RectF(k1, 0.0F, k1 + i1 / getChildCount(), (j1 * 2) / 100);
        t = Bitmap.createBitmap(i1, (j1 * 2) / 100, android.graphics.Bitmap.Config.ARGB_8888);
        e = new Canvas(t);
        e.drawRoundRect(n, 0.0F, 0.0F, x);
        e.drawRoundRect(y, 5F, 5F, i);
        return;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        Log.e((new StringBuilder()).append(G[8]).append(outofmemoryerror).toString());
        return;
    }

    private void b(MotionEvent motionevent)
    {
        int i1;
        int j1;
        i1 = App.am;
        j1 = motionevent.findPointerIndex(w);
        if (j1 != -1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        float f1 = motionevent.getX(j1);
        j1 = (int)(v - f1);
        v = f1;
        if (p != null)
        {
            p.b();
        }
        if (j1 >= 0)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        if (getScrollX() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        scrollBy(Math.max(-getScrollX(), j1), 0);
        if (i1 == 0) goto _L1; else goto _L3
_L3:
        if (p == null) goto _L1; else goto _L4
_L4:
        return;
        if (j1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        int k1 = getChildAt(getChildCount() - 1).getRight() - getScrollX() - getWidth();
        if (k1 > 0)
        {
            scrollBy(Math.min(k1, j1), 0);
            if (i1 == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        if (p == null);
        if (i1 == 0) goto _L1; else goto _L5
_L5:
        awakenScrollBars();
        return;
    }

    private void c()
    {
        int i1 = getWidth();
        a((getScrollX() + i1 / 2) / i1);
    }

    private void c(MotionEvent motionevent)
    {
        int i1 = motionevent.findPointerIndex(w);
        if (i1 != -1)
        {
            float f1 = motionevent.getX(i1);
            float f2 = motionevent.getY(i1);
            i1 = (int)Math.abs(f1 - v);
            int j1 = (int)Math.abs(f2 - o);
            boolean flag;
            boolean flag1;
            if (i1 > A)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (j1 > A)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag || flag1)
            {
                if (flag && !flag1)
                {
                    D = 1;
                    v = f1;
                }
                if (r)
                {
                    r = false;
                    motionevent = getChildAt(c);
                    if (motionevent != null)
                    {
                        motionevent.cancelLongPress();
                        return;
                    }
                }
            }
        }
    }

    public void a(int i1)
    {
        a(i1, false);
    }

    public void computeScroll()
    {
label0:
        {
            if (z.computeScrollOffset())
            {
                scrollTo(z.getCurrX(), z.getCurrY());
                postInvalidate();
                if (App.am == 0)
                {
                    break label0;
                }
            }
            if (q != -1)
            {
                c = Math.max(0, Math.min(q, getChildCount() - 1));
                q = -1;
            }
        }
    }

    public int d()
    {
        return c;
    }

    protected void dispatchDraw(Canvas canvas)
    {
label0:
        {
label1:
            {
label2:
                {
                    int j1 = App.am;
                    if (j != null)
                    {
                        float f2 = (float)getScrollX() * u;
                        float f1 = f2;
                        if ((float)F + f2 < (float)(getRight() - getLeft()))
                        {
                            f1 = getRight() - getLeft() - F;
                        }
                        canvas.drawBitmap(j, f1, (getBottom() - getTop() - g) / 2, m);
                    }
                    View view;
                    int i1;
                    int k1;
                    long l1;
                    if (D != 1 && q == -1)
                    {
                        i1 = 1;
                    } else
                    {
                        i1 = 0;
                    }
                    if (i1 == 0)
                    {
                        break label1;
                    }
                    view = getChildAt(c);
                    if (view != null)
                    {
                        drawChild(canvas, view, getDrawingTime());
                        if (j1 == 0)
                        {
                            break label2;
                        }
                    }
                    Log.e((new StringBuilder()).append(G[1]).append(c).toString());
                    if (p != null)
                    {
                        p.c();
                    }
                }
                if (j1 == 0)
                {
                    break label0;
                }
            }
            l1 = getDrawingTime();
            if (q >= 0 && q < getChildCount() && Math.abs(c - q) == 1)
            {
                drawChild(canvas, getChildAt(c), l1);
                drawChild(canvas, getChildAt(q), l1);
                if (j1 == 0)
                {
                    break label0;
                }
            }
            k1 = getChildCount();
            i1 = 0;
            do
            {
                if (i1 >= k1)
                {
                    break;
                }
                drawChild(canvas, getChildAt(i1), l1);
                i1++;
            } while (j1 == 0);
        }
        if (E)
        {
            b();
            canvas.drawBitmap(t, getScrollX(), (getMeasuredHeight() * 98) / 100, m);
        }
    }

    public boolean dispatchUnhandledMove(View view, int i1)
    {
        if (i1 == 17)
        {
            if (d() > 0)
            {
                a(d() - 1);
                return true;
            }
        } else
        if (i1 == 66 && d() < getChildCount() - 1)
        {
            a(d() + 1);
            return true;
        }
        return super.dispatchUnhandledMove(view, i1);
    }

    public boolean onDoubleTap(MotionEvent motionevent)
    {
        if (p != null)
        {
            p.a();
        }
        return false;
    }

    public boolean onDoubleTapEvent(MotionEvent motionevent)
    {
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int k1 = App.am;
        if (!h) goto _L2; else goto _L1
_L1:
        int i1;
        return true;
_L2:
        if ((i1 = motionevent.getAction()) == 2 && D != 0) goto _L1; else goto _L3
_L3:
        if (B == null)
        {
            B = VelocityTracker.obtain();
        }
        B.addMovement(motionevent);
        if ((getChildAt(c) instanceof TouchImageView) && motionevent.getPointerCount() > 1 && !((TouchImageView)getChildAt(c)).v && !((TouchImageView)getChildAt(c)).w)
        {
            ((TouchImageView)getChildAt(c)).q = true;
            TouchImageView.o = 1;
            h = true;
        }
        i1;
        JVM INSTR tableswitch 0 6: default 180
    //                   0 228
    //                   1 286
    //                   2 189
    //                   3 286
    //                   4 180
    //                   5 344
    //                   6 334;
           goto _L4 _L5 _L6 _L7 _L6 _L4 _L8 _L9
_L4:
        if (D == 0)
        {
            return false;
        }
          goto _L1
_L7:
        if (TouchImageView.o != 1) goto _L11; else goto _L10
_L10:
        if (p == null) goto _L4; else goto _L12
_L12:
        p.a(motionevent);
        if (k1 == 0) goto _L4; else goto _L11
_L11:
        c(motionevent);
        if (k1 == 0) goto _L4; else goto _L5
_L5:
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        v = f1;
        o = f2;
        r = true;
        w = motionevent.getPointerId(0);
        int j1;
        if (z.isFinished())
        {
            j1 = 0;
        } else
        {
            j1 = 1;
        }
        D = j1;
        if (k1 == 0) goto _L4; else goto _L6
_L6:
        Log.w(G[6]);
        w = -1;
        r = false;
        if (B != null)
        {
            B.recycle();
            B = null;
        }
        D = 0;
        if (k1 == 0) goto _L4; else goto _L9
_L9:
        a(motionevent);
        if (k1 == 0) goto _L4; else goto _L8
_L8:
        Log.e(G[7]);
          goto _L4
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        l1 = App.am;
        int i2 = getChildCount();
        i1 = 0;
        j1 = 0;
        do
        {
            if (i1 >= i2)
            {
                break;
            }
            View view = getChildAt(i1);
            k1 = j1;
            if (view.getVisibility() != 8)
            {
                k1 = view.getMeasuredWidth();
                view.layout(j1, 0, j1 + k1, view.getMeasuredHeight());
                k1 = j1 + k1;
            }
            i1++;
            j1 = k1;
        } while (l1 == 0);
        if (f != null)
        {
            f.a();
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int l1 = App.am;
        super.onMeasure(i1, j1);
        int i2 = android.view.View.MeasureSpec.getSize(i1);
        int j2 = android.view.View.MeasureSpec.getSize(j1);
        if (android.view.View.MeasureSpec.getMode(i1) != 0x40000000 && i1 != 0)
        {
            Log.e((new StringBuilder()).append(G[5]).append(i1).toString());
        }
        int k2 = android.view.View.MeasureSpec.getMode(j1);
        if (k2 != 0x40000000 && j1 != 0)
        {
            Log.e((new StringBuilder()).append(G[4]).append(j1).toString());
        }
        int l2 = getChildCount();
        j1 = 0;
        do
        {
label0:
            {
                float f1;
                if (j1 < l2)
                {
                    int k1;
                    if (E)
                    {
                        k1 = 98;
                    } else
                    {
                        k1 = 100;
                    }
                    k1 = android.view.View.MeasureSpec.makeMeasureSpec((k1 * j2) / 100, k2);
                    getChildAt(j1).measure(i1, k1);
                    if (l1 == 0)
                    {
                        break label0;
                    }
                }
                if (l)
                {
                    l = false;
                    j = a(j, i2, j2, getContext());
                    F = j.getWidth();
                    g = j.getHeight();
                }
                if (F > i2)
                {
                    f1 = (float)(l2 * i2 - F) / ((float)(l2 - 1) * (float)i2);
                } else
                {
                    f1 = 1.0F;
                }
                u = f1;
                if (a != i2)
                {
                    a = i2;
                    scrollTo(c * i2, 0);
                    setScreenWidth(i2);
                }
                b();
                invalidate();
                return;
            }
            j1++;
        } while (true);
    }

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        if (p != null)
        {
            p.b(0);
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        float f1;
        int i1;
        int j1;
        i1 = App.am;
        C.onTouchEvent(motionevent);
        if (B == null)
        {
            B = VelocityTracker.obtain();
        }
        B.addMovement(motionevent);
        j1 = motionevent.getAction();
        f1 = motionevent.getX();
        j1;
        JVM INSTR tableswitch 0 6: default 92
    //                   0 94
    //                   1 233
    //                   2 163
    //                   3 387
    //                   4 92
    //                   5 444
    //                   6 417;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        return true;
_L2:
        if (!h)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (p != null)
        {
            p.a(motionevent);
            return true;
        }
        continue; /* Loop/switch isn't completed */
        if (D == 0) goto _L1; else goto _L8
_L8:
        if (!z.isFinished())
        {
            z.abortAnimation();
        }
        v = f1;
        w = motionevent.getPointerId(0);
        if (i1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        if (!h)
        {
            break; /* Loop/switch isn't completed */
        }
        if (p != null)
        {
            p.a(motionevent);
            return true;
        }
        if (true) goto _L1; else goto _L9
_L9:
        if (D != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        b(motionevent);
        if (i1 == 0) goto _L1; else goto _L10
_L10:
        if (!onInterceptTouchEvent(motionevent) || D != 1) goto _L1; else goto _L11
_L11:
        b(motionevent);
        if (i1 == 0) goto _L1; else goto _L3
_L3:
        System.currentTimeMillis();
        if (p == null);
        VelocityTracker velocitytracker = B;
        velocitytracker.computeCurrentVelocity(1000, b);
        int k1 = (int)velocitytracker.getXVelocity();
        if (D == 1 && !h)
        {
label0:
            {
                if (k1 > 250 && c > 0)
                {
                    a(c - 1);
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                if (k1 < -250 && c < getChildCount() - 1)
                {
                    a(c + 1);
                    if (i1 == 0)
                    {
                        break label0;
                    }
                }
                c();
            }
            if (B != null)
            {
                B.recycle();
                B = null;
            }
        }
        D = 0;
        w = -1;
        if (i1 == 0) goto _L1; else goto _L5
_L5:
        if (h) goto _L1; else goto _L12
_L12:
        Log.w(G[2]);
        D = 0;
        w = -1;
        if (i1 == 0) goto _L1; else goto _L7
_L7:
        if (h) goto _L1; else goto _L13
_L13:
        TouchImageView.o = 2;
        TouchImageView.r = -1F;
        a(motionevent);
        if (i1 == 0) goto _L1; else goto _L6
_L6:
        Log.e(G[3]);
        return true;
    }

    public void setCurrentScreen(int i1)
    {
        setCurrentScreen(i1, s);
    }

    public void setCurrentScreen(int i1, int j1)
    {
        setScreenWidth(j1);
        if (!z.isFinished())
        {
            z.abortAnimation();
        }
        c = Math.max(0, Math.min(i1, getChildCount()));
        scrollTo(c * j1, 0);
        if (p != null)
        {
            p.a(i1);
        }
        invalidate();
    }

    public void setEventCallback(mi mi1)
    {
        p = mi1;
    }

    public void setOnLongClickListener(android.view.View.OnLongClickListener onlongclicklistener)
    {
        int j1 = App.am;
        int k1 = getChildCount();
        int i1 = 0;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            getChildAt(i1).setOnLongClickListener(onlongclicklistener);
            i1++;
        } while (j1 == 0);
    }

    public void setScreenWidth(int i1)
    {
        int j1 = i1;
        if (i1 == 0)
        {
            j1 = getWidth();
        }
        s = j1;
    }

    static 
    {
        Object obj;
        String as[];
        byte byte0;
        int i1;
        as = new String[9];
        obj = "{'\021z[\004P\031";
        byte0 = -1;
        i1 = 0;
_L2:
        String as1[];
        int j1;
        int k1;
        as1 = as;
        obj = ((String) (obj)).toCharArray();
        k1 = obj.length;
        j1 = 0;
_L8:
label0:
        {
            if (k1 > j1)
            {
                break label0;
            }
            obj = (new String(((char []) (obj)))).intern();
            switch (byte0)
            {
            default:
                as1[i1] = ((String) (obj));
                obj = "Z\000L/\017O\030\1775\003X\026\017-\005b\002U1\030X\017T\034\034T\004Wl";
                i1 = 1;
                byte0 = 0;
                break;

            case 0: // '\0'
                as1[i1] = ((String) (obj));
                obj = "^\000U$\002IAAc\t\\\017C&\006\035\025O6\tUAE5\017S\025";
                i1 = 2;
                byte0 = 1;
                break;

            case 1: // '\001'
                as1[i1] = ((String) (obj));
                obj = "\\\002I7\005SAP,\030T\017T&\030\035\005O4\004";
                i1 = 3;
                byte0 = 2;
                break;

            case 2: // '\002'
                as1[i1] = ((String) (obj));
                obj = "Z\000L/\017O\030V*\017JNO-\007X\000S6\030XN\000+\017T\006H7'X\000S6\030X2P&\t\007";
                i1 = 4;
                byte0 = 3;
                break;

            case 3: // '\003'
                as1[i1] = ((String) (obj));
                i1 = 5;
                obj = "Z\000L/\017O\030V*\017JNO-\007X\000S6\030XN\0004\003Y\025H\016\017\\\022U1\017n\021E P";
                byte0 = 4;
                break;

            case 4: // '\004'
                as1[i1] = ((String) (obj));
                i1 = 6;
                obj = "t\017T&\030^\004P7\017YAAc\036R\024C+JX\027E-\036\035L\000\026:";
                byte0 = 5;
                break;

            case 5: // '\005'
                as1[i1] = ((String) (obj));
                i1 = 7;
                obj = "\\\002T*\005S>P,\003S\025E15Y\016W-";
                byte0 = 6;
                break;

            case 6: // '\006'
                as1[i1] = ((String) (obj));
                i1 = 8;
                obj = "Z\000L/\017O\030\r5\003X\026\017,\005P[";
                byte0 = 7;
                break;

            case 7: // '\007'
                as1[i1] = ((String) (obj));
                G = as;
                k = new ke();
                return;
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        char c1 = obj[j1];
        j1 % 5;
        JVM INSTR tableswitch 0 3: default 288
    //                   0 311
    //                   1 318
    //                   2 325
    //                   3 332;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_332;
_L3:
        byte byte1 = 106;
_L9:
        obj[j1] = (char)(byte1 ^ c1);
        j1++;
          goto _L8
_L4:
        byte1 = 61;
          goto _L9
_L5:
        byte1 = 97;
          goto _L9
_L6:
        byte1 = 32;
          goto _L9
        byte1 = 67;
          goto _L9
    }
}
