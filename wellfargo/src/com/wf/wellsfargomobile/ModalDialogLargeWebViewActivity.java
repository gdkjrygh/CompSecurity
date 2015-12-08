// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;

// Referenced classes of package com.wf.wellsfargomobile:
//            BaseModalDialogWebViewActivity

public class ModalDialogLargeWebViewActivity extends BaseModalDialogWebViewActivity
{

    public ModalDialogLargeWebViewActivity()
    {
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        e = (int)getResources().getDimension(0x7f090012);
        b = (int)getResources().getDimension(0x7f090013);
        d = (int)getResources().getDimension(0x7f090014);
        c = (int)getResources().getDimension(0x7f090015);
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle)
    {
        j = 0x7f04005e;
        super.onCreate(bundle);
    }
}
