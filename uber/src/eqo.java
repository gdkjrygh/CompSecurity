// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.AutoCompleteTextView;
import com.ubercab.client.feature.payment.alipay.AddAlipayActivity;

public final class eqo
    implements hse
{

    final AddAlipayActivity a;
    private final AutoCompleteTextView b;

    public eqo(AddAlipayActivity addalipayactivity, AutoCompleteTextView autocompletetextview)
    {
        a = addalipayactivity;
        super();
        b = autocompletetextview;
    }

    private void a(hrs hrs1)
    {
        if (hrs1 == null)
        {
            b.setError(null);
            return;
        } else
        {
            b.setError(hrs1.a(a.getResources()));
            return;
        }
    }

    public final volatile void a(Object obj)
    {
        a((hrs)obj);
    }
}
