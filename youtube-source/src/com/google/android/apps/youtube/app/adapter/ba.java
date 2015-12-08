// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.app.adapter;

import android.content.Context;
import com.google.android.apps.youtube.app.ui.ha;
import com.google.android.apps.youtube.datalib.model.transfer.Transfer;

// Referenced classes of package com.google.android.apps.youtube.app.adapter:
//            af, bb

public final class ba extends af
{

    private final bb a;

    public ba(Context context, int i, bb bb1)
    {
        super(context, i, bb1);
        a = bb1;
    }

    public final boolean a(Transfer transfer)
    {
        boolean flag = a.a(transfer);
        if (flag)
        {
            transfer = ha.a(transfer);
            for (int i = 0; i < getCount(); i++)
            {
                if (((ha)getItem(i)).equals(transfer))
                {
                    b(i, transfer);
                }
            }

        }
        return flag;
    }
}
