// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.receipt;

import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import butterknife.ButterKnife;
import cfj;
import cgh;
import cgt;
import chp;
import cic;
import com.ubercab.analytics.model.AnalyticsEvent;
import com.ubercab.client.core.model.Item;
import com.ubercab.client.core.model.MealReceiptRating;
import com.ubercab.ui.Button;
import com.ubercab.ui.TextView;
import czb;
import czj;
import dfp;
import djb;
import dru;
import fce;
import fcf;
import fcz;
import fda;
import java.util.ArrayList;
import java.util.List;
import l;
import n;

// Referenced classes of package com.ubercab.client.feature.receipt:
//            StoppableScrollView

public class MealReceiptFragment extends czb
{

    private Drawable A;
    private MealReceiptRating B;
    private ViewPager C;
    protected cfj c;
    protected boolean d;
    protected boolean e;
    protected fda f;
    public chp g;
    public cgh h;
    private final List i = new ArrayList();
    private int j;
    private int k;
    private int l;
    private String m;
    ImageView mImageViewArrowLeft;
    ImageView mImageViewArrowRight;
    ImageView mImageViewFrowny;
    ImageView mImageViewItemPhoto;
    ImageView mImageViewSmiley;
    LinearLayout mLoadingView;
    Button mNegativeTagOne;
    Button mNegativeTagThree;
    Button mNegativeTagTwo;
    StoppableScrollView mScrollViewContent;
    TextView mTextViewQuestion;
    LinearLayout mViewGroupNegativeTagsContainer;
    LinearLayout mViewGroupRatingContainer;
    private int n;
    private int o;
    private String p;
    private int q;
    private int r;
    private int s;
    private int t;
    private Button u;
    private Drawable v;
    private Drawable w;
    private Drawable x;
    private Drawable y;
    private Drawable z;

    public MealReceiptFragment()
    {
    }

    private void A()
    {
        mImageViewSmiley.setSelected(false);
        y();
        r();
    }

    private void B()
    {
        mImageViewFrowny.setSelected(true);
        mImageViewFrowny.setImageDrawable(w);
    }

    private void C()
    {
        mImageViewSmiley.setSelected(true);
        mImageViewSmiley.setImageDrawable(y);
    }

    private void D()
    {
        Object obj = getActivity();
        if (obj == null)
        {
            return;
        } else
        {
            obj = AnimationUtils.loadAnimation(((android.content.Context) (obj)), 0x7f040021);
            ((Animation) (obj)).setAnimationListener(new dru() {

                final MealReceiptFragment a;

                public final void onAnimationStart(Animation animation)
                {
                    MealReceiptFragment.f(a);
                }

            
            {
                a = MealReceiptFragment.this;
                super();
            }
            });
            mImageViewSmiley.startAnimation(((Animation) (obj)));
            return;
        }
    }

    private void E()
    {
        Object obj = getActivity();
        if (obj == null)
        {
            return;
        } else
        {
            obj = AnimationUtils.loadAnimation(((android.content.Context) (obj)), 0x7f04000e);
            ((Animation) (obj)).setAnimationListener(new dru() {

                final MealReceiptFragment a;

                public final void onAnimationStart(Animation animation)
                {
                    MealReceiptFragment.g(a);
                }

            
            {
                a = MealReceiptFragment.this;
                super();
            }
            });
            mImageViewFrowny.startAnimation(((Animation) (obj)));
            return;
        }
    }

    private boolean F()
    {
        return u.getVisibility() == 8 && !u.isEnabled();
    }

    private boolean G()
    {
        return mImageViewFrowny.isSelected();
    }

    private boolean H()
    {
        return mImageViewSmiley.isSelected();
    }

    private void I()
    {
        if (f != null)
        {
            f.a();
        }
    }

    private void J()
    {
        if (f != null)
        {
            f.b();
        }
    }

    private void K()
    {
        u.setVisibility(0);
        u.setEnabled(true);
        g.a(AnalyticsEvent.create("impression").setName(l.iC));
    }

    public static MealReceiptFragment a(Item item, ArrayList arraylist, ArrayList arraylist1)
    {
        Bundle bundle = new Bundle();
        bundle.putString("item_image_url", item.getImageUrl());
        bundle.putString("item_question", item.getQuestion());
        bundle.putStringArrayList("negative_tag_descriptions", arraylist);
        bundle.putStringArrayList("negative_tag_uuids", arraylist1);
        item = new MealReceiptFragment();
        item.setArguments(bundle);
        return item;
    }

    private void a(ImageView imageview, int i1, int j1)
    {
        imageview = ObjectAnimator.ofFloat(imageview, "translationX", new float[] {
            (float)i1, (float)j1
        });
        imageview.setDuration(j);
        imageview.start();
    }

    static void a(MealReceiptFragment mealreceiptfragment)
    {
        mealreceiptfragment.g();
    }

    private void a(fcz fcz1)
    {
        fcz1.a(this);
    }

    private void a(ArrayList arraylist, ArrayList arraylist1)
    {
        if (arraylist != null && arraylist.size() == 3)
        {
            mNegativeTagOne.setText((CharSequence)arraylist.get(0));
            mNegativeTagTwo.setText((CharSequence)arraylist.get(1));
            mNegativeTagThree.setText((CharSequence)arraylist.get(2));
        }
        if (arraylist1 != null && arraylist1.size() == 3)
        {
            mNegativeTagOne.setTag(arraylist1.get(0));
            mNegativeTagTwo.setTag(arraylist1.get(1));
            mNegativeTagThree.setTag(arraylist1.get(2));
        }
    }

    private void a(boolean flag, List list)
    {
        B = MealReceiptRating.create().setNegativeTagUuids(list);
        if (flag)
        {
            B.setIsPositiveRating(true);
            return;
        } else
        {
            B.setIsPositiveRating(false);
            return;
        }
    }

    private fcz b(dfp dfp)
    {
        return fce.a().a(new djb(this)).a(dfp).a();
    }

    static void b(MealReceiptFragment mealreceiptfragment)
    {
        mealreceiptfragment.s();
    }

    private void b(Button button)
    {
        String s1 = button.getTag().toString();
        if (e(button))
        {
            i.remove(s1);
            c(button);
        } else
        {
            i.add(s1);
            d(button);
        }
        a(false, i);
        I();
        g.a(AnalyticsEvent.create("tap").setName(n.hN).setValue(s1));
    }

    private void c(int i1)
    {
        android.view.ViewGroup.LayoutParams layoutparams = mViewGroupRatingContainer.getLayoutParams();
        layoutparams.height = i1;
        mViewGroupRatingContainer.setLayoutParams(layoutparams);
    }

    static void c(MealReceiptFragment mealreceiptfragment)
    {
        mealreceiptfragment.m();
    }

    private void c(Button button)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            button.setBackground(A);
        }
        button.setSelected(false);
        button.setTextColor(s);
    }

    static int d(MealReceiptFragment mealreceiptfragment)
    {
        return mealreceiptfragment.l;
    }

    private void d(Button button)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            button.setBackground(z);
        }
        button.setSelected(true);
        button.setTextColor(t);
    }

    static int e(MealReceiptFragment mealreceiptfragment)
    {
        return mealreceiptfragment.k;
    }

    private static boolean e(Button button)
    {
        return button.isSelected();
    }

    static void f(MealReceiptFragment mealreceiptfragment)
    {
        mealreceiptfragment.k();
    }

    private void g()
    {
        e = true;
        if (d)
        {
            s();
            m();
        }
    }

    static void g(MealReceiptFragment mealreceiptfragment)
    {
        mealreceiptfragment.l();
    }

    private void h()
    {
        t();
        mLoadingView.postDelayed(new Runnable() {

            final MealReceiptFragment a;

            public final void run()
            {
                a.d = true;
                if (a.e)
                {
                    MealReceiptFragment.b(a);
                    MealReceiptFragment.c(a);
                }
            }

            
            {
                a = MealReceiptFragment.this;
                super();
            }
        }, 400L);
    }

    private void i()
    {
        mImageViewArrowLeft.setVisibility(8);
    }

    private void j()
    {
        mImageViewArrowRight.setVisibility(8);
    }

    private void k()
    {
        mImageViewSmiley.setVisibility(4);
        mImageViewSmiley.setEnabled(false);
    }

    private void l()
    {
        mImageViewFrowny.setVisibility(4);
        mImageViewFrowny.setEnabled(false);
    }

    private void m()
    {
        mLoadingView.setVisibility(8);
    }

    private void n()
    {
        mImageViewArrowLeft.setVisibility(0);
    }

    private void o()
    {
        mImageViewArrowRight.setVisibility(0);
    }

    private void p()
    {
        n();
        o();
    }

    private void q()
    {
        mImageViewSmiley.setVisibility(0);
        mImageViewSmiley.setEnabled(true);
    }

    private void r()
    {
        mImageViewFrowny.setVisibility(0);
        mImageViewFrowny.setEnabled(true);
    }

    private void s()
    {
        mImageViewItemPhoto.setVisibility(0);
    }

    private void t()
    {
        mLoadingView.setVisibility(0);
    }

    private void u()
    {
        mViewGroupNegativeTagsContainer.setVisibility(0);
    }

    private void v()
    {
        android.support.v4.app.FragmentActivity fragmentactivity = getActivity();
        if (fragmentactivity != null)
        {
            Toast.makeText(fragmentactivity, p, 0).show();
        }
    }

    private void w()
    {
        mScrollViewContent.a(true);
        mScrollViewContent.postDelayed(new Runnable() {

            final MealReceiptFragment a;

            public final void run()
            {
                a.mScrollViewContent.smoothScrollBy(0, MealReceiptFragment.d(a) + MealReceiptFragment.e(a));
            }

            
            {
                a = MealReceiptFragment.this;
                super();
            }
        }, 1L);
    }

    private void x()
    {
        mScrollViewContent.smoothScrollTo(0, 0);
        mScrollViewContent.a(false);
    }

    private void y()
    {
        a(mImageViewSmiley, r, 0);
        a(mImageViewFrowny, -r, 0);
        mImageViewFrowny.setImageDrawable(v);
        mImageViewSmiley.setImageDrawable(x);
    }

    private void z()
    {
        mImageViewFrowny.setSelected(false);
        q();
        y();
    }

    public final MealReceiptRating a()
    {
        return B;
    }

    protected final czj a(dfp dfp)
    {
        return b(dfp);
    }

    public final void a(int i1)
    {
        n = i1;
    }

    public final void a(int i1, int j1)
    {
        boolean flag1 = false;
        boolean flag;
        if (i1 == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i1 == j1 - 1)
        {
            flag1 = true;
        }
        if (j1 == 1)
        {
            b();
            return;
        }
        if (flag)
        {
            i();
            o();
            return;
        }
        if (flag1)
        {
            n();
            j();
            return;
        } else
        {
            p();
            return;
        }
    }

    public final void a(ViewPager viewpager)
    {
        C = viewpager;
    }

    public final void a(Button button)
    {
        u = button;
    }

    public final volatile void a(czj czj)
    {
        a((fcz)czj);
    }

    public final void a(fda fda1)
    {
        f = fda1;
    }

    public final void a(String s1)
    {
        m = s1;
    }

    public final void b()
    {
        i();
        j();
    }

    public final void b(int i1)
    {
        o = i1;
    }

    public final cic f()
    {
        return czb.a;
    }

    public void onClickFrowny()
    {
        g.a(n.hJ);
        if (r == 0)
        {
            r = mImageViewFrowny.getWidth() / 2;
        }
        if (l == 0)
        {
            l = mImageViewItemPhoto.getHeight();
        }
        if (G())
        {
            x();
            z();
            J();
            return;
        }
        int j1 = mViewGroupRatingContainer.getHeight();
        int i1 = j1;
        if (F())
        {
            K();
            i1 = j1 - q;
        }
        B();
        c(i1);
        w();
        u();
        a(mImageViewFrowny, 0, -r);
        D();
        a(false, ((List) (null)));
        I();
        g.a(AnalyticsEvent.create("impression").setName(l.iD).setValue(m));
    }

    public void onClickLeftArrow()
    {
        int i1 = o - 1;
        C.setCurrentItem(i1);
        g.a(AnalyticsEvent.create("tap").setName(n.hK).setValue(Integer.valueOf(i1)));
    }

    public void onClickNegativeTagOne()
    {
        b(mNegativeTagOne);
    }

    public void onClickNegativeTagThree()
    {
        b(mNegativeTagThree);
    }

    public void onClickNegativeTagTwo()
    {
        b(mNegativeTagTwo);
    }

    public void onClickRightArrow()
    {
        int i1 = o + 1;
        C.setCurrentItem(i1);
        g.a(AnalyticsEvent.create("tap").setName(n.hL).setValue(Integer.valueOf(i1)));
    }

    public void onClickSmiley()
    {
        g.a(n.hO);
        if (r == 0)
        {
            r = mImageViewSmiley.getWidth() / 2;
        }
        if (H())
        {
            A();
            J();
            return;
        }
        if (F())
        {
            K();
        }
        C();
        v();
        l();
        a(mImageViewSmiley, 0, r);
        E();
        a(true, ((List) (null)));
        I();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0300a3, viewgroup, false);
        ButterKnife.inject(this, layoutinflater);
        viewgroup = getArguments();
        if (viewgroup != null && !viewgroup.isEmpty())
        {
            bundle = viewgroup.getString("item_image_url");
            String s1 = viewgroup.getString("item_question");
            c = new cfj() {

                final MealReceiptFragment a;

                public final void a()
                {
                    MealReceiptFragment.a(a);
                }

                public final void b()
                {
                    MealReceiptFragment.a(a);
                }

            
            {
                a = MealReceiptFragment.this;
                super();
            }
            };
            h.a(bundle).a(mImageViewItemPhoto, c);
            mTextViewQuestion.setText(s1);
            a(viewgroup.getStringArrayList("negative_tag_descriptions"), viewgroup.getStringArrayList("negative_tag_uuids"));
        }
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        h();
        view = getResources();
        j = view.getInteger(0x7f0b0013);
        k = (int)view.getDimension(0x7f0800e7);
        q = (int)view.getDimension(0x7f0800ea);
        x = view.getDrawable(0x7f0201e2);
        y = view.getDrawable(0x7f0201e1);
        v = view.getDrawable(0x7f0201af);
        w = view.getDrawable(0x7f0201ae);
        p = view.getString(0x7f07042c);
        z = view.getDrawable(0x7f020094);
        A = view.getDrawable(0x7f0200c4);
        s = view.getColor(0x7f0d006f);
        t = view.getColor(0x7f0d008e);
        a(o, n);
    }
}
