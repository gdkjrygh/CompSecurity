// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;

// Referenced classes of package com.whatsapp:
//            tw, asw, SearchFAQ

class ad5
    implements android.view.View.OnClickListener
{

    final SearchFAQ a;

    ad5(SearchFAQ searchfaq)
    {
        a = searchfaq;
        super();
    }

    public void onClick(View view)
    {
        asw.a(new tw(a), new Void[0]);
    }
}
