// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            a8_, MultipleContactsSelector, og

class uu
    implements android.view.View.OnClickListener
{

    final a8_ a;
    final og b;

    uu(a8_ a8_1, og og)
    {
        a = a8_1;
        b = og;
        super();
    }

    public void onClick(View view)
    {
        a.a.j.remove(b);
        a.notifyDataSetChanged();
        a.a.i();
    }
}
