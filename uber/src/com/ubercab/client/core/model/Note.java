// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ubercab.client.core.model;

import android.os.Parcelable;

// Referenced classes of package com.ubercab.client.core.model:
//            Shape_Note

public abstract class Note
    implements Parcelable, com.ubercab.rider.realtime.request.param.Note
{

    public Note()
    {
    }

    public static Note create()
    {
        return new Shape_Note();
    }

    public abstract String getText();

    public abstract Note setText(String s);
}
