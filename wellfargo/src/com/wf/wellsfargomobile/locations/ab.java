// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.view.View;

// Referenced classes of package com.wf.wellsfargomobile.locations:
//            z

class ab
    implements android.view.View.OnClickListener
{

    final z a;

    ab(z z1)
    {
        a = z1;
        super();
    }

    public void onClick(View view)
    {
        a.dismiss();
        a.getActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        a.getActivity().finish();
    }
}
