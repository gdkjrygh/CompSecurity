// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.bridge.client;


// Referenced classes of package com.walmart.android.app.bridge.client:
//            Customer

public class SignIn
{

    public boolean accountCreated;
    public Customer customer;

    public SignIn()
    {
    }

    public boolean getAccountCreated()
    {
        return accountCreated;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public void setAccountCreated(boolean flag)
    {
        accountCreated = flag;
    }

    public void setCustomer(Customer customer1)
    {
        customer = customer1;
    }
}
