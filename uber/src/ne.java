// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.AdRequestParcel;

public final class ne
{

    public ne()
    {
    }

    public static aiw a(Context context, nd nd1, amb amb, nf nf)
    {
        if (((Boolean)abn.R.c()).booleanValue() && nd1.b.c.getBundle("sdk_less_server_data") != null)
        {
            context = new nz(context, nd1, nf);
        } else
        {
            context = new ng(context, nd1, amb, nf);
        }
        context.f();
        return context;
    }
}
