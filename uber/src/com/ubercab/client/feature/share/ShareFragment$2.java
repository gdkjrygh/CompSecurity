// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.feature.share;


// Referenced classes of package com.ubercab.client.feature.share:
//            ShareFragment

final class a
    implements Runnable
{

    final ShareFragment a;

    public final void run()
    {
        if (a.isAdded())
        {
            ShareFragment.a(a).a(false);
        }
    }

    aderViewHolder(ShareFragment sharefragment)
    {
        a = sharefragment;
        super();
    }
}
