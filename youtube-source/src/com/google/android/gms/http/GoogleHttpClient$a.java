// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.http;

import android.os.Bundle;
import java.io.IOException;

public class BK extends IOException
{

    private final Bundle BK;

    (Bundle bundle)
    {
        super((new StringBuilder("Blocked by rule: ")).append(bundle.getString("name")).toString());
        BK = bundle;
    }
}
