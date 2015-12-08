// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.util;

import android.content.Intent;
import android.view.View;

// Referenced classes of package com.wf.wellsfargomobile.util:
//            i

class k
    implements android.view.View.OnClickListener
{

    final i a;

    k(i j)
    {
        a = j;
        super();
    }

    public void onClick(View view)
    {
        a.dismiss();
        a.startActivity(new Intent("android.settings.APPLICATION_DEVELOPMENT_SETTINGS"));
    }
}
