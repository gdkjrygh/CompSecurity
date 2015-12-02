// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.client.feature.payment.expense.ExpenseInfoActivity;

public final class esa
    implements icg
{

    final ExpenseInfoActivity a;

    private esa(ExpenseInfoActivity expenseinfoactivity)
    {
        a = expenseinfoactivity;
        super();
    }

    public esa(ExpenseInfoActivity expenseinfoactivity, byte byte0)
    {
        this(expenseinfoactivity);
    }

    public final void a()
    {
        ExpenseInfoActivity.a(a);
    }

    public final volatile void a(Object obj)
    {
    }

    public final void a(Throwable throwable)
    {
        ExpenseInfoActivity.b(a);
    }
}
