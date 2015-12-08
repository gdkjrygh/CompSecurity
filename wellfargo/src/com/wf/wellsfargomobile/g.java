// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile;


// Referenced classes of package com.wf.wellsfargomobile:
//            ai, BaseWebViewActivity

class g extends ai
{

    final BaseWebViewActivity a;

    g(BaseWebViewActivity basewebviewactivity)
    {
        a = basewebviewactivity;
        super();
    }

    public void dismiss()
    {
        super.dismiss();
        a.returnWithErrorWithIcon(getString(0x7f080125), getString(0x7f080124), 0x7f0200fb);
    }
}
