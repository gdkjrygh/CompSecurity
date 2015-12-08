// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.locations;

import android.os.Bundle;

// Referenced classes of package com.wf.wellsfargomobile.locations:
//            n, d, LocationListActivity

public class m extends n
{

    public m()
    {
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        a = new d(getActivity(), 0x7f040039, ((LocationListActivity)getActivity()).b());
        setListAdapter(a);
    }
}
