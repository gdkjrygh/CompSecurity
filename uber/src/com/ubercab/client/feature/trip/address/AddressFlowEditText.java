// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Handler;
import android.support.v4.view.animation.FastOutSlowInInterpolator;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import bu;
import butterknife.ButterKnife;
import chm;
import com.ubercab.client.feature.search.LocationSearchEditText;
import com.ubercab.ui.TextView;
import ftk;
import ftl;
import ftu;
import hpb;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AddressFlowEditText extends FrameLayout
{

    private final hpb A;
    private final Runnable B;
    private final Handler C;
    private final int a;
    private final Context b;
    private final Interpolator c;
    private final Set d;
    private final Set e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    LocationSearchEditText mAddressEditText;
    TextView mAddressTextView;
    ImageView mArrowView;
    ImageView mClearButton;
    View mDarkenOverlayView;
    ImageView mIconView;
    ViewGroup mTextContainer;
    private int n;
    private int o;
    private int p;
    private int q;
    private int r;
    private float s;
    private float t;
    private ftu u;
    private ViewPropertyAnimator v;
    private ViewPropertyAnimator w;
    private ValueAnimator x;
    private ValueAnimator y;
    private bu z;

    public AddressFlowEditText(Context context)
    {
        this(context, null);
    }

    public AddressFlowEditText(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AddressFlowEditText(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = new FastOutSlowInInterpolator();
        d = new HashSet();
        e = new HashSet();
        l = -1;
        m = -1;
        n = 1;
        s = 0.0F;
        t = 1.0F;
        b = context;
        LayoutInflater.from(context).inflate(0x7f030032, this);
        attributeset = context.obtainStyledAttributes(attributeset, chm.AddressFlowEditText);
        if (attributeset != null)
        {
            o = attributeset.getResourceId(0, -1);
            p = attributeset.getResourceId(1, -1);
            q = attributeset.getResourceId(2, -1);
            r = attributeset.getResourceId(3, -1);
            attributeset.recycle();
        }
        if (o == -1 || p == -1)
        {
            throw new IllegalArgumentException("You must define both a standalone and both background resource.");
        }
        if (q == -1)
        {
            throw new IllegalStateException("An icon must be defined in the xml.");
        }
        if (r == -1)
        {
            throw new IllegalStateException("An overlay must be defined in the xml.");
        } else
        {
            a = context.getResources().getInteger(0x7f0b0008);
            C = new Handler();
            B = new Runnable() {

                final AddressFlowEditText a;

                public final void run()
                {
                    AddressFlowEditText.a(a);
                }

            
            {
                a = AddressFlowEditText.this;
                super();
            }
            };
            A = new hpb() {

                final AddressFlowEditText a;

                public final void afterTextChanged(Editable editable)
                {
                    AddressFlowEditText.c(a).removeCallbacks(AddressFlowEditText.b(a));
                    AddressFlowEditText.c(a).postDelayed(AddressFlowEditText.b(a), 250L);
                    AddressFlowEditText.d(a);
                }

            
            {
                a = AddressFlowEditText.this;
                super();
            }
            };
            return;
        }
    }

    static float a(AddressFlowEditText addressflowedittext, float f1)
    {
        addressflowedittext.s = f1;
        return f1;
    }

    private void a()
    {
        mAddressEditText.addTextChangedListener(A);
        mAddressEditText.setOnEditorActionListener(new android.widget.TextView.OnEditorActionListener() {

            final AddressFlowEditText a;

            public final boolean onEditorAction(android.widget.TextView textview, int i1, KeyEvent keyevent)
            {
                boolean flag1 = false;
                boolean flag;
                if (keyevent != null && keyevent.getKeyCode() == 66 && keyevent.getAction() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (i1 == 3 || flag)
                {
                    AddressFlowEditText.e(a);
                    flag1 = true;
                }
                return flag1;
            }

            
            {
                a = AddressFlowEditText.this;
                super();
            }
        });
    }

    private void a(int i1, boolean flag)
    {
        if (m == i1)
        {
            return;
        }
        m = i1;
        if (m != 0)
        {
            b();
        }
        Object obj;
        boolean flag1;
        if (m != 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        setEnabled(flag1);
        obj = mTextContainer;
        if (m == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((ViewGroup) (obj)).setClickable(flag1);
        obj = mArrowView;
        if (m == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((ImageView) (obj)).setClickable(flag1);
        if (x != null)
        {
            x.cancel();
        }
        if (m == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (flag)
        {
            if (x == null)
            {
                x = ValueAnimator.ofFloat(new float[] {
                    s, (float)i1
                });
                x.setDuration(a);
                x.setInterpolator(c);
                x.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                    final AddressFlowEditText a;

                    public final void onAnimationUpdate(ValueAnimator valueanimator)
                    {
                        AddressFlowEditText.a(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
                        AddressFlowEditText.f(a);
                    }

            
            {
                a = AddressFlowEditText.this;
                super();
            }
                });
            } else
            {
                x.setFloatValues(new float[] {
                    s, (float)i1
                });
            }
            x.start();
            return;
        } else
        {
            s = i1;
            c();
            return;
        }
    }

    static void a(AddressFlowEditText addressflowedittext)
    {
        addressflowedittext.h();
    }

    private void a(boolean flag, boolean flag1)
    {
        int j1 = 0;
        if (f == flag)
        {
            return;
        }
        f = flag;
        if (w != null)
        {
            w.cancel();
        }
        int i1;
        if (f)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (flag1)
        {
            if (w == null)
            {
                w = mDarkenOverlayView.animate().setDuration(a).setInterpolator(c).alpha(i1).setListener(new AnimatorListenerAdapter() {

                    final AddressFlowEditText a;

                    public final void onAnimationEnd(Animator animator)
                    {
                        if (!AddressFlowEditText.h(a))
                        {
                            a.mDarkenOverlayView.setVisibility(8);
                        }
                    }

                    public final void onAnimationStart(Animator animator)
                    {
                        if (AddressFlowEditText.h(a))
                        {
                            a.mDarkenOverlayView.setVisibility(0);
                        }
                    }

            
            {
                a = AddressFlowEditText.this;
                super();
            }
                });
            } else
            {
                w.alpha(i1);
            }
            w.start();
            return;
        }
        View view = mDarkenOverlayView;
        if (i1 <= 0)
        {
            j1 = 8;
        }
        view.setVisibility(j1);
        mDarkenOverlayView.setAlpha(i1);
    }

    static float b(AddressFlowEditText addressflowedittext, float f1)
    {
        addressflowedittext.t = f1;
        return f1;
    }

    static Runnable b(AddressFlowEditText addressflowedittext)
    {
        return addressflowedittext.B;
    }

    private void b()
    {
        Object obj = "";
        String s2 = "";
        String s1 = "";
        if (u != null)
        {
            obj = u.b();
            s2 = u.c();
            s1 = u.d();
        }
        mAddressTextView.setText(((CharSequence) (obj)));
        TextView textview = mAddressTextView;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = s1;
        } else
        {
            obj = null;
        }
        textview.setHint(((CharSequence) (obj)));
        if (m != 0)
        {
            mAddressEditText.setText(s2);
            obj = mAddressEditText;
            if (!TextUtils.isEmpty(s2))
            {
                s1 = null;
            }
            ((LocationSearchEditText) (obj)).setHint(s1);
        }
    }

    private void b(int i1, boolean flag)
    {
        if (n == i1)
        {
            return;
        }
        n = i1;
        if (y != null)
        {
            y.cancel();
        }
        if (n == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (flag)
        {
            if (y == null)
            {
                y = ValueAnimator.ofFloat(new float[] {
                    t, (float)i1
                });
                y.setDuration(a);
                y.setInterpolator(c);
                y.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                    final AddressFlowEditText a;

                    public final void onAnimationUpdate(ValueAnimator valueanimator)
                    {
                        AddressFlowEditText.b(a, ((Float)valueanimator.getAnimatedValue()).floatValue());
                        AddressFlowEditText.g(a);
                    }

            
            {
                a = AddressFlowEditText.this;
                super();
            }
                });
            } else
            {
                y.setFloatValues(new float[] {
                    t, (float)i1
                });
            }
            y.start();
            return;
        } else
        {
            t = i1;
            d();
            return;
        }
    }

    static Handler c(AddressFlowEditText addressflowedittext)
    {
        return addressflowedittext.C;
    }

    private void c()
    {
        byte byte1 = 8;
        z.b(s);
        mArrowView.setScaleX(s);
        mArrowView.setScaleY(s);
        mArrowView.setAlpha(s);
        Object obj = mArrowView;
        byte byte0;
        int i1;
        if (s == 0.0F)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((ImageView) (obj)).setVisibility(byte0);
        mIconView.setScaleX(1.0F - s);
        mIconView.setScaleY(1.0F - s);
        mIconView.setAlpha(1.0F - s);
        obj = mIconView;
        if (1.0F - s == 0.0F)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        ((ImageView) (obj)).setVisibility(byte0);
        mAddressEditText.setAlpha(s);
        if (s == 0.0F)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        i1 = mAddressEditText.getVisibility();
        mAddressEditText.setVisibility(byte0);
        if (g && byte0 == 0 && i1 != 0)
        {
            e();
        }
        mAddressTextView.setAlpha(1.0F - s);
        obj = mAddressTextView;
        if (1.0F - s == 0.0F)
        {
            byte0 = byte1;
        } else
        {
            byte0 = 0;
        }
        ((TextView) (obj)).setVisibility(byte0);
    }

    private void d()
    {
        int i1 = mTextContainer.getMeasuredWidth();
        if (i1 == 0)
        {
            return;
        } else
        {
            mAddressTextView.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000), 0);
            int j1 = mAddressTextView.getMeasuredWidth();
            float f1 = t;
            f1 = ((float)(i1 - j1) * f1) / 2.0F;
            mAddressTextView.setTranslationX(f1);
            mAddressEditText.setTranslationX(f1);
            return;
        }
    }

    static void d(AddressFlowEditText addressflowedittext)
    {
        addressflowedittext.h(true);
    }

    private void e()
    {
        mAddressEditText.requestFocus();
        mAddressEditText.a();
        ((InputMethodManager)getContext().getSystemService("input_method")).showSoftInput(mAddressEditText, 1);
    }

    static void e(AddressFlowEditText addressflowedittext)
    {
        addressflowedittext.i();
    }

    private void f()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((ftk)iterator.next()).a()) { }
    }

    static void f(AddressFlowEditText addressflowedittext)
    {
        addressflowedittext.c();
    }

    private void g()
    {
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((ftk)iterator.next()).b()) { }
    }

    static void g(AddressFlowEditText addressflowedittext)
    {
        addressflowedittext.d();
    }

    private void h()
    {
        if (m == 0)
        {
            Iterator iterator = e.iterator();
            while (iterator.hasNext()) 
            {
                iterator.next();
                mAddressEditText.getText().toString();
            }
        }
    }

    private void h(boolean flag)
    {
        int i1 = 1;
        boolean flag1 = false;
        ImageView imageview = mClearButton;
        boolean flag2;
        if (m != 2)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        imageview.setClickable(flag2);
        if (u == null)
        {
            flag2 = false;
        } else
        if (m == 0)
        {
            if (!TextUtils.isEmpty(mAddressEditText.getText().toString().trim()))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
        } else
        {
            flag2 = j;
        }
        if (k == flag2)
        {
            return;
        }
        k = flag2;
        if (!k)
        {
            i1 = 0;
        }
        if (v != null)
        {
            v.cancel();
        }
        if (flag)
        {
            if (v == null)
            {
                v = mClearButton.animate().scaleX(i1).scaleY(i1).setDuration(a).setInterpolator(c).setListener(new AnimatorListenerAdapter() {

                    final AddressFlowEditText a;

                    public final void onAnimationEnd(Animator animator)
                    {
                        if (!AddressFlowEditText.i(a))
                        {
                            a.mClearButton.setVisibility(8);
                        }
                    }

                    public final void onAnimationStart(Animator animator)
                    {
                        if (AddressFlowEditText.i(a))
                        {
                            a.mClearButton.setVisibility(0);
                        }
                    }

            
            {
                a = AddressFlowEditText.this;
                super();
            }
                });
            } else
            {
                v.scaleX(i1).scaleY(i1);
            }
            v.start();
            return;
        }
        mClearButton.setScaleX(i1);
        mClearButton.setScaleY(i1);
        imageview = mClearButton;
        if (k)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        imageview.setVisibility(i1);
    }

    static boolean h(AddressFlowEditText addressflowedittext)
    {
        return addressflowedittext.f;
    }

    private void i()
    {
        if (m == 0)
        {
            Iterator iterator = e.iterator();
            while (iterator.hasNext()) 
            {
                iterator.next();
                mAddressEditText.getText().toString();
            }
        }
    }

    static boolean i(AddressFlowEditText addressflowedittext)
    {
        return addressflowedittext.k;
    }

    public final void a(int i1)
    {
        a(i1, false);
        h(false);
    }

    public final void a(ftk ftk1)
    {
        d.add(ftk1);
    }

    public final void a(ftl ftl)
    {
        e.add(ftl);
    }

    public final void a(ftu ftu1)
    {
        u = ftu1;
        b();
        d();
    }

    public final void a(boolean flag)
    {
        i = flag;
    }

    public final void b(int i1)
    {
        a(i1, true);
        h(true);
    }

    public final void b(boolean flag)
    {
        h = flag;
    }

    public final void c(int i1)
    {
        b(i1, false);
    }

    public final void c(boolean flag)
    {
        g = flag;
    }

    public final void d(int i1)
    {
        b(i1, true);
    }

    public final void d(boolean flag)
    {
        a(flag, false);
    }

    public final void e(int i1)
    {
        if (l == i1)
        {
            return;
        }
        l = i1;
        if (i1 == 0)
        {
            setBackgroundResource(o);
            return;
        } else
        {
            setBackgroundResource(p);
            return;
        }
    }

    public final void e(boolean flag)
    {
        a(flag, true);
    }

    public final void f(boolean flag)
    {
        j = flag;
        h(false);
    }

    public final void g(boolean flag)
    {
        j = flag;
        h(true);
    }

    public void onArrowClick()
    {
        f();
    }

    public void onClearClick()
    {
        if (m == 0 && !TextUtils.isEmpty(mAddressEditText.getText().toString().trim()))
        {
            mAddressEditText.setText("");
            LocationSearchEditText locationsearchedittext = mAddressEditText;
            String s1;
            if (u != null)
            {
                s1 = u.d();
            } else
            {
                s1 = null;
            }
            locationsearchedittext.setHint(s1);
            h(true);
            i();
            return;
        } else
        {
            g();
            return;
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        C.removeCallbacks(B);
        mAddressEditText.removeTextChangedListener(A);
        mAddressEditText.setOnEditorActionListener(null);
        mAddressEditText.setOnFocusChangeListener(null);
        e.clear();
        d.clear();
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        if (!isInEditMode())
        {
            ButterKnife.inject(this);
        }
        mIconView.setImageResource(q);
        z = new bu(b);
        mArrowView.setImageDrawable(z);
        mDarkenOverlayView.setBackgroundResource(r);
        a();
        c();
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        d();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (motionevent.getActionMasked() == 0)
        {
            Rect rect = new Rect(getLeft(), getTop(), getRight(), getBottom());
            if (!i)
            {
                rect.top = rect.top + getPaddingTop();
            }
            if (!h)
            {
                rect.bottom = rect.bottom - getPaddingBottom();
            }
            float f1 = motionevent.getX();
            float f2 = getLeft();
            float f3 = motionevent.getY();
            float f4 = getTop();
            if (rect.contains((int)(f1 + f2), (int)(f3 + f4)))
            {
                if (m == 0)
                {
                    e();
                    return true;
                } else
                {
                    return super.onTouchEvent(motionevent);
                }
            } else
            {
                return false;
            }
        } else
        {
            return super.onTouchEvent(motionevent);
        }
    }
}
