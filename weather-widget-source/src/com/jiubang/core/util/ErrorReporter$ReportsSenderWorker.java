// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jiubang.core.util;

import com.gtp.a.a.b.c;

// Referenced classes of package com.jiubang.core.util:
//            ErrorReporter

final class mReportFileName extends Thread
{

    private String mBody;
    private String mReportFileName;
    final ErrorReporter this$0;

    public void run()
    {
        try
        {
            ErrorReporter.access$100(ErrorReporter.this, ErrorReporter.access$000(ErrorReporter.this), mReportFileName, mBody);
            return;
        }
        catch (Exception exception)
        {
            c.b("ACRA", "", this);
        }
    }

    void setCommentReportFileName(String s)
    {
        mReportFileName = s;
    }

    void setCustomComment(String s)
    {
        mBody = s;
    }

    ()
    {
        this$0 = ErrorReporter.this;
        super();
        mBody = null;
        mReportFileName = null;
    }
}
