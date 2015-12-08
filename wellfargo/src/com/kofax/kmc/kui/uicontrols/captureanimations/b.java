// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kofax.kmc.kui.uicontrols.captureanimations;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.RotateAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.kofax.kmc.ken.engines.data.CheckDetectionResult;
import com.kofax.kmc.ken.engines.data.HorizontalGuidance;
import com.kofax.kmc.ken.engines.data.TurnGuidance;
import com.kofax.kmc.ken.engines.data.VerticalGuidance;
import com.kofax.kmc.ken.engines.data.ZoomGuidance;

// Referenced classes of package com.kofax.kmc.kui.uicontrols.captureanimations:
//            CaptureMessage, CaptureStaticFrameView, a, CaptureExperienceCriteria

class b extends View
{

    private static final int a = 50;
    private static final String b = "CaptureMessagesFrameView";
    private Context c;
    private CaptureMessage d;
    private CaptureMessage e;
    private CaptureMessage f;
    private CaptureMessage g;
    private CaptureMessage h;
    private a i;
    private CaptureExperienceCriteria j;
    private int k;
    private int l;
    private CaptureStaticFrameView m;
    private Rect n;
    private final Handler o = new Handler(Looper.getMainLooper());

    public b(Context context, CaptureStaticFrameView capturestaticframeview)
    {
        super(context);
        l = 5;
        c = context;
        m = capturestaticframeview;
        k = android.os.Build.VERSION.SDK_INT;
        o.postDelayed(new _cls1(), 50L);
    }

    static Handler a(b b1)
    {
        return b1.o;
    }

    private void a(Canvas canvas)
    {
        int k1 = -2;
        Object obj = (WindowManager)c.getSystemService("window");
        Configuration configuration = getResources().getConfiguration();
        int i1 = ((WindowManager) (obj)).getDefaultDisplay().getRotation();
        boolean flag;
        if ((i1 == 0 || i1 == 2) && configuration.orientation == 2 || (i1 == 1 || i1 == 3) && configuration.orientation == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (d == null)
        {
            d = new CaptureMessage();
            LinearLayout linearlayout;
            if (!flag)
            {
                d.setOrientation(CaptureMessage.KUIMessageOrientation.LANDSCAPE);
            } else
            {
                d.setOrientation(CaptureMessage.KUIMessageOrientation.PORTRAIT);
            }
        }
        if (d.getTextColor() == -11)
        {
            d.setTextColor(-1);
        }
        if (d.getBackgroundColor() == -11)
        {
            d.setBackgroundColor(0);
        }
        if (d.getMessage() == null)
        {
            d.setMessage("Fit Document in the frame, \nPicture will be taken automatically");
        }
        if (CaptureMessage.KUIMessageOrientation.UNKNOWN == d.getOrientation())
        {
            if (!flag)
            {
                d.setOrientation(CaptureMessage.KUIMessageOrientation.LANDSCAPE);
            } else
            {
                d.setOrientation(CaptureMessage.KUIMessageOrientation.PORTRAIT);
            }
        }
        canvas.save();
        obj = new TextView(c);
        if (d.getVisibility())
        {
            ((TextView) (obj)).setVisibility(0);
        } else
        {
            ((TextView) (obj)).setVisibility(8);
        }
        ((TextView) (obj)).setTextColor(d.getTextColor());
        ((TextView) (obj)).setTextSize(18F);
        if (d.getTextSize() != -1)
        {
            ((TextView) (obj)).setTextSize(d.getTextSize());
        }
        ((TextView) (obj)).setText(d.getMessage());
        ((TextView) (obj)).setBackgroundColor(d.getBackgroundColor());
        ((TextView) (obj)).setSingleLine(false);
        if (d.getBackground() != null)
        {
            if (k < 16)
            {
                ((TextView) (obj)).setBackgroundDrawable(d.getBackground());
            } else
            {
                ((TextView) (obj)).setBackground(d.getBackground());
            }
        }
        if (d.getTypeface() != null)
        {
            ((TextView) (obj)).setTypeface(d.getTypeface());
        }
        if (d.getHeight() == 0 || d.getWidth() == 0)
        {
            ((TextView) (obj)).setVisibility(8);
        } else
        {
            int j1;
            if (d.getWidth() != -1)
            {
                j1 = d.getWidth();
            } else
            {
                j1 = -2;
            }
            if (d.getHeight() != -1)
            {
                k1 = d.getHeight();
            }
            ((TextView) (obj)).setLayoutParams(new android.widget.LinearLayout.LayoutParams(j1, k1, 1.0F));
        }
        ((TextView) (obj)).setGravity(17);
        ((TextView) (obj)).setPadding(l, l, l, l);
        linearlayout = new LinearLayout(c);
        linearlayout.addView(((View) (obj)));
        linearlayout.measure(canvas.getWidth(), canvas.getHeight());
        linearlayout.layout(0, 0, canvas.getWidth(), canvas.getHeight());
        a(canvas, d, ((View) (obj)), 1);
        linearlayout.draw(canvas);
        canvas.restore();
    }

    private void a(View view, CaptureMessage capturemessage)
    {
        int j1;
        int k1;
        j1 = view.getWidth();
        k1 = view.getHeight();
        ((WindowManager)c.getSystemService("window")).getDefaultDisplay().getRotation();
        JVM INSTR tableswitch 0 2: default 60
    //                   0 127
    //                   1 132
    //                   2 138;
           goto _L1 _L2 _L3 _L4
_L1:
        int i1 = 90;
_L10:
        if (k >= 11) goto _L6; else goto _L5
_L5:
        if (CaptureMessage.KUIMessageOrientation.PORTRAIT == capturemessage.getOrientation())
        {
            capturemessage = new RotateAnimation(i1 + 0, i1 + 90, j1 / 2, k1 / 2);
        } else
        if (CaptureMessage.KUIMessageOrientation.LANDSCAPE == capturemessage.getOrientation())
        {
            capturemessage = new RotateAnimation(i1 + 90, i1 + 180, j1 / 2, k1 / 2);
        } else
        if (CaptureMessage.KUIMessageOrientation.REVERSEPORTRAIT == capturemessage.getOrientation())
        {
            capturemessage = new RotateAnimation(i1 + 180, i1 + 270, j1 / 2, k1 / 2);
        } else
        if (CaptureMessage.KUIMessageOrientation.REVERSELANDSCAPE == capturemessage.getOrientation())
        {
            capturemessage = new RotateAnimation(i1 + 270, i1 + 0, j1 / 2, k1 / 2);
        } else
        {
            capturemessage = null;
        }
        capturemessage.setDuration(100L);
        capturemessage.setFillAfter(true);
        view.startAnimation(capturemessage);
_L8:
        return;
_L2:
        i1 = 0;
        continue; /* Loop/switch isn't completed */
_L3:
        i1 = -90;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 180;
        continue; /* Loop/switch isn't completed */
_L6:
        view.setPivotX(j1 / 2);
        view.setPivotY(k1 / 2);
        if (CaptureMessage.KUIMessageOrientation.PORTRAIT == capturemessage.getOrientation())
        {
            view.setRotation((float)i1 + 0.0F);
            return;
        }
        if (CaptureMessage.KUIMessageOrientation.LANDSCAPE == capturemessage.getOrientation())
        {
            view.setRotation((float)i1 + 90F);
            return;
        }
        if (CaptureMessage.KUIMessageOrientation.REVERSEPORTRAIT == capturemessage.getOrientation())
        {
            view.setRotation((float)i1 + 180F);
            return;
        }
        if (CaptureMessage.KUIMessageOrientation.REVERSELANDSCAPE != capturemessage.getOrientation()) goto _L8; else goto _L7
_L7:
        view.setRotation((float)i1 + 270F);
        return;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private void b(Canvas canvas)
    {
        int j1 = -2;
        if (e == null)
        {
            e = new CaptureMessage();
            e.setOrientation(CaptureMessage.KUIMessageOrientation.LANDSCAPE);
        }
        if (e.getTextColor() == -11)
        {
            e.setTextColor(-1);
        }
        if (e.getBackgroundColor() == -11)
        {
            e.setBackgroundColor(0xffff0000);
        }
        if (e.getMessage() == null)
        {
            e.setMessage("You may be holding the device too near to or \ntoo far from the Document");
        }
        if (CaptureMessage.KUIMessageOrientation.UNKNOWN == e.getOrientation())
        {
            e.setOrientation(CaptureMessage.KUIMessageOrientation.LANDSCAPE);
        }
        canvas.save();
        LinearLayout linearlayout = new LinearLayout(c);
        TextView textview = new TextView(c);
        textview.setTextSize(18F);
        if (e.getVisibility())
        {
            textview.setVisibility(0);
        } else
        {
            textview.setVisibility(8);
        }
        textview.setTextColor(e.getTextColor());
        if (e.getTextSize() != -1)
        {
            textview.setTextSize(e.getTextSize());
        }
        textview.setText(e.getMessage());
        textview.setBackgroundColor(e.getBackgroundColor());
        textview.setSingleLine(false);
        if (e.getBackground() != null)
        {
            if (k < 16)
            {
                textview.setBackgroundDrawable(e.getBackground());
            } else
            {
                textview.setBackground(e.getBackground());
            }
        }
        if (e.getTypeface() != null)
        {
            textview.setTypeface(e.getTypeface());
        }
        if (e.getHeight() == 0 || e.getWidth() == 0)
        {
            textview.setVisibility(8);
        } else
        {
            int i1;
            if (e.getWidth() != -1)
            {
                i1 = e.getWidth();
            } else
            {
                i1 = -2;
            }
            if (e.getHeight() != -1)
            {
                j1 = e.getHeight();
            }
            textview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i1, j1, 1.0F));
        }
        textview.setGravity(17);
        textview.setPadding(l, l, l, l);
        linearlayout.addView(textview);
        linearlayout.measure(canvas.getWidth(), canvas.getHeight());
        linearlayout.layout(0, 0, canvas.getWidth(), canvas.getHeight());
        a(canvas, e, textview, 1);
        linearlayout.draw(canvas);
        canvas.restore();
    }

    private void c(Canvas canvas)
    {
        int j1 = -2;
        if (f == null)
        {
            f = new CaptureMessage();
            f.setOrientation(CaptureMessage.KUIMessageOrientation.LANDSCAPE);
        }
        if (f.getTextColor() == -11)
        {
            f.setTextColor(-1);
        }
        if (f.getBackgroundColor() == -11)
        {
            f.setBackgroundColor(0xffff0000);
        }
        if (f.getMessage() == null)
        {
            f.setMessage("Move Closer");
        }
        if (CaptureMessage.KUIMessageOrientation.UNKNOWN == f.getOrientation())
        {
            f.setOrientation(CaptureMessage.KUIMessageOrientation.LANDSCAPE);
        }
        canvas.save();
        LinearLayout linearlayout = new LinearLayout(c);
        TextView textview = new TextView(c);
        if (f.getVisibility())
        {
            textview.setVisibility(0);
        } else
        {
            textview.setVisibility(8);
        }
        textview.setTextColor(f.getTextColor());
        if (f.getTextSize() != -1)
        {
            textview.setTextSize(f.getTextSize());
        }
        textview.setText(f.getMessage());
        textview.setBackgroundColor(f.getBackgroundColor());
        textview.setSingleLine(false);
        if (f.getBackground() != null)
        {
            if (k < 16)
            {
                textview.setBackgroundDrawable(f.getBackground());
            } else
            {
                textview.setBackground(f.getBackground());
            }
        }
        if (f.getTypeface() != null)
        {
            textview.setTypeface(f.getTypeface());
        }
        if (f.getHeight() == 0 || f.getWidth() == 0)
        {
            textview.setVisibility(8);
        } else
        {
            int i1;
            if (f.getWidth() != -1)
            {
                i1 = f.getWidth();
            } else
            {
                i1 = -2;
            }
            if (f.getHeight() != -1)
            {
                j1 = f.getHeight();
            }
            textview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i1, j1, 1.0F));
        }
        textview.setGravity(17);
        textview.setPadding(l, l, l, l);
        linearlayout.addView(textview);
        linearlayout.measure(canvas.getWidth(), canvas.getHeight());
        linearlayout.layout(0, 0, canvas.getWidth(), canvas.getHeight());
        a(canvas, f, textview, 2);
        linearlayout.draw(canvas);
        canvas.restore();
    }

    private void d(Canvas canvas)
    {
        int j1 = -2;
        if (g == null)
        {
            g = new CaptureMessage();
            g.setOrientation(CaptureMessage.KUIMessageOrientation.LANDSCAPE);
        }
        if (g.getTextColor() == -11)
        {
            g.setTextColor(-1);
        }
        if (g.getBackgroundColor() == -11)
        {
            g.setBackgroundColor(0xffff0000);
        }
        if (g.getMessage() == null)
        {
            g.setMessage("Hold Steady To Capture");
        }
        if (CaptureMessage.KUIMessageOrientation.UNKNOWN == g.getOrientation())
        {
            g.setOrientation(CaptureMessage.KUIMessageOrientation.LANDSCAPE);
        }
        canvas.save();
        LinearLayout linearlayout = new LinearLayout(c);
        TextView textview = new TextView(c);
        if (g.getVisibility())
        {
            textview.setVisibility(0);
        } else
        {
            textview.setVisibility(8);
        }
        textview.setTextColor(g.getTextColor());
        if (g.getTextSize() != -1)
        {
            textview.setTextSize(g.getTextSize());
        }
        textview.setText(g.getMessage());
        textview.setBackgroundColor(g.getBackgroundColor());
        textview.setSingleLine(false);
        if (g.getBackground() != null)
        {
            if (k < 16)
            {
                textview.setBackgroundDrawable(g.getBackground());
            } else
            {
                textview.setBackground(g.getBackground());
            }
        }
        if (g.getTypeface() != null)
        {
            textview.setTypeface(g.getTypeface());
        }
        if (g.getHeight() == 0 || g.getWidth() == 0)
        {
            textview.setVisibility(8);
        } else
        {
            int i1;
            if (g.getWidth() != -1)
            {
                i1 = g.getWidth();
            } else
            {
                i1 = -2;
            }
            if (g.getHeight() != -1)
            {
                j1 = g.getHeight();
            }
            textview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i1, j1, 1.0F));
        }
        textview.setGravity(17);
        textview.setPadding(l, l, l, l);
        linearlayout.addView(textview);
        linearlayout.measure(canvas.getWidth(), canvas.getHeight());
        linearlayout.layout(0, 0, canvas.getWidth(), canvas.getHeight());
        a(canvas, g, textview, 2);
        linearlayout.draw(canvas);
        canvas.restore();
    }

    private void e(Canvas canvas)
    {
        int j1 = -2;
        if (h == null)
        {
            h = new CaptureMessage();
            h.setOrientation(CaptureMessage.KUIMessageOrientation.PORTRAIT);
        }
        if (h.getTextColor() == -11)
        {
            h.setTextColor(-1);
        }
        if (h.getBackgroundColor() == -11)
        {
            h.setBackgroundColor(0xffff0000);
        }
        if (h.getMessage() == null)
        {
            h.setMessage("Improper Device Orientation");
        }
        if (CaptureMessage.KUIMessageOrientation.UNKNOWN == h.getOrientation())
        {
            h.setOrientation(CaptureMessage.KUIMessageOrientation.PORTRAIT);
        }
        canvas.save();
        LinearLayout linearlayout = new LinearLayout(c);
        TextView textview = new TextView(c);
        if (h.getVisibility())
        {
            textview.setVisibility(0);
        } else
        {
            textview.setVisibility(8);
        }
        textview.setTextColor(h.getTextColor());
        if (h.getTextSize() != -1)
        {
            textview.setTextSize(h.getTextSize());
        }
        textview.setText(h.getMessage());
        textview.setBackgroundColor(h.getBackgroundColor());
        textview.setSingleLine(false);
        if (h.getBackground() != null)
        {
            if (k < 16)
            {
                textview.setBackgroundDrawable(h.getBackground());
            } else
            {
                textview.setBackground(h.getBackground());
            }
        }
        if (h.getTypeface() != null)
        {
            textview.setTypeface(h.getTypeface());
        }
        if (h.getHeight() == 0 || h.getWidth() == 0)
        {
            textview.setVisibility(8);
        } else
        {
            int i1;
            if (h.getWidth() != -1)
            {
                i1 = h.getWidth();
            } else
            {
                i1 = -2;
            }
            if (h.getHeight() != -1)
            {
                j1 = h.getHeight();
            }
            textview.setLayoutParams(new android.widget.LinearLayout.LayoutParams(i1, j1, 1.0F));
        }
        textview.setGravity(17);
        textview.setPadding(l, l, l, l);
        linearlayout.addView(textview);
        linearlayout.measure(canvas.getWidth(), canvas.getHeight());
        linearlayout.layout(0, 0, canvas.getWidth(), canvas.getHeight());
        a(canvas, h, textview, 0);
        linearlayout.draw(canvas);
        canvas.restore();
    }

    public CaptureMessage a()
    {
        return d;
    }

    void a(Canvas canvas, CaptureMessage capturemessage, View view, int i1)
    {
        int j1;
        int k1;
        j1 = view.getWidth();
        k1 = view.getHeight();
        if (capturemessage.getTextPosX() == -1 || capturemessage.getTextPosY() == -1) goto _L2; else goto _L1
_L1:
        canvas.translate(capturemessage.getTextPosX(), capturemessage.getTextPosY());
_L4:
        a(view, capturemessage);
        return;
_L2:
        switch (i1)
        {
        default:
            canvas.translate((n.left + n.right) / 2 - j1 / 2, (n.top + n.bottom) / 2 - k1 / 2);
            break;

        case 0: // '\0'
            canvas.translate((n.left + n.right) / 2 - j1 / 2, (n.top + n.bottom) / 4 - k1 / 2);
            break;

        case 1: // '\001'
            canvas.translate(((n.left + n.right) - j1) / 2, ((n.top + n.bottom) - k1) / 2);
            break;

        case 2: // '\002'
            canvas.translate((n.left + n.right) / 4 - j1 / 2, (n.top + n.bottom) / 2 - k1 / 2);
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(CaptureMessage capturemessage)
    {
        d = capturemessage;
    }

    void a(a a1)
    {
    }

    public void a(a a1, CaptureExperienceCriteria captureexperiencecriteria)
    {
        i = a1;
        j = captureexperiencecriteria;
    }

    public CaptureMessage b()
    {
        return e;
    }

    public void b(CaptureMessage capturemessage)
    {
        e = capturemessage;
    }

    public CaptureMessage c()
    {
        return f;
    }

    public void c(CaptureMessage capturemessage)
    {
        f = capturemessage;
    }

    public CaptureMessage d()
    {
        return g;
    }

    public void d(CaptureMessage capturemessage)
    {
        g = capturemessage;
    }

    public CaptureMessage e()
    {
        return h;
    }

    public void e(CaptureMessage capturemessage)
    {
        h = capturemessage;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        i = null;
    }

    protected void onDraw(Canvas canvas)
    {
        boolean flag7;
        flag7 = false;
        n = m.getFrameBounds();
        break MISSING_BLOCK_LABEL_14;
        while (true) 
        {
            do
            {
                return;
            } while (n != null && n.left == 0 && n.right == 0 && n.top == 0 && n.bottom == 0 || i == null);
            boolean flag;
            boolean flag1;
label0:
            {
                if (!i.j())
                {
                    a(canvas);
                }
                CheckDetectionResult checkdetectionresult;
                boolean flag2;
                boolean flag3;
                boolean flag4;
                boolean flag5;
                boolean flag6;
                if (!j.isPitchThresholdEnabled() || i.b() <= j.getPitchThreshold())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!j.isRollThresholdEnabled() || i.c() <= j.getRollThreshold())
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (i.f() || !j.isPageDetectionEnabled() || i.e())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (i.f() || flag1 && !j.isPageAreaThresholdEnabled() || i.k() >= j.getPageAreaThreshold())
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                if (i.f() || flag1 && !j.isPageLongEdgeThresholdEnabled() || i.l() >= j.getPageLongEdgeThreshold())
                {
                    flag4 = true;
                } else
                {
                    flag4 = false;
                }
                if (i.f() || flag1 && !j.isPageShortEdgeThresholdEnabled() || i.m() >= j.getPageShortEdgeThreshold())
                {
                    flag5 = true;
                } else
                {
                    flag5 = false;
                }
                checkdetectionresult = i.h();
                if (!i.f() || i.g() && checkdetectionresult != null && checkdetectionresult.getHorizontalMovementGuidance() == HorizontalGuidance.HORIZONTAL_MOVE_OK && checkdetectionresult.getTurnGuidance() == TurnGuidance.TURN_OK && checkdetectionresult.getVerticalMovementGuidance() == VerticalGuidance.VERTICAL_MOVE_OK && checkdetectionresult.getZoomGuidance() == ZoomGuidance.ZOOM_OK)
                {
                    flag6 = true;
                } else
                {
                    flag6 = false;
                }
                if (flag && flag2 && flag4 && flag5 && flag3 && flag6)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag1)
                {
                    flag1 = flag7;
                    if (!flag3)
                    {
                        break label0;
                    }
                    flag1 = flag7;
                    if (!flag4)
                    {
                        break label0;
                    }
                    flag1 = flag7;
                    if (!flag5)
                    {
                        break label0;
                    }
                }
                flag1 = true;
            }
            if (!i.o())
            {
                e(canvas);
                return;
            }
            if (flag)
            {
                d(canvas);
                return;
            }
            if (!flag1)
            {
                c(canvas);
                return;
            }
            if (i.j())
            {
                b(canvas);
                return;
            }
        }
    }

    private class _cls1
        implements Runnable
    {

        final b a;

        public void run()
        {
            a.invalidate();
            b.a(a).postDelayed(this, 50L);
        }

        _cls1()
        {
            a = b.this;
            super();
        }
    }

}
