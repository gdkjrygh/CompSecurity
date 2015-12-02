// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.ubercab.client.feature.promo.v3.PromoView;

public final class fbw
    implements Runnable
{

    final PromoView a;

    private fbw(PromoView promoview)
    {
        a = promoview;
        super();
    }

    public fbw(PromoView promoview, byte byte0)
    {
        this(promoview);
    }

    public final void run()
    {
        Object obj = new Rect();
        a.getGlobalVisibleRect(((Rect) (obj)));
        int i = ((Rect) (obj)).top;
        a.mInputView.getGlobalVisibleRect(((Rect) (obj)));
        PromoView.a(a, ((Rect) (obj)).bottom - i);
        a.mFormBgView.getGlobalVisibleRect(((Rect) (obj)));
        PromoView.b(a, ((Rect) (obj)).bottom - i);
        i = PromoView.e(a) - PromoView.f(a);
        a.mItemsView.setTranslationY(PromoView.e(a));
        obj = new AnimatorListenerAdapter() {

            final fbw a;

            public final void onAnimationEnd(Animator animator)
            {
                PromoView.b(a.a, false);
            }

            
            {
                a = fbw.this;
                super();
            }
        };
        PromoView.d(a).playTogether(new Animator[] {
            ObjectAnimator.ofFloat(a.mFormBgView, View.TRANSLATION_Y, new float[] {
                0.0F, (float)(-PromoView.f(a))
            }), ObjectAnimator.ofFloat(a.mItemsView, View.TRANSLATION_Y, new float[] {
                (float)PromoView.e(a), (float)i
            })
        });
        PromoView.d(a).addListener(((android.animation.Animator.AnimatorListener) (obj)));
        PromoView.c(a).playTogether(new Animator[] {
            ObjectAnimator.ofFloat(a.mFormBgView, View.TRANSLATION_Y, new float[] {
                (float)(-PromoView.f(a)), 0.0F
            }), ObjectAnimator.ofFloat(a.mItemsView, View.TRANSLATION_Y, new float[] {
                (float)i, (float)PromoView.e(a)
            })
        });
        PromoView.c(a).addListener(((android.animation.Animator.AnimatorListener) (obj)));
    }
}
