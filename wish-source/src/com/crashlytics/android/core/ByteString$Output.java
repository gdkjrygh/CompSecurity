// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;

// Referenced classes of package com.crashlytics.android.core:
//            ByteString

static final class <init> extends FilterOutputStream
{

    private final ByteArrayOutputStream bout;

    public ByteString toByteString()
    {
        return new ByteString(bout.toByteArray(), null);
    }

    private (ByteArrayOutputStream bytearrayoutputstream)
    {
        super(bytearrayoutputstream);
        bout = bytearrayoutputstream;
    }

    bout(ByteArrayOutputStream bytearrayoutputstream, bout bout1)
    {
        this(bytearrayoutputstream);
    }
}
