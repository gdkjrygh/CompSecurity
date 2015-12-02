// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.contacts;

import android.widget.AbsListView;
import cwz;

// Referenced classes of package com.ubercab.client.core.contacts:
//            SelectContactsFragment

public final class a
    implements android.widget.ner
{

    final SelectContactsFragment a;

    public final void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1)
        {
            cwz.b(a.getActivity(), a.mInviteesEditText);
        }
    }

    (SelectContactsFragment selectcontactsfragment)
    {
        a = selectcontactsfragment;
        super();
    }
}
