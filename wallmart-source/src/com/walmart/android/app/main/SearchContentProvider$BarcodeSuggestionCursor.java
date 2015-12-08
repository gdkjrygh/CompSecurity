// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.main;

import android.content.Context;
import android.database.MatrixCursor;
import com.walmart.android.util.ScannerUtil;

// Referenced classes of package com.walmart.android.app.main:
//            SearchContentProvider

public static class addRow extends MatrixCursor
{

    public (Context context)
    {
        super(SearchContentProvider.access$000(), 1);
        if (ScannerUtil.scannerAvailable(context))
        {
            addRow(new Object[] {
                Integer.valueOf(0), String.valueOf(0x7f0202c5), null, "scanner", null, null, context.getString(0x7f090544), ""
            });
        }
    }
}
