// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.youtube.datalib.legacy.model;

import com.google.android.apps.youtube.common.fromguava.c;
import java.io.Serializable;

public final class ArtistSnippet
    implements Serializable
{

    private volatile int hashCode;
    public final String id;
    public final String name;

    public ArtistSnippet(String s, String s1)
    {
        id = c.a(s, "id may not be null or empty");
        name = c.a(s1, "name may not be null or empty");
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ArtistSnippet))
            {
                return false;
            }
            obj = (ArtistSnippet)obj;
            if (!id.equals(((ArtistSnippet) (obj)).id) || !name.equals(((ArtistSnippet) (obj)).name))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int j = hashCode;
        int i = j;
        if (j == 0)
        {
            i = (id.hashCode() + 527) * 31 + name.hashCode();
            hashCode = i;
        }
        return i;
    }

    public final String toString()
    {
        return name;
    }
}
