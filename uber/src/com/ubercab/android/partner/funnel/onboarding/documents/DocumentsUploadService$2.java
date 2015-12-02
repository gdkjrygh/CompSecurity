// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.android.partner.funnel.onboarding.documents;

import ide;
import iiy;

// Referenced classes of package com.ubercab.android.partner.funnel.onboarding.documents:
//            DocumentsUploadService

final class a
    implements ide
{

    final DocumentsUploadService a;

    private void a()
    {
        if (DocumentsUploadService.b(a).d())
        {
            a.a(true);
        }
    }

    public final void call(Object obj)
    {
        a();
    }

    (DocumentsUploadService documentsuploadservice)
    {
        a = documentsuploadservice;
        super();
    }
}
