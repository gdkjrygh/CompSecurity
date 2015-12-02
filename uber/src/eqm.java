// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.braintreegateway.encryption.Braintree;
import com.braintreegateway.encryption.BraintreeEncryptionException;

public final class eqm
{

    private final Braintree a;

    eqm(Braintree braintree)
    {
        a = braintree;
    }

    public final String a(String s)
    {
        try
        {
            s = a.encrypt(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            ijg.a("Braintree").b(s, "encrypt failed", new Object[0]);
            return null;
        }
        return s;
    }
}
