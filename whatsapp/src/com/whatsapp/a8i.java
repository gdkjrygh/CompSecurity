// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.view.View;
import android.widget.AdapterView;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            SetStatus

class a8i
    implements android.widget.AdapterView.OnItemClickListener
{

    final SetStatus a;

    a8i(SetStatus setstatus)
    {
        a = setstatus;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (String)SetStatus.l.get(i);
        a.e(adapterview);
    }
}
