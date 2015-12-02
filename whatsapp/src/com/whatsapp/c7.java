// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;


// Referenced classes of package com.whatsapp:
//            CallsFragment, e7

class c7
    implements Runnable
{

    final CallsFragment a;

    c7(CallsFragment callsfragment)
    {
        a = callsfragment;
        super();
    }

    public void run()
    {
        CallsFragment.f(a).notifyDataSetChanged();
        CallsFragment.e(a);
    }
}
