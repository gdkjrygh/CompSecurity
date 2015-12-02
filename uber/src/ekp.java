// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.Toast;

public final class ekp
    implements icg
{

    private final Context a;

    public ekp(Context context)
    {
        a = context;
    }

    public final void a()
    {
    }

    public final volatile void a(Object obj)
    {
    }

    public final void a(Throwable throwable)
    {
        Toast.makeText(a, a.getString(0x7f070631), 1).show();
    }
}
