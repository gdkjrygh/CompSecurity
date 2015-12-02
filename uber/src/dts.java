// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import io.card.payment.CardIOActivity;

public final class dts
{

    public static Intent a(Activity activity)
    {
        activity = new Intent(activity, io/card/payment/CardIOActivity);
        activity.putExtra("io.card.payment.requireExpiry", true);
        activity.putExtra("io.card.payment.suppressManual", true);
        return activity;
    }
}
