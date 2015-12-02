// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

// Referenced classes of package com.whatsapp:
//            ConversationsFragment, u5, gf

public class ArchivedConversationsFragment extends ConversationsFragment
{

    public ArchivedConversationsFragment()
    {
    }

    protected void a(View view)
    {
        super.a(view);
        if (u5.c() != 0)
        {
            int i = view.getTop();
            getListView().getViewTreeObserver().addOnGlobalLayoutListener(new gf(this, i));
        }
    }

    public void b()
    {
        super.b();
        if (u5.c() == 0)
        {
            getActivity().finish();
        }
    }

    protected void g()
    {
        f.setVisibility(8);
        c.setVisibility(8);
    }

    protected ArrayList h()
    {
        return u5.i();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
    }
}
