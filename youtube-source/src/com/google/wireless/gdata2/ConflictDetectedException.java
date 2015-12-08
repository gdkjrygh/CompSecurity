// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wireless.gdata2;

import com.google.wireless.gdata2.a.a;

// Referenced classes of package com.google.wireless.gdata2:
//            GDataException

public class ConflictDetectedException extends GDataException
{

    private final a conflictingEntry;

    public ConflictDetectedException(a a)
    {
        conflictingEntry = a;
    }

    public a getConflictingEntry()
    {
        return conflictingEntry;
    }
}
