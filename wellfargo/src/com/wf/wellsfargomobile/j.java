// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

// Referenced classes of package com.wf.wellsfargomobile:
//            i

class j
    implements android.view.View.OnClickListener
{

    final i a;

    j(i k)
    {
        a = k;
        super();
    }

    public void onClick(View view)
    {
        a.dismiss();
        if (i.a(a) != null)
        {
            a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(i.a(a))));
        }
    }
}
