// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.protocol.c4;

// Referenced classes of package com.whatsapp:
//            sz, PlaceInfo

final class sv extends sz
{

    final PlaceInfo n;
    final boolean o;

    sv(Context context, c4 c4_1, PlaceInfo placeinfo, boolean flag)
    {
        n = placeinfo;
        o = flag;
        super(context, c4_1);
    }

    public Boolean a(Void avoid[])
    {
        if (!n.hasDetails)
        {
            n.downloadDetails();
            i.l = n.url;
            if (o && n.address != null)
            {
                StringBuilder stringbuilder = new StringBuilder();
                c4 c4_1 = i;
                c4_1.L = stringbuilder.append(c4_1.L).append("\n").append(n.address).toString();
            }
        }
        return super.a(avoid);
    }

    public Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }
}
