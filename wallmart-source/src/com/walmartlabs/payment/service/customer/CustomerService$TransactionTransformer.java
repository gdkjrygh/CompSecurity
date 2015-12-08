// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmartlabs.payment.service.customer;

import com.walmartlabs.kangaroo.service.Transformer;
import com.walmartlabs.payment.service.payment.Transaction;
import com.walmartlabs.payment.service.payment.UserTransactionResponse;

// Referenced classes of package com.walmartlabs.payment.service.customer:
//            CustomerService

private static class <init>
    implements Transformer
{

    public Transaction transform(UserTransactionResponse usertransactionresponse)
    {
        int i = 0;
        if (usertransactionresponse.data != null && usertransactionresponse.data. != null && usertransactionresponse.data..tions != null && usertransactionresponse.data.tions.tions.ems != null && usertransactionresponse.data.ems.tions.ems.length > 0)
        {
            com.walmartlabs.payment.service.payment.  = usertransactionresponse.data.ems.tions.ems[0];
            float f = 0.0F;
            float f1 = 0.0F;
            String s = "";
            usertransactionresponse = "";
            com.walmartlabs.payment.service.payment. a[] = .ions;
            int j = a.length;
            while (i < j) 
            {
                com.walmartlabs.payment.service.payment. 1 = a[i];
                float f2 = f1;
                UserTransactionResponse usertransactionresponse1 = usertransactionresponse;
                float f3 = f;
                String s1 = s;
                if (1 != null)
                {
                    if ("giftCard".equals(1.ype))
                    {
                        f3 = f + 1.mount;
                        s1 = s;
                        usertransactionresponse1 = usertransactionresponse;
                        f2 = f1;
                    } else
                    {
                        f2 = f1;
                        usertransactionresponse1 = usertransactionresponse;
                        f3 = f;
                        s1 = s;
                        if ("creditCard".equals(1.ype))
                        {
                            f2 = 1.mount;
                            if (1.astFour != null)
                            {
                                s = 1.astFour;
                            }
                            if (1.ardType != null)
                            {
                                usertransactionresponse = 1.ardType;
                            }
                            usertransactionresponse1 = usertransactionresponse;
                            f3 = f;
                            s1 = s;
                        }
                    }
                }
                i++;
                f1 = f2;
                usertransactionresponse = usertransactionresponse1;
                f = f3;
                s = s1;
            }
            return (new com.walmartlabs.payment.service.payment.ardType()).(.).(.nDate).nDate(f).(f1).(s).(usertransactionresponse).(String.valueOf(.)).(.).(.).(.).(.eOne).eOne();
        } else
        {
            return null;
        }
    }

    public volatile Object transform(Object obj)
    {
        return transform((UserTransactionResponse)obj);
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
