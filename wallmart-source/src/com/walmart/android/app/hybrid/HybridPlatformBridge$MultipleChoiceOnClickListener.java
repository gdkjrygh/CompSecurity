// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.app.hybrid;

import android.content.DialogInterface;
import java.util.ArrayList;

// Referenced classes of package com.walmart.android.app.hybrid:
//            HybridPlatformBridge

private static class mAction
    implements android.content.nClickListener
{

    private final String mAction;
    private final mCallback mCallback;
    private final boolean mCheckedItems[];

    private static ArrayList getIntegerList(boolean aflag[])
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < aflag.length; i++)
        {
            if (aflag[i])
            {
                arraylist.add(Integer.valueOf(i));
            }
        }

        return arraylist;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = new mAction(mAction);
        dialoginterface.mAction = getIntegerList(mCheckedItems);
        mCallback.mCallback(dialoginterface);
    }

    public ( , boolean aflag[], String s)
    {
        mCallback = ;
        mCheckedItems = aflag;
        mAction = s;
    }
}
