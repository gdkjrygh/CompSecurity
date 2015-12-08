// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.walmart.android.wmservice;

import android.content.DialogInterface;

// Referenced classes of package com.walmart.android.wmservice:
//            DialogFactory

static final class val.id
    implements android.content.OnClickListener
{

    final int val$id;
    final alogListener val$listener;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        val$listener.onClicked(val$id, i, null);
    }

    alogListener(alogListener aloglistener, int i)
    {
        val$listener = aloglistener;
        val$id = i;
        super();
    }
}
