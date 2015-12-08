// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.objects;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package net.hockeyapp.android.objects:
//            FeedbackAttachment

class this._cls0
    implements FilenameFilter
{

    final FeedbackAttachment this$0;

    public boolean accept(File file, String s)
    {
        return s.equals(getCacheId());
    }

    ()
    {
        this$0 = FeedbackAttachment.this;
        super();
    }
}
