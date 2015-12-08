// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.UUID;

// Referenced classes of package com.facebook:
//            NativeAppCallContentProvider

static interface 
{

    public abstract File openAttachment(UUID uuid, String s)
        throws FileNotFoundException;
}
