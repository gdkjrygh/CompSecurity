// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.ObjectAnimator;
import android.widget.EditText;
import com.ubercab.client.feature.promo.v3.PromoView;
import com.ubercab.client.feature.promo.v3.RequestProgressView;

public final class fbx
    implements Runnable
{

    final PromoView a;

    private fbx(PromoView promoview)
    {
        a = promoview;
        super();
    }

    public fbx(PromoView promoview, byte byte0)
    {
        this(promoview);
    }

    public final void run()
    {
        a.a.d();
        fbg.a(a.mFormView).start();
        a.mInputView.requestFocus();
    }
}
