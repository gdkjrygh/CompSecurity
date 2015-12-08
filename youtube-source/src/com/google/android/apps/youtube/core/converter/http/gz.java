// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.core.converter.http;

import com.google.android.apps.youtube.common.fromguava.c;
import com.google.android.apps.youtube.core.converter.ConverterException;
import com.google.android.apps.youtube.core.converter.e;
import com.google.android.apps.youtube.core.converter.n;
import com.google.android.apps.youtube.datalib.legacy.model.r;
import java.io.InputStream;

// Referenced classes of package com.google.android.apps.youtube.core.converter.http:
//            ay

public abstract class gz extends ay
{

    protected final n a;

    public gz(n n1)
    {
        a = (n)c.a(n1);
    }

    protected abstract e a();

    protected final Object a(InputStream inputstream)
    {
        inputstream = (r)a.a(inputstream, a());
        try
        {
            inputstream = ((InputStream) (inputstream.build()));
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            throw new ConverterException(inputstream);
        }
        return inputstream;
    }
}
