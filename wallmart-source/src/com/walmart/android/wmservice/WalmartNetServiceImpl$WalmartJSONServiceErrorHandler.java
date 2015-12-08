// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.content.Context;
import android.content.Intent;
import com.walmart.android.service.ServiceData;
import com.walmart.android.service.ServiceDataValidator;

// Referenced classes of package com.walmart.android.wmservice:
//            WalmartNetServiceImpl

private class <init>
    implements ServiceDataValidator
{

    private int mErrorCode;
    final WalmartNetServiceImpl this$0;

    public int getErrorCode()
    {
        return mErrorCode;
    }

    public boolean validate(ServiceData servicedata)
    {
        com.walmart.android.service.r r = null;
        String s = null;
        if (servicedata != null)
        {
            r = servicedata.getContentType();
            s = servicedata.getContent();
        }
        if (r == null || s == null)
        {
            mErrorCode = 0x15f91;
            return false;
        }
        if (r == com.walmart.android.service.r.mErrorCode && s.contains("<div id=\"maint\">\n<img src=\"images/walmart_logo2.gif\" alt=\"Wal-Mart&reg;\" border=\"0\" style=\"\">\n<h1>Walmart Mobile Scheduled Maintenance</h1>\n<p>Walmart Mobile is temporarily unavailable while we make important upgrades to our site. We appreciate your patience and invite you to return soon.</p>\n<p>If you need immediate assistance, please email us at <a href=\"mailto:help@walmart.com\">help@walmart.com</a>.</p>\n</div>"))
        {
            mErrorCode = 4;
            WalmartNetServiceImpl.access$400(WalmartNetServiceImpl.this).sendBroadcast(new Intent("com.walmart.android.MAINTENANCE"));
            return false;
        } else
        {
            return true;
        }
    }

    private ()
    {
        this$0 = WalmartNetServiceImpl.this;
        super();
        mErrorCode = -1;
    }

    mErrorCode(mErrorCode merrorcode)
    {
        this();
    }
}
