// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.OrientationEventListener;
import io.card.payment.CardIOActivity;

public final class htn extends OrientationEventListener
{

    private CardIOActivity a;

    public htn(CardIOActivity cardioactivity, Context context)
    {
        a = cardioactivity;
        super(context, 2);
    }

    public final void onOrientationChanged(int i)
    {
        CardIOActivity.a(a, i);
    }
}
