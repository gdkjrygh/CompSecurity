// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import gju;
import gjz;
import hom;
import hon;
import hoo;
import hop;
import hoq;
import hos;
import hou;
import hox;
import hrs;
import hse;
import hsf;
import hsk;
import java.util.Arrays;

// Referenced classes of package com.ubercab.ui:
//            TextView

public abstract class FloatingLabelElement extends LinearLayout
    implements hse, hsf, hsk
{

    private static final int c[];
    int a;
    int b;
    private final TextView d;
    private final com.ubercab.ui.TextView e;
    private final View f;
    private final com.ubercab.ui.TextView g;
    private final hsk h;
    private final gju i;
    private AnimatorSet j;
    private CharSequence k;
    private android.view.View.OnFocusChangeListener l;
    private hon m;
    private boolean n;
    private long o;

    public FloatingLabelElement(Context context)
    {
        this(context, null);
    }

    public FloatingLabelElement(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, hos.floatingLabelStyle);
    }

    public FloatingLabelElement(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        i = new gju();
        m = new hon(hoo.c, null, null, null, true, false, (byte)0);
        n = false;
        o = 0L;
        setOrientation(1);
        TypedArray typedarray = context.getTheme().obtainStyledAttributes(attributeset, hox.FloatingLabelEditText, i1, 0);
        attributeset = a(context);
        gjz.a(attributeset);
        d = attributeset.c();
        f = attributeset.b();
        h = attributeset.a();
        gjz.a(h);
        gjz.a(d);
        gjz.a(f);
        e = new com.ubercab.ui.TextView(context);
        g = new com.ubercab.ui.TextView(context);
        d.setIncludeFontPadding(false);
        e.setIncludeFontPadding(false);
        g.setIncludeFontPadding(false);
        int i2 = typedarray.getIndexCount();
        Drawable drawable = null;
        attributeset = null;
        boolean flag1 = false;
        boolean flag = true;
        int j1 = 0;
        i1 = 0;
        while (i1 < i2) 
        {
            int j2 = typedarray.getIndex(i1);
            Drawable drawable1;
            Object obj;
            int l1;
            boolean flag2;
            boolean flag3;
            if (j2 == hox.FloatingLabelEditText_floatingLabelEditTextAppearance)
            {
                a(d, typedarray.getResourceId(hox.FloatingLabelEditText_floatingLabelEditTextAppearance, -1));
                l1 = j1;
                flag3 = flag;
                flag2 = flag1;
                obj = attributeset;
                drawable1 = drawable;
            } else
            if (j2 == hox.FloatingLabelEditText_floatingLabelLabelTextAppearance)
            {
                a(e, typedarray.getResourceId(hox.FloatingLabelEditText_floatingLabelLabelTextAppearance, -1));
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_floatingLabelSubTextAppearance)
            {
                a(g, typedarray.getResourceId(hox.FloatingLabelEditText_floatingLabelSubTextAppearance, -1));
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_floatingLabelErrorTextColor)
            {
                a = typedarray.getColor(hox.FloatingLabelEditText_floatingLabelErrorTextColor, -1);
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_floatingLabelInfoTextColor)
            {
                b = typedarray.getColor(hox.FloatingLabelEditText_floatingLabelInfoTextColor, -1);
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_floatingLabelEditTextHintColor)
            {
                d.setHintTextColor(typedarray.getColor(hox.FloatingLabelEditText_floatingLabelEditTextHintColor, -1));
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_floatingLabelEditTextBackground)
            {
                f.setBackgroundResource(typedarray.getResourceId(hox.FloatingLabelEditText_floatingLabelEditTextBackground, -1));
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_state_error_highlight)
            {
                flag2 = typedarray.getBoolean(hox.FloatingLabelEditText_state_error_highlight, false);
                drawable1 = drawable;
                obj = attributeset;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_floatingLabelHintText)
            {
                e(typedarray.getString(hox.FloatingLabelEditText_floatingLabelHintText));
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_floatingLabelStartingText)
            {
                d(typedarray.getString(hox.FloatingLabelEditText_floatingLabelStartingText));
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_floatingLabelLabelText)
            {
                c(typedarray.getString(hox.FloatingLabelEditText_floatingLabelLabelText));
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_android_imeOptions)
            {
                d(typedarray.getInt(hox.FloatingLabelEditText_android_imeOptions, -1));
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_android_nextFocusForward)
            {
                d.setNextFocusForwardId(typedarray.getResourceId(hox.FloatingLabelEditText_android_nextFocusForward, -1));
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_android_nextFocusDown)
            {
                d.setNextFocusDownId(typedarray.getResourceId(hox.FloatingLabelEditText_android_nextFocusDown, -1));
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_android_nextFocusUp)
            {
                d.setNextFocusUpId(typedarray.getResourceId(hox.FloatingLabelEditText_android_nextFocusUp, -1));
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_android_nextFocusLeft)
            {
                d.setNextFocusLeftId(typedarray.getResourceId(hox.FloatingLabelEditText_android_nextFocusLeft, -1));
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_android_nextFocusRight)
            {
                d.setNextFocusRightId(typedarray.getResourceId(hox.FloatingLabelEditText_android_nextFocusRight, -1));
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_android_singleLine)
            {
                d.setSingleLine(typedarray.getBoolean(hox.FloatingLabelEditText_android_singleLine, false));
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_android_maxLines)
            {
                d.setMaxLines(typedarray.getInteger(hox.FloatingLabelEditText_android_maxLines, 1));
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_android_inputType)
            {
                d.setInputType(typedarray.getInt(j2, 0));
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_android_enabled)
            {
                flag3 = typedarray.getBoolean(hox.FloatingLabelEditText_android_enabled, true);
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_android_maxLength)
            {
                j2 = typedarray.getInt(hox.FloatingLabelEditText_android_maxLength, -1);
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
                if (j2 >= 0)
                {
                    b(j2);
                    drawable1 = drawable;
                    obj = attributeset;
                    flag2 = flag1;
                    flag3 = flag;
                    l1 = j1;
                }
            } else
            if (j2 == hox.FloatingLabelEditText_floatingLabelLabelDrawableStart)
            {
                obj = typedarray.getDrawable(j2);
                drawable1 = drawable;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            if (j2 == hox.FloatingLabelEditText_floatingLabelLabelDrawableEnd)
            {
                drawable1 = typedarray.getDrawable(j2);
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
            } else
            {
                drawable1 = drawable;
                obj = attributeset;
                flag2 = flag1;
                flag3 = flag;
                l1 = j1;
                if (j2 == hox.FloatingLabelEditText_floatingLabelLabelDrawablePadding)
                {
                    l1 = typedarray.getDimensionPixelSize(j2, 0);
                    drawable1 = drawable;
                    obj = attributeset;
                    flag2 = flag1;
                    flag3 = flag;
                }
            }
            i1++;
            drawable = drawable1;
            attributeset = ((AttributeSet) (obj));
            flag1 = flag2;
            flag = flag3;
            j1 = l1;
        }
        a(attributeset, drawable);
        a(j1);
        if (typedarray.hasValue(hox.FloatingLabelEditText_android_imeActionLabel))
        {
            i1 = 0;
            if (d.getImeOptions() != 0)
            {
                i1 = d.getImeOptions();
            }
            int k1 = i1;
            if (typedarray.hasValue(hox.FloatingLabelEditText_android_imeActionId))
            {
                k1 = typedarray.getInt(hox.FloatingLabelEditText_android_imeActionId, i1);
            }
            d.setImeActionLabel(typedarray.getText(hox.FloatingLabelEditText_android_imeActionLabel), k1);
        }
        typedarray.recycle();
        d.setOnFocusChangeListener(new _cls1());
        super.setOnFocusChangeListener(new _cls2());
        d.addTextChangedListener(new hom(this, (byte)0));
        g.setTextColor(b);
        g.setMaxLines(2);
        g.setEllipsize(android.text.TextUtils.TruncateAt.END);
        g.setVisibility(8);
        a(((CharSequence) (null)));
        e.setAllCaps(true);
        context = new Space(context);
        i1 = getResources().getDimensionPixelSize(hou.ui__spacing_unit_1x);
        f.setPadding(0, i1, 0, i1);
        e.setPadding(0, i1, 0, 0);
        g.setPadding(0, 0, 0, (int)((float)i1 * 0.5F));
        attributeset = new android.widget.LinearLayout.LayoutParams(-2, -2);
        addView(e, attributeset);
        addView(f);
        m();
        addView(context, 1, i1);
        addView(g, attributeset);
        a(a(d(), flag1));
        if (!n)
        {
            setEnabled(flag);
        }
        n = true;
    }

    static com.ubercab.ui.TextView a(FloatingLabelElement floatinglabelelement)
    {
        return floatinglabelelement.e;
    }

    private static hon a(hon hon1, CharSequence charsequence, CharSequence charsequence1)
    {
        if (a(hon1.d(), charsequence) && a(hon1.c(), charsequence1))
        {
            return hon1;
        }
        hoo hoo1;
        CharSequence charsequence2;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (!TextUtils.isEmpty(charsequence))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hoo1 = hon1.a();
        charsequence2 = hon1.e();
        flag2 = hon1.f();
        if (flag || hon1.j())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        return new hon(hoo1, charsequence, charsequence1, charsequence2, flag2, flag1, (byte)0);
    }

    private static hon a(hon hon1, boolean flag)
    {
        if (hon1.j() == flag)
        {
            return hon1;
        } else
        {
            return new hon(hon1.a(), hon1.d(), hon1.c(), hon1.e(), hon1.f(), flag, (byte)0);
        }
    }

    private void a(InputFilter inputfilter)
    {
        InputFilter ainputfilter[] = d.getFilters();
        if (ainputfilter == null)
        {
            ainputfilter = new InputFilter[1];
            ainputfilter[0] = inputfilter;
            inputfilter = ainputfilter;
        } else
        {
            ainputfilter = (InputFilter[])Arrays.copyOf(ainputfilter, ainputfilter.length + 1);
            ainputfilter[ainputfilter.length - 1] = inputfilter;
            inputfilter = ainputfilter;
        }
        d.setFilters(inputfilter);
    }

    private void a(TextView textview, int i1)
    {
        if (i1 > 0)
        {
            textview.setTextAppearance(getContext(), i1);
            TypedArray typedarray = getContext().obtainStyledAttributes(i1, c);
            i1 = typedarray.getResourceId(0, 0);
            if (i1 > 0 && !isInEditMode())
            {
                textview.setTypeface(hoq.a(getContext(), i1));
            }
            typedarray.recycle();
        }
    }

    static void a(FloatingLabelElement floatinglabelelement, hon hon1)
    {
        floatinglabelelement.a(hon1);
    }

    private void a(hon hon1)
    {
        if (hon1.equals(m) && n)
        {
            return;
        }
        if (!m.b().equals(hon1.b()) || !n)
        {
            g.setVisibility(hon1.i());
        }
        if (!m.a().equals(hoo.a) && hon1.a().equals(hoo.a) && n)
        {
            k();
        } else
        if (m.a().equals(hoo.a) && hon1.a().equals(hoo.b))
        {
            l();
        }
        if (!m.a().equals(hon1.a()) || !n)
        {
            e.setVisibility(hon1.h());
        }
        if (hon1.a().equals(hoo.b) && !m.a().equals(hoo.b) && hon1.f())
        {
            if (hon1.g())
            {
                d.setHint(k);
            } else
            {
                d.setHint(e.getText());
            }
        } else
        if (hon1.a().equals(hoo.a) && !m.a().equals(hoo.a))
        {
            d.setHint(null);
        } else
        if (hon1.g() && !m.g())
        {
            d.setHint(k);
        } else
        if (hon1.g() && !a(m.e(), hon1.e()))
        {
            d.setHint(k);
        } else
        if (!hon1.g() && m.g() && !hon1.a().equals(hoo.a))
        {
            d.setHint(e.getText());
        }
        if (!a(m.c(), hon1.c()) || !a(m.d(), hon1.d()))
        {
            if (!TextUtils.isEmpty(hon1.d()))
            {
                g.setText(hon1.d());
                g.setTextColor(a);
            } else
            {
                g.setText(hon1.c());
                g.setTextColor(b);
            }
        }
        if (m.j() != hon1.j())
        {
            h.a_(hon1.j());
        }
        m = hon1;
    }

    private void a(CharSequence charsequence, CharSequence charsequence1)
    {
        if (n)
        {
            a(a(a(d(), false), charsequence, charsequence1));
        }
    }

    private static boolean a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    static hon b(FloatingLabelElement floatinglabelelement)
    {
        return floatinglabelelement.d();
    }

    private void b(int i1)
    {
        a(new android.text.InputFilter.LengthFilter(i1));
    }

    static android.view.View.OnFocusChangeListener c(FloatingLabelElement floatinglabelelement)
    {
        return floatinglabelelement.l;
    }

    static TextView d(FloatingLabelElement floatinglabelelement)
    {
        return floatinglabelelement.d;
    }

    private hon d()
    {
        boolean flag5 = true;
        boolean flag3 = d.isFocused();
        hoo hoo1;
        CharSequence charsequence;
        CharSequence charsequence1;
        CharSequence charsequence2;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag4;
        if (!TextUtils.isEmpty(e.getText()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!TextUtils.isEmpty(m.d()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!TextUtils.isEmpty(d.getText()))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        hoo1 = hoo.c;
        if (flag)
        {
            if (flag2 || flag3)
            {
                hoo1 = hoo.a;
            } else
            {
                hoo1 = hoo.b;
            }
        }
        charsequence = m.d();
        charsequence1 = m.c();
        charsequence2 = k;
        if (!flag2)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        flag4 = flag5;
        if (!flag1)
        {
            if (m.j())
            {
                flag4 = flag5;
            } else
            {
                flag4 = false;
            }
        }
        return new hon(hoo1, charsequence, charsequence1, charsequence2, flag3, flag4, (byte)0);
    }

    private int e()
    {
        return d.getTop();
    }

    public static com.ubercab.ui.TextView e(FloatingLabelElement floatinglabelelement)
    {
        return floatinglabelelement.g;
    }

    public static hon f(FloatingLabelElement floatinglabelelement)
    {
        return floatinglabelelement.m;
    }

    private void k()
    {
        if (j != null && j.isRunning())
        {
            j.cancel();
        }
        while (e.getMeasuredHeight() <= 0 || f.getMeasuredHeight() <= 0 || gju.a() - o < 350L) 
        {
            return;
        }
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(e, ALPHA, new float[] {
            0.0F, 1.0F
        });
        ObjectAnimator objectanimator1 = ObjectAnimator.ofFloat(e, TRANSLATION_Y, new float[] {
            (float)f.getMeasuredHeight() * 0.33F, 0.0F
        });
        j = new AnimatorSet();
        j.playTogether(new Animator[] {
            objectanimator, objectanimator1
        });
        j.setDuration(150L);
        j.setInterpolator(new AccelerateDecelerateInterpolator());
        j.start();
    }

    private void l()
    {
        if (j != null && j.isRunning())
        {
            j.cancel();
        }
        e.setVisibility(4);
    }

    private void m()
    {
        android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
        if (layoutparams != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (layoutparams.width != -2)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((layoutparams = f.getLayoutParams()).width != -2)
        {
            layoutparams.width = -2;
            layoutparams.height = -2;
            f.setLayoutParams(layoutparams);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        android.view.ViewGroup.LayoutParams layoutparams1 = f.getLayoutParams();
        if (layoutparams1.width != -1)
        {
            layoutparams1.width = -1;
            layoutparams1.height = -2;
            f.setLayoutParams(layoutparams1);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public abstract hop a(Context context);

    public CharSequence a()
    {
        return i();
    }

    public void a(int i1)
    {
        d.setCompoundDrawablePadding(i1);
    }

    public void a(Drawable drawable, Drawable drawable1)
    {
        if (drawable == null && drawable1 == null)
        {
            return;
        }
        if (getLayoutDirection() == 1)
        {
            d.setCompoundDrawablesWithIntrinsicBounds(drawable1, null, drawable, null);
            return;
        } else
        {
            d.setCompoundDrawablesWithIntrinsicBounds(drawable, null, drawable1, null);
            return;
        }
    }

    public abstract void a(Parcelable parcelable);

    public final void a(TextWatcher textwatcher)
    {
        d.addTextChangedListener(textwatcher);
    }

    public final void a(TransformationMethod transformationmethod)
    {
        d.setTransformationMethod(transformationmethod);
    }

    public final void a(android.widget.TextView.OnEditorActionListener oneditoractionlistener)
    {
        d.setOnEditorActionListener(oneditoractionlistener);
    }

    public void a(hrs hrs1)
    {
        if (hrs1 == null)
        {
            a(((CharSequence) (null)));
            return;
        } else
        {
            a(hrs1.a(getResources()));
            return;
        }
    }

    public final void a(CharSequence charsequence)
    {
        a(charsequence, m.c());
    }

    public volatile void a(Object obj)
    {
        a((hrs)obj);
    }

    public final void a_(boolean flag)
    {
        a(a(m, flag));
    }

    public Object b()
    {
        return a();
    }

    public final void b(CharSequence charsequence)
    {
        a(m.d(), charsequence);
    }

    public abstract Parcelable c();

    public void c(int i1)
    {
        d.setInputType(i1);
    }

    public final void c(CharSequence charsequence)
    {
        e.setText(charsequence);
        if (n)
        {
            a(d());
        }
    }

    public final void d(int i1)
    {
        d.setImeOptions(i1);
    }

    public final void d(CharSequence charsequence)
    {
        d.setText(charsequence);
        if (n)
        {
            a(d());
        }
    }

    public final void e(CharSequence charsequence)
    {
        k = charsequence;
        if (n)
        {
            a(d());
        }
    }

    public final void f()
    {
        d.setRawInputType(2);
    }

    public final CharSequence g()
    {
        return m.c();
    }

    public int getLayoutDirection()
    {
        if (getContext().getApplicationInfo().targetSdkVersion < 17)
        {
            return 0;
        } else
        {
            return super.getLayoutDirection();
        }
    }

    public final CharSequence h()
    {
        return m.d();
    }

    public final CharSequence i()
    {
        return d.getText();
    }

    public final int j()
    {
        return e() + d.getMeasuredHeight();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        o = gju.a();
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof SavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (f.getId() <= 0)
        {
            a(SavedState.a(parcelable));
        }
        c(SavedState.b(parcelable));
        a(SavedState.c(parcelable), SavedState.d(parcelable));
        a(d());
    }

    public Parcelable onSaveInstanceState()
    {
        return new SavedState(super.onSaveInstanceState(), c(), e.getText(), m.d(), m.c());
    }

    public void setActivated(boolean flag)
    {
        super.setActivated(flag);
        e.setActivated(flag);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        f.setEnabled(flag);
        g.setEnabled(flag);
        e.setEnabled(flag);
        setFocusable(flag);
        setFocusableInTouchMode(flag);
    }

    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.setLayoutParams(layoutparams);
        m();
    }

    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onfocuschangelistener)
    {
        l = onfocuschangelistener;
    }

    public void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener)
    {
        super.setOnTouchListener(ontouchlistener);
        d.setOnTouchListener(ontouchlistener);
    }

    public void setVisibility(int i1)
    {
        super.setVisibility(i1);
        if (i1 == 0)
        {
            setFocusable(true);
            setFocusableInTouchMode(true);
            d.setFocusable(true);
            d.setFocusableInTouchMode(true);
            return;
        } else
        {
            setFocusable(false);
            setFocusableInTouchMode(false);
            d.setFocusable(false);
            d.setFocusableInTouchMode(false);
            return;
        }
    }

    static 
    {
        c = (new int[] {
            hos.fontPath
        });
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class SavedState {}

}
