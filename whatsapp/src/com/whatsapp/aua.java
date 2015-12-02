// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.whatsapp.contact.n;

// Referenced classes of package com.whatsapp:
//            App, a1o, ContactsFragment, akq, 
//            s3

class aua
    implements Runnable
{

    final a1o a;
    final n b;

    aua(a1o a1o1, n n1)
    {
        a = a1o1;
        b = n1;
        super();
    }

    public void run()
    {
        int i;
        i = App.am;
        ((SherlockFragmentActivity)a.a.getActivity()).setSupportProgressBarIndeterminateVisibility(false);
        ContactsFragment.g(a.a);
        akq.a[b.ordinal()];
        JVM INSTR tableswitch 1 5: default 76
    //                   1 77
    //                   2 113
    //                   3 129
    //                   4 129
    //                   5 152;
           goto _L1 _L2 _L3 _L4 _L4 _L5
_L1:
        return;
_L2:
        App.ay.c(true);
        App.au.a(System.currentTimeMillis());
        App.b(a.a.getActivity(), 0x7f0e009c, 0);
        if (i == 0) goto _L1; else goto _L3
_L3:
        ContactsFragment.a(a.a, 0x7f0e009a);
        if (i == 0) goto _L1; else goto _L4
_L4:
        ContactsFragment.a(a.a, 0x7f0e0099);
        App.ay.a(true);
        if (i == 0) goto _L1; else goto _L5
_L5:
        ContactsFragment.a(a.a, 0x7f0e009b);
        return;
    }
}
