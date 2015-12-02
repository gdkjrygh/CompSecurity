// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;

public final class fbg
{

    public static ObjectAnimator a(View view)
    {
        view.setVisibility(0);
        view.setAlpha(0.0F);
        return ObjectAnimator.ofFloat(view, View.ALPHA, new float[] {
            0.0F, 1.0F
        });
    }

    public static ObjectAnimator a(View view, int i)
    {
        ObjectAnimator objectanimator = ObjectAnimator.ofFloat(view, View.ALPHA, new float[] {
            1.0F, 0.0F
        });
        objectanimator.addListener(new AnimatorListenerAdapter(view, i) {

            final View a;
            final int b;

            public final void onAnimationEnd(Animator animator)
            {
                a.setVisibility(b);
                a.setAlpha(1.0F);
            }

            
            {
                a = view;
                b = i;
                super();
            }
        });
        return objectanimator;
    }

    public static void b(View view, int i)
    {
        int k = view.getPaddingLeft();
        int l = view.getPaddingTop();
        int i1 = view.getPaddingRight();
        int j = i;
        if (i == -1)
        {
            j = view.getPaddingBottom();
        }
        view.setPadding(k, l, i1, j);
    }
}
