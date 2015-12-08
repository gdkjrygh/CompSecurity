// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.wf.wellsfargomobile.p2pimport;

import android.content.Intent;
import com.wf.wellsfargomobile.BaseWebViewActivity;
import com.wf.wellsfargomobile.WFApp;

// Referenced classes of package com.wf.wellsfargomobile.p2pimport:
//            P2PImportDetailActivity

public class c
{

    private final BaseWebViewActivity a;

    public c(BaseWebViewActivity basewebviewactivity)
    {
        a = basewebviewactivity;
    }

    public void fetchContactDetails(String s)
    {
        if (!a.validNonce(s))
        {
            return;
        } else
        {
            s = new Intent(a, com/wf/wellsfargomobile/p2pimport/P2PImportDetailActivity);
            s.putExtra("com.wf.wellsfargomobile.p2pimport.contact", WFApp.W());
            a.startActivityForResult(s, 17);
            return;
        }
    }

    public void fetchContacts(String s)
    {
        if (!a.validNonce(s))
        {
            return;
        } else
        {
            s = new Intent("android.intent.action.PICK", android.provider.ContactsContract.Contacts.CONTENT_URI);
            a.startActivityForResult(s, 16);
            return;
        }
    }
}
