// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.payment.internal.ui.CreditCardEditText;
import com.ubercab.payment.internal.ui.CreditCardFieldsView;
import com.ubercab.ui.FloatingLabelEditText;
import java.util.List;

public final class gue
{

    private final hsj a = new hsj();
    private final CreditCardFieldsView b;
    private gug c;

    public gue(CreditCardFieldsView creditcardfieldsview)
    {
        b = creditcardfieldsview;
        Object obj1 = new gtz(b.b(), new hrs(gsg.ub__payment_invalid_card_code));
        Object obj2 = new hsd(b.f(), new hrs(gsg.ub__payment_invalid_card_zip));
        Object obj = new gua(new hrs(gsg.ub__payment_invalid_card_month));
        creditcardfieldsview = new gub(new hrs(gsg.ub__payment_invalid_card_year));
        a.a(b.a(), ((hrt) (obj1)));
        a.a(b.c(), ((hrt) (obj)));
        a.a(b.d(), creditcardfieldsview);
        a.a(b.e(), ((hrt) (obj2)));
        a.a(b.b(), new guf(this, new hrs(gsg.ub__payment_invalid_card_number)));
        obj2 = b.b();
        ((CreditCardEditText) (obj2)).setOnFocusChangeListener(new _cls1(((CreditCardEditText) (obj2))));
        obj2 = b.a();
        ((FloatingLabelEditText) (obj2)).setOnFocusChangeListener(new _cls2(((FloatingLabelEditText) (obj2))));
        ((FloatingLabelEditText) (obj2)).a(new _cls3(((gtz) (obj1)), ((FloatingLabelEditText) (obj2))));
        obj1 = b.c();
        ((FloatingLabelEditText) (obj1)).setOnFocusChangeListener(new _cls4(((FloatingLabelEditText) (obj1))));
        ((FloatingLabelEditText) (obj1)).a(new _cls5(((gua) (obj)), ((FloatingLabelEditText) (obj1))));
        obj = b.d();
        ((FloatingLabelEditText) (obj)).setOnFocusChangeListener(new _cls6(((FloatingLabelEditText) (obj))));
        ((FloatingLabelEditText) (obj)).a(new _cls7(creditcardfieldsview, ((FloatingLabelEditText) (obj))));
        creditcardfieldsview = b.e();
        creditcardfieldsview.a(new _cls8(creditcardfieldsview));
    }

    static hsj a(gue gue1)
    {
        return gue1.a;
    }

    private void b()
    {
        if (c != null)
        {
            a.b().size();
        }
    }

    static void b(gue gue1)
    {
        gue1.b();
    }

    public final boolean a()
    {
        return a.a().size() == 0;
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls8 {}

}
