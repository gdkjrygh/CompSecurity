// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.promo.v3;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import fbg;
import fbv;
import fbw;
import fbx;
import hm;
import hpx;

// Referenced classes of package com.ubercab.client.feature.promo.v3:
//            RequestProgressView

public class PromoView extends FrameLayout
{

    public RequestProgressView a;
    private final fbx b;
    private final AnimatorSet c;
    private final AnimatorSet d;
    private fbv e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;
    Button mApplyView;
    public ViewGroup mFormBgView;
    public ViewGroup mFormView;
    public EditText mInputView;
    public RecyclerView mItemsView;
    ViewStub mProgressStub;

    public PromoView(Context context)
    {
        this(context, null);
    }

    public PromoView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PromoView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        b = new fbx(this, (byte)0);
        c = new AnimatorSet();
        d = new AnimatorSet();
        LayoutInflater.from(context).inflate(0x7f03015c, this);
        ButterKnife.inject(this, this);
        context = mItemsView;
        getContext();
        context.a(new LinearLayoutManager());
        mItemsView.a(new hpx(null, getResources().getDimensionPixelSize(0x7f0802da)));
        mItemsView.a(new hm() {

            final PromoView a;

            public final void a(RecyclerView recyclerview, int k)
            {
                if (!PromoView.a(a))
                {
                    if (k < -20 && PromoView.b(a))
                    {
                        PromoView.c(a).start();
                        PromoView.d(a).cancel();
                        PromoView.a(a, false);
                        PromoView.b(a, true);
                        fbg.b(a.mItemsView, PromoView.e(a));
                    } else
                    if (k > 20 && !PromoView.b(a))
                    {
                        PromoView.c(a).cancel();
                        PromoView.d(a).start();
                        PromoView.a(a, true);
                        PromoView.b(a, true);
                        fbg.b(a.mItemsView, PromoView.e(a) - PromoView.f(a));
                        return;
                    }
                }
            }

            
            {
                a = PromoView.this;
                super();
            }
        });
        mFormView.post(new fbw(this, (byte)0));
    }

    public static int a(PromoView promoview, int j)
    {
        promoview.h = j;
        return j;
    }

    static boolean a(PromoView promoview)
    {
        return promoview.f;
    }

    static boolean a(PromoView promoview, boolean flag)
    {
        promoview.g = flag;
        return flag;
    }

    public static int b(PromoView promoview, int j)
    {
        promoview.i = j;
        return j;
    }

    static boolean b(PromoView promoview)
    {
        return promoview.g;
    }

    public static boolean b(PromoView promoview, boolean flag)
    {
        promoview.f = flag;
        return flag;
    }

    public static AnimatorSet c(PromoView promoview)
    {
        return promoview.d;
    }

    public static AnimatorSet d(PromoView promoview)
    {
        return promoview.c;
    }

    public static int e(PromoView promoview)
    {
        return promoview.i;
    }

    public static int f(PromoView promoview)
    {
        return promoview.h;
    }

    public final void a()
    {
        mItemsView.d();
        mFormView.postDelayed(b, 1000L);
        a.b();
        a.c();
    }

    public final void a(fbv fbv1)
    {
        e = fbv1;
        mItemsView.a(e.b());
    }

    void onApplyPromoCode()
    {
        e.a();
        fbg.a(mFormView, 4).start();
        if (mProgressStub.getParent() != null)
        {
            a = (RequestProgressView)mProgressStub.inflate();
        }
        a.a();
    }
}
