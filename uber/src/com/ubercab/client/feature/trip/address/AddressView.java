// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.trip.address;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.ubercab.client.core.app.RiderApplication;
import com.ubercab.client.core.location.RiderLocation;
import com.ubercab.client.core.model.LocationSearchResult;
import com.ubercab.ui.TextView;
import dal;
import dfp;
import dsj;
import dtb;
import dtt;
import ftv;
import ftw;
import hoq;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

// Referenced classes of package com.ubercab.client.feature.trip.address:
//            AddressTextView

public class AddressView extends LinearLayout
{

    public dal a;
    private List b;
    private List c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private dtb j;
    private RiderLocation k;
    private ValueAnimator l;
    private ValueAnimator m;
    ImageButton mImageButtonAdd;
    ImageButton mImageButtonClear;
    AddressTextView mTextViewAddress;
    TextView mTextViewLabel;
    View mViewIcon;
    View mViewSpacer;

    public AddressView(Context context)
    {
        this(context, null);
    }

    public AddressView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public AddressView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = new CopyOnWriteArrayList();
        c = new CopyOnWriteArrayList();
        d = 255;
        if (!isInEditMode())
        {
            ((RiderApplication)context.getApplicationContext()).b().a(this);
        }
    }

    static int a(AddressView addressview, int i1)
    {
        addressview.d = i1;
        return i1;
    }

    private Spannable c(String s)
    {
        s = new SpannableString(s);
        s.setSpan(new dsj(hoq.a(getContext(), 0x7f070697)), 0, s.length(), 17);
        return s;
    }

    private String c(RiderLocation riderlocation)
    {
        String s;
        int i1;
        boolean flag;
        i1 = 0;
        flag = false;
        s = riderlocation.getTag();
        if (TextUtils.isEmpty(s) || !riderlocation.isEqualToLocationSearchResult(a.i(s))) goto _L2; else goto _L1
_L1:
label0:
        {
            if (!LocationSearchResult.isTagWork(s))
            {
                i1 = ((flag) ? 1 : 0);
                if (!LocationSearchResult.isTagHome(s))
                {
                    break label0;
                }
            }
            i1 = 1;
        }
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        return s;
_L4:
        return null;
_L2:
        String as[] = LocationSearchResult.HOME_WORK_TAGS;
        int j1 = as.length;
label1:
        do
        {
label2:
            {
                if (i1 >= j1)
                {
                    break label2;
                }
                s = as[i1];
                LocationSearchResult locationsearchresult = a.i(s);
                if (locationsearchresult != null && riderlocation.isEqualToLocationSearchResult(locationsearchresult))
                {
                    break label1;
                }
                i1++;
            }
        } while (true);
        if (true) goto _L3; else goto _L5
_L5:
        return null;
    }

    private void i(int i1)
    {
        mTextViewLabel.setTextColor(i1);
    }

    private void j(int i1)
    {
        e = i1;
    }

    public final void a()
    {
        a(2);
        j(0x7f02027e);
        d(getResources().getColor(0x7f0d004b));
        i(getResources().getColor(0x7f0d0053));
        e(0x7f02027f);
        f(0x7f02010d);
    }

    public final void a(int i1)
    {
        switch (i1)
        {
        default:
            mViewIcon.setBackgroundResource(f);
            return;

        case 1: // '\001'
            mViewIcon.setBackgroundResource(e);
            return;

        case 2: // '\002'
            mViewIcon.setBackgroundResource(g);
            break;
        }
    }

    public final void a(RiderLocation riderlocation)
    {
        k = riderlocation;
        if (k == null)
        {
            mTextViewAddress.a("");
            return;
        }
        String s = c(riderlocation);
        if (!TextUtils.isEmpty(s))
        {
            if (LocationSearchResult.isTagHome(s))
            {
                riderlocation = getResources().getString(0x7f07026c);
            } else
            {
                riderlocation = getResources().getString(0x7f070672);
            }
            mTextViewAddress.a(dtt.a(riderlocation));
            return;
        }
        s = riderlocation.getNickname();
        riderlocation = riderlocation.getDisplayAddressDescription();
        SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(s))
        {
            spannablestringbuilder.append(c(s));
            spannablestringbuilder.append(" ");
        }
        if (TextUtils.isEmpty(s) || !riderlocation.startsWith(s))
        {
            spannablestringbuilder.append(riderlocation);
        }
        mTextViewAddress.a(spannablestringbuilder.toString().trim());
    }

    public final void a(ftv ftv1)
    {
        b.add(ftv1);
    }

    public final void a(ftw ftw1)
    {
        c.add(ftw1);
    }

    public final void a(String s)
    {
        mTextViewLabel.setText(s);
    }

    public final void a(boolean flag)
    {
        i = false;
        if (flag)
        {
            animate().alpha(1.0F).start();
            return;
        } else
        {
            setAlpha(1.0F);
            return;
        }
    }

    public final void b()
    {
        h(0);
        a(2);
        j(0x7f020130);
        i(getResources().getColor(0x7f0d006c));
        e(0x7f02012e);
        d(getResources().getColor(0x7f0d0070));
        f(0x7f0200e9);
    }

    public final void b(int i1)
    {
        Drawable drawable;
        if (i1 == 1)
        {
            setBackgroundResource(h);
        } else
        {
            setBackgroundResource(0x7f0200e8);
        }
        drawable = getBackground();
        drawable.setAlpha(d);
        l.setTarget(drawable);
        m.setTarget(drawable);
    }

    public final void b(String s)
    {
        mTextViewAddress.setHint(s);
    }

    public final void b(boolean flag)
    {
        i = true;
        if (flag)
        {
            animate().alpha(0.0F).start();
            return;
        } else
        {
            setAlpha(0.0F);
            return;
        }
    }

    public final boolean b(RiderLocation riderlocation)
    {
        if (k != null)
        {
            return k.equals(riderlocation);
        }
        return riderlocation == null;
    }

    final void c()
    {
        if (j == null)
        {
            j = new dtb(mTextViewAddress);
        }
        j.start();
    }

    public final void c(int i1)
    {
        mTextViewLabel.setVisibility(i1);
    }

    public final void c(boolean flag)
    {
        if (!flag)
        {
            l.cancel();
            m.cancel();
            getBackground().setAlpha(0);
            d = 0;
        } else
        {
            if (l.isRunning())
            {
                l.reverse();
                return;
            }
            if (d > 0)
            {
                m.setIntValues(new int[] {
                    d, 0
                });
                m.start();
                return;
            }
        }
    }

    public final void d(int i1)
    {
        mTextViewAddress.setHintTextColor(i1);
    }

    public final void d(boolean flag)
    {
        if (!flag)
        {
            l.cancel();
            m.cancel();
            getBackground().setAlpha(255);
            d = 255;
        } else
        {
            if (m.isRunning())
            {
                m.reverse();
                return;
            }
            if (d < 255)
            {
                l.setIntValues(new int[] {
                    d, 255
                });
                l.start();
                return;
            }
        }
    }

    final boolean d()
    {
        return i;
    }

    public final void e(int i1)
    {
        g = i1;
    }

    public final void e(boolean flag)
    {
        mTextViewAddress.a(flag);
    }

    public final void f(int i1)
    {
        h = i1;
    }

    public final void g(int i1)
    {
        mImageButtonAdd.setVisibility(i1);
        View view = mViewSpacer;
        if (i1 == 0)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        view.setVisibility(i1);
    }

    public final void h(int i1)
    {
        mImageButtonClear.setVisibility(i1);
        View view = mViewSpacer;
        if (i1 == 0)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        view.setVisibility(i1);
    }

    public void onClickAdd()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ftv)iterator.next()).a(this)) { }
    }

    public void onClickClear()
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext(); ((ftw)iterator.next()).b(this)) { }
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
        if (isInEditMode())
        {
            return;
        } else
        {
            ButterKnife.inject(this);
            f = 0x7f0201d8;
            l = ObjectAnimator.ofInt(getBackground(), "alpha", new int[] {
                0, 255
            });
            m = ObjectAnimator.ofInt(getBackground(), "alpha", new int[] {
                255, 0
            });
            l.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final AddressView a;

                public final void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    AddressView.a(a, ((Integer)valueanimator.getAnimatedValue()).intValue());
                }

            
            {
                a = AddressView.this;
                super();
            }
            });
            m.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

                final AddressView a;

                public final void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    AddressView.a(a, ((Integer)valueanimator.getAnimatedValue()).intValue());
                }

            
            {
                a = AddressView.this;
                super();
            }
            });
            return;
        }
    }
}
